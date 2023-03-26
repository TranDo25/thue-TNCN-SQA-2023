package com.sqa.models.dtos;

import lombok.Data;

@Data
public class BieuthueluytientungphanDTO {
    private String idBieuThueLuyTienTungPhan;
    private Integer bacthue;
    private String phanthunhaptinhthuenam;
    private String phanthunhaptinhthuethang;
    private Double thuesuat;
    private String cauhinhIdCauHinh;


}
