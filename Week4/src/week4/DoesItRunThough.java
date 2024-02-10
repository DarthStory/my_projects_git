package week4;

import java.util.Scanner;

public class DoesItRunThough {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String rawElGuerroujTime = "3:43.13";
        float elGuerroujMinutes = Float.parseFloat(rawElGuerroujTime.substring(0, 1));
        float elGuerroujMinutesMilli = Float.parseFloat(rawElGuerroujTime.substring(2, 7));
        float elGuerroujSecondsMilli = (elGuerroujMinutes * 60) + elGuerroujMinutesMilli;
        int elGuerroujRecord = (int) elGuerroujSecondsMilli;

        System.out.println("The world record for the mile is held by Hicham El Guerrouj at 3:43.13.\n");

        System.out.println("Enter your personal best mile time in minutes, seconds, and milliseconds, using the \":\" and \".\" symbol, respectively, like \"4:15.46\":");
        String personalBestMileTime = scr.nextLine();
        float personalBestMinutes = Float.parseFloat(personalBestMileTime.substring(0, 1));
        float personalBestMinutesMilli = Float.parseFloat(personalBestMileTime.substring(2, 6));
        float personalBestSecondsMilli = (personalBestMinutes * 60) + personalBestMinutesMilli;
        int personalBest = (int) (personalBestSecondsMilli);
        if (personalBest >= elGuerroujRecord) {
            System.out.println("Your time of " + personalBestMileTime + " is not faster than the world record. " + "It's time to start training...");
        } else {
            System.out.println("Your time is faster than the world record! Time to retire.");
            System.exit(0);
        }
        int monthCount = 0;
        
        while ((monthCount < 18) && (personalBest >= elGuerroujRecord)) {
            monthCount++;
            System.out.println("Training and race complete for month " + monthCount + "\nEnter 1 for Yes, 2 for No:");
            int trainingBinary = scr.nextInt();
            if (trainingBinary == 1) {
                System.out.println("Enter this month's race time:");
                String rawNewRaceTime = scr.next();
                float rawNewRaceMinutes = Float.parseFloat(rawNewRaceTime.substring(0, 1));
                float rawNewRaceMinutesMilli = Float.parseFloat(rawNewRaceTime.substring(2, 6));
                float rawNewRaceSecondsMilli = (rawNewRaceMinutes * 60) + (int) (rawNewRaceMinutesMilli);
                int convertNewRaceTime = (int) (rawNewRaceSecondsMilli);
                if (convertNewRaceTime >= elGuerroujRecord) {
                    System.out.println("Your new time did not break the record. Proceeding to month " + (monthCount+1) + "...");
                } else {
                    System.out.println("You broke the record! Congratulations! Time to retire.");
                    break;
                }
            } else if (trainingBinary == 2){
                System.out.println("You have quit your pursuit of your goal. Time to retire.");
                break;
            }
        }
        System.out.println("You have reached your 18-month time limit. Time to retire.");
        return 0;
    }
}