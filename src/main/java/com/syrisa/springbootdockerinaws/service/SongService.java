package com.syrisa.springbootdockerinaws.service;



public interface SongService<T,R>{
    T create(T t) throws Exception;

    T update(T t) throws Exception;

    String delete(R r);


}
