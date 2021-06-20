package myJavaProject;

public class StringBufferPrac {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("abc");
		str.setCharAt(1, 'q');
		str.append("stuv");
		System.out.println(str+" "+str.length());
	}

}
