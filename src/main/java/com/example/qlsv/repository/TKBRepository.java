package com.example.qlsv.repository;

import com.example.qlsv.entity.LopHoc;
import com.example.qlsv.entity.MonHoc;
import com.example.qlsv.entity.TKB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TKBRepository extends JpaRepository<TKB, Long> {
    TKB getTKBByLopHoc(LopHoc lopHoc);
    TKB getTKBByLopHoc_MaLop(int maLop);
    TKB getTKBByMonHoc(MonHoc monHoc);
}
