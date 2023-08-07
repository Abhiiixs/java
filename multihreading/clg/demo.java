class EmpIdExp extends Exception  
{  
    public EmpIdExp(String str)  
    {  
        super(str);  
    }  
}  
public class demo
 
{  
    public static void main(String args[])  
    {
	  String empid = args[0];
        try  
        {  		
		if (empid.charAt(0) == 'E') 
		{
            	System.out.print("Valid Employee ID");
            }
		else 
		{
            	throw new EmpIdExp("Invailid Employee ID");
           	}
            
        }  
        catch (EmpIdExp e)  
        {  
            System.out.println("Caught the exception");  
            System.out.println( e.getMessage());  
        }  
    }  
}