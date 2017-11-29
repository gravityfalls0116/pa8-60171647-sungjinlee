/*학번:60171647
 * 이름:이성진 
 */
//하나의 사각형과 그 사각형의 좌우상단에 중심을 두고있는 원 두개를 포함한 Bear 도형을 생성하기 위한 클래스.
public class Bear implements Drawable{
	private Drawable[] bearShape=new Drawable[3];
	public Bear(int x, int y, int radius){
		Shape mainSquare=new Square(x-radius,y-radius,radius*2);
		//기존의 square 클래스는 생성할때 좌상단 꼭지점을 기준으로 생성하지만, Bear클래스는 사각형의 중심점을 기준으로 하므로 그에 알맞게 값을 수정하여 메인사각형을 생성함.
		Shape Circle1=new Circle(x-radius,y-radius,radius/2);
		Shape Circle2=new Circle(x+radius,y-radius,radius/2);
		//사각형의 좌우상단 꼭지점을 중심점으로 원 두개를 생성함.
		bearShape[0]=mainSquare;
		bearShape[1]=Circle1;
		bearShape[2]=Circle2;
		//위에서 만든 도형들을 bearShape라는 리스트에 함께 저장함.
	}
	public void draw(){
		System.out.println(this.getClass().getName());
		for(Drawable dw:bearShape){
			dw.draw();
		}
		//bear클래스에서 draw메소드는 bearShape메소드에 있는 도형들의 draw 메소드를 전부 호출함.
	}

}
