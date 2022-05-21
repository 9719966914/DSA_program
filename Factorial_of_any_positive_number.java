//Find factorial of any positive integer by recursive method.
class Factorial_of_any_positive_number{
	static int  factorial(int n){
		if(n<0){
			return -1;
		}
		if(n==0 || n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String args[]){
		System.out.println(factorial(31));
	}
}