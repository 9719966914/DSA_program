class Unique_array{
	public boolean isUnique(int arr[]){
		for(int i= 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					return false;
				}
			}
		}
		return true;
	}			
	public static void main(String args[]){
		int arr[] = {10,20,60,40,50,60,70};
		Unique_array sp = new Unique_array();
		boolean result = sp.isUnique(arr);
		System.out.println(result);
	}
}