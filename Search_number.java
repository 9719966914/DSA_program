import java.util.*;
class Search_number{
	public void search_number(int arr[],int value){
		int k = 0;
		int index = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == value){
				k++;
				index = i;
			}
		}
		if(k!=0){
			System.out.println(value+" is present at index:- "+index);
		}
		else{
			System.out.println(value+" is not found");
		}
	}
	public static void main(String args[]){
		Search_number sp = new Search_number();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number which you want to search");
		int value = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		sp.search_number(arr,value);
	}
}