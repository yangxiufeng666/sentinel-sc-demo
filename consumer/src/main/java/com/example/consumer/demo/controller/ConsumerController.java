package com.example.consumer.demo.controller;

import com.example.consumer.demo.facade.ProviderFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2019-07-25
 * Time: 14:44
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private ProviderFacade providerFacade;

    @GetMapping("getProviderPort")
    public String getProviderPort(){
//        return restTemplate.getForObject("http://sentinel-provider/getPort", String.class);
        return providerFacade.getPort();
    }

}