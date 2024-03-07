package Task10;


public class herbaltea06 extends teaclass05 {
	public void preparedTea() {
		if(!isPrepared) {
			System.out.println("Preparing herbal tea with hot water and herbal tea ingredients."); 
			System.out.println("Brewing time: 15 minutes");
			isPrepared=true;
		}else {
			System.out.println("Herbal tea has already been prepared.");
		}
	}

}
