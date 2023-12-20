/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
			int minimum = Integer.parseInt(args[0]);
		int maximum = Integer.parseInt(args[1]);
		int minimumGenerated = minimum;
		int i = 0;
		while (i<3)	{
			int num = (int)(Math.random()*maximum);
			if(num>=minimum&&num<maximum){ //checks if the current number genarated is the minimal one
				System.out.println(num);
				if(i==0){
					minimumGenerated = num;
				}
				if(num<minimumGenerated){
					minimumGenerated = num;
				}
				i=i+1;
	}}
	System.out.println("The minimal generated number was "+minimumGenerated);	
	}
}
