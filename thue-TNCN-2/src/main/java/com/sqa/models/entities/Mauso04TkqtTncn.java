package com.sqa.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name = "mauso04-tkqt-tncn")
public class Mauso04TkqtTncn {
    @Id
    @Column(name = "idMauSo04/TKQT-TNCN")
    private String idMauSo04TkqtTncn;

    @Column(name = "MauSo04/TKQT-TNCNcol")
    private String mauSo04TkqtTncNcol;

    @Column(name = "tokhaithue_idToKhaiThue")
    private String tokhaithueIdToKhaiThue;


}
