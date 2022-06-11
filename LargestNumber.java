class LargestNumber{
	public int largestNumber(int arr[]){
		int max = 0;
		max = arr[0];
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String args[]){
		int arr[] = {1,4,7,3,78,67,55,99,87,42};
		LargestNumber sp = new LargestNumber();
		System.out.println(sp.largestNumber(arr));
	}
}