package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hosokhaibaothue")
public class Hosokhaibaothue {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "magiaodich")
    private String magiaodich;

    @Column(name = "ngaytaohoso")
    private java.sql.Date ngaytaohoso;

    @Column(name = "trangthaihoso")
    private String trangthaihoso;

    @Column(name = "nguoinopthue_id")
    private String nguoinopthueId;

    @Column(name = "tongcucthue_idTongCucThue")
    private String tongcucthueIdTongCucThue;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMagiaodich() {
        return this.magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public java.sql.Date getNgaytaohoso() {
        return this.ngaytaohoso;
    }

    public void setNgaytaohoso(java.sql.Date ngaytaohoso) {
        this.ngaytaohoso = ngaytaohoso;
    }

    public String getTrangthaihoso() {
        return this.trangthaihoso;
    }

    public void setTrangthaihoso(String trangthaihoso) {
        this.trangthaihoso = trangthaihoso;
    }

    public String getNguoinopthueId() {
        return this.nguoinopthueId;
    }

    public void setNguoinopthueId(String nguoinopthueId) {
        this.nguoinopthueId = nguoinopthueId;
    }

    public String getTongcucthueIdTongCucThue() {
        return this.tongcucthueIdTongCucThue;
    }

    public void setTongcucthueIdTongCucThue(String tongcucthueIdTongCucThue) {
        this.tongcucthueIdTongCucThue = tongcucthueIdTongCucThue;
    }
}
