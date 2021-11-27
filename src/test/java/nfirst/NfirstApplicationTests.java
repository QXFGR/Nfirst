package nfirst;

import lombok.Data;
import nfirst.entity.Duty;
import nfirst.mapper.dutymapper;
import nfirst.service.DutyServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class NfirstApplicationTests {

    @Autowired
    DutyServiceImpl s;

    @Test
    public void query(){
        System.out.println(s.list());
    }

}
