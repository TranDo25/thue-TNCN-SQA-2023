package com.sqa.models.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "tienthuakequatangtructiep")
public class Tienthuakequatangtructiep {
    @Id
    @Column(name = "idTienThuaKeQuaTangTrucTiep")
    private String idTienThuaKeQuaTangTrucTiep;

    @Column(name = "TienThuaKeQuaTangTrucTiepcol")
    private String tienThuaKeQuaTangTrucTiepcol;

    @Column(name = "thunhapkhongchiuthue_idThuNhapKhongChiuThue")
    private String thunhapkhongchiuthueIdThuNhapKhongChiuThue;

    public String getIdTienThuaKeQuaTangTrucTiep() {
        return this.idTienThuaKeQuaTangTrucTiep;
    }

    public void setIdTienThuaKeQuaTangTrucTiep(String idTienThuaKeQuaTangTrucTiep) {
        this.idTienThuaKeQuaTangTrucTiep = idTienThuaKeQuaTangTrucTiep;
    }

    public String getTienThuaKeQuaTangTrucTiepcol() {
        return this.tienThuaKeQuaTangTrucTiepcol;
    }

    public void setTienThuaKeQuaTangTrucTiepcol(String tienThuaKeQuaTangTrucTiepcol) {
        this.tienThuaKeQuaTangTrucTiepcol = tienThuaKeQuaTangTrucTiepcol;
    }

    public String getThunhapkhongchiuthueIdThuNhapKhongChiuThue() {
        return this.thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }

    public void setThunhapkhongchiuthueIdThuNhapKhongChiuThue(String thunhapkhongchiuthueIdThuNhapKhongChiuThue) {
        this.thunhapkhongchiuthueIdThuNhapKhongChiuThue = thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }
}
