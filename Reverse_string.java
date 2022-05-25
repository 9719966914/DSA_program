class Reverse_string{
	public String reverse(String str){
		if(str.isEmpty()){
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String args[]){
		Reverse_string sp = new Reverse_string();
		System.out.println(sp.reverse("shivam parashar"));
	}
}