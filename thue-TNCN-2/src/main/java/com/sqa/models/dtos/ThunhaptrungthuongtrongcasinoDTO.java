package com.sqa.models.dtos;
import lombok.Data;

@Data
public class ThunhaptrungthuongtrongcasinoDTO {
    private String idThuNhapTrungThuongTrongCasino;
    private String thunhapkhongchiuthueIdThuNhapKhongChiuThue;

    public String getIdThuNhapTrungThuongTrongCasino() {
        return this.idThuNhapTrungThuongTrongCasino;
    }


}
