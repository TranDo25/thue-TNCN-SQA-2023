package com.sqa.models.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "tokhaidanhchocanhankinhdoanh")
public class Tokhaidanhchocanhankinhdoanh {
    @Id
    @Column(name = "idToKhaiDanhChoCaNhanKinhDoanh")
    private String idToKhaiDanhChoCaNhanKinhDoanh;

    public String getIdToKhaiDanhChoCaNhanKinhDoanh() {
        return this.idToKhaiDanhChoCaNhanKinhDoanh;
    }

    public void setIdToKhaiDanhChoCaNhanKinhDoanh(String idToKhaiDanhChoCaNhanKinhDoanh) {
        this.idToKhaiDanhChoCaNhanKinhDoanh = idToKhaiDanhChoCaNhanKinhDoanh;
    }
}
