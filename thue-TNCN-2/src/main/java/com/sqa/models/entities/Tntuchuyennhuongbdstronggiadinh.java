package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tntuchuyennhuongbdstronggiadinh")
public class Tntuchuyennhuongbdstronggiadinh {
    @Id
    @Column(name = "idTNTuChuyenNhuongBDSTrongGiaDinh")
    private String idTnTuChuyenNhuongBdsTrongGiaDinh;

    @Column(name = "thunhapkhongchiuthue_idThuNhapKhongChiuThue")
    private String thunhapkhongchiuthueIdThuNhapKhongChiuThue;

    public String getIdTnTuChuyenNhuongBdsTrongGiaDinh() {
        return this.idTnTuChuyenNhuongBdsTrongGiaDinh;
    }

    public void setIdTnTuChuyenNhuongBdsTrongGiaDinh(String idTnTuChuyenNhuongBdsTrongGiaDinh) {
        this.idTnTuChuyenNhuongBdsTrongGiaDinh = idTnTuChuyenNhuongBdsTrongGiaDinh;
    }

    public String getThunhapkhongchiuthueIdThuNhapKhongChiuThue() {
        return this.thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }

    public void setThunhapkhongchiuthueIdThuNhapKhongChiuThue(String thunhapkhongchiuthueIdThuNhapKhongChiuThue) {
        this.thunhapkhongchiuthueIdThuNhapKhongChiuThue = thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }
}
