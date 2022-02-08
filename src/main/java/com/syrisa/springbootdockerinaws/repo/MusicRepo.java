package com.syrisa.springbootdockerinaws.repo;

import com.syrisa.springbootdockerinaws.entity.Music;
import org.springframework.stereotype.Component;

@Component
public interface MusicRepo extends RepoService<Music,Long>{
}
