package com.syrisa.springbootdockerinaws.repo;

import org.springframework.stereotype.Component;

@Component
public interface RepoService<T, R> {

    T create(T t) throws Exception;

    T update(T t) throws Exception;

    void delete(R r);

}
