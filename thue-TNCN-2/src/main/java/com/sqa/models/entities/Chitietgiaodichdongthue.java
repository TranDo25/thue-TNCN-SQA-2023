package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chitietgiaodichdongthue")
public class Chitietgiaodichdongthue {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "phithanhtoan")
    private Double phithanhtoan;

    @Column(name = "hinhthucthanhtoan")
    private String hinhthucthanhtoan;

    @Column(name = "hoadondongthue_id")
    private String hoadondongthueId;

    @Column(name = "nganhanghotrothanhtoan_id")
    private String nganhanghotrothanhtoanId;


}
