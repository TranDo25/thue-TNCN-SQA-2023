package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "mauso04-dtv-tncn")
public class Mauso04DtvTncn {
    @Id
    @Column(name = "idMauSo04/ĐTV-TNCN")
    private String idMauSo04ĐtvTncn;

    @Column(name = "tokhaithue_idToKhaiThue")
    private String tokhaithueIdToKhaiThue;


}
