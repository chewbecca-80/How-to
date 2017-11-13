private String findMatchingRegexDate(String s) {
		ArrayList<RegexMatcher> regexObjects = new ArrayList<RegexMatcher>() {
			{

				add(new RegexMatcher(".*[a-zA-Z]{4,}\\s\\d{1,2}\\s\\d{4}.*", "[a-zA-Z]{4,}\\s\\d{1,2}\\s\\d{4}",
						"MMMM dd yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{4,}\\s\\d{1,2},\\s\\d{4}.*", "[a-zA-Z]{4,}\\s\\d{1,2},\\s\\d{4}",
						"MMMM dd, yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{4,}\\s\\d{1,2},\\d{4}.*", "[a-zA-Z]{4,}\\s\\d{1,2},\\d{4}",
						"MMMM dd,yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{4,}[.]\\s\\d{1,2}\\s\\d{4}.*", "[a-zA-Z]{4,}[.]\\s\\d{1,2}\\s\\d{4}",
						"MMMM. dd yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{4,}[.]\\s\\d{1,2},\\s\\d{4}.*", "[a-zA-Z]{4,}[.]\\s\\d{1,2},\\s\\d{4}",
						"MMMM. dd, yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{4,}[.]\\s\\d{1,2},\\d{4}.*", "[a-zA-Z]{4,}[.]\\s\\d{1,2},\\d{4}",
						"MMMM. dd,yyyy"));
				add(new RegexMatcher(".*\\d{1,2}\\s[a-zA-Z]{4,}\\s\\d{4}.*", "\\d{1,2}\\s[a-zA-Z]{4,}\\s\\d{4}",
						"dd MMMM yyyy"));
				add(new RegexMatcher(".*\\d{1,2}\\s[a-zA-Z]{4,}[.]\\s\\d{4}.*", "\\d{1,2}\\s[a-zA-Z]{4,}[.]\\s\\d{4}",
						"dd MMMM. yyyy"));
				add(new RegexMatcher(".*\\d{1,2}\\s[a-zA-Z]{3}\\s\\d{4}.*", "\\d{1,2}\\s[a-zA-Z]{3}[.]\\s\\d{4}",
						"dd MMM. yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{3}\\s\\d{1,2},\\d{4}.*", "[a-zA-Z]{3}\\s\\d{1,2},\\d{4}",
						"MMM dd,yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{4,}[.]\\s\\d{1,2}\\s\\d{4}.*", "[a-zA-Z]{4,}[.]\\s\\d{1,2}\\s\\d{4}",
						"MMM. dd yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{3}\\s\\d{1,2},\\s\\d{4}.*", "[a-zA-Z]{3}\\s\\d{1,2}\\s,\\d{4}",
						"MMM dd, yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{3}[.]\\s\\d{1,2},\\d{4}.*", "[a-zA-Z]{3}[.]\\s\\d{1,2},\\d{4}",
						"MMM. dd,yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{3}[.]\\s\\d{1,2},\\s\\d{4}.*", "[a-zA-Z]{3}[.]\\s\\d{1,2},\\s\\d{4}",
						"MMM. dd, yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{3}\\s\\d{1,2}\\s\\d{4}.*", "[a-zA-Z]{3}\\s\\d{1,2}\\s\\d{4}",
						"MMM dd yyyy"));
				add(new RegexMatcher(".*[a-zA-Z]{3}\\s\\d{1,2}[,]\\s\\d{4}.*", "[a-zA-Z]{3}\\s\\d{1,2}[,]\\s\\d{4}",
						"MMM dd, yyyy"));
				add(new RegexMatcher(".*\\d{4}/\\d{1,2}/\\d{1,2}.*", "\\d{4}/\\d{1,2}/\\d{1,2}", "yyyy/mm/dd"));
				add(new RegexMatcher(".*\\d{1,2}/\\d{1,2}/\\d{4}.*", "\\d{1,2}/\\d{1,2}/\\d{4}", "mm/dd/yyyy"));
				add(new RegexMatcher(".*\\d{1,2}-\\d{1,2}-\\d{4}.*", "[^-\\d]\\d{1,2}-\\d{1,2}-\\d{4}", "mm-dd-yyyy"));
				// Issue
				add(new RegexMatcher(".*\\d{1,2}\\s[a-zA-Z]{3}\\s\\d{4}.*", "\\d{1,2}\\s[a-zA-Z]{3}\\s\\d{4}",
						"dd MMM yyyy"));

				add(new RegexMatcher(".*\\d{4}-\\d{1,2}-\\d{1,2}.*", "[^-\\d]\\d{4}-\\d{1,2}-\\d{1,2}", "yyyy-mm-dd"));

				add(new RegexMatcher(".*\\d{4}\\s-\\s\\d{1,2}\\s-\\s\\d{1,2}.*", "[^-\\d]\\d{4}\\s-\\s\\d{1,2}\\s-\\s\\d{1,2}",
						"yyyy - mm - dd"));
				add(new RegexMatcher(".*\\d{8}.*", "\\d{8}", "yyyymmdd"));

			}
		};

		for (RegexMatcher rm : regexObjects) {

			Matcher matchMe = rm.shortPattern.matcher(s);
			if (matchMe.find()) {
				// System.out.println("Found a match: " + matchMe.toString());
				// System.out.println(matchMe.group(0));
				return matchMe.group(0);
			}
		}

		return null;
	}
  
  public class RegexMatcher {

	Pattern fullPattern;
	Pattern shortPattern;
	String patternStyle;
	
	
	RegexMatcher(String fullPattern, String shortPattern, String style) {
		this.fullPattern = Pattern.compile(fullPattern);
		this.shortPattern = Pattern.compile(shortPattern);
		this.patternStyle = style;
	}
	
}
