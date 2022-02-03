package com.syrisa.springbootdockerinaws.repo;

import com.syrisa.springbootdockerinaws.entity.Singer;
import org.springframework.stereotype.Component;

@Component
public interface SingerRepo extends RepoService<Singer,Long> {

}
