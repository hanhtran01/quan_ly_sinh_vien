package com.example.qlsv.controller;

import com.example.qlsv.dto.BangDiemLopDto;
import com.example.qlsv.dto.MyResponse;
import com.example.qlsv.dto.ThoiKhoaBieuDto;
import com.example.qlsv.entity.BangDiem;
import com.example.qlsv.entity.LopHoc;
import com.example.qlsv.entity.SinhVien;
import com.example.qlsv.repository.LopHocRepository;
import com.example.qlsv.service.StudentService;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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

    @GetMapping("/thoi-khoa-bieu/id={id}")
    public ResponseEntity<?> getThoiKhoaBieu(@PathVariable String id) {
        List<ThoiKhoaBieuDto> result = stuService.getTkbLecturer(id);
        return ResponseEntity.ok(MyResponse.success(result));
    }

    /*@GetMapping("/diem-theo-lop")
    public List<BangDiemLopDto> getListScore_Class() {
        return stuService.getBangDiemLop(100);
    }*/

    @GetMapping("/diem-theo-lop/malop={id}")
    public ResponseEntity<?> getListScore_Class(@PathVariable int id) {
        List<BangDiemLopDto> result = stuService.getBangDiemLop(id);
        return ResponseEntity.ok(result);
    }

//    @PostMapping("/thoi-khoa-bieu/search")
//    public ThoiKhoaBieuDto timTkb_lop(@RequestBody LopHoc lopHoc) {
//        return stuService.getTKB_maLop(lopHoc.getMaLop());
//    }

    @PostMapping("/thoi-khoa-bieu/search")
    public ResponseEntity<?> timTkb_lop(@RequestBody LopHoc lopHoc) {
        if (lopHoc.getMaLop() != 0) {
            List<ThoiKhoaBieuDto> result = stuService.getTKB_maLop(lopHoc.getMaLop());
            return ResponseEntity.ok(MyResponse.success(result));
        } else {
            List<ThoiKhoaBieuDto> result = stuService.getListTKB();
            return ResponseEntity.ok(MyResponse.success(result));
        }
    }

    @PostMapping("/diem-theo-lop/search")
    public ResponseEntity<?> timBangDiem_lop(@RequestBody LopHoc lopHoc) {
        if (lopHoc.getMaLop() != 0) {
            List<BangDiemLopDto> result = stuService.getBangDiemLop(lopHoc.getMaLop());
            return ResponseEntity.ok(MyResponse.success(result));
        } else {
            List<ThoiKhoaBieuDto> result = stuService.getListTKB();
            return ResponseEntity.ok(MyResponse.success(result));
        }
    }
}
