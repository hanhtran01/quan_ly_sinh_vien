package com.example.qlsv.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ThoiKhoaBieuDto {
    private String maHP;

    private int maLop;

    private String tenMon;

    private int soTin;

    private String loaiLop;

    private String idGV;

    private String lichHoc;

    private String diaDiem;
}
