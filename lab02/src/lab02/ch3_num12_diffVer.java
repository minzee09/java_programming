package lab02;
import java.util.*;

public class ch3_num12_diffVer {

	public static void main(String[] args) {
		int[] num = new int[3];
		Scanner input =new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("������ �Է��Ͻÿ�: ");
			num[i] = input.nextInt();
		}
		
		Arrays.sort(num);
		System.out.print("���ĵ� ����: ");
		for(int i : num)
			System.out.print(i + " ");

	}

}
