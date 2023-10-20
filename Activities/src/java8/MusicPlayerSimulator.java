package java8;

import java.util.Scanner;

public class MusicPlayerSimulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the playback control (Resume, Pause, Stop): ");
        String playbackControl = scanner.nextLine();

        switch (playbackControl) {
            case "Resume":
                System.out.println("Action: Resume playing music");
                break;
            case "Pause":
                System.out.println("Action: Pausing music");
                break;
            case "Stop":
                System.out.println("Action: Music stopped");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}