package com.example.qlsv.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyResponse {
    private String mess;

    private Object data;

    public static MyResponse success(Object data){
        return new MyResponse("success", data);
    }
}
