package com.syrisa.springbootdockerinaws.service;

import com.syrisa.springbootdockerinaws.entity.Music;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface MusicService extends SongService<Music,Long> {

    List<Music> getMusicBy(Long id);

    Music getMusicByIdAndMusicName(Long id, String musicName);

    String deleteMusicByMusicIdAndMusicName(Long id, String musicName) throws Exception;


}
