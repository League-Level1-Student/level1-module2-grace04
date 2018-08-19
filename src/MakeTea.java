import javax.swing.JOptionPane;

public class MakeTea {
	public static void main(String[] args) {
		String fla = JOptionPane.showInputDialog("What flavor?");
		TeaBag bag = new TeaBag(fla);
		bag.getFlavor();
		
		Kettle ket = new Kettle();
		ket.boil();
		
		Cup cup = new Cup();
		cup.makeTea(bag,ket.getWater());
	}
}
