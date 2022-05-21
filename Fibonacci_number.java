class Fibonacci_number{
	public int Fibonacci(int n){
		if(n<0){
			return -1;
		}
		if(n==0 || n==1){
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
	public static void main(String args[]){
		Fibonacci_number fn = new Fibonacci_number();
		System.out.println(fn.Fibonacci(5));
	}
} 