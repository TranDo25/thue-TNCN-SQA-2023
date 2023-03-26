package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tienboithuongbaohiemnhantho")
public class Tienboithuongbaohiemnhantho {
    @Id
    @Column(name = "idTienBoiThuongBaoHiemNhanTho")
    private String idTienBoiThuongBaoHiemNhanTho;

    @Column(name = "thunhapkhongchiuthue_idThuNhapKhongChiuThue")
    private String thunhapkhongchiuthueIdThuNhapKhongChiuThue;

    public String getIdTienBoiThuongBaoHiemNhanTho() {
        return this.idTienBoiThuongBaoHiemNhanTho;
    }

    public void setIdTienBoiThuongBaoHiemNhanTho(String idTienBoiThuongBaoHiemNhanTho) {
        this.idTienBoiThuongBaoHiemNhanTho = idTienBoiThuongBaoHiemNhanTho;
    }

    public String getThunhapkhongchiuthueIdThuNhapKhongChiuThue() {
        return this.thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }

    public void setThunhapkhongchiuthueIdThuNhapKhongChiuThue(String thunhapkhongchiuthueIdThuNhapKhongChiuThue) {
        this.thunhapkhongchiuthueIdThuNhapKhongChiuThue = thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }
}
