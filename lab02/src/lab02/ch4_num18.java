package lab02;

public class ch4_num18 {

	public static void main(String[] args) {
		String[] cardType = {"Clubs","Diamonds","Hearts","Spades"};
		String[] cardNum = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		String result1 = cardType[(int) (Math.random() * cardType.length)];
		String result2 = cardNum[(int) (Math.random() * cardNum.length)];
		
		System.out.print(result1+"ÀÇ "+result2);

	}

}
