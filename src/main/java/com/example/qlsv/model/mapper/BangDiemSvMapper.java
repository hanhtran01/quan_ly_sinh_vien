package com.example.qlsv.model.mapper;

import com.example.qlsv.entity.BangDiem;
import com.example.qlsv.model.dto.BangDiemSvDto;
import com.example.qlsv.repository.BangDiemRepository;

public class BangDiemSvMapper {
    public static BangDiemSvDto toBangDiemSvDto(BangDiemRepository bangDiem) {
        BangDiemSvDto tmp = new BangDiemSvDto();
        tmp.setMssv(bangDiem.);
        tmp.setName(bangDiem.getSinhVien().getName());
        tmp.setMaHP(bangDiem.getMonHoc().getMaHP());
        tmp.setDiem(bangDiem.getDiem());

        return tmp;
    }
}
