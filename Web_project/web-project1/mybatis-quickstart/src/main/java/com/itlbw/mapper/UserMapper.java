package com.itlbw.mapper;

import com.itlbw.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // 项目运行时，会动态的自动生成该接口实现类的对象(代理对象)，并且将该对象交给 IOC 容器管理
public interface UserMapper {

    /**
     * 查询所有用户
     */
//    @Select("select * from user")
    public List<User> findAll();

    /**
     * 根据 id 删除用户
     * @param id
     */
//    #{id} 作为占位符，底层会转换为 ？
    @Delete("delete from user where id = #{id}")
    public Integer deleteById(Integer id);

    /**
     * 添加用户
     * */
    @Insert("insert into user(username,password,name,age) values(#{username}, #{password}, #{name}, #{age})")
    public void insert(User user);

    /**
     * 修改用户
     * */
    @Update("update user set username=#{username},password=#{password},name=#{name},age=#{age} where id = #{id}")
    public void update(User user);

    /**
     * 根据用户名和密码查询用户
     */
    @Select("select * from user where username = #{username} and password = #{password}")
//    public User findByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
    public User findByUsernameAndPassword(String username, String password);
}
