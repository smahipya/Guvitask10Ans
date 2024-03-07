package Task10;

public class teaclass05 {
    protected boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;
    
   public teaclass05() {
	   this.isPrepared=false;
	   this.hasMilk=false;
	   this.hasMilk=false;
			      }
   //creating a method for tea 
   public void prepareTea() {
	   if(!isPrepared) {
		   System.out.println("Preparing basic tea with hot water and tea leaves.");
		   isPrepared=true;
	   }else {
		   System.out.println("Tea has already been prepared");
	   }
   }
   //Creating a method for milk
   public void addMilk() {
	   if(isPrepared) {
		   if(!hasMilk) {
			   System.out.println("Adding milk to the the tea");
			   hasMilk =true;
		   }else {
			   System.out.println("Tea has already been prepared.");
		   }
	   }
   }
   //Creating a method for Sugar 
   public void addSugar() {
	   if(isPrepared) {
		   if(!hasSugar) {
			   System.out.println("Adding sugar to the the tea");
			   hasSugar=true;
		   }else {
			   System.out.println("Please prepare the tea first.");
		   }
	   }
   }
public static void main(String[] args) {
	teaclass05 tea =new teaclass05();
	tea.prepareTea();
	tea.addMilk();
	tea.addSugar();
	tea.addMilk();
	tea.addSugar();
}
}
