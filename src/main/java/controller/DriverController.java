//DriverController - to interpret user input and
// transform it into a model that is represented to the user by the view.
package controller;
//Imports
import model.Driver;
import service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Annonation
//@RestController - combines @Controller and @ResponseBody, and simplifies the creation of REST
@RestController


public class DriverController {
    @Autowired
//     enables automatic DI
    private DriverService driverService;

//create and object and inserting it (saving it to our database)
    @PostMapping("/driver")
    public ResponseEntity<Driver> saveDriver(@RequestBody Driver driver){
    Driver saveDriver =  driverService.saveDriver(driver);
            return new ResponseEntity<>(saveDriver, HttpStatus.CREATED);
}

// get a single driver (all attributes) by its ID
    @GetMapping("/drivers")
    public ResponseEntity<Driver> getDriver(@RequestParam(name = "driverId") long driverId){
        Driver driver = driverService.getDriver(driverId);
        return new ResponseEntity<>(driver, HttpStatus.OK);
    }

// get all the drivers in the table in our database
//@GetMapping(value = "/drivers")

 public List<Driver> getDriver(){
        return driverService.getDrivers();
 }
//update attributes for a specific driver
    @PatchMapping("/driver")
    public ResponseEntity<Driver> updateDriver(@RequestParam(name="driverId") long driverId, @RequestBody Driver driver){
        Driver updateDriver = driverService.updateDriver(driverId, driver);
        return new ResponseEntity<>(updateDriver, HttpStatus.OK);
    }

// Delete a driver from the database

    @DeleteMapping("/driver")
    public ResponseEntity<Driver> deleteDriver(@RequestParam(name = "driverId") long driverId){
        Driver deletedDriver = driverService.deleteDriver(driverId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

//get a driver by name using raw SQL statement
    @GetMapping("/driver-by-name")
    public List<Driver> getDriverByName(@RequestParam(name = "driverName") String driverName){
    return driverService.getDriverByName(driverName);
    }
    //get a driver by age using raw SQL statement
    @GetMapping("/driver-by-age")
    public List<Driver> getDriverByAge(@RequestParam(name = "driverAge") int driverAge){
        return driverService.getDriverByAge(driverAge);
    }
    //get a driver by status using raw SQL statement
    @GetMapping("/driver-by-status")
    public List<Driver> getDriverByStatus(@RequestParam(name = "driverStatus") String driverStatus){
        return driverService.getDriverByStatus(driverStatus);
    }
    //get a driver by working hours using raw SQL statement
    @GetMapping("/driver-by-workingHours")
    public List<Driver> getDriverByWorkingHours(@RequestParam(name = "driverWorkingHours") String driverWorkingHours){
        return driverService.getDriverByWorkingHours(driverWorkingHours);
    }
    //get a driver by current location using raw SQL statement
    @GetMapping("/driver-by-currentLocation")
    public List<Driver> getDriverByCurrentLocation(@RequestParam(name = "driverCurrentLocation") String driverCurrentLocation){
        return driverService.getDriverCurrentLocation(driverCurrentLocation);
    }

}
