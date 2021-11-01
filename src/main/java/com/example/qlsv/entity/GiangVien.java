package com.example.qlsv.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "giang_vien")
public class GiangVien {
    @Id
    @Column(name = "id_gv")
    private String id;

    @Column(name = "ten_gv")
    private String name;

    @OneToMany(mappedBy = "giangVien", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<TKB> tkb;
}
