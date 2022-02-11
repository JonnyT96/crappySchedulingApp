import java.util.Scanner;
/**
 * Write a description of class STEMDay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class STEMDay
{
    Scanner kbd = new Scanner(System.in);
    private Attendee [] attendeeList;
    private int maxAttendees;
    private char [] choices= {'B', 'P', 'R', 'S', 'W'};
    private String [] messages;
    private int startTime, duration;
    private int [] [] attendanceTable = {{1, 2, 3, 4}, {3, 4, 5, 6}, {4, 5, 6, 7}};
    private int nbrSoFar;

    public STEMDay(){
        //never put a type for an instance variable
        //You will instead make a local copy, and not change the instance variable
        duration = 5;
        startTime = 2;
        maxAttendees = 20;
        attendeeList = new Attendee[maxAttendees];
        attendanceTable = new int[choices.length] [duration];
        nbrSoFar = 0;
    }
    
    public void addAttendee(){
        int attendeeNumber = nbrSoFar+1;
        Attendee a = new Attendee(this);
        a.getInfo();
        attendeeList[nbrSoFar] = a;
        nbrSoFar++;
    }
    
    public void printReport(){
        //right now, does not print time of events
        for(int i = 0; i<attendanceTable.length; i++){
            for(int nbr:attendanceTable[i]){
                System.out.print(nbr + "   ");
                //printRow(attendanceTable[i]);
            }
            System.out.println();
        }
    }

    private void printRow(int [] row){
        /*for(int nbr:row){
        System.out.print(nbr + "   ");
        }
         */
        for(int i = 0; i<row.length; i++){
            System.out.print(row[i] + "   ");
        }
    }
}
