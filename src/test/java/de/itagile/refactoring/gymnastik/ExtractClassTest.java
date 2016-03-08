package de.itagile.refactoring.gymnastik;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ExtractClassTest {

	@Test
	public void methodReturnsGandalfsName() {
		assertThat(new ExtractClass().getNameFormatted(), is("Greyhame, Gandalf"));
	}
}
