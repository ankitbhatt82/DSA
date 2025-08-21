import java.util.Arrays;
class Experiment3C {
  public static void main(String[] args) {
   int num[] = {1, 95, 5, 42, 18, 39, 3, 55};
   int n = num.length;
   Arrays.sort(num);
   System.out.println("Second Highest Number: "+num[n-2]);
   }
}
