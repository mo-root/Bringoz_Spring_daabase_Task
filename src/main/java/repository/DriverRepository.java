package repository;

import model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service

public interface DriverRepository extends JpaRepository<Driver, Long> {


    //check what happens here if you uncomment
    //    @PersistenceContext
//    private EntityManager entityManger;
    @Query(value = "SELECT * FROM drivers WHERE driverName = ?1",nativeQuery = true)
    List<Driver> getDriverByName(String driverName);

    @Query(value = "SELECT * FROM drivers WHERE driverAge = ?1",nativeQuery = true)
    List<Driver> getDriverByAge(int driverAge);

    @Query(value = "SELECT * FROM drivers WHERE driverStatus = ?1",nativeQuery = true)
    List<Driver> getDriverByStatus(String driverStatus);

    @Query(value = "SELECT * FROM drivers WHERE driverWorkingHours = ?1",nativeQuery = true)
    List<Driver> getDriverByWorkingHours(String driverName);

    @Query(value = "SELECT * FROM drivers WHERE driverCurrentLocation = ?1",nativeQuery = true)
    List<Driver> getDriverCurrentLocation(String driverCurrentLocation);


}
