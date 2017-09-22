import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
/**
 * 
 * @author Justin Mattix
 * Gradebook Program
 *This class creates a Gradebook object to hold the grades.
 *This class also run the methods for each function that the user wants to run
 */
public class Gradebook
{
	private int [] grades;
	
	public Gradebook(String filename) throws IOException
	{
		Scanner fin = new Scanner(new FileReader(filename));
		
		int numGrades = fin.nextInt();
		/**
		 * Finding the number of grades
		 */
		grades = new int[numGrades];
		/**
		 * creating and sorting the array
		 */
		for(int i = 0; i < numGrades; i++)
		{
			grades[i] = fin.nextInt();
		}
		fin.close();
		
		Arrays.sort(grades);
	/**
	 * This is the code for each of the 6 functions this program can run
	 */
	}
 
	public int getnumGrades()
	{
		return grades.length;
	}
	public int getMin()
	{
		return grades[0];
	}
	public int getMax()
	{
		return grades[grades.length - 1];
	}
	public double getMean()
	{
		double sum = 0;
		
		for(int i = 0; i < grades.length; i++)
		{
			sum = sum + grades[i];
		}
		return sum/grades.length;
	}
	public int getMedian()
	{
		    int median = grades.length/2;
		    if (grades.length%2 == 1) 
		    {
		        return grades[median];
		    }
		    else 
		    {
		     median = (int) ((grades[median-1] + grades[median]) / 2.0);
		    }
		return median;
	}
	
	public int[] getGradeDistribution()
	{
		int[]distro = new int[11];
		
		for(int i = 0; i < grades.length; i++)
		{
			if(grades[i] >= 90)
			{
				distro[0]++;
			}
			else if(grades[i] >= 80)
			{
				distro[1]++;
			}
			else if(grades[i] >= 70)
			{
				distro[2]++;
			}
			else if(grades[i] >= 60)
			{
				distro[3]++;
			}
			else
			{
				distro[4]++;
			}
		}
			return distro;
		
	}
}

