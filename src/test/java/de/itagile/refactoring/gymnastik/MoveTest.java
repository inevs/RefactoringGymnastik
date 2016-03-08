package de.itagile.refactoring.gymnastik;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import de.itagile.refactoring.gymnastik.helper.Foo;

public class MoveTest {

	private Move refactorMove;

	@Before
	public void setUp() {
		refactorMove = new Move();
	}

	@Test
	public void methodReturnsNameOfClass() throws Exception {
		assertThat(refactorMove.tryToMoveMeToFoo(), is("Move"));
	}

	@Test
	public void methodReturnsHelloIAmFoo() throws Exception {
		assertThat(refactorMove.moveMeAlsoToFoo(new Foo()), is("Hello, I am Foo"));
	}

}
