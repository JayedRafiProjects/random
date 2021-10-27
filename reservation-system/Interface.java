/*
 * Use this file to run your program
 */
import java.util.Scanner;
public class Interface
{
 public static void main(String[] args)
 {
     System.out.println("-------------------- Welcome to Airlines Reservation System Version 1.0 --------------------");
     Scanner scan = new Scanner(System.in);
     while(1!=0)
     {
         System.out.println("Enter flight name");
         String flightName = scan.nextLine();
         System.out.println("Enter Date");
         int Date = scan.nextInt();
         System.out.println("Enter Month");
         int Month = scan.nextInt();
         System.out.println("Enter Year");
         int Year = scan.nextInt();
         Flight flight = new Flight(flightName,Date,Month,Year);
         String next = "";
         
         while(!next.equals("DONE"))
         {
             if(!next.equals("DONE"))
             System.out.println("ADD to add / REMOVE to remove/ Done to end list");
             next = scan.nextLine().toUpperCase();
             if(next.equals("DONE"))
             {
                }
             else if(next.equals("REMOVE"))
             {
                 TicketNumber ticket = new TicketNumber();
                 System.out.println("Enter client name");
                 String nameClient = scan.nextLine();
                 System.out.println("Enter client E-mail");
                 String emailClient = scan.nextLine();
                 System.out.println("Enter client age");
                 int ageClient = scan.nextInt();
                 Passenger A = new Passenger(ticket,nameClient,ageClient,emailClient);
                 flight.delete(A);
                }
             else if(next.equals("ADD"))
             {
                 TicketNumber rTicket = new TicketNumber();
                 System.out.println("Enter client name");
                 String rNameClient = scan.nextLine();
                 System.out.println("Enter client E-mail");
                 String rEmailClient = scan.nextLine();
                 System.out.println("Enter client age");
                 int rAgeClient = scan.nextInt();
                 Passenger R = new Passenger(rTicket,rNameClient,rAgeClient,rEmailClient);
                 flight.add(R);
                }
            }
         System.out.println(flight);
        }
    }
}
