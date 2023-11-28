package com.imax;


import com.imax.service.impl.UserGoAshoreImpl;


import java.io.IOException;

public class MavenTest {
    public static void main(String[] args) throws IOException {
        UserGoAshoreImpl userGoAshore = new UserGoAshoreImpl();
        if (userGoAshore.UserLogin("00001", "123456")){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }
}
