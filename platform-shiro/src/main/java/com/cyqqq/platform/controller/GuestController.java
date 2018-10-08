package com.cyqqq.platform.controller;

import com.cyqqq.platform.model.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @Author : huangjinxing
 * @Email : hmm7023@gmail.com
 * @Date : 2018/9/30 15:00
 * @Version :
 */

@RestController
@RequestMapping("/guest")
public class GuestController {


    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public R login() {
        return new R().success().message("欢迎进入，您的身份是游客");
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public R submitLogin() {
        return new R().success().message("您拥有获得该接口的信息的权限！");
    }
}
