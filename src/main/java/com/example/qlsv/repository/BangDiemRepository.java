package com.example.qlsv.repository;

import com.example.qlsv.entity.GiangVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BangDiemRepository extends JpaRepository<GiangVien, Long> {
}
