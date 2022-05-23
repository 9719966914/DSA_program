class Power_of_number{
	public int power(int base, int exp){
		if(exp<0){
			return -1;
		}
		if(exp ==0){
			return 1;
		}
		else{
			return base*power(base,exp-1);
		}
	}
	public static void main(String args[]){
		Power_of_number sp = new Power_of_number();
		int k = sp.power(2,4);
		System.out.println(k);
	}
} 