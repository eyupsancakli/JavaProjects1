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

        // Validation of the Ticket Type with Do-While Loop
        do
        {
            System.out.println("Please Enter Your Ticket Type,A=Adult, C=Child, S=Senior, ");
            customerType = keyboardIn.next().char(0);
            
            //invalid entry message //
            if(customerType !=)
        }


    
    }
}