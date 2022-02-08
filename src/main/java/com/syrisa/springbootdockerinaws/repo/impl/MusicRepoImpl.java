package com.syrisa.springbootdockerinaws.repo.impl;

import com.syrisa.springbootdockerinaws.entity.Music;
import com.syrisa.springbootdockerinaws.entity.Singer;
import com.syrisa.springbootdockerinaws.exceptions.HttpStatusInfo;
import com.syrisa.springbootdockerinaws.repo.MusicRepo;
import com.syrisa.springbootdockerinaws.repo.SingerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MusicRepoImpl implements MusicRepo {

    private final SingerRepo singerRepo;

    private static final Map<Long, List<Music>> musicRepo = new HashMap<>();

    @Override
    public Music create(Music music) throws Exception {
        if (isSingerRegisterInTheSystem.test(music.getSinger())) {
            List<Music> musics;
            if (musicRepo.containsKey(music.getId())) {
                musics = musicRepo.get(music.getId());
                musics.add(music);
            } else {
                musics = new ArrayList<>();
                musics.add(music);
            }
            musicRepo.put(music.getId(), musics);
        }
        throw new Exception(String.valueOf(HttpStatusInfo.HTTP_NOT_REGISTER_ON_THE_SYSTEM));
    }

    @Override
    public Music update(Music music) throws Exception {
        if (isSingerRegisterInTheSystem.test(music.getSinger())) {
            List<Music> musics;
            if (musicRepo.containsKey(music.getId())) {
                musics = musicRepo.get(music.getId());
                musics.add(music);
                musicRepo.put(music.getId(), musics);
            }
        }
        throw new Exception(String.valueOf(HttpStatusInfo.HTTP_NOT_REGISTER_ON_THE_SYSTEM));
    }


    @Override
    public void delete(Long aLong) {
        // TODO document why this method is empty
        musicRepo.remove(aLong);
        System.out.println("Deleted");

    }


    private final Predicate<Singer> isSingerRegisterInTheSystem = (singer -> singerRepo.isSingerInTheRepo(singer.getSingerID()));

    @Override
    public List<Music> getMusicBy(Long id) {
        return musicRepo.get(id);
    }

    @Override
    public Music getMusicByIdAndMusicName(Long id, String musicName) {

        return (Music) musicRepo.get(id).stream()
                .filter(music -> music.getMusicName().equals(musicName))
                .map(Music::toMusicDto)
                .collect(Collectors.toList());
    }

    @Override
    public String deleteMusicByMusicIdAndMusicName(Long id, String musicName) throws Exception {
        List<Music> musics = musicRepo.get(id);
        if (musics != null) {
            for (Music music : musics) {
                if (music.getMusicName().equals(musicName)) {
                    musics.remove(music);
                    return musicName + " named music removed music list";
                }
            }
        }
        throw new Exception(String.valueOf(HttpStatusInfo.HTTP_NOT_REGISTER_ON_THE_SYSTEM));
    }

    @Override
    public Map<Long, List<Music>> writeMusic() {
        return musicRepo;
    }

    @Override
    public Boolean isTheMusicRegisteredInTheRepository(Long musicID) {
        return musicRepo.containsKey(musicID);
    }
}
