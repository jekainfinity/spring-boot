package com.jekainfinity.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "BUS")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BUS_ID")
    private int busId;

    @Column(name = "BUS_NAME")
    private String busName;

    @Column(name = "DEPARTURE_POINT")
    private String departurePoint;

    @Column(name = "DESTINATION_POINT")
    private String destinationPoint;

    @Column(name = "TIME")
    private int time;

    @Column(name = "COST")
    private int cost;

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
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
