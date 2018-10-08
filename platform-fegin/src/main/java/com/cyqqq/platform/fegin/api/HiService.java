package com.cyqqq.platform.fegin.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description
 *
 * @Author : huangjinxing
 * @Email : hmm7023@gmail.com
 * @Date : 2018/9/28 16:39
 * @Version :
 */



@FeignClient(value = "service-hi")
public interface HiService {
    /**
     * service-hi 服务名
     * /hi 服务中的接口
     * 这个主要是起到调用其他服务内部的接口消费服务
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
