package com.example.qlsv.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bang_diem")
public class BangDiem {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "diem")
    private float diem;


    @ManyToOne
    @JoinColumn(name = "mssv")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "ma_hp")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private MonHoc monHoc;
}
