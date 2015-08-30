import java.util.Scanner;

public class Teclado {
	Scanner tc = new Scanner(System.in);
	
	public int lerint()
	{
		System.out.println("Digite um inteiro: ");
		return tc.nextInt();
	}
	
	public void lerint(int b)
	{
		System.out.println("Digite um inteiro: ");
		b= tc.nextInt();
	}
	
	public void lerint(String a, int b)
	{
		System.out.println(a);
		b= tc.nextInt();
	}
	
	public int lerint(String a)
	{
		System.out.println(a);
		return tc.nextInt();
	}
	
	
	
	
	
	public float lerfloat()
	{
		System.out.println("Digite um Real: ");
		return tc.nextFloat();
	}
	
	
	public void lerfloat(float b)
	{
		System.out.println("Digite um Real: ");
		b= tc.nextFloat();
	}

	public void lerfloat(String a, float b)
	{
		System.out.println(a);
		b= tc.nextFloat();
	}
	public float lerfloat(String a)
	{
		System.out.println(a);
		return tc.nextFloat();
	}
	
	
	
	
	
	public String lerchar()
	{
		System.out.println("Digite um caracter: ");
		return tc.next();
	}
	
	public void lerchar1(String b)
	{
		System.out.println("Digite um caracter: ");
		b= tc.next();
	}

	public void lerchar(String a, String b)
	{
		System.out.println(a);
		b= tc.next();
	}
	public String lerchar(String a)
	{
		System.out.println(a);
		return tc.next();
	}
	
	
	
	
	public double lerdouble()
	{
		System.out.println("Digite um Double: ");
		return tc.nextDouble();
	}
	
	public void lerdouble1(double b)
	{
		System.out.println("Digite um Double: ");
		b= tc.nextDouble();
	}

	public void lerDouble(Double a, Double b)
	{
		System.out.println(a);
		b= tc.nextDouble();
	}
	public double lerdouble(double a)
	{
		System.out.println(a);
		return tc.nextDouble();
	}
}
