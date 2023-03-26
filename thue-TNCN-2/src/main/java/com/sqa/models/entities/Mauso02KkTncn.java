package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mauso02-kk-tncn")
public class Mauso02KkTncn {
    @Id
    @Column(name = "idMauSo02/KK-TNCN")
    private String idMauSo02KkTncn;

    @Column(name = "tokhaithue_idToKhaiThue")
    private String tokhaithueIdToKhaiThue;


}
