public class TicketNumber
{
    //Instance variale
    private int seatNumber;
    private int ticketNumber;
    
    //Class variable
    private static int startSeatNumber = 1;
    private static int startTicketNumber = 1000;
    
    //Total cpacity in one flight
    private final int SEATS = 499;
    
    /*
     * 
     * Initializes variables
     * and limit seats to SEATS
     * 
     */
    public TicketNumber()
    {
        seatNumber = startSeatNumber;
        ticketNumber = startTicketNumber;
        if(startSeatNumber <= SEATS)
        startSeatNumber++;
        else 
        {
        startSeatNumber = 1;
        startTicketNumber++;
        }
    }
    
    //Accessor methods
    
    public int accessSeatNumber()
    {
     return seatNumber;   
    }
    
    public int accessTicketNumber()
    {
        return ticketNumber;
    }
    
    /*
     * 
     * Aligns output
     * 
     */
    public String toString()
    {
     return seatNumber+":"+ticketNumber;   
    }
}
