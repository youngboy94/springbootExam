package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    //事务
    @Transactional
    //注意数据表为Innodb
    public void insertTwo(){

        Girl girl = new Girl();
        girl.setCupSize("A");
        girl.setAge(18);
        girlRepository.save(girl);

        Girl girlA = new Girl();
        girlA.setCupSize("E");
        girlA.setAge(19);
        girlRepository.save(girlA);
    }

}
