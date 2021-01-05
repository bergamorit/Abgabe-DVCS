package dsl;

public class Main {

	public static void main(String[] args) {
		Movie m1 = (new Movie("Jaws", 1975, "Steven Spielberg"));
		Movie m2 = (new Movie("Apocalypse Now", 1979, "Francis Ford Coppola"));
		Movie m3 = (new Movie("Ghostbusters 2", 1989, "Ivan Reitman"));
		Movie m4 = (new Movie("Les Misérables", 2020, "Ladj Ly"));
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}

}
