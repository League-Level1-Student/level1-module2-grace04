import javax.swing.JOptionPane;

public class Bond {
	public static void main(String[] args) {
		Vault name = new Vault();
		Bond jb = new Bond();
		System.out.println(jb.findCode(name));
	}
	int findCode (Vault name){
		for(int i=0;i<10000000;i++) {
			if(name.tryCode(i)==true) {
				return i;
			}
		}
		return -1;
	}
}
