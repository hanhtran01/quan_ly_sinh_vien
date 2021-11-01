package com.example.qlsv.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "sinh_vien")
public class SinhVien {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int mssv;

    @Column(name = "ten_sv")
    private String name;

    @Column(name = "ava")
    private String ava;

    @OneToMany(mappedBy = "sinhVien", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<BangDiem> bangDiem;

}
