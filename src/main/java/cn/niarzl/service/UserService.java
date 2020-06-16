package cn.niarzl.service;

import cn.niarzl.domain.User;

/**
 * @Author: Niarzl
 * @Date: 2020/5/4 19:06
 * @Description: 用户接口
 */
public interface UserService {

    /**
     * 功能描述: 查找用户是否存在
     * @param: user
     * @return: true || false
     * @author: Niarzl
     * @date: 2020/5/4 19:08
     */
    boolean findUser(User user);

    /**
     * 功能描述: 查找注册用户是否存在
     * @param: user
     * @return: true || false
     * @author: Niarzl
     * @date: 2020/5/4 19:08
     */
    boolean findByUsername(String username);

    /**
     * 功能描述: 注册用户
     * @param: user
     * @return: void
     * @author: Niarzl
     * @date: 2020/5/4 19:08
     */
    void registUser(User user);
}
