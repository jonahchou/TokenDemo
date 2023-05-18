package com.springSecuriy;

import com.springSecuriy.domain.User;
import com.springSecuriy.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * @author Jonah
 * @date 2023/5/4 10:53
 */
@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void userMapperTest() {
        List<User> users = userMapper.selectList(null);
        System.out.println("users = " + users);
    }

    @Test
    void BCryptPasswordEncoderTest() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String x = passwordEncoder.encode("123456");
//        String y = passwordEncoder.encode("123");
//        String z = passwordEncoder.encode("1234");
        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//        $2a$10$
//        boolean matches = passwordEncoder.matches("123", "$2a$10$1OdbM3HV8..Tnr/F35jzxu/SQt6QbBbzZin4XRWZpXTeNP8GuG4EW");
//        boolean matches1 = passwordEncoder.matches("123", "$2a$10$cAP2sOrcCztHcQo4rr7TdOEUxl/md/iFTYdIps1P1SMp2Pxiaa2WK");
//        System.out.println("matches = " + matches);
//        System.out.println("matches1 = " + matches1);

    }
}
