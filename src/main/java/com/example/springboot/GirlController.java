package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping(value = "/girl")
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /*
     * 查询所有女生列表
     * */
    @RequestMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }
    /**
     * 添加女生
     *
     * @param cupSize
     * @param age
     * @return
     */
    @RequestMapping(value = "/addgirl")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /*
     * 通过id查询一个女生信息
     * */
    @RequestMapping(value = "/findgirl")
    public Girl girlList(@RequestParam("id") Integer id) {
        return girlRepository.getOne(id);
    }

    //更新女生
    //return return girlRepository.save(girl);

    //删除女生
    //return return girlRepository.delete(id);

    //插入两条数据，事务
    @RequestMapping(value = "/addTwoGirl")
    public void addTwoGirl(){
        girlService.insertTwo();
    }

}
