package com.sqa.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tokhaithue")
public class Tokhaithue {
    @Id
    @Column(name = "idToKhaiThue")
    private String idToKhaiThue;

    @Column(name = "hosokhaibaothue_id")
    private String hosokhaibaothueId;

    public String getIdToKhaiThue() {
        return this.idToKhaiThue;
    }

    public void setIdToKhaiThue(String idToKhaiThue) {
        this.idToKhaiThue = idToKhaiThue;
    }

    public String getHosokhaibaothueId() {
        return this.hosokhaibaothueId;
    }

    public void setHosokhaibaothueId(String hosokhaibaothueId) {
        this.hosokhaibaothueId = hosokhaibaothueId;
    }
}
