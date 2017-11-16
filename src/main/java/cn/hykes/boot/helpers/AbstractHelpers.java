package cn.hykes.boot.helpers;

import com.github.jknack.handlebars.Helper;
import lombok.Getter;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractHelpers {
    @Getter
    private Map<String, Helper<?>> helpers = new HashMap<String, Helper<?>>();

    @PostConstruct
    public void init() {
        fillHelpers(helpers);
    }

    protected abstract void fillHelpers(Map<String, Helper<?>> helpers);
}
