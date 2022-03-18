package utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author by wyl
 * @date 2021/10/9.10点52分
 */
public class SpringUtils {

    /**
     * xml方式获取Spring配置文件
     */
    // 默认
    public static ApplicationContext getApplicationContext() {
        return new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    // 自定义
    public static ApplicationContext getApplicationContext(String xmlName) {
        return new ClassPathXmlApplicationContext(xmlName + ".xml");
    }

}

