package com.example.qlsv.controller;

import com.example.qlsv.dto.BangDiemLopDto;
import com.example.qlsv.dto.BangDiemSvDto;
import com.example.qlsv.dto.MyResponse;
import com.example.qlsv.dto.ThoiKhoaBieuDto;
import com.example.qlsv.entity.SinhVien;
import com.example.qlsv.repository.LopHocRepository;
import com.example.qlsv.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentCotroller {
    //@Qualifier("")
    @Autowired
    private StudentService stuService;

    @GetMapping("")
    public List<SinhVien> getListStu() {
        List<SinhVien> stu = stuService.getListStu();
        return stu;
    }

    /*@GetMapping("/diem-theo-mssv")
    public List<BangDiemSvDto> getListScore_id() {
        return stuService.getBangDiemSv(20202020);
    }*/

    @GetMapping("/diem-theo-mssv/id={id}")
    public ResponseEntity<?> getListScore_id(@PathVariable int id) {
        List<BangDiemSvDto> result = stuService.getBangDiemSv(id);
        return ResponseEntity.ok(result);
    }

   /* @GetMapping("/thoi-khoa-bieu")
    public List<ThoiKhoaBieuDto> getThoiKhoaBieu() {
        return stuService.getTkbDto(20202020);
    }*/

    @GetMapping("/thoi-khoa-bieu/id={id}")
    public ResponseEntity<?> getThoiKhoaBieu(@PathVariable int id) {
        List<ThoiKhoaBieuDto> result = stuService.getTkbDto(id);
        return ResponseEntity.ok(result);
    }

}
