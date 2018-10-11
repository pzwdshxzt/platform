package com.cyqqq.platform.controller;

import com.cyqqq.platform.model.R;
import org.apache.shiro.authc.AccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Description
 *
 * @Author : huangjinxing
 * @Email : hmm7023@gmail.com
 * @Date : 2018/9/30 14:56
 * @Version :
 */
@RestControllerAdvice
public class ExceptionController {


    /**
     * 捕捉 CustomRealm 抛出的异常
     */
    @ExceptionHandler(AccountException.class)
    public R handleShiroException(Exception ex) {
        return new R().fail().message(ex.getMessage());
    }
}
