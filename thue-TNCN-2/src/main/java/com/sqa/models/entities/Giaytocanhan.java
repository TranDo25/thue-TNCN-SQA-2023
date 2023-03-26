package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "giaytocanhan")
public class Giaytocanhan {
    @Id
    @Column(name = "idGiayToCaNhan")
    private String idGiayToCaNhan;

    @Column(name = "loaigiayto")
    private String loaigiayto;

    @Column(name = "sogiayto")
    private String sogiayto;

    @Column(name = "ngaycap")
    private java.sql.Date ngaycap;

    @Column(name = "noicap")
    private String noicap;

    @Column(name = "hotennguoidkythue")
    private String hotennguoidkythue;

    @Column(name = "ngaysinh")
    private java.sql.Date ngaysinh;

    @Column(name = "gioitinh")
    private Boolean gioitinh;

    @Column(name = "quoctich")
    private String quoctich;

    @Column(name = "tokhaithuecanhanthongthuong_idToKhaiThueCaNhanThongThuong")
    private String tokhaithuecanhanthongthuongIdToKhaiThueCaNhanThongThuong;


}
