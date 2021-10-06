package at.splendit.refday.switchexp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SwitchExpressionSamplesTest {

	private SwitchExpressionSamples samples;
	
	@BeforeEach
	void setUp() {
		samples = new SwitchExpressionSamples();
	}
	
	@Test
	void assignValue_shouldReturnGold() {
		assertEquals("Gold", samples.assigningValue(1));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"t", "true", "True", "TRUE"})
	void yieldingValue_shouldYieldTrue(String value) {
		assertTrue(samples.yieldingValue(value));
	}
	
	@Test
	void variableScope_shouldReturnSilver() {
		assertEquals("Silver", samples.switchStatementVariableScope(2));
	}
}
