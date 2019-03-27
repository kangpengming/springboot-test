package yottabyte.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import yottabyte.requestmodel.FrontendRequest;

/**
 * @author kangpeng
 * @date 2019/3/27 上午11:18
 */

@RestController
public class Controller {

    @Autowired
    private Gson gson;

    @RequestMapping( value = "/frontend/kpi", name = "frontend架构讲解", method = RequestMethod.POST)
    public String test(@RequestBody FrontendRequest request){
        System.out.println(gson.toJson(request));

        return "你的id是：" + request.getId();
    }

}
