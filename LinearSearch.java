import java.util.*;
class LinearSearch{
	public void linearSearching(int arr[], int n,int key){
		int index = 0;
		for(int i = 0; i<n; i++){
			if(arr[i] ==key){
				index = i;
			}
		}
		if(index!=0){
			
			System.out.println("number  found at index "+index);
		}
		else{
			System.out.println("number not found");
		}
	}	
	public static void main(String args[]){
		LinearSearch sp = new LinearSearch();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++){
			System.out.println("enter "+(i+1)+" element ");
			arr[i]= sc.nextInt();
		}
		System.out.println("enter the key which you want");
		int key = sc.nextInt();
		sp.linearSearching(arr,n,key);
	}
}
		