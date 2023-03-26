package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "nguoiphuthuoc")
public class Nguoiphuthuoc {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "hoten")
    private String hoten;

    @Column(name = "ngaysinh")
    private java.sql.Date ngaysinh;

    @Column(name = "masothue")
    private String masothue;

    @Column(name = "quoctich")
    private String quoctich;

    @Column(name = "cccd")
    private String cccd;

    @Column(name = "cmnd")
    private String cmnd;

    @Column(name = "sodinhdangcanhan")
    private String sodinhdangcanhan;

    @Column(name = "thoigiangiamtrututhang")
    private java.sql.Date thoigiangiamtrututhang;

    @Column(name = "thoigiangiamtrudenthang")
    private java.sql.Date thoigiangiamtrudenthang;

    @Column(name = "fkNPT_DKY_GIAMTRU")
    private String fkNptDkyGiamtru;

    @Column(name = "fkNPT_GIAYKHAISINH")
    private String fkNptGiaykhaisinh;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public java.sql.Date getNgaysinh() {
        return this.ngaysinh;
    }

    public void setNgaysinh(java.sql.Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getMasothue() {
        return this.masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    public String getQuoctich() {
        return this.quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getCccd() {
        return this.cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getCmnd() {
        return this.cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSodinhdangcanhan() {
        return this.sodinhdangcanhan;
    }

    public void setSodinhdangcanhan(String sodinhdangcanhan) {
        this.sodinhdangcanhan = sodinhdangcanhan;
    }

    public java.sql.Date getThoigiangiamtrututhang() {
        return this.thoigiangiamtrututhang;
    }

    public void setThoigiangiamtrututhang(java.sql.Date thoigiangiamtrututhang) {
        this.thoigiangiamtrututhang = thoigiangiamtrututhang;
    }

    public java.sql.Date getThoigiangiamtrudenthang() {
        return this.thoigiangiamtrudenthang;
    }

    public void setThoigiangiamtrudenthang(java.sql.Date thoigiangiamtrudenthang) {
        this.thoigiangiamtrudenthang = thoigiangiamtrudenthang;
    }

    public String getFkNptDkyGiamtru() {
        return this.fkNptDkyGiamtru;
    }

    public void setFkNptDkyGiamtru(String fkNptDkyGiamtru) {
        this.fkNptDkyGiamtru = fkNptDkyGiamtru;
    }

    public String getFkNptGiaykhaisinh() {
        return this.fkNptGiaykhaisinh;
    }

    public void setFkNptGiaykhaisinh(String fkNptGiaykhaisinh) {
        this.fkNptGiaykhaisinh = fkNptGiaykhaisinh;
    }
}
