import java.util.*;
class EvenElementSum{
	public void evenSum( int arr[],int n){
		int c = 0;
		for(int i = 0; i<n; i++){
			if(arr[i]%2==0){
				c+=arr[i];
			}
		}
		System.out.println("Sum of even element in an array is :"+c);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++){
			System.out.println("enter "+(i+1)+" element ");
			arr[i]= sc.nextInt();
		}
		EvenElementSum sp = new EvenElementSum();
		sp.evenSum(arr,n);
	}
}
