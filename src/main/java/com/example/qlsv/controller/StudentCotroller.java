package com.example.qlsv.controller;

import com.example.qlsv.entity.SinhVien;
import com.example.qlsv.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/add")
    public List<SinhVien> addStu() {
        List<SinhVien> stu = stuService.getListStu();
        return stu;
    }


}
