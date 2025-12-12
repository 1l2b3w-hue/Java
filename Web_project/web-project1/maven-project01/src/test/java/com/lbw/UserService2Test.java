package com.lbw;

import org.junit.jupiter.api.*;

@DisplayName("用户信息测试类")
public class UserService2Test {
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @AfterEach
    public void tearDown() {
        userService = null;
    }

    @DisplayName("输入null")
    @Test
    public void testGetGender1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender(null);
        });
    }

    @DisplayName("输入空串")
    @Test
    public void testGetGender2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender("");
        });
    }

    @DisplayName("输入长度小于18")
    @Test
    public void testGetGender3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender("100");
        });
    }

    @DisplayName("输入长度大于 18")
    @Test
    public void testGetGender4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender("1100002000100100111100000");
        });
    }

    @DisplayName("输入正常男性身份证")
    @Test
    public void testGetGender5() {
        Assertions.assertEquals("男",userService.getGender("110000200010010011"));
    }

    @DisplayName("输入正常女性身份证")
    @Test
    public void testGetGender6() {
        Assertions.assertEquals("女",userService.getGender("110000200010010021"));
    }


//    测试获取年龄
    @DisplayName("输入正常身份证")
    @Test
    public void testGetAge1() {
        Integer age = userService.getAge("110000200010010011");
        Assertions.assertEquals(25  ,age);
    }
    @DisplayName("输入null")
    @Test
    public void testGetAge2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.getAge(null);
        });
    }

    @DisplayName("输入长度小于18位")
    @Test
    public void testGetAge3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.getAge("100");
        });
    }

    @DisplayName("输入长度大于18位")
    @Test
    public void testGetAge4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.getAge("1100002000100100111100000");
        });
    }


}
