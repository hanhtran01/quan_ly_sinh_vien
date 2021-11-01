package com.example.qlsv.repository;

import com.example.qlsv.entity.TKB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TKBRepository extends JpaRepository<TKB, Long> {
}
