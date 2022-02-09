package com.syrisa.springbootdockerinaws.repo;

import com.syrisa.springbootdockerinaws.dto.MusicDto;
import com.syrisa.springbootdockerinaws.entity.Music;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface MusicRepo extends RepoService<Music, Long> {
    List<Music> getMusicBy(Long id);

    List<MusicDto> getMusicByIdAndMusicName(Long id, String musicName);

    String deleteMusicByMusicIdAndMusicName(Long id, String musicName) throws Exception;

    Map<Long, List<Music>> writeMusic();

    Boolean isTheMusicRegisteredInTheRepository (Long musicID);
}
