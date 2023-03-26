package com.sqa.models.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "mauso04-cnv-tncn")
public class Mauso04CnvTncn {
    @Id
    @Column(name = "idMauSo04/CNV-TNCN")
    private String idMauSo04CnvTncn;

    @Column(name = "tokhaithue_idToKhaiThue")
    private String tokhaithueIdToKhaiThue;


}
