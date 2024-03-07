package Task10;


public class blacktea06 extends teaclass05 {
	    @Override
	    public void prepareTea() {
	        if (!isPrepared) {
	            System.out.println("Preparing black tea with hot water and black tea leaves.");
	            System.out.println("Brewing time: 10 minutes");
	            isPrepared = true;
	        } else {
	            System.out.println("Black tea has already been prepared.");
	        }

	    }
	}

