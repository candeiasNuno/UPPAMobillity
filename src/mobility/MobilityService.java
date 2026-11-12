package mobility;
import java.time.LocalDateTime;

public class MobilityService{
/* MATHODES */
    public Rental rentBike(User user, Bike bike, Station station, LocalDateTime startTime){
        Rental rent = null;
        if(bike.isAvailable()){
            if(station.containsBike(bike)){
                station.removeBike(bike);
                rent = new Rental(user, bike, startTime);
            } else{
                throw new IllegalStateException(" Bike does not belong ti this station !");
            }
        } else{
            throw new IllegalStateException(" Bike not available !");
        }
        return rent;
    }    
}