package com.sqa.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bieuthueluytientungphan")
public class Bieuthueluytientungphan {
    @Id
    @Column(name = "idBieuThueLuyTienTungPhan")
    private String idBieuThueLuyTienTungPhan;

    @Column(name = "bacthue")
    private Integer bacthue;

    @Column(name = "phanthunhaptinhthuenam")
    private String phanthunhaptinhthuenam;

    @Column(name = "phanthunhaptinhthuethang")
    private String phanthunhaptinhthuethang;

    @Column(name = "thuesuat")
    private Double thuesuat;

    @Column(name = "cauhinh_idCauHinh")
    private String cauhinhIdCauHinh;

   }
