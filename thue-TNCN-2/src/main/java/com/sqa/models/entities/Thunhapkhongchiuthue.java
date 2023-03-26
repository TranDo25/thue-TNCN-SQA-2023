package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thunhapkhongchiuthue")
public class Thunhapkhongchiuthue {
    @Id
    @Column(name = "idThuNhapKhongChiuThue")
    private String idThuNhapKhongChiuThue;

    @Column(name = "nguoinopthue_id")
    private String nguoinopthueId;

    public String getIdThuNhapKhongChiuThue() {
        return this.idThuNhapKhongChiuThue;
    }

    public void setIdThuNhapKhongChiuThue(String idThuNhapKhongChiuThue) {
        this.idThuNhapKhongChiuThue = idThuNhapKhongChiuThue;
    }

    public String getNguoinopthueId() {
        return this.nguoinopthueId;
    }

    public void setNguoinopthueId(String nguoinopthueId) {
        this.nguoinopthueId = nguoinopthueId;
    }
}
