import java.util.Scanner;
class ArrayDeleteElement{
	public static void main(String[] args) {
	int n,i,m,p;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number of elements you want in an array:");
	n = sc.nextInt();	
	int arr1[] = new int[n];
	int arr2[] = new int[n-1];
	System.out.println("Enter the value of elements you want in an array:");
	for (i=0; i<n; i++){
		arr1[i]= sc.nextInt();
	}
	System.out.println("Enter index of the value which you want to delete:");
    m = sc.nextInt();
    
    for(i=0; i<n;i++){
    	if(i<m){
    		arr2[i]= arr1[i];
    	}else if(i==m)
    	
    	continue;
    		else{
    			arr2[i-1]= arr1[i];
    	    }
        }	
    
	System.out.println("Elements of new array are :");
	for(i=0; i<n-1; i++){
		System.out.println(arr2[i]);
	}
	}
}