import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String fla = JOptionPane.showInputDialog("What flavor?");
		String min = JOptionPane.showInputDialog("How long?");
		int ti = Integer.parseInt(min);
		Popcorn pop = new Popcorn(fla);
		
		Microwave mi = new Microwave();
		mi.putInMicrowave(pop);
		mi.setTime(ti);
		mi.startMicrowave();
	}
}
