 class SmallestNumber{
	 public int smallestNumber(int arr[]){
			int min = 0;
			min = arr[0];
			for(int i=0; i<arr.length; i++){
					if(arr[i]<min){
							min = arr[i];
					}
			}
			return min;
	 }
	 public static void main(String aegs[]){
		 int arr[] = {43,66,88,77,34,22,11,100};
		 SmallestNumber sp = new SmallestNumber();
		 System.out.println(sp.smallestNumber(arr));
	 }
 }
		 