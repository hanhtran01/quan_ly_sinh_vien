package com.example.qlsv.repository;

import com.example.qlsv.entity.BangDiem;
import com.example.qlsv.entity.MonHoc;
import com.example.qlsv.entity.TKB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonHocRepository extends JpaRepository<MonHoc, String> {
    MonHoc getMonHocByBangDiem(BangDiem bangDiem);
    MonHoc getMonHocByTkb(TKB tkb);
    MonHoc getMonHocByMaHP(String maHP);
}
