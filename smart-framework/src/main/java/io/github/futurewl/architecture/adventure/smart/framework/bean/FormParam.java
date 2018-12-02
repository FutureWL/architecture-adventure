package io.github.futurewl.architecture.adventure.smart.framework.bean;

/**
 * ==========================
 * 功能描述：封装表单参数
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class FormParam {

    private String fieldName;

    private String fieldValue;

    public FormParam(String fieldName, String fieldValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }
}
