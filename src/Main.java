import mobility.Bike;
import mobility.Station;
import mobility.User;

public class Main {
    public static void main(String[] args){
        Station stat1 = new Station("stat1", 1);
        Bike bike1 = new Bike("001");
        boolean full = stat1.isFull();
        System.out.println(full);
        stat1.addBike(bike1);
        full = stat1.isFull();
        System.out.println(full);
        stat1.removeBike(bike1);
        full = stat1.isFull();
        System.out.println(full);
        boolean con = stat1.containsBike(bike1);
        System.out.println(con);
    }
}
