//Justin Mattix
//ESPN program
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author Justin Mattix
 *this class uses a scanner and if loops to read and compute the user input to run the right method
 */
public class ESPN_ 
	{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter a command");
		/**
		 * scanner for user input
		 * 
		 */
		Scanner cin = new Scanner(System.in);
		/**
		 * Making the Gradebook
		 */
		Gradebook g = null;
		String command;
		while(true)
		/**
		 * listing the commands and leading them to the correct methods
		 */
		{
			command = cin.nextLine();
			
			if(command.equalsIgnoreCase("read"))
			{
				System.out.println("Please enter a filename then a command");
				g = new Gradebook(cin.nextLine());
			}
			if(command.equalsIgnoreCase("min"))
			{
				System.out.println(g.getMin());
			}
			if(command.equalsIgnoreCase("max"))
			{
				System.out.println(g.getMax());
			}
			if(command.equalsIgnoreCase("mean"))
			{
				System.out.println(g.getMean());
			}
			if(command.equalsIgnoreCase("median"))
			{
				System.out.println(g.getMedian());
			}
			if(command.equalsIgnoreCase("grade distribution"))
			{
				System.out.println("The grades are as follows");
				int[]distro = g.getGradeDistribution();
				System.out.println(distro[0] + " got an A");
				System.out.println(distro[1] + " got a B");
				System.out.println(distro[2] + " got a C");
				System.out.println(distro[3] + " got a D");
				System.out.println(distro[4] + " got a F");
			}
			if(command.equalsIgnoreCase("quit"))
			{
				break;
			}
			
		
		}
		
		cin.close();
		
	}	
}


