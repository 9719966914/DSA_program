class Find_missing_element{
	public void  missing_number(int arr[]){
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i<arr.length; i++){
			sum1 =sum1+ arr[i];
		}
		sum2 = 20*(20+1)/2;
		int difference = sum2 - sum1;
		if(difference!=0){
			System.out.println("the missing element is:- "+difference);
		}
		else{
			System.out.println("All elements are present no element is missing");	
		 }
	}
	public static void main(String args[]){
	Find_missing_element sp = new Find_missing_element();
	int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	sp.missing_number(arr);
	}
}