package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hosoquyettoanthue")
public class Hosoquyettoanthue {
    @Id
    @Column(name = "idHoSoQuyetToanThue")
    private String idHoSoQuyetToanThue;

    @Column(name = "magiaodich")
    private String magiaodich;

    @Column(name = "ngaynophoso")
    private java.sql.Date ngaynophoso;

    @Column(name = "trangthaihoso")
    private String trangthaihoso;

    @Column(name = "tennguoigui")
    private String tennguoigui;

    @Column(name = "diachilienhe")
    private String diachilienhe;

    @Column(name = "diachiemail")
    private String diachiemail;

    @Column(name = "loaitokhai")
    private String loaitokhai;

    @Column(name = "coquanquyettoan")
    private String coquanquyettoan;

    @Column(name = "truonghopquyettoanthue")
    private String truonghopquyettoanthue;

    @Column(name = "namkekhai")
    private Integer namkekhai;

    @Column(name = "tuthang")
    private Integer tuthang;

    @Column(name = "denthang")
    private Integer denthang;

    @Column(name = "nguoinopthue_id")
    private String nguoinopthueId;

    @Column(name = "tokhaiquyettoanthue_idToKhaiQuyetToanThue")
    private Integer tokhaiquyettoanthueIdToKhaiQuyetToanThue;

    @Column(name = "tongcucthue_idTongCucThue")
    private String tongcucthueIdTongCucThue;

    public String getIdHoSoQuyetToanThue() {
        return this.idHoSoQuyetToanThue;
    }

    public void setIdHoSoQuyetToanThue(String idHoSoQuyetToanThue) {
        this.idHoSoQuyetToanThue = idHoSoQuyetToanThue;
    }

    public String getMagiaodich() {
        return this.magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public java.sql.Date getNgaynophoso() {
        return this.ngaynophoso;
    }

    public void setNgaynophoso(java.sql.Date ngaynophoso) {
        this.ngaynophoso = ngaynophoso;
    }

    public String getTrangthaihoso() {
        return this.trangthaihoso;
    }

    public void setTrangthaihoso(String trangthaihoso) {
        this.trangthaihoso = trangthaihoso;
    }

    public String getTennguoigui() {
        return this.tennguoigui;
    }

    public void setTennguoigui(String tennguoigui) {
        this.tennguoigui = tennguoigui;
    }

    public String getDiachilienhe() {
        return this.diachilienhe;
    }

    public void setDiachilienhe(String diachilienhe) {
        this.diachilienhe = diachilienhe;
    }

    public String getDiachiemail() {
        return this.diachiemail;
    }

    public void setDiachiemail(String diachiemail) {
        this.diachiemail = diachiemail;
    }

    public String getLoaitokhai() {
        return this.loaitokhai;
    }

    public void setLoaitokhai(String loaitokhai) {
        this.loaitokhai = loaitokhai;
    }

    public String getCoquanquyettoan() {
        return this.coquanquyettoan;
    }

    public void setCoquanquyettoan(String coquanquyettoan) {
        this.coquanquyettoan = coquanquyettoan;
    }

    public String getTruonghopquyettoanthue() {
        return this.truonghopquyettoanthue;
    }

    public void setTruonghopquyettoanthue(String truonghopquyettoanthue) {
        this.truonghopquyettoanthue = truonghopquyettoanthue;
    }

    public Integer getNamkekhai() {
        return this.namkekhai;
    }

    public void setNamkekhai(Integer namkekhai) {
        this.namkekhai = namkekhai;
    }

    public Integer getTuthang() {
        return this.tuthang;
    }

    public void setTuthang(Integer tuthang) {
        this.tuthang = tuthang;
    }

    public Integer getDenthang() {
        return this.denthang;
    }

    public void setDenthang(Integer denthang) {
        this.denthang = denthang;
    }

    public String getNguoinopthueId() {
        return this.nguoinopthueId;
    }

    public void setNguoinopthueId(String nguoinopthueId) {
        this.nguoinopthueId = nguoinopthueId;
    }

    public Integer getTokhaiquyettoanthueIdToKhaiQuyetToanThue() {
        return this.tokhaiquyettoanthueIdToKhaiQuyetToanThue;
    }

    public void setTokhaiquyettoanthueIdToKhaiQuyetToanThue(Integer tokhaiquyettoanthueIdToKhaiQuyetToanThue) {
        this.tokhaiquyettoanthueIdToKhaiQuyetToanThue = tokhaiquyettoanthueIdToKhaiQuyetToanThue;
    }

    public String getTongcucthueIdTongCucThue() {
        return this.tongcucthueIdTongCucThue;
    }

    public void setTongcucthueIdTongCucThue(String tongcucthueIdTongCucThue) {
        this.tongcucthueIdTongCucThue = tongcucthueIdTongCucThue;
    }
}
