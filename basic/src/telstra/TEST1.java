package telstra;

public class TEST1 {
	
	public static void main(String[] args)
	{
		byte b = 24;
		long h = 1234858384;
		float g = 1.5F;
		double d = 5.66;
		char c = 11;
		
		int i=10;
		long l = i;
		float f = l;
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		
		double s = 10000;
		long t = (long)s;
		int gh = (int)t;
		
		System.out.println("double "+s);
		System.out.println("long "+t);
		System.out.println("int "+gh);
		
	}

}
