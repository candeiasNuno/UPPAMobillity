import java.time.LocalDateTime;
import mobility.*;
//Salut les amies
public class Main {
    public static void main(String[] args){
        Station campusNord = new Station("Campus Nord", 10);
        Station bibliotheque = new Station("Bibliotheque", 10);

        User alice = new User("000", "Alice");
        Bike b104 = new Bike("B-104");

        campusNord.addBike(b104);
        MobilityService emprunt = new MobilityService();
        LocalDateTime start = LocalDateTime.of(2026, 10, 12, 9, 0);
        Rental rent = emprunt.rentBike(alice, b104, campusNord, start);

        boolean estDans = campusNord.containsBike(b104);
        System.out.println(b104.getId() + " avaible : " + estDans);

        LocalDateTime end = LocalDateTime.of(2026, 10, 12, 11, 30);
        emprunt.returnBike(alice, b104, bibliotheque, rent, end);

        boolean actifRent = rent.isActive();
        System.out.println("Rental active : " + actifRent);

        boolean estDans2 = bibliotheque.containsBike(b104);
         System.out.println(b104.getId() + " now at Bibliotheque : " + estDans2);

    }
}
