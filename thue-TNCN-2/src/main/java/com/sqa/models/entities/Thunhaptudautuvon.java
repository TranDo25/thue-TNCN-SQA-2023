package com.sqa.models.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "thunhaptudautuvon")
public class Thunhaptudautuvon {
    @Id
    @Column(name = "idThuNhapTuDauTuVon")
    private String idThuNhapTuDauTuVon;

    @Id
    @Column(name = "thunhapchiuthue_idThuNhapChiuThue")
    private String thunhapchiuthueIdThuNhapChiuThue;

    public String getIdThuNhapTuDauTuVon() {
        return this.idThuNhapTuDauTuVon;
    }

    public void setIdThuNhapTuDauTuVon(String idThuNhapTuDauTuVon) {
        this.idThuNhapTuDauTuVon = idThuNhapTuDauTuVon;
    }

    public String getThunhapchiuthueIdThuNhapChiuThue() {
        return this.thunhapchiuthueIdThuNhapChiuThue;
    }

    public void setThunhapchiuthueIdThuNhapChiuThue(String thunhapchiuthueIdThuNhapChiuThue) {
        this.thunhapchiuthueIdThuNhapChiuThue = thunhapchiuthueIdThuNhapChiuThue;
    }
}
