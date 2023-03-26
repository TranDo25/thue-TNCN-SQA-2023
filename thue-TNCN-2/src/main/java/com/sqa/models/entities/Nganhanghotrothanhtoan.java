package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "nganhanghotrothanhtoan")
public class Nganhanghotrothanhtoan {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "tennganhang")
    private String tennganhang;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTennganhang() {
        return this.tennganhang;
    }

    public void setTennganhang(String tennganhang) {
        this.tennganhang = tennganhang;
    }
}
