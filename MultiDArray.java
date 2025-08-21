import java.util.Scanner;
class MultiDArray{
	public static void main(String[] args) {
		int m, n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		n = sc.nextInt();
		System.out.println("enter the number of column");
		m = sc.nextInt();
		int a[][] = new int [n][m];
		System.out.println("enter values");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			} 
			System.out.println();
		}		
	}
}