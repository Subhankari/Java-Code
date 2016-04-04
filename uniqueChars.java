//Implement an algorithm to determine 
//if a string has all unique characters. 
//What if you can not use additional data structures?

public class uniqueChars {
	
	public static void main(String[] args){
		
		int[] str = new int[256];
		String s = "abcd";
		char[] a = s.toCharArray();
		boolean flag = false;
		for(char ch : a){
			int i = ch;
			if(str[i] != 0){
				flag = true;
				break;
			}else{
				str[i] = 1;
			}	
		}
		if(!flag){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		
		
		
	}

}
