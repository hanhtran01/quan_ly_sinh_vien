package com.example.qlsv.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tkb")
public class TKB {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "ma_hp")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private MonHoc monHoc;

    @ManyToOne
    @JoinColumn(name = "ma_lop")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private LopHoc lopHoc;

    @ManyToOne
    @JoinColumn(name = "id_gv")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private GiangVien giangVien;
}
