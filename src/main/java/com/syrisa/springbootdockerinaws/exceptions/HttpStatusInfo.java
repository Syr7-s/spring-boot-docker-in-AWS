package com.syrisa.springbootdockerinaws.exceptions;

public enum HttpStatusInfo {


    HTTP_ALREADY_EXIST(999, "Record Already Exist"),
    HTTP_NOT_REGISTER_ON_THE_SYSTEM(998,"Not Register On The System");


    public final String exception;
    public final Integer statusCode;

    HttpStatusInfo(Integer statusCode, String ex) {
        this.exception = ex;
        this.statusCode = statusCode;
    }
}
