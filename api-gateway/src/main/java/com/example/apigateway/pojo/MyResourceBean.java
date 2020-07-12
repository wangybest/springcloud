package com.example.apigateway.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyResourceBean {
    private Long id;
    private String url;
    private String roles;


    public String[] getRolesArray(){
        String[] authorities = roles.split(",");
        return authorities;
    }


}
