package mobility;

public class Bike {
/* VARIABLE */
    protected String id;
    protected boolean available;

/* COSNTRUCTEUR */
    public Bike (String id){
        this.id = id;
        this.available = true;
    }
/* METHODES */
    public String getId(){return this.id;}
    public boolean isAvailable(){return this.available;}

}
