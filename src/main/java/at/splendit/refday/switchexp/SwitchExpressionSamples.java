package at.splendit.refday.switchexp;

public class SwitchExpressionSamples {

	public void sample(String value) {
		int i = switch (value) {
		case "1" -> 1;
		case "2" -> 1;
		case "3" -> 1;
		default -> 0;
		};
	}

	public void sample(int position) {
		String medal = switch (position) {
		case 1 -> "Gold";
		case 2 -> "Silver";
		case 3 -> "Bronze";
		default -> "None";
		};
	}
}
