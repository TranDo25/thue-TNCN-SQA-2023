package com.sqa.models.dtos;
import lombok.Data;

@Data
public class NganhanghotrothanhtoanDTO {
    private String id;
    private String tennganhang;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
