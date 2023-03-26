package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "taikhoanthanhtoan")
public class Taikhoanthanhtoan {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "hotenchuthe")
    private String hotenchuthe;

    @Column(name = "ngayhieuluc")
    private java.sql.Date ngayhieuluc;

    @Column(name = "sothe")
    private String sothe;

    @Column(name = "nguoinopthue_id")
    private String nguoinopthueId;

    @Column(name = "nganhanghotrothanhtoan_id")
    private String nganhanghotrothanhtoanId;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHotenchuthe() {
        return this.hotenchuthe;
    }

    public void setHotenchuthe(String hotenchuthe) {
        this.hotenchuthe = hotenchuthe;
    }

    public java.sql.Date getNgayhieuluc() {
        return this.ngayhieuluc;
    }

    public void setNgayhieuluc(java.sql.Date ngayhieuluc) {
        this.ngayhieuluc = ngayhieuluc;
    }

    public String getSothe() {
        return this.sothe;
    }

    public void setSothe(String sothe) {
        this.sothe = sothe;
    }

    public String getNguoinopthueId() {
        return this.nguoinopthueId;
    }

    public void setNguoinopthueId(String nguoinopthueId) {
        this.nguoinopthueId = nguoinopthueId;
    }

    public String getNganhanghotrothanhtoanId() {
        return this.nganhanghotrothanhtoanId;
    }

    public void setNganhanghotrothanhtoanId(String nganhanghotrothanhtoanId) {
        this.nganhanghotrothanhtoanId = nganhanghotrothanhtoanId;
    }
}
