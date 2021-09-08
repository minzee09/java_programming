package lab02;
import java.util.Scanner;

public class ch3_num12 {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		n1=input.nextInt();
		System.out.print("정수를 입력하시오: ");
		n2=input.nextInt();
		System.out.print("정수를 입력하시오: ");
		n3=input.nextInt();
		
		if(n1 < n2) {
            if(n1 < n3) {
                if(n2 < n3)
                    System.out.println("정렬된 숫자: "+n1+" "+n2+" "+n3);
                else
                    System.out.println("정렬된 숫자: "+n1+" "+n3+" "+n2);
            }
            else
                System.out.println("정렬된 숫자: "+n3+" "+n1+" "+n2);
        }
        else if(n2 < n3) { 
            if(n2 < n1) {
                if(n1 < n3)
                    System.out.println("정렬된 숫자: "+n2+" "+n1+" "+n3);
                else
                    System.out.println("정렬된 숫자: "+n2+" "+n3+" "+n1);
            }
        }
        else
            System.out.println("정렬된 숫자: "+n3+" "+n2+" "+n1);
	}

}
