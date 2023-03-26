package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thunhaptubanquyennhuongquyen")
public class Thunhaptubanquyennhuongquyen {
    @Id
    @Column(name = "idThuNhapTuBanQuyenNhuongQuyen")
    private String idThuNhapTuBanQuyenNhuongQuyen;

    @Column(name = "thunhapchiuthue_idThuNhapChiuThue")
    private String thunhapchiuthueIdThuNhapChiuThue;

    public String getIdThuNhapTuBanQuyenNhuongQuyen() {
        return this.idThuNhapTuBanQuyenNhuongQuyen;
    }

    public void setIdThuNhapTuBanQuyenNhuongQuyen(String idThuNhapTuBanQuyenNhuongQuyen) {
        this.idThuNhapTuBanQuyenNhuongQuyen = idThuNhapTuBanQuyenNhuongQuyen;
    }

    public String getThunhapchiuthueIdThuNhapChiuThue() {
        return this.thunhapchiuthueIdThuNhapChiuThue;
    }

    public void setThunhapchiuthueIdThuNhapChiuThue(String thunhapchiuthueIdThuNhapChiuThue) {
        this.thunhapchiuthueIdThuNhapChiuThue = thunhapchiuthueIdThuNhapChiuThue;
    }
}
