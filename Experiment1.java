import java.util.Scanner; 
class Experiment1
{
	public static void main(String[]args)
	{
	 Scanner input = new Scanner(System.in);
	 System.out.println("enter the size of array");
     int n=input.nextInt();
     int i,sum=0;
     int arr[]=new int[n];
     System.out.println("Enter the elements: ");
     for(i=0;i<n;i++)   
       {
          arr[i]=input.nextInt();
        }

       int max=arr[0],min=arr[0];  

       for(i=0;i<n;i++)
       {
         if(arr[i]>max)   
         max=arr[i];
         if(arr[i]<min)  
         min=arr[i];
       }
      System.out.println("Maximum Number: "+max);
     System.out.println("Minimum Number: "+min);
     System.out.println("difference between maximum and minimum array is " +(max-min));
    }
}
