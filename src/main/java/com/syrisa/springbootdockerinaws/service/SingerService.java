package com.syrisa.springbootdockerinaws.service;

import com.syrisa.springbootdockerinaws.entity.Singer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SingerService extends SongService<Singer, Long> {

    Integer SINGER_ID_LENGTH = 5;

    Singer getByID(Long id);

    List<Singer> getAll();


}
