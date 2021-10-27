public class Passenger
{
  private TicketNumber ticket;
  private String name;
  private int age;
  private String email;
  
  public Passenger(TicketNumber ticket,String name,int age,String email)
  {
     this.ticket = ticket;
     this.name = name;
     this.age = age;
     this.email = email;
    }
    
  public String toString()
  {
     return String.format("               Ticket: %s%n               <Name: %s> <Age: %s> <Email: %s>%n", ticket,name,age,email);
    }
  
  public String accessName()
  {
     return name; 
    }
   
  public int accessAge()
  {
     return age; 
    }
    
  public String accessEmail()
  {
     return email; 
    }
}
