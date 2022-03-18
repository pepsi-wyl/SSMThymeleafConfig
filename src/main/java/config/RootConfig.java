package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author by pepsi-wyl
 * @date 2022-03-01 17:12
 */

// Spring配置类

// 全局配置类
@Configuration
@ComponentScan({"config", "mapper", "service", "pojo"})
@Import(MapperConfig.class)         // 注入数据配置
public class RootConfig {

}
