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

	public String switchStatementVariableScope(int position, String time) {
		String medal;
		switch (position) {
		case 1:
			String recordDelta = findRecordDelta(time);
			medal = "Gold";
			break;
		case 2:
			recordDelta = findRecordDelta(time);
			medal = "Silver";
			break;
		case 3:
			recordDelta = findRecordDelta(time);
			medal = "Bronze";
			break;
		default:
			medal = "";
		}
		return medal;
	}
	
	public String switchExpressionVariableScope(int position, String time) {
		String medal;
		switch (position) {
		case 1 -> {
			String recordDelta = findRecordDelta(time);
			medal = "Gold";
		}
		case 2 -> {
			String recordDelta = findRecordDelta(time);
			medal = "Silver";
		}
		case 3 -> {
			String recordDelta = findRecordDelta(time);
			medal = "Bronze";
		}
		default -> medal = "";
		}
		return medal;
	}

	private String findRecordDelta(String time) {
		return "+0.05";
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
		
		int length;
		switch (day) {
		case MONDAY:
		case FRIDAY:
		case SUNDAY:
			length = 6;
			break;
		case TUESDAY:
			length = 7;
			break;
		case THURSDAY:
		case SATURDAY:
			length = 8;
			break;
		case WEDNESDAY:
			length = 9;
			break;
		}
		// System.out.println("Length = " + length); 
	}

	public void expressionExhaustiveness(Day day) {
		switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
		case TUESDAY -> System.out.println(7);
		case THURSDAY, SATURDAY -> System.out.println(8);
		case WEDNESDAY -> System.out.println(9);
		}
		
		int length = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		};
		
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

	
	int yieldingIntValue(String value) {
		int truth = switch (value) {
		case "t", "true", "True", "TRUE" -> {
			logger.debug("Assuming true for: {}", value);
			yield(1);
		}
		default -> {
			logger.debug("Assuming false for {}", value);
			yield 0;
		}
		};
		this.yield(2);
		return 0;
	}

	void yield(int value) {
		
	}
}
