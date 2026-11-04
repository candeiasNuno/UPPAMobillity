package mobility;

public class User {
/* VARIABLES */    
    protected String id;
    protected String name;

/* CONSTRUCTEUR */
    public User(String id, String name){
        this.id = id;
        this.name = name;
    }

/* METHODES */
    public String getId(){ return this.id; }
    public String getName(){ return this.name; }
    
}
