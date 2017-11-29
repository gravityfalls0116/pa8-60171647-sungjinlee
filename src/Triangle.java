/*학번:60171647
 * 이름:이성진 
 */
//shape를 상속받는 삼각형 도형을 만들기위해 생성한 클래스.
public class Triangle extends Shape{
	private int xPoint;
	private int yPoint;
	private int widthPoint;
	private int bottomPoint;
	public Triangle(int x, int y, int width, int bottom){
		xPoint=x;
		yPoint=y;
		widthPoint=width;
		bottomPoint=bottom;
	}
	//삼각형 클래스는 상단의 꼭지점의 좌표와 밑변의 길이, 높이를 인자로 받아 할당함.
	
	public double getArea(){
		double result=(widthPoint*bottomPoint)/2;
		return result;
	}
	//삼각형의 넓이를 계산함.
	public double getLength(){
		double line=Math.sqrt(Math.pow(widthPoint,2)+Math.pow(bottomPoint, 2));
		double result=line*2+bottomPoint;
		return result;
	}
	//삼각형의 둘레를 계산함.
	
	public void draw(){
		System.out.println(this.getClass().getName()+String.format(" (%d,%d), (%d,%d), (%d,%d)",xPoint,yPoint,xPoint-(bottomPoint/2),yPoint+widthPoint,xPoint+(bottomPoint/2),yPoint+widthPoint));
	}
	
	public void move(double dx, double dy){
		xPoint+=dx;
		yPoint+=dy;
	}
	//move클래스에서는 상단의 꼭지점의 위치를 이동시킴.

}
