package com.lbw.jdbc.datasource_;

import com.lbw.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class ConQuestion {

    @Test
    public void connect() {

        long start = System.currentTimeMillis();
        for(int i = 0; i < 5000; i++) {
            Connection connection = JDBCUtils.getConnection();
            // 完成一些操作
            // 不进行关闭时 直接抛错 ：Too many connections

            JDBCUtils.close(null,null,connection);

        }

        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start)); // 6001
    }
}
