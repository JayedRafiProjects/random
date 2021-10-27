import java.util.ArrayList;
public class Flight
{
    //Instance variables
    private ArrayList<Passenger>clients;
    private String flightName;
    private int date; private int month; private int year;
    private final int SEATS = 500;
    
    /*
     * 
     * Initializes the variables
     * 
     */
    public Flight(String flightName,int date,int month,int year)
    {
        clients = new ArrayList<Passenger>();
        this.flightName = flightName;
        this.date = date;
        this.month = month;
        this.year = year;
    }
    
    /*
     * 
     * Aligns the list
     * 
     */
    public String list()
    {
     String output = "\n";
     for(int i=0; i<clients.size(); i++)
     {
         output+=clients.get(i)+"\n";
        }
     return output;
    }
    
    /*
     * 
     * Aligns the output
     * 
     */
    public String toString()
    {
        return String.format("         Flight: %s%n    Date(M/D/Y): %s/%s%s%nTotal Passenger: %s%n Passenger list:%n%s",flightName,month,date,year,clients.size(),list());
    }
    
    public void add(Passenger client)
    {
        boolean duplicate = false;
        for(int i=0; i<clients.size(); i++)
        {
        if(client.accessName() == clients.get(i).accessName() && client.accessAge() == clients.get(i).accessAge() && client.accessEmail() == clients.get(i).accessEmail())
        duplicate = true;
        }
        if(duplicate==false && clients.size()<SEATS)
        clients.add(client);
    }
    
    public void delete(Passenger client)
    {
     for(int i=0; i<clients.size(); i++)
        {
        if(client.accessName().equals(clients.get(i).accessName()) && client.accessAge() == clients.get(i).accessAge() && client.accessEmail().equals(clients.get(i).accessEmail()))
        clients.remove(i);
    }
    }
}
