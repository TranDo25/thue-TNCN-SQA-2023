package com.sqa.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cauhinh")
public class Cauhinh {
    @Id
    @Column(name = "idCauHinh")
    private String idCauHinh;

    @Column(name = "tongcucthue_idTongCucThue")
    private String tongcucthueIdTongCucThue;


}
