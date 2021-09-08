package lab02;
import java.util.Scanner;

public class ch3_num15 {

	public static void main(String[] args) {
		double height,weight,standWeight;
		Scanner input = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		height = input.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		weight = input.nextDouble();
		
		standWeight = (height-100)*0.9;
		if(weight<standWeight)
			System.out.println("저체중입니다. 표준 체중은 "+standWeight+"kg 입니다.");
		else if(weight>standWeight)
			System.out.println("과체중입니다. 표준 체중은 "+standWeight+"kg 입니다.");
		else
			System.out.println("표준 체중입니다.");

	}

}
