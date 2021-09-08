package lab07;

interface GraphicsObject
{
	int getArea();
	void draw();
}
class Rectangle implements GraphicsObject
{
	private int length;
	private int width;
	
	public void setDimensions(int l, int w)
	{
		length = l;
		width = w;
	}
	public int getArea()
	{
		return length * width;
	}
	public void draw()
	{
		System.out.print("This is a rectangle");
	}
}

public class RectTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setDimensions(3, 4);
		int area = r1.getArea();
		System.out.println(area);
		r1.draw();

	}

}
