package com.syrisa.springbootdockerinaws.service;

import com.syrisa.springbootdockerinaws.dto.MusicDto;
import com.syrisa.springbootdockerinaws.entity.Music;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MusicService extends SongService<Music,Long> {

    Integer MUSIC_ID_LENGTH = 6;

    List<Music> getMusicBy(Long id);

    List<MusicDto> getMusicByIdAndMusicName(Long id, String musicName);

    String deleteMusicByMusicIdAndMusicName(Long id, String musicName) throws Exception;


}
