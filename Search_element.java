import java.util.Scanner;
public class Search_element
{
public static void main(String[] args)
{
int n;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of elements:");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Input the array elements:");
for (int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}
int ele = s.nextInt();
for (int i = 0; i < n; i++)
{
if(a[i] == ele)
{
System.out.println("Element Found");
}
}
}
}