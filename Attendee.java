import java.util.Scanner;

/**
 * Write a description of class Attendee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attendee
{
    private int arriving;
    private int hoursAtttend;
    private String [] schedule;
    private int idNumber;
    private STEMDay stemday;
    private String attendedEvents;

    public Attendee (STEMDay s){
        stemday = s;
    }

    public static int getInteger(Scanner kbd,
    String prompt, int begin, int end) {
        int value;
        System.out.print(prompt);
        System.out.print("Number must be between " + begin
            + " and " + end + "-> ");
        value = kbd.nextInt();
        while (value < begin || value > end) {
            System.out.print("Number must be between " + begin
                + " and " + end + ". ");
            System.out.print(prompt);
            value = kbd.nextInt();
        }
        return value;
    }

    public void getInfo(java.util.Scanner kbd){
        arriveTime = getInteger(kbd, "What time would you like to arrive? ", 2, 7);
        duration = getInteger(kbd, "How many hours would you like to attend? ", 1, 7-arriveTime);

    }

}
