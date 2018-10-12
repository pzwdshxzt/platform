package com.cyqqq.platform.controller;

import com.alibaba.druid.VERSION;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Description
 * 配置文件测试
 *
 * @Author : huangjinxing
 * @Email : hmm7023@gmail.com
 * @Date : 2018/10/12 10:46
 * @Version : 0.0.1
 */
@RestController
@RequestMapping(value = "/admin")
public class ConfigController {


    private static final String VERSION = "version";
    private static final String DATABASE = "database";
    private static final String INIT = "init";

    @Value("${version}")
    private String version;

    @Value("${database}")
    private String database;

    @Value("${init}")
    private String init;


    @RequestMapping(value = "/getValue" , method = RequestMethod.POST)
    public DeferredResult<Object> getValue(@RequestBody String o){
        DeferredResult<Object> deferredResult = new DeferredResult<>();
        if (VERSION.equals(o)){
            deferredResult.setResult(version);
        }
        if (DATABASE.equals(o)){
            deferredResult.setResult(database);
        }
        if (INIT.equals(o)){
            deferredResult.setResult(init);
        }
        return deferredResult;
    }
}
