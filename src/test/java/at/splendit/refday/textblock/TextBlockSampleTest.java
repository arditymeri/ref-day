package at.splendit.refday.textblock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.splendit.refday.text.TextBlockSamples;

public class TextBlockSampleTest {
	
	private TextBlockSamples sample;
	
	@BeforeEach
	void setUp() {
		sample = new TextBlockSamples();
	}
	
	@Test
	void htmlBlock_shouldMatchSimpleString() {
		String html = "" +
				"<html>\n" +
				"\t<head>\n" +
				"\t\t<meta charset=\"utf-8\">" +
				"\t</head>\n" +
				"\t<body class=\"default-view\">\n"+ 
				"\t\t<p>Hello, world</p>\n" + 
				"\t</body>\n"+
				"</html>\n";
		String block = sample.createHtmlTextBlock();
		assertEquals(html, block);
	}

}
