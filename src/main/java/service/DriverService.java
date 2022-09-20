//Service is used to mark the class as a service provider

package service;

import model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Configurable
public class DriverService {



    @Autowired
  // the line under is the constructor parameter
    public DriverService(DriverRepository driverRepository) {this.driverRepository = driverRepository;}
    //defining the repository
    private final DriverRepository driverRepository;


    //creating the save function
    public Driver saveDriver(Driver driver){
        return driverRepository.save(driver);
    }
    //get function
    public Driver getDriver(long driverId){
        return driverRepository.findById(driverId).orElseThrow(() -> new RuntimeException("not Found!!!"));
    }

    //get all drivers
    public List<Driver> getDrivers(){
        return (List<Driver>) driverRepository.findAll();
    }

    //update properties about drivers
    public Driver updateDriver(long driverId, Driver driver){
        Driver existingDriver = driverRepository.findById(driverId).orElseThrow(() -> new RuntimeException("not Found!!!"));
        existingDriver.setDriverName(driver.getDriverName());
        existingDriver.setDriverAge(driver.getDriverAge());
        existingDriver.setDriverWorkingHours(driver.getDriverWorkingHours());
        existingDriver.setDriverStatus(driver.getDriverStatus());
        existingDriver.setDriverCurrentLocation(driver.getDriverCurrentLocation());
        driverRepository.save(existingDriver);
        return existingDriver;
    }

    //deleting a driver from the database
    public Driver deleteDriver(long driverId){
        Driver existingDriver = driverRepository.findById(driverId).orElseThrow(() -> new RuntimeException("not Found!!!"));
        driverRepository.delete(existingDriver);
        return existingDriver;
    }


    //Queries
    public List<Driver> getDriverByName(String driverName){
        return driverRepository.getDriverByName(driverName);
    }
    public List<Driver> getDriverByAge(int driverAge){
        return driverRepository.getDriverByAge(driverAge);
    }
    public List<Driver> getDriverByStatus(String driverStatus){
        return driverRepository.getDriverByStatus(driverStatus);
    }
    public List<Driver> getDriverByWorkingHours(String driverWokringHours){
        return driverRepository.getDriverByWorkingHours(driverWokringHours);
    }
    public List<Driver> getDriverCurrentLocation(String driverCurrentLocation){
        return driverRepository.getDriverByWorkingHours(driverCurrentLocation);
    }


}
