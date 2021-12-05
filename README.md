# quan_ly_sinh_vien
* Được viết trên Windows
* Sử dụng IDE IntelliJ: Spring boot, loombook, hibernateCode
* Code trên MySQL
```php

create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;

create table tkb
(
	id			int AUTO_INCREMENT,
	ma_hp		varchar(10),
    ma_lop		int,
    id_gv		varchar(50),
    lich_hoc	varchar(100),
	primary key (id, ma_hp, ma_lop, id_gv)
);

create table mon_hoc
(
	ma_hp		varchar(10),
    ten_mon		varchar(50),
    so_tin		int,
    loai_lop	varchar(10),
    primary key (ma_hp)
);

create table lop_hoc
(	
	ma_lop		int,
    ten_lop		varchar(100),
    dia_diem	varchar(50),
    primary key (ma_lop)
);

create table giang_vien
(
	id_gv		varchar(50),
    ten_gv		varchar(100),
    khoa		varchar(50),
    primary key (id_gv)
);

create table sinh_vien
(
	mssv		int,
    ma_lop		int,
    ten_sv		varchar(100),
    avatar		varchar(100),
    buoi_vang	int,
    primary key (mssv)
);

create table bang_diem
(	
	id			int AUTO_INCREMENT,
	mssv		int,
    ma_hp		varchar(10),
    diem		float,
	primary key (id, mssv, ma_hp)
);


alter table tkb add constraint Fk_TKB_MocHoc
	foreign key (ma_hp) references mon_hoc(ma_hp);

alter table tkb add constraint Fk_TKB_LopHoc
	foreign key (ma_lop) references lop_hoc(ma_lop);

alter table tkb add constraint Fk_TKB_GiangVien
	foreign key (id_gv) references giang_vien(id_gv);

alter table bang_diem add constraint Fk_BangDiem_SV
	foreign key (mssv) references sinh_vien(mssv);
    
alter table bang_diem add constraint Fk_BangDiem_MonHoc
	foreign key (ma_hp) references mon_hoc(ma_hp);
    
alter table sinh_vien add constraint Fk_SinhVien_LopHoc
	foreign key (ma_lop) references lop_hoc(ma_lop); 
    

```
