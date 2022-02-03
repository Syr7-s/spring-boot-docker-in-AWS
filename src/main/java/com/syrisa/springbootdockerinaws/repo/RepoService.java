package com.syrisa.springbootdockerinaws.repo;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface RepoService<T,R> {

    T create(T t);

    T update(T t);

    T getByID(R r);

    List<T> getAll();

    String delete(R r);

}
