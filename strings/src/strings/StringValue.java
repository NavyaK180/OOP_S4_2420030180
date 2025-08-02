package strings;

public class StringValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println(str);
		
		// Object reference variable
		String str1 = new String("Hi");
		System.out.println(str1);
		
		//Character string
        char ch[]= {'H','e','l','l','o'};
        String str2 = new String(ch,2,3);
        System.out.println(str2);
	}

}
