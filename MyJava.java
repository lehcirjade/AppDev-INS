import java.util.*;  
public class FindAverageOfList  
{  
public static void main(String args[])  
{  
//creates an array   
//the asList() method return a fixed-size list backed by the specified array  
List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);  
//variable to store sum  
int sum = 0;  
//for-each loop iterates over the list  
for (int i : list)   
{  
//adds elements to the variable sum  
sum+=i;  
}  
//checks if the list is empty  
if(list.isEmpty())  
{  
System.out.println("List is empty!");  
}   
else   
{  
//calculate average and returns the same  
System.out.println("The average of the List is: " + sum/(float)list.size());  
}  
}  
}  
