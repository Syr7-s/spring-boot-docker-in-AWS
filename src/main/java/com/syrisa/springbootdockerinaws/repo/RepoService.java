package com.syrisa.springbootdockerinaws.repo;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface RepoService<T,R> {

    T create(T t) throws Exception;

    T update(T t) throws Exception;

    T getByID(R r);

    List<T> getAll();

    void delete(R r);

}
