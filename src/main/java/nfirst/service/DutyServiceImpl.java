package nfirst.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nfirst.entity.Duty;
import nfirst.mapper.dutymapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DutyServiceImpl extends ServiceImpl<dutymapper,Duty> implements IDutyService{
    @Autowired
    dutymapper mm;
    @Override
    public List<Duty> selectAll(){
        return mm.selectAll();
    }
}
