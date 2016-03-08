package de.itagile.refactoring.gymnastik;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class ChangeMethodSignatureTest {

	@Test
	public void userOfChangeMyMethodSinatureReturnsFoo() {
		assertThat(new ChangeMethodSignature().userOfChangeMyMethodSinature(), Is.is((Object) "foo"));
	}

}
