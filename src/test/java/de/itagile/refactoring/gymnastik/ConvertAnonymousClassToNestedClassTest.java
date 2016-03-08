package de.itagile.refactoring.gymnastik;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ConvertAnonymousClassToNestedClassTest {

	@Test
	public void test() {
		assertThat(new ConvertAnonymousClassToNestedClassAndMoveToFile().convertAnonymousComparatorToNestedClass(), is(asList(3, 2, 1)));
	}

}
