package de.itagile.refactoring.gymnastik;

import de.itagile.refactoring.gymnastik.helper.Foo;

public class Move {
	public String tryToMoveMeToFoo() {
		return this.getClass().getSimpleName();
	}

	public String moveMeAlsoToFoo(Foo foo) {
		return foo.toString();
	}
}
