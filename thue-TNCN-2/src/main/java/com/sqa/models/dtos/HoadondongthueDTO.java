package com.sqa.models.dtos;

import lombok.Data;

@Data
public class HoadondongthueDTO {
    private String id;
    private String kyquyettoan;
    private Double sotienphaidong;
    private String nguoinopthueId;
    private String tongcucthueIdTongCucThue;

    public String getId() {
        return this.id;
    }


}
