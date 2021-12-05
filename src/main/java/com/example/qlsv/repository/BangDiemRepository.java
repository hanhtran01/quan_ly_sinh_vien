package com.example.qlsv.repository;

import com.example.qlsv.entity.BangDiem;
import com.example.qlsv.entity.MonHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BangDiemRepository extends JpaRepository<BangDiem, Long> {
    List<BangDiem>   getALLBySinhVien_Mssv(int mssv);
    List<BangDiem>  getAllByMonHoc_MaHP(String maHP);
    List<BangDiem> getBangDiemByMonHoc(MonHoc monHoc);

}
