package day3_variables_dataTypes;

public class primitiveVariables {

	public static void main(String[] args) {
		
		byte b1 = 25;
		byte b2 = -25;
		//byte b3 = 128;
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000; //is for grouping of digits
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		long l1 = 5000L; //Suffix L is optional, literal 5000 is of int type
		//And long type can accommodate int range without any issues
		
		long l2 = -50000; //Suffix L is optional
		long l3 = -2147483649L; //Suffix L is compulsory, this number is out of int range
		
		long l4 = 2147483648L; //Suffix L is compulsory, this number is out of int range
		
		long creditCardNumber = 5876_1234_3452_9832L; //Suffix L is compulsory
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("l3 = " + l3);
		
		float f1 = 2.718f; //f is compulsory
		
		
		double d1 = 123.4;
		double d2 = 3.14;
		
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
		char c1 = 65;  //Decimal value corresponding to character 'A'
		System.out.println(c1);
		
		char c2 = 'A'; //character A
		System.out.println(c2);
		
		char c3 = '\u0041'; //Unicode value corresponding to character 'A'
		
		char c4 = 8658;
		System.out.println(c4);
		
		boolean status = true;
		System.out.println("Eligible to take the exam: " + status);
		
		String name = "Ozzy";
		System.out.println("My Name is " + name);
		
		
		
		
		

	}

}
