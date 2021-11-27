package nfirst.controller;


import nfirst.entity.Duty;
import nfirst.service.IDutyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.util.resources.cldr.es.CalendarData_es_UY;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Controller
@ResponseBody
@RequestMapping("/api/duty")

public class DutyController {

    @Autowired
    IDutyService s;

    @ResponseBody
    @GetMapping("/list")
    public List<Duty> query(){
            return s.selectAll();
        }
    @ResponseBody
    @PostMapping("/c")
    public String create(@RequestBody Duty duty){
        boolean flag=s.save(duty);
        if(flag)return "创建成功";
        else return "创建失败";
    }
    @PostMapping("/d")
    public String delete(@RequestBody Duty duty){
        boolean flag=s.removeById(duty.getId());
        if(flag)return "删除成功";
        else return "删除失败";
    }
    @PostMapping("/up")
    public String up(@RequestBody Duty duty){
        boolean f = false;
        boolean flag;
        List<Duty> list = s.selectAll();
        for(Duty d:list){
            if(Objects.equals(d.getId(), duty.getId())){
                f = true;
                break;
            }
        }
        if(f){
            flag = s.saveOrUpdate(duty);
            if(flag){
                return "修改成功";
            }
            return "修改失败";
        }
        return "修改失败";
    }
}
