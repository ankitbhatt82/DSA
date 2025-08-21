class Experiment3B
{
    static int arr[] = {12,3,4,15,20,11};
    static int sum()
    {
        int sum = 0; 
        int i;
        for (i = 0; i < arr.length; i=i+2)
        sum +=  arr[i];
       
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Sum of alternate elements of array is " + sum());
    }
}
