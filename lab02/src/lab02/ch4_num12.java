package lab02;
import java.util.Arrays;

public class ch4_num12 {

	public static void main(String[] args) {
		double[] num = {1.0,2.0,3.0,4.0};
		double sum = 0;
		
		for(double value : num)
		{
			System.out.print(value + " ");
			sum = sum + value;
		}
		System.out.println("\n합은 " + sum );
		
		Arrays.sort(num);
		System.out.println("최대값은 " + num[num.length-1]);
		

	}

}
