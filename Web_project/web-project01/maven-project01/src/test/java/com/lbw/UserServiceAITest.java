package com.lbw;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceAITest {
    private final UserService userService = new UserService();

    @Test
    public void testGetGender_Male() {
        // 测试奇数情况，应该返回"男"
        String idCard = "110101199001011234"; // 第17位是3（奇数）
        assertEquals("男", userService.getGender(idCard));
    }

    @Test
    public void testGetGender_Female() {
        // 测试偶数情况，应该返回"女"
        String idCard = "110101199001012468"; // 第17位是6（偶数）
        assertEquals("女", userService.getGender(idCard));
    }

    @Test
    public void testGetGender_NullIdCard() {
        // 测试null输入，应该抛出IllegalArgumentException异常
        assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender(null);
        });
    }

    @Test
    public void testGetGender_WrongLength() {
        // 测试长度不正确的身份证号，应该抛出IllegalArgumentException异常
        String shortIdCard = "123456"; // 长度不足18位
        assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender(shortIdCard);
        });

        String longIdCard = "1101011990010112345"; // 长度超过18位
        assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender(longIdCard);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "110101199001011234, 男",  // 奇数位为3
            "110101199001011254, 男",  // 奇数位为5
            "110101199001011274, 男",  // 奇数位为7
            "110101199001011294, 男",  // 奇数位为9
            "110101199001011214, 男",  // 奇数位为1
            "110101199001012468, 女",  // 偶数位为6
            "110101199001012488, 女",  // 偶数位为8
            "110101199001012408, 女",  // 偶数位为0
            "110101199001012428, 女",  // 偶数位为2
            "110101199001012448, 女"   // 偶数位为4
    })
    public void testGetGender_Parameterized(String idCard, String expectedGender) {
        assertEquals(expectedGender, userService.getGender(idCard));
    }
}
