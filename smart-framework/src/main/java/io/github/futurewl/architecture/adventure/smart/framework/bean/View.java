package io.github.futurewl.architecture.adventure.smart.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * ==========================
 * 功能描述：返回视图对象
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class View {

    /**
     * 视图路径
     */
    private String path;

    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        this.model = new HashMap<String, Object>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
