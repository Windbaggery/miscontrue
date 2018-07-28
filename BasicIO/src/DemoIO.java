import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemoIO {
public static void main (String[] args)
{
	File file =new File("Test.txt");
	try {
	PrintWriter output = new PrintWriter(file);
	output.println("Jincy");
	output.println("31");
	output.close();
		
	}
	catch(IOException ex) {System.out.printf("Error in writing file : \n "+ ex);}
	


	try
	{
	Scanner input = new Scanner(file);
	String name=input.nextLine();
	int age=input.nextInt();
	System.out.println("Name :"+name+ " "+" Age :"+ age);
	input.close();
	}
	catch (Exception e) {System.out.println("Error in Reading File :  \n" + e);}
	
	
}
}
