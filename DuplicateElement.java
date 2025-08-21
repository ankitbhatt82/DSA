import java.util.Scanner;
class DuplicateElement {  
    public static void main(String[] args) {      
           
        int n,i,j;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of elements you want in an array:");
    n = sc.nextInt();   
    int arr[] = new int[n];  
    System.out.println("Enter the value of elements you want in an array:");
    for (i=0; i<n; i++){
        arr[i]= sc.nextInt();
    }
          
        System.out.println("Duplicate elements in given array: ");  
                      
        for( i = 0; i < arr.length; i++) {  
            for( j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  
