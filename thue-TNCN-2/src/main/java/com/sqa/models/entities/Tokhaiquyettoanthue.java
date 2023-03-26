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
@Table(name = "tokhaiquyettoanthue")
public class Tokhaiquyettoanthue {
    @Id
    @Column(name = "idToKhaiQuyetToanThue")
    private Integer idToKhaiQuyetToanThue;

    @Column(name = "tennguoinopthue")
    private String tennguoinopthue;

    @Column(name = "masothue")
    private String masothue;

    @Column(name = "quan/huyen")
    private String quanHuyen;

    @Column(name = "tinh/TP")
    private String tinhTp;

    @Column(name = "dienthoai")
    private String dienthoai;

    @Column(name = "email")
    private String email;


}
