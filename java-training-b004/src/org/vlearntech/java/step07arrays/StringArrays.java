package org.vlearntech.java.step07arrays;

public class StringArrays {
	public static void main(String[] args) {

		String[] names = { "Albert", "Bob", "Charlie", "Denise", "Ellie", "Frank", "Gunther", "Harry", "Ian", "Jack",
				"Katherine", "Laura", "Maurice", "Nathan" };

		/*
		 * jshell> String[] names = { "Albert", "Bob", "Charlie", "Denise", "Ellie", "Frank", "Gunther", "Harry", "Ian",
		 * "Jack", ...> "Katherine", "Laura", "Maurice" }; names ==> String[13] { "Albert", "Bob", "Charlie", "Denise"
		 * ... ine", "Laura", "Maurice" }
		 * 
		 * jshell> names names ==> String[13] { "Albert", "Bob", "Charlie", "Denise", "Ellie", "Frank", "Gunther",
		 * "Harry", "Ian", "Jack", "Katherine", "Laura", "Maurice" }
		 * 
		 * jshell> names[0] $3 ==> "Albert"
		 * 
		 * jshell> names[3] $4 ==> "Denise"
		 * 
		 * jshell> names[3] + " " + names[7] $5 ==> "Denise Harry"
		 * 
		 * jshell> names[13] | Exception java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
		 * | at (#6:1)
		 * 
		 * jshell> names[130] | Exception java.lang.ArrayIndexOutOfBoundsException: Index 130 out of bounds for length
		 * 13 | at (#7:1)
		 * 
		 * jshell> names.length $8 ==> 13
		 * 
		 * jshell> Arrays.toString(names) $9 ==>
		 * "[Albert, Bob, Charlie, Denise, Ellie, Frank, Gunther, Harry, Ian, Jack, Katherine, Laura, Maurice]"
		 * 
		 */

		// Use normal loop with arrays ONLY IF you are interested in the index for some reason
		System.out.println("========== NORMAL FOR LOOP ===============");
		for (int i = 0; i < names.length; ++i) {
			System.out.println(names[i]);
		}

		// If you are not interested in the index, go for the ENHANCED FOR LOOP.
		System.out.println("\n\n========== ENHANCED FOR LOOP ===============");
		for (String name : names) {
			System.out.println(name);
//			System.out.println(name  + " : " + name.length() );
		}

	}
}
