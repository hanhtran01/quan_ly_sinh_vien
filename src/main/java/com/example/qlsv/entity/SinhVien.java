package com.example.qlsv.entity;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@Table(name = "sinh_vien")
public class SinhVien {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int mssv;

    @Column(name = "ten_sv")
    private String name;

    @Column(name = "avatar")
    private String ava;

    @Column(name = "buoi_vang")
    private int buoiVang;

    @OneToMany(mappedBy = "sinhVien", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<BangDiem> bangDiem;

}
