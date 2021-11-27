package nfirst.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import nfirst.entity.Duty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface dutymapper extends BaseMapper<Duty> {

    List<Duty>  selectAll();
}
