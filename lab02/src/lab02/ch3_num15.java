package lab02;
import java.util.Scanner;

public class ch3_num15 {

	public static void main(String[] args) {
		double height,weight,standWeight;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���: ");
		height = input.nextDouble();
		System.out.print("�����Ը� �Է��ϼ���: ");
		weight = input.nextDouble();
		
		standWeight = (height-100)*0.9;
		if(weight<standWeight)
			System.out.println("��ü���Դϴ�. ǥ�� ü���� "+standWeight+"kg �Դϴ�.");
		else if(weight>standWeight)
			System.out.println("��ü���Դϴ�. ǥ�� ü���� "+standWeight+"kg �Դϴ�.");
		else
			System.out.println("ǥ�� ü���Դϴ�.");

	}

}
