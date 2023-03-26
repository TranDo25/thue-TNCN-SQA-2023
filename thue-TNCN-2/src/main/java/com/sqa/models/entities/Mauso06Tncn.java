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
@Table(name = "mauso06-tncn")
public class Mauso06Tncn {
    @Id
    @Column(name = "idMauSo06/TNCN")
    private String idMauSo06Tncn;

    @Column(name = "tokhaithue_idToKhaiThue")
    private String tokhaithueIdToKhaiThue;

}
