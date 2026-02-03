import java.util.*;
public class Temperatures{
public static void main(String[] args)
{
Scanner keyboardIn = new Scanner(System.in);
int[] temps = new int[7];
//Get max temps for the week
for(int i = 0; i< temps.length; i++)
{
 System.out.print("Max temp for Day " +(i+1)+": ");
 temps[i] = keyboardIn.nextInt();
}
//display max temps for week
System.out.println("***Max weekly temperature***");
for(int i = 0; i< temps.length; i++)
{
 System.out.println("Day " +(i+1)+": " +temps[i]);
}
}
}
