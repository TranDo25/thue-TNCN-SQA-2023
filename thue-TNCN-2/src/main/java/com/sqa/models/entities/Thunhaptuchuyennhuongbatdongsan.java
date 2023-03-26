package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thunhaptuchuyennhuongbatdongsan")
public class Thunhaptuchuyennhuongbatdongsan {
    @Id
    @Column(name = "idThuNhapTuChuyenNhuongBatDongSan")
    private String idThuNhapTuChuyenNhuongBatDongSan;

    @Column(name = "thunhapchiuthue_idThuNhapChiuThue")
    private String thunhapchiuthueIdThuNhapChiuThue;

    public String getIdThuNhapTuChuyenNhuongBatDongSan() {
        return this.idThuNhapTuChuyenNhuongBatDongSan;
    }

    public void setIdThuNhapTuChuyenNhuongBatDongSan(String idThuNhapTuChuyenNhuongBatDongSan) {
        this.idThuNhapTuChuyenNhuongBatDongSan = idThuNhapTuChuyenNhuongBatDongSan;
    }

    public String getThunhapchiuthueIdThuNhapChiuThue() {
        return this.thunhapchiuthueIdThuNhapChiuThue;
    }

    public void setThunhapchiuthueIdThuNhapChiuThue(String thunhapchiuthueIdThuNhapChiuThue) {
        this.thunhapchiuthueIdThuNhapChiuThue = thunhapchiuthueIdThuNhapChiuThue;
    }
}
