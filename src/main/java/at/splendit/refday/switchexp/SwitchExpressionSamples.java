package at.splendit.refday.switchexp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.splendit.refday.model.Day;

public class SwitchExpressionSamples {

	private static final Logger logger = LoggerFactory.getLogger(SwitchExpressionSamples.class);

	public String assigningValue(int position) {
		String medal = switch (position) {
		case 1 -> "Gold";
		case 2 -> "Silver";
		case 3 -> "Bronze";
		default -> "";
		};
		return medal;
	}

	public String returningValue(int position) {
		return switch (position) {
		case 1 -> "Gold";
		case 2 -> "Silver";
		case 3 -> "Bronze";
		default -> "";
		};
	}

	public String switchStatementAssigningValue(int position) {
		String medal;
		switch (position) {
		case 1:
			medal = "Gold";
			break;
		case 2:
			medal = "Silver";
			break;
		case 3:
			medal = "Bronze";
			break;
		default:
			medal = "";
		}
		return medal;
	}

	public String switchStatementVariableScope(int position) {
		String medal;
		switch (position) {
		case 1:
			String time = "47.03";
			medal = "Gold";
			break;
		case 2:
			time = "47.22";
			medal = "Silver";
			logger.info("Medal: {}, time: {}", medal, time);
			break;
		case 3:
			time = "48:15";
			medal = "Bronze";
			break;
		default:
			medal = "";
		}
		return medal;
	}

	public void exhaustiveness(Day day) {
		switch (day) {
		case MONDAY:
		case FRIDAY:
		case SUNDAY:
			System.out.println(6);
			break;
		case TUESDAY:
			System.out.println(7);
			break;
		case THURSDAY:
		case SATURDAY:
			System.out.println(8);
			break;
		case WEDNESDAY:
			System.out.println(9);
			break;
		}
	}

	public void expressionExhaustiveness(Day day) {
		switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
		case TUESDAY -> System.out.println(7);
		case THURSDAY, SATURDAY -> System.out.println(8);
		case WEDNESDAY -> System.out.println(9);
		}
	}

	boolean yieldingValue(String value) {
		boolean truth = switch (value) {
		case "t", "true", "True", "TRUE" -> {
			logger.debug("Assuming true for: {}", value);
			yield true;
		}
		default -> {
			logger.debug("Assuming false for {}", value);
			yield false;
		}
		};
		return truth;
	}

	String patternMatchingForSwitch(Object o) {
		/*
		 * Preview feature in Java 17. This may change in the future.
		 */
		String value = switch (o) {
		case Integer i -> String.format("int %d", i);
		case Long l -> String.format("long %d", l);
		case Double d -> String.format("double %f", d);
		case String s -> String.format("String %s", s);
		default -> "unknown";
		};
		return value;
	}

}
