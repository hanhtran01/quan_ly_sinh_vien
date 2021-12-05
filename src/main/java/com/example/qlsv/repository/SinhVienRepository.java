package com.example.qlsv.repository;

import com.example.qlsv.entity.BangDiem;
import com.example.qlsv.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Long> {
    SinhVien getSinhVienByBangDiem(BangDiem bangDiem);
    SinhVien getSinhVienByMssv(int mssv);

    /*@Query("SELECT e FROM SinhVien e WHERE e.mssv = :mssv")
    SinhVien getSV(@Param("mssv") int mssv );*/
}
