package org.codefx.courses.java8.default_;

public class NoOpEditor implements Translator, Reviewer {

	@Override
	public boolean verify(String sentence) {
		return true;
	}

	@Override
	public String translate(String sentence) {
		return sentence;
	}

}
