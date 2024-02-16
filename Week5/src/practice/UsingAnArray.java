package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class UsingAnArray {
	public static void main(String[] args) {
		ArrayList<String> partyList = new ArrayList<>();
		System.out.println("Add guests until you are done. Then type done.");
		String end = "done";
		Scanner scnr = new Scanner(System.in);
		String guest = "idk";
		
			while (!guest.equals(end)) {
				guest = scnr.next();
				partyList.add(guest);
				
			}
			partyList.remove("done");
			System.out.println(partyList);
		}
	}
