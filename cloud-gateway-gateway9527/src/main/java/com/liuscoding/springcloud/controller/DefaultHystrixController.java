package com.liuscoding.springcloud.controller;

import com.liuscoding.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 熔断后回调
 * @Author: spark
 * @Date: 2020/7/3 15:16
 **/
@RestController
@Slf4j
public class DefaultHystrixController {


    /**
     * 发生熔断调用的请求
     *
     * @return
     */
    @RequestMapping(value = "/fallback")
    public CommonResult<String> fallback() {
        return new CommonResult(200, "熔断成功回调", null);
    }
}
