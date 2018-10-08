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
 * @Date : 2018/9/30 14:55
 * @Version :
 */

@RestController
@RequestMapping("/admin")
public class AdminController {


    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public R getMessage() {
        return new R().success().message("您拥有管理员权限，可以获得该接口的信息！");
    }
}
