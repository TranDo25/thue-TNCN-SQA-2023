package com.sqa.models.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "tokhaithuecanhanthongthuong")
public class Tokhaithuecanhanthongthuong {
    @Id
    @Column(name = "idToKhaiThueCaNhanThongThuong")
    private String idToKhaiThueCaNhanThongThuong;

    @Column(name = "hosodangkythue_idHoSoDangKyThue")
    private String hosodangkythueIdHoSoDangKyThue;

    public String getIdToKhaiThueCaNhanThongThuong() {
        return this.idToKhaiThueCaNhanThongThuong;
    }

    public void setIdToKhaiThueCaNhanThongThuong(String idToKhaiThueCaNhanThongThuong) {
        this.idToKhaiThueCaNhanThongThuong = idToKhaiThueCaNhanThongThuong;
    }

    public String getHosodangkythueIdHoSoDangKyThue() {
        return this.hosodangkythueIdHoSoDangKyThue;
    }

    public void setHosodangkythueIdHoSoDangKyThue(String hosodangkythueIdHoSoDangKyThue) {
        this.hosodangkythueIdHoSoDangKyThue = hosodangkythueIdHoSoDangKyThue;
    }
}
