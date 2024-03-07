package stringOutputForDifferentReasons;

import java.util.Scanner;

public class UserInputINStringOUT {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Input a word.");
		String answer0 = scnr.next();
		System.out.println("Enter a number.");
		int answer1 = scnr.nextInt();
		
		System.out.println("You input " + answer0 + " and " + answer1 + "\n\n");
		
		System.out.println("Let's see if we can do an MadLib. \nI am going to ask "
				+ "for differnt nouns, adjetives, verbs and adverbs. \nThen I will output a story"
				+ "with those words inplanted into it. \r\n\n");
		
		System.out.print("A place you can be: ");
		String noun0; // a place you can be
		noun0 = scnr.next();
		System.out.print("Animal: ");
		String noun1; // animal
		noun1 = scnr.next();
		System.out.print("Something you can eat: ");
		String noun2; // something you can eat
		noun2 = scnr.next();
		System.out.print("A place you can be that rhymes with your animal: ");
		String noun3; // place you can be the rhymes with your animal
		noun3 = scnr.next();
		System.out.print("Adjective desribing a concept: ");
		String adj0; // adjective describing a concept
		adj0 = scnr.next();
		System.out.print("Something you wear: ");
		String noun4; // something you wear
		noun4 = scnr.next();
		System.out.print("Action verb: ");
		String verb0; // action verb
		verb0 = scnr.next();
		System.out.print("Animal: ");
		String noun5; // animal
		noun5 = scnr.next();
		System.out.print("Past tense verb: ");
		String verb1; // past tense verb
		verb1 = scnr.next();
		System.out.print("Past tense verb: ");
		String verb2; // past tense verb
		verb2 = scnr.next();
		System.out.print("Food: ");
		String noun6; // food
		noun6 = scnr.next();
		System.out.print("A place you can be: ");
		String noun7; // place you can be
		noun7 = scnr.next();
		System.out.print("Past tense verb: ");
		String verb3; // past tense verb
		verb3 = scnr.next();
		System.out.print("An occasion: ");
		String noun8; // occasion
		noun8 = scnr.next();
		System.out.print("Adjective: ");
		String adj1; // adjective
		adj1 = scnr.next();
		System.out.print("Adverb: ");
		String adverb0; // adverb
		adverb0 = scnr.next();
		System.out.print("Noun: ");
		String noun9; // noun
		noun9 = scnr.next();
		System.out.print("Noun: ");
		String noun10; // noun
		noun10 = scnr.next();
		System.out.print("Adjective: ");
		String adj2; // adjective
		adj2 = scnr.next();
		
		
		System.out.println(
				"In a " + noun0 + " quite snug, lived Benny the " + noun1 + ",\r\n"
				+ "Dreaming of " + noun2 + ", from his under-bed " + noun3 + ".\r\n"
				+ "With a plan so " + adj0 + ", in a bee " + noun4 + ", he'd dare,\r\n"
				+ "To " + verb0 + " with the " + noun5 + ", as if he didn't care.\r\n"
				+ "\r\n"
				+ "He " + verb1 + " and he " + verb2 + ", in his yellow-striped wear,\r\n"
				+ "Snatched " + noun6 + " so sweet, with barely a spare.\r\n"
				+ "Back to his " + noun7 + ", with his prize in the air,\r\n"
				+ "Benny " + verb3 + " with glee, \"What a splendid " + noun8 + "!\"\r\n"
				+ "\r\n"
				+ "In his " + adj1 + " retreat, with a " + adverb0 + " flair,\r\n"
				+ "He savored his " + noun9 + ", in his " + adj2 + " bear " + noun10 + ".");
	}

}
