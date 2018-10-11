package com.cyqqq.platform.controller;

import com.cyqqq.platform.mapper.UserMapper;
import com.cyqqq.platform.model.R;
import com.cyqqq.platform.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @Author : huangjinxing
 * @Email : hmm7023@gmail.com
 * @Date : 2018/9/30 15:01
 * @Version :
 */
@RestController
public class LoginController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "/notLogin", method = RequestMethod.GET)
    public R notLogin() {
        return new R().success().message("您尚未登陆！");
    }

    @RequestMapping(value = "/notRole", method = RequestMethod.GET)
    public R notRole() {
        return new R().success().message("您没有权限！");
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public R logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return new R().success().message("成功注销！");
    }

    /**
     * 登陆
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public R login(@RequestBody User user) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        String role = userMapper.getRole(user.getUsername());
        if ("user".equals(role)) {
            return new R().success().message("欢迎登陆");
        }
        if ("admin".equals(role)) {
            return new R().success().message("欢迎来到管理员页面");
        }
        return new R().fail().message("权限错误！");
    }
}
