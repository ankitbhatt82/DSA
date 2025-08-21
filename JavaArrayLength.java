import java.util.Scanner;
class JavaArrayLength{
	public static void main(String[] args) {
	int n,i;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number of elements you want in an array:");
	n = sc.nextInt();	
	int arr[] = new int[n];
	System.out.println("Enter the value of elements you want in an array:");
	for (i=0; i<n; i++){
		arr[i]= sc.nextInt();
	}
	System.out.println("Elements of array are :");
	for(i=0; i<n; i++){
		System.out.println(arr[i]);
	}
	}
}