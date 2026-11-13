package mobility;
import java.time.LocalDateTime;

public class MobilityService{
/* METHODES */
    public  Rental rentBike(User user, Bike bike, Station station, LocalDateTime startTime){
        Rental rent = null;
        if(bike.isAvailable()){
            if(station.containsBike(bike)){
                station.removeBike(bike);
                rent = new Rental(user, bike, startTime);
                System.out.println(user.getName() + " rents " + bike.getId() + "at " + startTime);
            } else{
                throw new IllegalStateException(" Bike does not belong ti this station !");
            }
        } else{
            throw new IllegalStateException(" Bike not available !");
        }
        return rent;
    }    
    public void returnBike(User user, Bike bike, Station station, Rental rent, LocalDateTime returnTime){
        if(rent.isActive()){
            rent.setReturnTime(returnTime);
            if(!station.isFull()){
                rent.finish();
                station.addBike(bike);
                bike.setAvailable(true);
                System.out.println(user.getName() + " returns " + bike.getId() + " at " + station.getName() + " at " + returnTime);
            } else{
                throw new IllegalStateException(" Station Full !");
            }
        } else{
            throw new IllegalStateException(" Location not actif !");
        }
    }
}