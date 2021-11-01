package com.example.qlsv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BangDiemSvDto {
    private int mssv;

    private String name;

    private String maHP;

    private float diem;
}
