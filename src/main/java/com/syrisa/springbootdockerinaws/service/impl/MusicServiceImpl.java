package com.syrisa.springbootdockerinaws.service.impl;

import com.syrisa.springbootdockerinaws.entity.Music;
import com.syrisa.springbootdockerinaws.repo.MusicRepo;
import com.syrisa.springbootdockerinaws.service.MusicService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MusicServiceImpl implements MusicService {

    private final MusicRepo musicRepo;

    @Override
    public Music create(Music music) throws Exception {
        return musicRepo.create(music);
    }

    @Override
    public Music update(Music music) throws Exception {
        return musicRepo.update(music);
    }

    @Override
    public String delete(Long aLong) {
        musicRepo.delete(aLong);
        return musicRepo.isTheMusicRegisteredInTheRepository(aLong) ? "Music was not deleted" : "Music was successfully deleted";
    }

    @Override
    public List<Music> getMusicBy(Long id) {
        return musicRepo.getMusicBy(id);
    }

    @Override
    public Music getMusicByIdAndMusicName(Long id, String musicName) {
        return musicRepo.getMusicByIdAndMusicName(id,musicName);
    }

    @Override
    public String deleteMusicByMusicIdAndMusicName(Long id, String musicName) throws Exception {
        return musicRepo.deleteMusicByMusicIdAndMusicName(id, musicName);
    }

}
