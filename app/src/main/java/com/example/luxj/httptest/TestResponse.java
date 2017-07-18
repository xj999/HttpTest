package com.example.luxj.httptest;

import java.io.Serializable;

/**
 * @author Luxj
 * @date create 2017/7/18
 * @description
 */
public class TestResponse<T> implements Serializable {


    public int code;
    public String msg;
    public T data;

    @Override
    public String toString() {
        return "TestResponse{\n" +//
                "\tcode=" + code + "\n" +//
                "\tmsg='" + msg + "\'\n" +//
                "\tdata=" + data + "\n" +//
                '}';
    }
}
