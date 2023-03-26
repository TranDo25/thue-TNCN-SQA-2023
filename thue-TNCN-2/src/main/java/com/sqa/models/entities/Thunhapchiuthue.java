package com.sqa.models.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "thunhapchiuthue")
public class Thunhapchiuthue {
    @Id
    @Column(name = "idThuNhapChiuThue")
    private String idThuNhapChiuThue;

    @Column(name = "nguoinopthue_id")
    private String nguoinopthueId;

    public String getIdThuNhapChiuThue() {
        return this.idThuNhapChiuThue;
    }

    public void setIdThuNhapChiuThue(String idThuNhapChiuThue) {
        this.idThuNhapChiuThue = idThuNhapChiuThue;
    }

    public String getNguoinopthueId() {
        return this.nguoinopthueId;
    }

    public void setNguoinopthueId(String nguoinopthueId) {
        this.nguoinopthueId = nguoinopthueId;
    }
}
