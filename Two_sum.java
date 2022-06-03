class Two_sum{
	public void pairs(int arr[],int target_value){
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if((arr[i]+arr[j])==target_value){
					System.out.println(i+","+j);
				}
			}
		}
	}
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		Two_sum sp = new Two_sum();
		sp.pairs(arr,7);
	}
}