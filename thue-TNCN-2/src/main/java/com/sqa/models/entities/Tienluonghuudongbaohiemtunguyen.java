package com.sqa.models.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "tienluonghuudongbaohiemtunguyen")
public class Tienluonghuudongbaohiemtunguyen {
    @Id
    @Column(name = "idTienLuongHuuDongBaoHiemTuNguyen")
    private String idTienLuongHuuDongBaoHiemTuNguyen;

    @Column(name = "thunhapkhongchiuthue_idThuNhapKhongChiuThue")
    private String thunhapkhongchiuthueIdThuNhapKhongChiuThue;

    public String getIdTienLuongHuuDongBaoHiemTuNguyen() {
        return this.idTienLuongHuuDongBaoHiemTuNguyen;
    }

    public void setIdTienLuongHuuDongBaoHiemTuNguyen(String idTienLuongHuuDongBaoHiemTuNguyen) {
        this.idTienLuongHuuDongBaoHiemTuNguyen = idTienLuongHuuDongBaoHiemTuNguyen;
    }

    public String getThunhapkhongchiuthueIdThuNhapKhongChiuThue() {
        return this.thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }

    public void setThunhapkhongchiuthueIdThuNhapKhongChiuThue(String thunhapkhongchiuthueIdThuNhapKhongChiuThue) {
        this.thunhapkhongchiuthueIdThuNhapKhongChiuThue = thunhapkhongchiuthueIdThuNhapKhongChiuThue;
    }
}
