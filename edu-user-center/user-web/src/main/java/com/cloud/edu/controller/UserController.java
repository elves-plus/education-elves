package com.cloud.edu.controller;

import com.cloud.edu.model.RestResult;
import com.cloud.edu.model.RestResultBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <Description>
 *
 * @author xianliru@163.com
 * @version 1.0
 * @createDate 2019/12/12 15:20
 */
@RequestMapping
@RestController
public class UserController {


    @GetMapping("/")
    public RestResult hello(){
        return RestResultBuilder.builder().success().data("hello word!").build();
    }

}
