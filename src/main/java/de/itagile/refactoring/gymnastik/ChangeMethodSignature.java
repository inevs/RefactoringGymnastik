package de.itagile.refactoring.gymnastik;

public class ChangeMethodSignature {

	private String changeMyMethodSignatureToReturnStringAndAdditionalIntroduceIntParameter(String text) {
		return text;
	}

	public Object userOfChangeMyMethodSinature() {
		// do not change but look at the params
		return changeMyMethodSignatureToReturnStringAndAdditionalIntroduceIntParameter("1");
	}
}
