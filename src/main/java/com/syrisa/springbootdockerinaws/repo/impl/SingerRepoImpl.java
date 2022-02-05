package com.syrisa.springbootdockerinaws.repo.impl;

import com.syrisa.springbootdockerinaws.entity.Singer;
import com.syrisa.springbootdockerinaws.exceptions.HttpStatusInfo;
import com.syrisa.springbootdockerinaws.repo.SingerRepo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class SingerRepoImpl implements SingerRepo {

    private static final Map<Long, Singer> singerRepo = new HashMap<>();

    @Override
    public Singer create(Singer singer) throws Exception {
        if (singerRepo.containsKey(singer.getSingerID())) {
            throw new Exception(String.valueOf(HttpStatusInfo.HTTP_ALREADY_EXIST));
        }
        singerRepo.put(singer.getSingerID(), singer);
        return singer;
    }

    @Override
    public Singer update(Singer singer) throws Exception {
        if (!singerRepo.containsKey(singer.getSingerID())){
            throw new Exception(String.valueOf(HttpStatusInfo.HTTP_NOT_REGISTER_ON_THE_SYSTEM));
        }
        singerRepo.put(singer.getSingerID(), singer);
        return singer;

    }

    @Override
    public Singer getByID(Long aLong) {
        return (Singer) singerRepo.values()
                .stream()
                .map(Singer::getSingerID);
    }

    @Override
    public List<Singer> getAll() {
        return new ArrayList<>(singerRepo.values());
    }

    @Override
    public void delete(Long aLong) {
        singerRepo.values().stream()
                .filter(singer -> singerRepo.containsKey(singer.getSingerID()))
                .map(singer -> singerRepo.remove(singer.getSingerID()))
                .forEach(System.out::println);
    }
}
