package com.syrisa.springbootdockerinaws.repo;

import com.syrisa.springbootdockerinaws.entity.Music;
import com.syrisa.springbootdockerinaws.entity.Singer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface MusicRepo extends RepoService<Music, Long> {
    List<Music> getMusicBy(Long id);

    Music getMusicByIdAndMusicName(Long id, String musicName);

    String deleteMusicByMusicIdAndMusicName(Long id, String musicName) throws Exception;

    Map<Long, List<Music>> writeMusic();
}
