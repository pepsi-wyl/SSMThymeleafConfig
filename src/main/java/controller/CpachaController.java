package controller;

import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import utils.CpachaUtil;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * @author by wyl
 * @date 2021/10/17.18点31分
 */
@Controller
@RequestMapping(value = "/cpacha")
public class CpachaController {

    @SneakyThrows
    @RequestMapping("/loginCpacha")
    public void getLoginCpacha(HttpServletRequest req, HttpServletResponse resp) {
        CpachaUtil cpachaUtil = new CpachaUtil();
        String generatorVCode = cpachaUtil.generatorVCode();                   //获取验证码
        req.getSession().setAttribute("loginCpacha", generatorVCode);       //给Session设置验证码
        System.out.println("生成验证码： " + generatorVCode + "   " + " Session: " + req.getSession().getAttribute("loginCpacha"));
        BufferedImage generatorRotateVCodeImage = cpachaUtil.generatorRotateVCodeImage(generatorVCode, true);   //得到旋转验证码
        ImageIO.write(generatorRotateVCodeImage, "gif", resp.getOutputStream());     //写出验证码
    }

}
