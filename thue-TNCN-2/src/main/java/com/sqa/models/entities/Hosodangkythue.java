package com.sqa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hosodangkythue")
public class Hosodangkythue {
    @Id
    @Column(name = "idHoSoDangKyThue")
    private String idHoSoDangKyThue;

    @Column(name = "magiaodich")
    private String magiaodich;

    @Column(name = "ngaynophoso")
    private java.sql.Date ngaynophoso;

    @Column(name = "trangthaihoso")
    private String trangthaihoso;

    @Column(name = "nguoinopthue_id")
    private String nguoinopthueId;

    @Column(name = "TKDCCNKinhDoanh_idTKDCCNKinhDoanh")
    private String tkdccnKinhDoanhIdTkdccnKinhDoanh;

    @Column(name = "tongcucthue_idTongCucThue")
    private String tongcucthueIdTongCucThue;




}
