package com.sqa.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bangtonghopnguoiphuthuocdkygiamtrugiacanh")
public class Bangtonghopnguoiphuthuocdkygiamtrugiacanh {
    @Id
    @Column(name = "idBangTongHopNguoiPhuThuocDKYGiamTruGiaCanh")
    private String idBangTongHopNguoiPhuThuocDkyGiamTruGiaCanh;

    @Column(name = "tennguoinopthue")
    private String tennguoinopthue;

    @Column(name = "masothue")
    private String masothue;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "quan/huyen")
    private String quanHuyen;

    @Column(name = "tinh/TP")
    private String tinhTp;

    @Column(name = "fax")
    private String fax;

    @Column(name = "dienthoai")
    private String dienthoai;

    @Column(name = "email")
    private String email;

    @Column(name = "nguoinopthue_id")
    private String nguoinopthueId;

    @Column(name = "dailythue_idDaiLyThue")
    private String dailythueIdDaiLyThue;

    @Column(name = "nhanviendallythue_idNhanVienDalLyThue")
    private String nhanviendallythueIdNhanVienDalLyThue;

    @Column(name = "tongcucthue_idTongCucThue")
    private String tongcucthueIdTongCucThue;


}
