import java.util.Scanner;
public class sumFibonacci{
	public static void main(String[]args){
		 Scanner show = new Scanner(System.in);
		 int n1=1,n2=1,n3,i,count,sum=0; 
		 System.out.print("Masukkan Angka: ");

		 count = show.nextInt();  
		 sum=sum+n1+n2;
		 
		 for(i=2;i<count;++i)  {  
			  n3=n1+n2;
			  sum=sum+n3;
			  n1=n2;  
			  n2=n3;
		 }
		 System.out.print(" "+sum);  
	}
}