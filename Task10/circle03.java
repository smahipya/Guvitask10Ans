package Task10;

public class circle03 {
	private double radius;
	
	  public circle03(double radius) {
	    this.radius = radius;
	  }

	  public double getRadius() {
	    return radius;
	  }

	  public void setRadius(double radius) {
	    this.radius = radius;
	  }

	  public double getArea() {
	    return Math.PI * radius * radius;
	  }

	  public double getCircumference() {
	    return 2 * Math.PI * radius;
	  }


}
