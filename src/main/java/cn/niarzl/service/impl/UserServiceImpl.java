package cn.niarzl.service.impl;

import cn.niarzl.dao.UserDao;
import cn.niarzl.domain.User;
import cn.niarzl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Niarzl
 * @Date: 2020/5/4 19:09
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    /**
     * 功能描述:查找是否有对应的user存在
     * @param: User
     * @return: boolean
     * @author: Niarzl
     * @date: 2020/6/15 19:45
     */
    @Override
    public boolean findUser(User user) {
        User u = userDao.findUser(user);
        if (u != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean findByUsername(String username) {

        User u = userDao.findByUsername(username);
        if (u != null) {
            return true;
        }
        return false;
    }

    @Override
    public void registUser(User user) {
        userDao.regist(user);
    }
}
