package com.example.qlsv.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lop_hoc")
public class LopHoc {
    @Id
    @Column(name = "ma_lop")
    private int maLop = 0;

    @Column(name = "ten_lop")
    private String tenLop;

    @Column(name = "dia_diem")
    private String diaDiem;

    @OneToMany(mappedBy = "lopHoc", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<TKB> tkb;

    @OneToMany()
    @JoinColumn(name = "ma_lop")
    private List<SinhVien> sinhVien = new ArrayList<>();
}
