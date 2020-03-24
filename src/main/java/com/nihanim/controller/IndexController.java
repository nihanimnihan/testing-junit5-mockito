package com.nihanim.controller;

import com.nihanim.exception.ValueNotfoundexception;

public class IndexController {

    public String index() {
        return "index";
    }

    public String oupsHandler() {
        throw new ValueNotfoundexception();
    }
}
