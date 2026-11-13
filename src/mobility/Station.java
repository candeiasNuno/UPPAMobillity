package mobility;
import java.util.ArrayList;
import java.util.List;

public class Station {
/* VARIABLES */    
    protected String nom;
    protected int capaciteMax;
    private List<Bike> bikes;

/* CONSTRUCTEUR */
    public Station(String nom, int capaciteMax){
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.bikes = new ArrayList<>();
    }

/* METHODES */
    public boolean isFull() {
    	if(this.bikes.size() == this.capaciteMax) {
    		return true;
    	} else {
    		return false;
    	}
    }
    public void addBike(Bike bike) {
    	if(this.isFull()) {
    		throw new IllegalStateException("Station is full");
    	} else {
    		this.bikes.add(bike);
    		System.out.println(bike.getId() + " initially at " + this.nom);
    	}
    }
    public void removeBike(Bike bike) {
    	if(this.bikes.remove(bike)) {
    		System.out.println("Bike remove !");
    	} else {
    		System.out.println("Bike not found !");
    	}
    }
    public boolean containsBike(Bike bike) {
    	return this.bikes.contains(bike);
    }
/* GETTERS */    
    public String getName(){ return this.nom;}
}
