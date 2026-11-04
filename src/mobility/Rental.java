package mobility;
import java.time.LocalDateTime;

public class Rental {
/* VARIABLES */	
	private User user;
	private Bike bike;
	private LocalDateTime startTime;
	private LocalDateTime returnTime;
	
/* CONSTRUCTEUR */
	public Rental(User user, Bike bike, LocalDateTime startTime) {
		this.user = user;
		this.bike = bike;
		this.startTime = startTime;
		this.returnTime = null;
	}
	
/* METHODES */	
	public void finish( LocalDateTime returnTime) {
		if(this.returnTime.isBefore(this.startTime)) {
			System.out.println("Location finish !");
		} else {
			throw new IllegalStateException("Return Time < Start Time !");
		}
		
	}
 	public boolean isActive() {
		return this.returnTime == null;
	}
	
/* GETTERS */	
	public User getUser() { return this.user; }
	public Bike getBike() { return this.bike; }
	public LocalDateTime getStartTime() { return this.startTime ; }
	public LocalDateTime getReturnTime() { return this.returnTime ; }
	
}
