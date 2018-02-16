private String findMatchingRegexDate(String s) {
		ArrayList<RegexMatcher> regexObjects = new ArrayList<RegexMatcher>() {
			{
				add(new RegexMatcher("[a-zA-Z]{4,}\\s\\d{1,2}\\s\\d{4}", "MMMM dd yyyy"));
				add(new RegexMatcher("[a-zA-Z]{4,}\\s\\d{1,2},\\s\\d{4}", "MMMM dd, yyyy"));
				add(new RegexMatcher("[a-zA-Z]{4,}\\s\\d{1,2},\\d{4}", "MMMM dd,yyyy"));
				add(new RegexMatcher("[a-zA-Z]{4,}[.]\\s\\d{1,2}\\s\\d{4}", "MMMM. dd yyyy"));
				add(new RegexMatcher("[a-zA-Z]{4,}[.]\\s\\d{1,2},\\s\\d{4}", "MMMM. dd, yyyy"));
				add(new RegexMatcher("[a-zA-Z]{4,}[.]\\s\\d{1,2},\\d{4}", "MMMM. dd,yyyy"));
				add(new RegexMatcher("\\d{1,2}\\s[a-zA-Z]{4,}\\s\\d{4}", "dd MMMM yyyy"));
				add(new RegexMatcher("\\d{1,2}\\s[a-zA-Z]{4,}[.]\\s\\d{4}", "dd MMMM. yyyy"));
				add(new RegexMatcher("\\d{1,2}\\s[a-zA-Z]{3}[.]\\s\\d{4}", "dd MMM. yyyy"));
				add(new RegexMatcher("[a-zA-Z]{3}\\s\\d{1,2},\\d{4}", "MMM dd,yyyy"));
				add(new RegexMatcher("[a-zA-Z]{4,}[.]\\s\\d{1,2}\\s\\d{4}", "MMM. dd yyyy"));
				add(new RegexMatcher("[a-zA-Z]{3}\\s\\d{1,2}\\s,\\d{4}", "MMM dd, yyyy"));
				add(new RegexMatcher("[a-zA-Z]{3}[.]\\s\\d{1,2},\\d{4}", "MMM. dd,yyyy"));
				add(new RegexMatcher("[a-zA-Z]{3}[.]\\s\\d{1,2},\\s\\d{4}", "MMM. dd, yyyy"));
				add(new RegexMatcher("[a-zA-Z]{3}\\s\\d{1,2}\\s\\d{4}", "MMM dd yyyy"));
				add(new RegexMatcher("[a-zA-Z]{3}\\s\\d{1,2}[,]\\s\\d{4}", "MMM dd, yyyy"));
				add(new RegexMatcher("\\d{4}/\\d{1,2}/\\d{1,2}", "yyyy/mm/dd"));
				add(new RegexMatcher("\\d{1,2}/\\d{1,2}/\\d{4}", "mm/dd/yyyy"));
				add(new RegexMatcher("[^-\\d]\\d{1,2}-\\d{1,2}-\\d{4}", "mm-dd-yyyy"));
				// Issue
				add(new RegexMatcher("\\d{1,2}\\s[a-zA-Z]{3}\\s\\d{4}", "dd MMM yyyy"));
				add(new RegexMatcher("[^-\\dA-Z-a-z]\\d{4}-\\d{1,2}-\\d{1,2}", "yyyy-mm-dd"));
				add(new RegexMatcher("[^-\\d]\\d{4}\\s-\\s\\d{1,2}\\s-\\s\\d{1,2}", "yyyy - mm - dd"));
				add(new RegexMatcher("20\\d{2}[0-1][0-9][0-3][0-9]", "yyyymmdd"));
				add(new RegexMatcher("\\d{1,2}[-][A-Za-z]{3,}[-]\\d{4}", "dd-MMMM-yyyy"));
				add(new RegexMatcher("[A-Za-z]{3,}[.]\\d{4}", "MMMM.yyyy"));
				add(new RegexMatcher("\\d{1,2}\\s[A-Za-z]{3,}\\s{1,2}\\d{4}", "dd MMMM yyyy"));
				add(new RegexMatcher("\\d{1,2}[-][A-Za-z]{3,}[-]\\d{2}", "dd-MMMM-yy"));
				add(new RegexMatcher("[A-Za-z]{3,}[.]\\s\\d{1,2}\\s\\d{4}", "MMMM. dd yyyy"));
				add(new RegexMatcher("[A-Za-z]{3,}[.]\\d{4}", "MMMM.yyyy"));
				add(new RegexMatcher("[A-Za-z]{3,}[.]\\s\\d{4}", "MMMM. yyyy"));
				add(new RegexMatcher("\\d{1,2}\\s[A-Za-z]{3,}\\s\\d{2}", "dd MMMM yy"));
				add(new RegexMatcher("[^-\\dA-Za-z]\\d{1,2}[A-Za-z]{3,}\\d{2}", "ddMMMMyy"));
				add(new RegexMatcher("[^-\\dA-Za-z]\\d{1,2}[a-zA-Z]{3,}\\d{4}", "ddMMMMyyyy"));
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

	Pattern shortPattern;
	String patternStyle;
	
	
	RegexMatcher(String shortPattern, String style) {		
		this.shortPattern = Pattern.compile(shortPattern);
		this.patternStyle = style;
	}
	
}
