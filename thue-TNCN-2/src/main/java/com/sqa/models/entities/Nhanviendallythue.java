package com.sqa.models.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "nhanviendallythue")
public class Nhanviendallythue {
    @Id
    @Column(name = "idNhanVienDalLyThue")
    private String idNhanVienDalLyThue;

    @Column(name = "dailythue_idDaiLyThue")
    private String dailythueIdDaiLyThue;

    public String getIdNhanVienDalLyThue() {
        return this.idNhanVienDalLyThue;
    }

    public void setIdNhanVienDalLyThue(String idNhanVienDalLyThue) {
        this.idNhanVienDalLyThue = idNhanVienDalLyThue;
    }

    public String getDailythueIdDaiLyThue() {
        return this.dailythueIdDaiLyThue;
    }

    public void setDailythueIdDaiLyThue(String dailythueIdDaiLyThue) {
        this.dailythueIdDaiLyThue = dailythueIdDaiLyThue;
    }
}
