package learnJava;

public class Add {
	
	
	
	
	public double adding(double a ,double b) {
		
		
		double sum;
		
		
		sum = a+b;
		
		System.out.println("sum of two number "+sum);
		
		return sum;
		
	}
public static void main(String[] args) {
		
		
		Add ad = new Add();
		
		ad.adding(4.5, 5);
		
		
	}

}
