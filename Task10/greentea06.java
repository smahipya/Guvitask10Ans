package Task10;

public class greentea06 extends teaclass05 {
	//black tea subclass
	
	    @Override
	    public void prepareTea() {
	        if (!isPrepared) {
	            System.out.println("Preparing Geenrtea with hot water and black tea leaves.");
	            System.out.println("Brewing time: 10 minutes");
	            isPrepared = true;
	        } else {
	            System.out.println("Green tea has already been prepared.");
	        }

}
}
