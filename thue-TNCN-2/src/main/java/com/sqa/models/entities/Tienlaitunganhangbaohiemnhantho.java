package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tienlaitunganhangbaohiemnhantho")
public class Tienlaitunganhangbaohiemnhantho {
    @Id
    @Column(name = "idTienLaiTuNganHangBaoHiemNhanTho")
    private String idTienLaiTuNganHangBaoHiemNhanTho;

    @Column(name = "thunhapkhongchiuthue_idThuNhapKhongChiuThue")
    private String thunhapkhongchiuthueIdThuNhapKhongChiuThue;

    public String getIdTienLaiTuNganHangBaoHiemNhanTho() {
        return this.idTienLaiTuNganHangBaoHiemNhanTho;
    }

    public void setIdTienLaiTuNganHangBaoHiemNhanTho(String idTienLaiTuNganHangBaoHiemNhanTho) {
        this.idTienLaiTuNganHangBaoHiemNhanTho = idTienLaiTuNganHangBaoHiemNhanTho;
    }

    public String getThunhapkhongchiuthueIdThuNhapKhongChiuThue() {
        return this.thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }

    public void setThunhapkhongchiuthueIdThuNhapKhongChiuThue(String thunhapkhongchiuthueIdThuNhapKhongChiuThue) {
        this.thunhapkhongchiuthueIdThuNhapKhongChiuThue = thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }
}
