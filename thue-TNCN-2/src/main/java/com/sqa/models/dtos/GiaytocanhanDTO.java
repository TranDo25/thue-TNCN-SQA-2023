package com.sqa.models.dtos;

import lombok.Data;

@Data
public class GiaytocanhanDTO {
    private String idGiayToCaNhan;
    private String loaigiayto;
    private String sogiayto;
    private java.sql.Date ngaycap;
    private String noicap;
    private String hotennguoidkythue;
    private java.sql.Date ngaysinh;
    private Boolean gioitinh;
    private String quoctich;
    private String tokhaithuecanhanthongthuongIdToKhaiThueCaNhanThongThuong;


}
