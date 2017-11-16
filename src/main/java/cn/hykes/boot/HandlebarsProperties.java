package cn.hykes.boot;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Desc: 属性配置类
 * Mail: hehaiyangwork@qq.com
 * Date: 2017/11/16
 */
@Data
@ConfigurationProperties(prefix="hbs")
public class HandlebarsProperties {

    private String root;

    private String prefix;

    @Value("${suffix:.hbs}")
    private String suffix;

}
