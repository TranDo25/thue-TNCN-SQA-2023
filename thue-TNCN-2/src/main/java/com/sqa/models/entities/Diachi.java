package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "diachi")
public class Diachi {
    @Id
    @Column(name = "idDiaChi")
    private String idDiaChi;

    @Column(name = "sonha")
    private String sonha;

    @Column(name = "tinh/TP")
    private String tinhTp;

    @Column(name = "quan/huyen")
    private String quanHuyen;

    @Column(name = "xa/phuong")
    private String xaPhuong;

    @Column(name = "loaidiachi")
    private String loaidiachi;

    @Column(name = "dienthoai")
    private String dienthoai;

    @Column(name = "email")
    private String email;

    @Column(name = "tokhaithuecanhanthongthuong_idToKhaiThueCaNhanThongThuong")
    private String tokhaithuecanhanthongthuongIdToKhaiThueCaNhanThongThuong;


}
