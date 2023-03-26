package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tongcucthue")
public class Tongcucthue {
    @Id
    @Column(name = "idTongCucThue")
    private String idTongCucThue;

    @Column(name = "ten")
    private String ten;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "email")
    private String email;

    @Column(name = "sdt")
    private String sdt;

    public String getIdTongCucThue() {
        return this.idTongCucThue;
    }

    public void setIdTongCucThue(String idTongCucThue) {
        this.idTongCucThue = idTongCucThue;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return this.diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
