class First_uppercase{
	public static char first(String str){
		if(str.isEmpty()){
			return ' ';
		}
		if(Character.isUpperCase(str.charAt(0))){
			return str.charAt(0);
		}
		else{
			return first(str.substring(1,str.length()));
		}
	}
	public static void main(String args[]){
		First_uppercase sp = new First_uppercase();
		System.out.println(sp.first("shivamParashar"));
	}
} 