package com.jekainfinity.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "TRAIN")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TRAIN_ID")
    private int trainId;

    @Column(name = "BUS_NAME")
    private String trainName;

    @Column(name = "DEPARTURE_POINT")
    private String departurePoint;

    @Column(name = "DESTINATION_POINT")
    private String destinationPoint;

    @Column(name = "TIME")
    private int time;

    @Column(name = "COST")
    private int cost;

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
