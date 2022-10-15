package exception_handling;

public class except_main {
	public static void main(String args[])  
    {  
        try  
        {  
            // throw an object of user defined exception  
            throw new rizon("This is user-defined exception");  
        }  
        catch (rizon abir)  
        {  
            System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(abir.getMessage());  
        }  
    }  
}
