package com.sqa.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NguoinopthueDTO {
    private String id;
    private String sogiayto;
    private String username;
    private String email;
    private String password;
    private java.sql.Timestamp createTime;
    private String masothue;
    private String tencanhan;
    private String tinhTp;
    private String coquancapMst;
    private String loaigiayto;
    private String sodienthoai;
    private Boolean gioitinh;
    private String captcha;

}
