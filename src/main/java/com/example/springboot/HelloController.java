package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    //@Value("${cupSize}")
    //private String cupSize;
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){//获取get和post中的数据
        return "id="+id+girlProperties.getCupSize();
    }
}
