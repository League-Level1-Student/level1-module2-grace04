import java.util.Random;

public class Vault {
	private int pw;
	
	Vault(){
		pw = new Random().nextInt(1000000);
	}
	
	public boolean tryCode (int wp) {
		if (pw==wp) {
			return true;
		}
		else {
			return false;
		}
	}
}
