package cn.niarzl.controller;

import cn.niarzl.domain.User;
import cn.niarzl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Niarzl
 * @Date: 2020/6/15 19:14
 * @Description: 登录页面
 */
@Controller
@RequestMapping("user")
public class UserControllor {


    @Autowired
    UserService userService;

    /**
     * 功能描述:用户登录 是否有对应的username和password
     *
     * @param: User
     * @return:
     * @author: Niarzl
     * @date: 2020/6/15 19:41
     */
    @PostMapping("login")
    public String login(User user, HttpServletRequest request) {
        if (userService.findUser(user)) {
            return "pages/success";
        }
        request.setAttribute("login_msg", "账号或密码错误");
        return "login";
    }

    @PostMapping("regist")
    public ModelAndView regist(User user) {
        ModelAndView mv = new ModelAndView("login");
        //找数据库中是否存在username
        boolean result = userService.findByUsername(user.getUsername());
        if (result) {
            mv.addObject("login_msg", "用户已存在");
            return mv;
        } else {
            userService.registUser(user);
        }
        return mv;
    }
}
