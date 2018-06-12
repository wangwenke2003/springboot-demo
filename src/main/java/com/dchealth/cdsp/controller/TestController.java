package com.dchealth.cdsp.controller;

import com.dchealth.cdsp.viewmodel.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangwkc on 2018/6/4.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/user", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User index(@RequestBody User user, HttpServletRequest request) {
        User postUser = user;
        postUser.setUserId(100L);
        return postUser;
    }
}
