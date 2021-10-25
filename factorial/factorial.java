public class factorial
{
    public static void main(String[] args)
    {
     int inputNumber = 10; //Input your n in here
     System.out.println(inputNumber+"! means");
     System.out.println("= "+calculator ("", 1, inputNumber));   
    }
    
    public static int calculator (String line, int result, int number)
    {
        if(number==0)
        {
           System.out.println(line);
           return result;
        }
        else
        {
            result*=number;
            line+=number;
            if(number>1)
            line+="x";
            return calculator(line, result, number-1);
        }
    }
}
