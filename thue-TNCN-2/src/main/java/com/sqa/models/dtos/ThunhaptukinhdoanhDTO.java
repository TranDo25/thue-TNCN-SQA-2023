package com.sqa.models.dtos;
import lombok.Data;

@Data
public class ThunhaptukinhdoanhDTO {
    private String idThuNhapTuKinhDoanh;
    private String thunhapchiuthueIdThuNhapChiuThue;

    public String getIdThuNhapTuKinhDoanh() {
        return this.idThuNhapTuKinhDoanh;
    }


}
