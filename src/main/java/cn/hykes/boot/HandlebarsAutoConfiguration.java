package cn.hykes.boot;

import cn.hykes.boot.handlebars.HandlebarsView;
import cn.hykes.boot.handlebars.HandlebarsViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Desc: 自动配置类
 * Mail: hehaiyangwork@qq.com
 * Date: 2017/11/16
 */
@EnableConfigurationProperties(HandlebarsProperties.class)
public class HandlebarsAutoConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private HandlebarsProperties handlebarsProperties;

    /**
     * 使用handlebars模版引擎
     * @param registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        HandlebarsViewResolver viewResolver = new HandlebarsViewResolver();
        viewResolver.setViewClass(HandlebarsView.class);
        viewResolver.setPrefix(handlebarsProperties.getPrefix());
        viewResolver.setSuffix(handlebarsProperties.getSuffix());
        viewResolver.setCache(false);
        registry.viewResolver(viewResolver);
    }

}
