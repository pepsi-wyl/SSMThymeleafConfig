package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.User;
import service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @author by pepsi-wyl
 * @date 2022-03-03 9:07
 */
@Controller(value = "userController")
@RequestMapping(value = "/user")  // 根路径
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(name = "注册用户", value = "/register", method = RequestMethod.POST)
    public String register(User user) {
        if ("".equals(user.getUserName()) || "".equals(user.getPassword()))
            return "redirect:/toRegister";
        userService.addUser(user);
        return "redirect:/toLogin";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request,
                        @RequestParam(value = "userName") String userName,
                        @RequestParam(value = "password") String password,
                        @RequestParam(value = "vcode") String vcode) {
        if (request.getSession().getAttribute("loginCpacha").toString().toUpperCase(Locale.ROOT).equals(vcode.trim().toUpperCase())) {
            // 验证码正确
            User user = userService.getUserByNameAndPwd(userName.trim(), password.trim());
            if (user != null) {
                //用户密码正确
                request.getSession().setAttribute("userName", userName.trim());      // 用户信息存入Session
                return "redirect:/book";    //跳转页面
            } else {
                // 用户名密码不正确
                request.setAttribute("error", "name错误或者password错误");
                return "login";
            }
        } else {
            //验证码不正确
            request.setAttribute("error", "验证码错误!");
            return "login";
        }
    }
}
