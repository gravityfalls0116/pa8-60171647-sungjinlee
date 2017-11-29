/*학번:60171647
 * 이름:이성진 
 */
//shape클래스에 상속된 circle 도형을 만들기 위한 클래스.
public class Circle extends Shape{
	private int[] centerPoint;
	private int radius;
	public Circle(int xpoint, int ypoint, int UserRadius){
		int[] userPoint={xpoint,ypoint};
		centerPoint=userPoint;
		radius=UserRadius;
	}
	//constructor 에서는 중심점과 반지름을 인자로 받아 변수로 지정해줌.
	public double getArea(){
		double result=(Math.pow(radius,2)*3.14);
		return result;
	}
	//원의 넓이를 계산함.
	public double getLength(){
		double result=((radius*2)*3.14);
		return result;
	}
	//원의 둘레를 계산함.
	public void draw(){
		System.out.println(this.getClass().getName()+"Center ("+centerPoint[0]+", "+centerPoint[1]+")"+"-radius ("+radius+")");
	}
	
	public void move(double dx, double dy){
		centerPoint[0]+=dx;
		centerPoint[1]+=dy;
	}
	//moveable 인터페이스에서 move 메소드를 오버라이드를 하여 중심점을 이동시키는 메소드를 만듬.

}
