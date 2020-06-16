package cn.niarzl.dao;

import cn.niarzl.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: Niarzl
 * @Date: 2020/5/4 19:10
 * @Description:
 */
@Repository
public interface UserDao {

    @Select("select * from user where username=#{username} and password=#{password}")
    User findUser(User user);

    @Select("select * from user where username=#{username}")
    User findByUsername(String username);

    @Insert("insert into user (username,password) values(#{username},#{password})")
    void regist(User user);
}
