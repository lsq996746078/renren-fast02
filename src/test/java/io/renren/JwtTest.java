package io.renren;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import io.renren.modules.app.utils.JwtUtils;


public class JwtTest extends SpringbootApplicationTests{
    @Autowired
    private JwtUtils jwtUtils;

    @Test
    public void test() {
        String token = jwtUtils.generateToken(1);

        System.out.println(token);
    }

}
