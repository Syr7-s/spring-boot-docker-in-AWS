package com.syrisa.springbootdockerinaws.service.impl;

import com.syrisa.springbootdockerinaws.entity.Singer;
import com.syrisa.springbootdockerinaws.repo.SingerRepo;
import com.syrisa.springbootdockerinaws.service.SingerService;
import com.syrisa.springbootdockerinaws.utilties.generate.NumberGenerate;
import lombok.RequiredArgsConstructor;


import java.util.List;

@RequiredArgsConstructor
public class SingerServiceImpl implements SingerService {

    private final SingerRepo singerRepo;

    @Override
    public Singer create(Singer singer) throws Exception {
        singer.setSingerID(NumberGenerate.numberGenerate.apply(SINGER_ID_LENGTH));
        return singerRepo.create(singer);
    }

    @Override
    public Singer update(Singer singer) throws Exception {
        return singerRepo.update(singer);
    }

    @Override
    public String delete(Long aLong) {
        singerRepo.delete(aLong);
        return singerRepo.isSingerInTheRepo(aLong) ? "Singer was not deleted" : "Singer was successfully deleted";
    }

    @Override
    public Singer getByID(Long id) {
        return singerRepo.getByID(id);
    }

    @Override
    public List<Singer> getAll() {
        return singerRepo.getAll();
    }
}
