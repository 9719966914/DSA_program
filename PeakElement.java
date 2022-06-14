class PeakElement{
	public int peakElementindex(int arr[], int size){
		int max_value = 0;
		int index = 0;
		for(int i = 0; i<size; i++){
			if(arr[i]>max_value){
				max_value = arr[i];
				index = i;
			}
		}
		return index;
	}
		public static void main(String args[]){
				PeakElement sp = new PeakElement();
				int arr[] = {23,454,56};
				System.out.println(sp.peakElementindex(arr,2));
		}
}
				