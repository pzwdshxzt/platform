package com.cyqqq.platform.fegin.controller;

import com.cyqqq.platform.fegin.api.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @Author : huangjinxing
 * @Email : hmm7023@gmail.com
 * @Date : 2018/9/28 16:41
 * @Version :
 */
@RestController
public class HiController {

    /**编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。*/
    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return hiService.sayHiFromClientOne( name );
    }


}
