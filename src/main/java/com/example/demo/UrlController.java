package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UrlController {

    @Autowired
    private IpMethod ipMethod;

    @GetMapping("url_ip")
    public String login(HttpServletRequest request){
        return ipMethod.getIp(request);
    }
}
