package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thunhaptuvantaiduongbienquocte")
public class Thunhaptuvantaiduongbienquocte {
    @Id
    @Column(name = "idThuNhapTuVanTaiDuongBienQuocTe")
    private String idThuNhapTuVanTaiDuongBienQuocTe;

    @Column(name = "thunhapkhongchiuthue_idThuNhapKhongChiuThue")
    private String thunhapkhongchiuthueIdThuNhapKhongChiuThue;

    public String getIdThuNhapTuVanTaiDuongBienQuocTe() {
        return this.idThuNhapTuVanTaiDuongBienQuocTe;
    }

    public void setIdThuNhapTuVanTaiDuongBienQuocTe(String idThuNhapTuVanTaiDuongBienQuocTe) {
        this.idThuNhapTuVanTaiDuongBienQuocTe = idThuNhapTuVanTaiDuongBienQuocTe;
    }

    public String getThunhapkhongchiuthueIdThuNhapKhongChiuThue() {
        return this.thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }

    public void setThunhapkhongchiuthueIdThuNhapKhongChiuThue(String thunhapkhongchiuthueIdThuNhapKhongChiuThue) {
        this.thunhapkhongchiuthueIdThuNhapKhongChiuThue = thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }
}
