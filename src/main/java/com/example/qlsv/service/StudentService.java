package com.example.qlsv.service;

import com.example.qlsv.entity.BangDiem;
import com.example.qlsv.entity.SinhVien;
import com.example.qlsv.model.dto.BangDiemSvDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public List<SinhVien>  getListStu();

    void saveStu(SinhVien student);

    void deleteStu(int mssv);

    public List<BangDiemSvDto> getBangDiemSv(int mssv);

}
