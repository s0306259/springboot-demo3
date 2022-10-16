package com.edu.murray;

import com.edu.murray.dao.CustomerDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootDemo01ApplicationTests {
    @Autowired
    CustomerDao customerDao;

    @Test
    public void testEmployeeDao(){
        System.out.println(customerDao.selectById("00013530066F40F9B341516B12C638A7"));
    }
}
