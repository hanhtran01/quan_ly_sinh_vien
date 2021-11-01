package com.example.qlsv.service.impl;

import com.example.qlsv.entity.BangDiem;
import com.example.qlsv.entity.SinhVien;
import com.example.qlsv.model.dto.BangDiemSvDto;
import com.example.qlsv.model.mapper.BangDiemSvMapper;
import com.example.qlsv.repository.BangDiemRepository;
import com.example.qlsv.repository.SinhVienRepository;
import com.example.qlsv.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    public SinhVienRepository StuRepository;

    @Autowired
    public BangDiemRepository bangDiemRepository;

    @Override
    public List<SinhVien> getListStu() {
        //System.out.println("Debug...." + StuRepository.findAll());
        return StuRepository.findAll();
    }

    @Override
    public void saveStu(SinhVien student) {
        StuRepository.save(student);
    }

    @Override
    public void deleteStu(int mssv) {
        StuRepository.deleteById((long) mssv);
    }

    @Override
    public List<BangDiemSvDto> getBangDiemSv(int mssv) {
        List<BangDiemSvDto> result = new ArrayList<BangDiemSvDto>();
        result.add(BangDiemSvMapper.toBangDiemSvDto(bangDiemRepository.));
        bangDiemRepository.
        return result;
    }


}
