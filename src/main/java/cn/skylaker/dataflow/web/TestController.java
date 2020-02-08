package cn.skylaker.dataflow.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author skylaker
 * @version V1.0 2020/1/6 21:01
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/main")
    public String getInfo(){
        return "MEB DATA ENGINE 数据引擎";
    }

}
