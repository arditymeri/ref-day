package at.splendit.refday.text;

public class TextBlockSamples {
	
	public String createHtmlString() {
		String html = "" +
				"<html>\n" +
				"\t<head>\n" +
				"\t\t<meta charset=\"utf-8\">" +
				"\t</head>\n" +
				"\t<body class=\"default-view\">\n"+ 
				"\t\t<p>Hello, world</p>\n" + 
				"\t</body>\n"+
				"</html>\n";
		return html;
	}

	
	public String createHtmlTextBlock() {
		String html = """
			<html>
				<head>
					<meta charset="utf-8">
				</head>
				<body class="default-view">
					<p>Hello, world</p>
				</body>
			</html>
			""";
		return html;
	}
	
	public void newEscapeSequences() {
		
		String literal = "Lorem ipsum dolor sit amet, consectetur adipiscing " +
                "elit, sed do eiusmod tempor incididunt ut labore " +
                "et dolore magna aliqua.";
		System.out.println(literal);
		// escape line separators
		String textBlockLiteral = """
                Lorem ipsum dolor sit amet, consectetur adipiscing \
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;
		System.out.println(textBlockLiteral);
	}
}
