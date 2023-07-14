package optgeneration;

import java.util.Random;
import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random ran=new Random();
		int otp=ran.nextInt(10000);
		if(otp<1000)
		{
			otp=otp+1000;
		}
		System.out.println("otp is "+ otp);
		Scanner scan=new Scanner(System.in);
		System.out.println("enter otp to verify");
		int userotp=scan.nextInt();
		if(userotp==otp)
		{
			System.out.println("otp is verified and your r accessed to your account");
		}
		else
		{
			System.out.println("opt is not verified");
		}
	}

}
				