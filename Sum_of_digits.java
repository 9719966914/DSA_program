class Sum_of_digits{
	public int Sum_of_digit(int n){
		if(n==0){
			return 0;
		}
		if(n<0){
			return 0;
		}
		else{
			return n%10 + Sum_of_digit(n/10);
		}
	}
	public static void main(String []args){
		Sum_of_digits sp = new Sum_of_digits();
		System.out.println(sp.Sum_of_digit(2984));
	}
}