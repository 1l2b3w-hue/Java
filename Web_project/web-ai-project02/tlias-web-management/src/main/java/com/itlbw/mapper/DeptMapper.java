package com.itlbw.mapper;

import com.itlbw.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {


    /*方式一： 手动映射
//    @Results({
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime")
//    })
//    @Select("SELECT id,`name`,create_time,update_time FROM dept ORDER BY update_time DESC;   ")
     */
    /*方式二：起别名
       @Select("SELECT id,`name`,create_time createTime,update_time updateTime FROM dept ORDER BY update_time DESC;   ")
     */

    @Select("SELECT id,`name`,create_time,update_time FROM dept ORDER BY update_time DESC;   ")
    public List<Dept> findAll();

    @Delete("DELETE FROM dept WHERE id = #{id} ")
    public void deleteById(int id);

    @Insert("insert into dept(name,create_time,update_time) values(#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept getDeptById(Integer id);


    @Update("update dept set name = #{name},update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);
}
