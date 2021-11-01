package com.example.qlsv.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mon_hoc")
public class MonHoc {
    @Id
    @Column(name = "ma_hp")
    private String maHP;

    @Column(name = "ten_mon")
    private String tenMon;

    @Column(name = "so_tin")
    private int soTin;

    @Column(name = "loai_lop")
    private String loaiLop;

    @OneToMany(mappedBy = "monHoc", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<TKB> tkb;

    @OneToMany(mappedBy = "monHoc", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<BangDiem> bangDiem;
}
