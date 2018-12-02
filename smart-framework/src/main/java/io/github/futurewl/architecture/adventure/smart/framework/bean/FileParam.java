package io.github.futurewl.architecture.adventure.smart.framework.bean;

import java.io.InputStream;

/**
 * ==========================
 * 功能描述：封装文件上传参数
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class FileParam {


    /**
     * 表示文件表单的字段名
     */
    private String fieldName;

    /**
     * 表示文件的文件名
     */
    private String fileName;

    /**
     * 表示文件大小
     */
    private Long fileSize;

    /**
     * 表示上传文件的 Content-Type 可判断文件类型
     */
    private String contentType;

    /**
     * 表示文件上传的字节输入流
     */
    private InputStream inputStream;

    public FileParam(String fieldName, String fileName, Long fileSize, String contentType, InputStream inputStream) {
        this.fieldName = fieldName;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.contentType = contentType;
        this.inputStream = inputStream;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFileName() {
        return fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public String getContentType() {
        return contentType;
    }

    public InputStream getInputStream() {
        return inputStream;
    }
}
