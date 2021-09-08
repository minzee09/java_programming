package lab02;
import java.util.*;

public class ch3_num12_diffVer {

	public static void main(String[] args) {
		int[] num = new int[3];
		Scanner input =new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("정수를 입력하시오: ");
			num[i] = input.nextInt();
		}
		
		Arrays.sort(num);
		System.out.print("정렬된 숫자: ");
		for(int i : num)
			System.out.print(i + " ");

	}

}
