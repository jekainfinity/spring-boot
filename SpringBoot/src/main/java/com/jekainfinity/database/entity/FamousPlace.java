package com.jekainfinity.database.entity;


import javax.persistence.*;

@Entity
@Table(name = "FAMOUS_PLACE")
public class FamousPlace {
    @Id
    @Column(name = "PLACE_NAME")
    private String placeName;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}
