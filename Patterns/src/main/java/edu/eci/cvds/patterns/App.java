package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		if (args.length == 0){
			System.out.println( "Hello Word");
		}else{
			
			System.out.println( "Hello " + args[0]+"!");
		}
    }
}
