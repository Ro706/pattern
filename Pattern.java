
import java.util.*;
public class pattern
{   
  public static void main(String args[])   
{   
  Scanner input = new Scanner(System.in);

  int i, j, row;
  System.out.println("Enter number of rows : \n");
  row = input.nextInt();

  for(i=0; i<row; i++)   
  {
    for(j=0; j<=i; j++)
    {  
       System.out.print(" * ");   
    } 
    System.out.println();   
   }   
  }   
 }  
