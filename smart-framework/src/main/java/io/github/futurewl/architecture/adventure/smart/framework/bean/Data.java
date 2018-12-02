package io.github.futurewl.architecture.adventure.smart.framework.bean;

/**
 * ==========================
 * 功能描述：返回数据对象
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
