package com.syrisa.springbootdockerinaws.repo.impl;

import com.syrisa.springbootdockerinaws.entity.Singer;
import com.syrisa.springbootdockerinaws.repo.SingerRepo;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class SingerRepoImpl implements SingerRepo{

    private static final Map<Long,Singer> singerRepo = new HashMap<>();
    @Override
    public Singer create(Singer singer) {
        return null;
    }

    @Override
    public Singer update(Singer singer) {
        return null;
    }

    @Override
    public Singer getByID(Long aLong) {
        return null;
    }

    @Override
    public List<Singer> getAll() {
        return null;
    }

    @Override
    public String delete(Long aLong) {
        return null;
    }
}
