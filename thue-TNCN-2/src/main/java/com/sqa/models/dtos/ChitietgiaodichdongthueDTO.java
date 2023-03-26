package com.sqa.models.dtos;

import lombok.Data;

@Data
public class ChitietgiaodichdongthueDTO {
    private String id;
    private Double phithanhtoan;
    private String hinhthucthanhtoan;
    private String hoadondongthueId;
    private String nganhanghotrothanhtoanId;

    public String getId() {
        return this.id;
    }


}
