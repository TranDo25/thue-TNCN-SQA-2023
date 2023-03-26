package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thunhaptrungthuongtrongcasino")
public class Thunhaptrungthuongtrongcasino {
    @Id
    @Column(name = "idThuNhapTrungThuongTrongCasino")
    private String idThuNhapTrungThuongTrongCasino;

    @Column(name = "thunhapkhongchiuthue_idThuNhapKhongChiuThue")
    private String thunhapkhongchiuthueIdThuNhapKhongChiuThue;

    public String getIdThuNhapTrungThuongTrongCasino() {
        return this.idThuNhapTrungThuongTrongCasino;
    }

    public void setIdThuNhapTrungThuongTrongCasino(String idThuNhapTrungThuongTrongCasino) {
        this.idThuNhapTrungThuongTrongCasino = idThuNhapTrungThuongTrongCasino;
    }

    public String getThunhapkhongchiuthueIdThuNhapKhongChiuThue() {
        return this.thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }

    public void setThunhapkhongchiuthueIdThuNhapKhongChiuThue(String thunhapkhongchiuthueIdThuNhapKhongChiuThue) {
        this.thunhapkhongchiuthueIdThuNhapKhongChiuThue = thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }
}
