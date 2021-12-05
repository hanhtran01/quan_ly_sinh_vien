package com.example.qlsv.controller;

import com.example.qlsv.entity.BangDiem;
import com.example.qlsv.entity.LopHoc;
import com.example.qlsv.entity.SinhVien;
import com.example.qlsv.repository.LopHocRepository;
import com.example.qlsv.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lecture")
public class LecturerController {
    @Autowired
    private StudentService stuService;

    @PostMapping("/add-student")
    public SinhVien addSinhVien(int mssv, String name) {
        return stuService.addSinhVien(mssv, name);
    }

    @PostMapping("/them-diem")
    public BangDiem addBangDiem(int mssv, String maHP, float diem) {
        return stuService.addBangDiem(mssv, maHP, diem);
    }

    /*@PostMapping("/test")
    public BangDiem test(BangDiem bangDiem) {
        return stuService.addBangDiem(bangDiem.getSinhVien().getMssv(), bangDiem.getMonHoc().getMaHP(), bangDiem.getDiem());
    }*/

    @PostMapping("/test")
    public LopHoc test(@RequestBody LopHoc lopHoc) {
        System.out.println(lopHoc);
        return lopHoc;
    }
}
