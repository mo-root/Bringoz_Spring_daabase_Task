package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="drivers")
@Data

public class Driver {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    ID is the primary key - this is the strategy



    private long driverId;
    @Column(name = "driverName")
    private String driverName;
    @Column(name = "driverAge")
    private int driverAge;
    @Column(name = "driverStatus")
    private String driverStatus;
    @Column(name = "driverCurrentLocation")
    private String driverCurrentLocation;
    @Column(name = "driverWorkingHours")
    private String driverWorkingHours;

    // default constructor
    public Driver(){}



    public Driver(String driverName, int driverAge, String driverStatus, String driverCurrentLocation, String driverWorkingHours){
        this.driverName = driverName;
        this.driverAge = driverAge;
        this.driverStatus = driverStatus;
        this.driverCurrentLocation = driverCurrentLocation;
        this.driverWorkingHours = driverWorkingHours;

}

//Getters

    public long getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public String getDriverStatus() {
        return driverStatus;
    }

    public String getDriverCurrentLocation() {
        return driverCurrentLocation;
    }

    public String getDriverWorkingHours() {
        return driverWorkingHours;
    }

    public void setDriverId(long driverId) {
        this.driverId = driverId;
    }

    //Setters

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    public void setDriverStatus(String driverStatus) {
        this.driverStatus = driverStatus;
    }

    public void setDriverCurrentLocation(String driverCurrentLocation) {
        this.driverCurrentLocation = driverCurrentLocation;
    }

    public void setDriverWorkingHours(String driverWorkingHours) {
        this.driverWorkingHours = driverWorkingHours;
    }
}

