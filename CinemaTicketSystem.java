import java.util.Scanner;

import Java.util.*:
public class CinemaTicketSystem 
{
    System.static.void main (String[] arg); 
    {
        Scanner keyboardIn = new Scanner (System.in);
        
        //constants 
        
        final double VAT_Rate = 0.13; //VAT Rate 

        ///Ticket Price List
        
        final double CHILD_PRICE = 5.00;
        final double ADULT_PRICE = 10.00;
        final dobule SENIOR_PRICE = 7.00; 

        //FOOD And DRINKS Price List 

        final double POPCORN = 3.00;
        final double COFFEE_BLACK = 2.50;
        final double COFFEE_OTHERS = 2.99;
        final double HAMBURGER = 5.00; 
        final double SNACKS = 2.00; 

        //Discount Rate More Than 5 Ticket 

        final double DISCOUNT = 0.10;

        //Defination of the veriables 

        char TicketType;
        int NumberOfTicket; 
        char SnackOption; 
        
        double TicketPrice =0.00;
        double SnackPrice = 0.00; 

        double ticketTotal, snackTotal, discount, subTotal, vat, finalTotal;


        // Validation of the Ticket Type with Do-While Loop
        do
        {
            System.out.println("Please Enter Your Ticket Type,A=Adult, C=Child, S=Senior, ");
            ticketType = keyboardIn.next().char(0);
            
            //invalid entry message //
            if(ticketType != 'C' && ticketType != 'c'&&
                ticketType != 'A' && ticketType != 'a' &&
                ticketType != 'S' && ticketType != 's'
            );
            {
                System.out.println("Invalid ticket type please re-enter your ticket type!!");

            }
        }

        while(ticketType != 'C' && ticketType != 'c' &&
            ticketType != 'A' && ticketType != 'a' &&
            ticketType != 'S' && ticketType != 's');

        //Number of Tickets
        do 
        {
            System.out.println("Enter number of tickets: ");
            numTicket =keyboardIn.nextInt();

            if(numTicket <= 0)
            {
                System.out.println("Invalid Number! Must be more than 1");

            }

        }
            while(numTicket<=0);

            do
            {
                System.out.print("Snack optins P=Popcorn, N=None):");
                snackOption =keyboardIn.next().charAt(0);
            }


    
    }
}