package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thunhaptuthuaketren10tr")
public class Thunhaptuthuaketren10Tr {
    @Id
    @Column(name = "idThuNhapTuThuaKeTren10Tr")
    private String idThuNhapTuThuaKeTren10Tr;

    @Column(name = "thunhapchiuthue_idThuNhapChiuThue")
    private String thunhapchiuthueIdThuNhapChiuThue;

    public String getIdThuNhapTuThuaKeTren10Tr() {
        return this.idThuNhapTuThuaKeTren10Tr;
    }

    public void setIdThuNhapTuThuaKeTren10Tr(String idThuNhapTuThuaKeTren10Tr) {
        this.idThuNhapTuThuaKeTren10Tr = idThuNhapTuThuaKeTren10Tr;
    }

    public String getThunhapchiuthueIdThuNhapChiuThue() {
        return this.thunhapchiuthueIdThuNhapChiuThue;
    }

    public void setThunhapchiuthueIdThuNhapChiuThue(String thunhapchiuthueIdThuNhapChiuThue) {
        this.thunhapchiuthueIdThuNhapChiuThue = thunhapchiuthueIdThuNhapChiuThue;
    }
}
