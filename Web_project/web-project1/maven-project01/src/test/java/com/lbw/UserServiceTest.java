package com.lbw;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("用户信息测试类")
public class UserServiceTest {
//    @BeforeAll
//    public static void beforeAll() {
//        System.out.println("before all");
//    }
//
//    @BeforeEach
//    public void beforeEach() {
//        System.out.println("before each");
//    }
//    @AfterEach
//    public void afterEach() {
//        System.out.println("after each");
//    }
//    @AfterAll
//    public static void afterAll() {
//        System.out.println("after all");
//    }


    @Test
    public void testGetAge() {
        UserService userService = new UserService();
        Integer age = userService.getAge("111111200105211101");
        System.out.println(age);
    }

    @Test
    public void testGetGender() {
        UserService userService = new UserService();
        String gender = userService.getGender("111111200105211101");
        System.out.println(gender);

    }

    /**
     *  基于断言的 测试
     */
    @Test
    public void testGetGenderWithAssert() {
        UserService userService = new UserService();
//        String gender = userService.getGender("111111200105211111");

//        Assertions.assertEquals("男",gender,"性别逻辑判断错误");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender("null");
        });
    }

    /**
     *  参数化测试
     */
    @DisplayName("用户性别测试")
    @ParameterizedTest
    @ValueSource(strings = {"111111200105211101","111111200105211121","111111200105211141"})
    public void testGetGenderWithAssert2(String gender) {
        UserService userService = new UserService();
        String gender1 = userService.getGender(gender);
        Assertions.assertEquals("女",gender1);
    }
}
