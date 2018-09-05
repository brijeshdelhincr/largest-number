package com.brijesh.assignment.one;

public class ElementDetail {
	
	int originalValue;
	long modifiedValue;

	public ElementDetail(int originalValue, int len) {
		this.originalValue = originalValue;
		String s = Integer.toString(originalValue);
		StringBuilder sb = new StringBuilder(s);
		StringBuilder ans = new StringBuilder();
		while (ans.length() <= len + 1)
			ans.append(sb);

		s = ans.toString().substring(0, len + 1);
		modifiedValue = Long.parseLong(s);
	}

	public String toString() {
		return "[" + modifiedValue + ", " + originalValue + "]";
	}
}
