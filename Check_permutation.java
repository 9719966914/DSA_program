class Check_permutation{
	public boolean ispermutation(int arr1[], int arr2[]){
		int sum1 = 0,sum2 = 0;
		int mul1 = 0,mul2 = 0;
		for(int i =0; i<arr1.length; i++){
			sum1 = sum1 +arr1[i];
			mul1 = mul1*arr1[i];
		}
		for(int j = 0; j<arr2.length; j++){
			sum2 = sum2 + arr2[j];
			mul2 = mul2*arr2[j];
		}
		if(sum1==sum2 && mul1==mul2){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		int arr1[] ={2,5,3,4,7,1,6,8,9};
		int arr2[] = {5,3,4,7,6,1,2,8,9};
		Check_permutation sp = new Check_permutation();
		boolean result = sp.ispermutation(arr1,arr2);
		System.out.println(result);
	}
}