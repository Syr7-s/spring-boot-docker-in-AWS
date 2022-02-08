package com.syrisa.springbootdockerinaws.service;

import com.syrisa.springbootdockerinaws.entity.Singer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface SingerService extends SongService<Singer,Long>{

    Singer getByID(Long id);

    List<Singer> getAll();


}
