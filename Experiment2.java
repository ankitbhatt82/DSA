import java.util.Scanner;
class  Experiment2{
    public static void main(String[] args){
            int i;
            Scanner sc = new Scanner (System.in);             
            int arr[] = new int[10];
            System.out.println("Enter the value of elements you want in an array:");
            for (i=0; i<10; i++){
            arr[i]= sc.nextInt();
            }
           
            System.out.println("Elements at even index:");
            for (i = 0; i < arr.length; i++) {
            if(i%2==0){
             System.out.println(arr[i]);
            }
            }
            System.out.println("Elements which are even:");
            for (i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
            System.out.println(arr[i]);
            }
            }
            System.out.println("On reversing, Array changes to: ");
            for(i=arr.length-1;i>=0;i--){
                System.out.println(arr[i]);
            }
            System.out.println("First Element is: "+arr[0]+" and Last ELement is: "+arr[arr.length-1]);
   }
}
