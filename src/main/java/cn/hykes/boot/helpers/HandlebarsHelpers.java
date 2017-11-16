package cn.hykes.boot.helpers;

import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Desc: 自定义Helpers
 * Mail: hehaiyangwork@qq.com
 * Date: 2017/11/16
 */
@Component
public class HandlebarsHelpers extends AbstractHelpers {

    @Override
    protected void fillHelpers(Map<String, Helper<?>> helpers) {

        /**
         * url转码
         */
        helpers.put("urlEncode", new Helper<Object>() {
            @Override
            public CharSequence apply(Object param, Options options) throws IOException {
                String charset = options.param(0, "utf-8");
                return URLEncoder.encode(param.toString(), charset);
            }
        });

    }
}
