package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name = "mauso04-nng-tncn")
public class Mauso04NngTncn {
    @Id
    @Column(name = "idMauSo04/NNG-TNCN")
    private String idMauSo04NngTncn;

    @Column(name = "tokhaithue_idToKhaiThue")
    private String tokhaithueIdToKhaiThue;


}
