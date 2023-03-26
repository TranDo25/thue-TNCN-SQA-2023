package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thunhaptutienluongtiencong")
public class Thunhaptutienluongtiencong {
    @Id
    @Column(name = "idThuNhapTuTienLuongTienCong")
    private String idThuNhapTuTienLuongTienCong;

    @Column(name = "thunhapchiuthue_idThuNhapChiuThue")
    private String thunhapchiuthueIdThuNhapChiuThue;

    public String getIdThuNhapTuTienLuongTienCong() {
        return this.idThuNhapTuTienLuongTienCong;
    }

    public void setIdThuNhapTuTienLuongTienCong(String idThuNhapTuTienLuongTienCong) {
        this.idThuNhapTuTienLuongTienCong = idThuNhapTuTienLuongTienCong;
    }

    public String getThunhapchiuthueIdThuNhapChiuThue() {
        return this.thunhapchiuthueIdThuNhapChiuThue;
    }

    public void setThunhapchiuthueIdThuNhapChiuThue(String thunhapchiuthueIdThuNhapChiuThue) {
        this.thunhapchiuthueIdThuNhapChiuThue = thunhapchiuthueIdThuNhapChiuThue;
    }
}
