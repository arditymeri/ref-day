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
}
