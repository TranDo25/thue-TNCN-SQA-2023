package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thunhaptutrungthuongquatang")
public class Thunhaptutrungthuongquatang {
    @Id
    @Column(name = "idThuNhapTuTrungThuongQuaTang")
    private String idThuNhapTuTrungThuongQuaTang;

    @Column(name = "thunhapchiuthue_idThuNhapChiuThue")
    private String thunhapchiuthueIdThuNhapChiuThue;

    public String getIdThuNhapTuTrungThuongQuaTang() {
        return this.idThuNhapTuTrungThuongQuaTang;
    }

    public void setIdThuNhapTuTrungThuongQuaTang(String idThuNhapTuTrungThuongQuaTang) {
        this.idThuNhapTuTrungThuongQuaTang = idThuNhapTuTrungThuongQuaTang;
    }

    public String getThunhapchiuthueIdThuNhapChiuThue() {
        return this.thunhapchiuthueIdThuNhapChiuThue;
    }

    public void setThunhapchiuthueIdThuNhapChiuThue(String thunhapchiuthueIdThuNhapChiuThue) {
        this.thunhapchiuthueIdThuNhapChiuThue = thunhapchiuthueIdThuNhapChiuThue;
    }
}
