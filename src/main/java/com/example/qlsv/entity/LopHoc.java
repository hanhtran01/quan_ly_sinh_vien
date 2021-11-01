package com.example.qlsv.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lop_hoc")
public class LopHoc {
    @Id
    @Column(name = "ma_lop")
    private int maLop;

    @Column(name = "ten_lop")
    private String tenLop;

    @Column(name = "dia_diem")
    private String diaDiem;

    @OneToMany(mappedBy = "lopHoc", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<TKB> tkb;
}
