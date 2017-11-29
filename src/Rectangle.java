/*학번:60171647
 * 이름:이성진 
 */
//shape에 상속된 rectangle 도형을 만들기 위해 구현한 클래스.
public class Rectangle extends Shape{
	int[] line1;
	int[] line2;
	public Rectangle(int x, int y, int z, int p){
		int[] userline1={x,y};
		int[] userline2={x+z,y+p};
		line1=userline1;
		line2=userline2;
	}
	//좌상단과 우하단꼭지점의 좌표를 인자로 받아 변 두개로 나누어 리스트를 할당함.
	public double getArea(){
		double result=1;
		for(int i=0; i<line1.length; i++){
			double line=line2[i]-line1[i];
			result=result*line;
		}
		return result;
	}
	//사각형의 넓이를 계산함.

	public double getLength() {
		double result=0;
		for(int i=0; i<line1.length; i++){
			double line=(line2[i]-line1[i])*2;
			result+=line;
		}
		return result;
	}
	//사각형의 둘레를 계산함.
	
	public void draw(){
		System.out.println(this.getClass().getName()+" "+"("+line1[0]+", "+line1[1]+")"+"-("+line2[0]+", "+line2[1]+")");
	}
	
	public void move(double dx, double dy){
		line1[0]+=dx;
		line1[1]+=dy;
		line2[0]+=dx;
		line2[1]+=dy;
	}
	//move메소드에서는 좌상단과 우하단의 꼭지점의 좌표를 이동시킴.

}
