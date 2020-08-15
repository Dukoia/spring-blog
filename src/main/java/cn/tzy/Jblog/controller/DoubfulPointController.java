package cn.tzy.Jblog.controller;


import cn.tzy.Jblog.dao.DoubfulPointDao;
import cn.tzy.Jblog.model.DoubfulPoint;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DoubfulPointController {


    @Autowired
    DoubfulPointDao doubfulPointDao;

    @RequestMapping("get")
    public Object method(){
        List<DoubfulPoint> doubfulPoints1 = doubfulPointDao.selectByIdAndStatus();
//        System.out.println(JSONObject.toJSONString(maps));
//        List<DoubfulPoint> doubfulPoints = JSONObject.parseObject(JSONObject.toJSONString(maps), new TypeReference<List<DoubfulPoint>>() {
//        });
        return doubfulPoints1;
    }
}
