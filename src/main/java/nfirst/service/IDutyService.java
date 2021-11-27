package nfirst.service;

import com.baomidou.mybatisplus.extension.service.IService;
import nfirst.entity.Duty;
import nfirst.mapper.dutymapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IDutyService  extends IService<Duty>{

    List<Duty> selectAll();


}
