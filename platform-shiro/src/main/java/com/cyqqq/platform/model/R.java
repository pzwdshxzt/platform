package com.cyqqq.platform.model;

import java.util.HashMap;

/**
 * Description
 *
 * @Author : huangjinxing
 * @Email : hmm7023@gmail.com
 * @Date : 2018/9/30 14:51
 * @Version :
 */
public class R extends HashMap<String,Object> {

    public R() {
    }

    public R success() {
        this.put("result", "success");
        return this;
    }

    public R fail() {
        this.put("result", "fail");
        return this;
    }

    public R message(Object message) {
        this.put("message", message);
        return this;
    }

}
