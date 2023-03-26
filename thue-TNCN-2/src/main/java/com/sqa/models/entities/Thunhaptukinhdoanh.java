package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thunhaptukinhdoanh")
public class Thunhaptukinhdoanh {
    @Id
    @Column(name = "idThuNhapTuKinhDoanh")
    private String idThuNhapTuKinhDoanh;

    @Column(name = "thunhapchiuthue_idThuNhapChiuThue")
    private String thunhapchiuthueIdThuNhapChiuThue;

    public String getIdThuNhapTuKinhDoanh() {
        return this.idThuNhapTuKinhDoanh;
    }

    public void setIdThuNhapTuKinhDoanh(String idThuNhapTuKinhDoanh) {
        this.idThuNhapTuKinhDoanh = idThuNhapTuKinhDoanh;
    }

    public String getThunhapchiuthueIdThuNhapChiuThue() {
        return this.thunhapchiuthueIdThuNhapChiuThue;
    }

    public void setThunhapchiuthueIdThuNhapChiuThue(String thunhapchiuthueIdThuNhapChiuThue) {
        this.thunhapchiuthueIdThuNhapChiuThue = thunhapchiuthueIdThuNhapChiuThue;
    }
}
