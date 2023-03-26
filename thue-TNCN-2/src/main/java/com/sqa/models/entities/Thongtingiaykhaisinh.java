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
@Table(name = "thongtingiaykhaisinh")
public class Thongtingiaykhaisinh {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "so")
    private String so;

    @Column(name = "quyenso")
    private String quyenso;

    @Column(name = "quocgia")
    private String quocgia;

    @Column(name = "tinh/TP")
    private String tinhTp;

    @Column(name = "quan/huyen")
    private String quanHuyen;

    @Column(name = "phuong/xa")
    private String phuongXa;


}
