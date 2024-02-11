package week4;

import java.util.Scanner;

public class AfterChatGPT {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String rawElGuerroujTime = "3:43.13";
        String[] parts = rawElGuerroujTime.split("[:.]");
        float elGuerroujMinutes = Float.parseFloat(parts[0]);
        float elGuerroujSeconds = Float.parseFloat(parts[1]);
        float elGuerroujMilliseconds = Float.parseFloat(parts[2]);
        float elGuerroujTotalSeconds = (elGuerroujMinutes * 60) + elGuerroujSeconds + (elGuerroujMilliseconds / 100);
        int elGuerroujRecord = (int) elGuerroujTotalSeconds;

        System.out.println("The world record for the mile is held by Hicham El Guerrouj at 3:43.13.\n");

        System.out.println("Enter your personal best mile time in minutes, seconds, and milliseconds, using the \":\" and \".\" symbol, respectively, like \"4:15.46\":");
        String personalBestMileTime = scr.nextLine();
        parts = personalBestMileTime.split("[:.]");
        float personalBestMinutes = Float.parseFloat(parts[0]);
        float personalBestSeconds = Float.parseFloat(parts[1]);
        float personalBestMilliseconds = parts.length > 2 ? Float.parseFloat(parts[2]) : 0;
        float personalBestTotalSeconds = (personalBestMinutes * 60) + personalBestSeconds + (personalBestMilliseconds / 100);
        int personalBest = (int) (personalBestTotalSeconds);
        if (personalBest >= elGuerroujRecord) {
            System.out.println("Your time of " + personalBestMileTime + " is not faster than the world record. It's time to start training...");
        } else {
            System.out.println("Your time is faster than the world record! Time to retire.");
            return; // Just return from the method
        }
        int monthCount = 0;

        while ((monthCount < 18) && (personalBest >= elGuerroujRecord)) {
            System.out.println("Training and race complete for month " + (monthCount + 1) + ". Enter 1 for Yes, 2 for No:");
            int trainingBinary = scr.nextInt();
            scr.nextLine(); // Consume the newline left-over
            if (trainingBinary == 1) {
                System.out.println("Enter this month's race time:");
                String rawNewRaceTime = scr.nextLine();
                parts = rawNewRaceTime.split("[:.]");
                float rawNewRaceMinutes = Float.parseFloat(parts[0]);
                float rawNewRaceSeconds = Float.parseFloat(parts[1]);
                float rawNewRaceMilliseconds = parts.length > 2 ? Float.parseFloat(parts[2]) : 0;
                float rawNewRaceTotalSeconds = (rawNewRaceMinutes * 60) + rawNewRaceSeconds + (rawNewRaceMilliseconds / 100);
                int convertNewRaceTime = (int) (rawNewRaceTotalSeconds);
                if (convertNewRaceTime >= elGuerroujRecord) {
                    System.out.println("Your new time did not break the record. Proceeding to the next month...");
                } else {
                    System.out.println("You broke the record! Congratulations! Time to retire.");
                    break;
                }
            } else if (trainingBinary == 2) {
                System.out.println("You have quit your pursuit of the goal. Time to retire.");
                break;
            }
            monthCount++;
        }
        if (monthCount >= 18) {
            System.out.println("You have reached your 18-month time limit. Time to retire.");
        }
    }
}