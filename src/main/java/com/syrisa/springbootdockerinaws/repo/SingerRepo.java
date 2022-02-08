package com.syrisa.springbootdockerinaws.repo;

import com.syrisa.springbootdockerinaws.entity.Singer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface SingerRepo extends RepoService<Singer, Long> {
    Singer getByID(Long id);

    List<Singer> getAll();

    Boolean isSingerInTheRepo(Long singerID);

    Map<Long,Singer> writeSinger();
}
