package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dailythue")
public class Dailythue {
    @Id
    @Column(name = "idDaiLyThue")
    private String idDaiLyThue;

    @Column(name = "ten")
    private String ten;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "quan/huyen")
    private String quanHuyen;

    @Column(name = "tinh/TP")
    private String tinhTp;

    @Column(name = "dienthoai")
    private String dienthoai;

    @Column(name = "email")
    private String email;

    @Column(name = "fax")
    private String fax;

    @Column(name = "hopdongdailythueso")
    private String hopdongdailythueso;

    @Column(name = "ngaytaohopdong")
    private java.sql.Date ngaytaohopdong;

   }
