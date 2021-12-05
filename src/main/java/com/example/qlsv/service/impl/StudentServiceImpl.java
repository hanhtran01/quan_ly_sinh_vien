package com.example.qlsv.service.impl;

import com.example.qlsv.dto.BangDiemLopDto;
import com.example.qlsv.dto.ThoiKhoaBieuDto;
import com.example.qlsv.entity.*;
import com.example.qlsv.dto.BangDiemSvDto;
import com.example.qlsv.repository.*;
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

    @Autowired
    public MonHocRepository monHocRepository;

    @Autowired
    public SinhVienRepository sinhVienRepository;

    @Autowired
    public TKBRepository tkbRepository;

    @Autowired
    public LopHocRepository lopHocRepository;

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
        List<BangDiemSvDto> result = new ArrayList<>();
        List<BangDiem> bangDiemList = bangDiemRepository.getALLBySinhVien_Mssv(mssv);

        for(BangDiem user : bangDiemList) {
            BangDiemSvDto tmp = new BangDiemSvDto(monHocRepository.getMonHocByBangDiem(user).getMaHP(), user.getMonHoc().getTenMon(), user.getDiem());
            result.add(tmp);
        }
        return result;
    }

    @Override
    public List<BangDiemLopDto> getBangDiemLop(int maLop) {
        List<BangDiemLopDto> result = new ArrayList<>();
        TKB tkb = tkbRepository.getTKBByLopHoc_MaLop(maLop);   // TKB tuong ung voi maLop

        MonHoc monHoc = monHocRepository.getMonHocByTkb(tkb);      // monHoc tuong ung voi TKB (co maLop)

        List<BangDiem> bangDiem = bangDiemRepository.getBangDiemByMonHoc(monHoc);
        for(BangDiem user : bangDiem) {
            BangDiemLopDto tmp = new BangDiemLopDto(user.getSinhVien().getMssv(), user.getSinhVien().getName(), user.getDiem());
            result.add(tmp);
        }
        return result;
    }

    @Override
    public List<ThoiKhoaBieuDto> getTkbDto(int mssv) {
        List<ThoiKhoaBieuDto> result = new ArrayList<>();

        List<BangDiem> bangDiem = bangDiemRepository.getALLBySinhVien_Mssv(mssv);    // List maHP (trong BangDiem) cua 1 sv

        List<MonHoc> monHocList = new ArrayList<>();
        for (BangDiem user : bangDiem) {
            monHocList.add(monHocRepository.getMonHocByBangDiem(user));              // ADD du lieu vao MonHoc
        }

        List<TKB> tkbList = new ArrayList<>();                                     // List thoi khoa bieu cac mon

        for (MonHoc user : monHocList) {
            tkbList.add(tkbRepository.getTKBByMonHoc(user));                          // ADD du lieu vao list TKB
        }

        for (TKB user : tkbList) {
            ThoiKhoaBieuDto tmp = ThoiKhoaBieuDto.builder()
                    .maHP(user.getMonHoc().getMaHP())
                    .maLop(user.getLopHoc().getMaLop())
                    .tenMon(user.getMonHoc().getTenMon())
                    .idGV(user.getGiangVien().getId())
                    .lichHoc(user.getLichHoc())
                    .diaDiem(user.getLopHoc().getDiaDiem())
                    .build();
            result.add(tmp);
        }
        return result;
    }
    /*-----------------------------*/
    @Override
    public SinhVien addSinhVien(int mssv, String name) {
        SinhVien tmp = new SinhVien();
        tmp.setMssv(mssv);
        tmp.setName(name);
        return tmp;
    }

    @Override
    public BangDiem addBangDiem(int mssv, String maHP, float diem) {
        BangDiem tmp = new BangDiem();
        tmp.setSinhVien(sinhVienRepository.getSinhVienByMssv(mssv));
        tmp.setMonHoc(monHocRepository.getMonHocByMaHP(maHP));
        tmp.setDiem(diem);
        return tmp;
    }

}
