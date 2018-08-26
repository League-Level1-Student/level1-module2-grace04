
public class TeaParty {

	private String name;
	private boolean isWoman;
	private boolean isKnighted;

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted && isWoman) {
			return "Hello Lady " + name;
		} else if (isKnighted && !isWoman) {
			return "Hello Sir " + name;
		} else if (!isKnighted && isWoman) {
			return "Hello Ms. " + name;
		} else {
			return "Hello Mr. " + name;
		}
	}

	/**
	 * Jane Austen is a woman, so say “Hello Ms. Austen”. George Orwell is a man, so
	 * say “Hello Mr. Orwell”. Isaac Newton was knighted, so say "Hello Sir Isaac
	 * Newton".
	 **/
}
