package com.example.qlsv.service;

import com.example.qlsv.dto.BangDiemLopDto;
import com.example.qlsv.dto.ThoiKhoaBieuDto;
import com.example.qlsv.entity.BangDiem;
import com.example.qlsv.entity.SinhVien;
import com.example.qlsv.dto.BangDiemSvDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public List<SinhVien>  getListStu();

    void saveStu(SinhVien student);

    void deleteStu(int mssv);

    public List<BangDiemSvDto> getBangDiemSv(int mssv);

    public List<BangDiemLopDto> getBangDiemLop(int maLop);

    public List<ThoiKhoaBieuDto> getTkbDto(int mssv);

    /*------------------------------*/

    public SinhVien addSinhVien(int mssv, String name);
    public BangDiem addBangDiem(int mssv, String maHP, float diem);
}
