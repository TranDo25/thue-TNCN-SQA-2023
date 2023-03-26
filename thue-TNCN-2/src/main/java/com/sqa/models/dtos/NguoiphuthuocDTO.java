package com.sqa.models.dtos;
import lombok.Data;

@Data
public class NguoiphuthuocDTO {
    private String id;
    private String hoten;
    private java.sql.Date ngaysinh;
    private String masothue;
    private String quoctich;
    private String cccd;
    private String cmnd;
    private String sodinhdangcanhan;
    private java.sql.Date thoigiangiamtrututhang;
    private java.sql.Date thoigiangiamtrudenthang;
    private String fkNptDkyGiamtru;
    private String fkNptGiaykhaisinh;




}
