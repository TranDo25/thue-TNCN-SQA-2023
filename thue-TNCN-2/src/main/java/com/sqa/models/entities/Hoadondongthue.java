package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hoadondongthue")
public class Hoadondongthue {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "kyquyettoan")
    private String kyquyettoan;

    @Column(name = "sotienphaidong")
    private Double sotienphaidong;

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

    public String getKyquyettoan() {
        return this.kyquyettoan;
    }

    public void setKyquyettoan(String kyquyettoan) {
        this.kyquyettoan = kyquyettoan;
    }

    public Double getSotienphaidong() {
        return this.sotienphaidong;
    }

    public void setSotienphaidong(Double sotienphaidong) {
        this.sotienphaidong = sotienphaidong;
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
