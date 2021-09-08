package lab04;

class Food
{
	private int cal;
	private int cost;
	private int kg;
	
	public int getCal() { return cal; }
	public void setCal(int cal) { this.cal = cal; }
	
	public int getCost() { return cost; }
	public void setCost(int cost) { this.cost = cost; }
	
	public int getKg() { return kg; }
	public void setKg(int kg) { this.kg = kg; }
	
	Food(int cal, int cost, int kg)
	{
		setCal(cal);
		setCost(cost);
		setKg(kg);
	}
}

class Melon extends Food
{
	private String info;

	public String getInfo() { return info; }
	public void setInfo(String info) { this.info = info; }
	
	Melon(int cal, int cost, int kg, String info)
	{
		super(cal,cost,kg);
		setInfo(info);
	}
	
	@Override
	public String toString()
	{
		return "칼로리: " + getCal() + " 가격: " + getCost() + " 무게: " + getKg() + " 경작지: " + this.info;
	}
}

public class Test2 {

	public static void main(String[] args) {
		Food f1 = new Food(150,1200,3);
		Melon m1 = new Melon(300,5000,2,"대한민국");
		System.out.println("칼로리: " + f1.getCal() + " 가격: " + f1.getCost() + " 무게: " + f1.getKg());
		System.out.println(m1);

	}

}
