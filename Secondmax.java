class SecondMax{
	public int secondmax(int arr[]){
		int fmax = 0;
		int smax = 0;
		for(int i = 0; i<arr.length; i++){
			if(fmax<arr[i]){
				smax = fmax;
				fmax = arr[i];
			}
		}
		return smax;
	}
	public static void main(String args[]){
		int arr[] = {1,443,646,3,354,67,433,3214};
		SecondMax sp = new SecondMax();
		System.out.println(sp.secondmax(arr));
	}
}
