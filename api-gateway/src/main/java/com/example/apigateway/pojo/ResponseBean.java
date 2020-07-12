package com.example.apigateway.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回服务器状态的bean类
 */
@Data
@AllArgsConstructor
public class ResponseBean {
    private Integer status;
    private String msg;
    private Object obj;

}
