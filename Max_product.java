class Max_product{
	public void Max_product(int arr[]){
		int max_product = 0;
		int s=0,p=0;
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i]*arr[j]>max_product){
					max_product = arr[i]*arr[j];
					s = i;
					p =j;
				}
			}
		}
		System.out.println("pairs:-"+s+","+p);
		System.out.println("maximum product :- "+max_product);
	}
	public static void main(String args[]){
		int arr[] = {10,20,30,40,50,60,45,62};
		Max_product sp = new Max_product();
		sp.Max_product(arr);
	}
}