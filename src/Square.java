/*학번:60171647
 * 이름:이성진 
 */
//shape에 상속된 정사각형 도형을 구현하기 위해 만든 클래스.
public class Square extends Shape{
	private int xPoint;
	private int yPoint;
	private int widthPoint;
	public Square(int x, int y, int width){
		xPoint=x;
		yPoint=y;
		widthPoint=width;
	}
	//좌상단의 꼭지점과 한변의 길이를 인자로 받아 할당함.
	
	public double getArea(){
		double result=Math.pow(widthPoint, 2);
		return result;
	}
	//정사각형의 넓이를 계산함.
	
	public double getLength(){
		double result=widthPoint*4;
		return result;
	}
	//정사각형의 둘레를 계산함.
	
	public void draw(){
		System.out.println(this.getClass().getName()+String.format(" (%d,%d)-(%d,%d)",xPoint,yPoint,xPoint+widthPoint,yPoint+widthPoint));
	}
	
	public void move(double dx, double dy){
		xPoint+=dx;
		yPoint+=dy;
	}
	//move메소드에서는 좌상단의 좌표를 이동시킴.
}
