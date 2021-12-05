package com.example.qlsv.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BangDiemLopDto {
    private int mssv;

    private String name;

    private float diem;
}
