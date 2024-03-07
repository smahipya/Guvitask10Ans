package Task10;

public class teaclass07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teaclass05[] teas = new teaclass05[3];

		teas[0] = new blacktea06();
		teas[1] = new greentea06();
		teas[2] = new herbaltea06();

		for (teaclass05 tea : teas) {
			tea.prepareTea();
			tea.addSugar();
			System.out.println();
		}
	}

}
