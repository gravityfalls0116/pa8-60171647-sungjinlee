/*학번:60171647
 * 이름:이성진 
 */
//Drawable인터페이스를 상속받는 Text클래스를 생성함.
public class Text implements Drawable{
	private String output;
	public Text(String str){
		output=str;
	}
	public void draw(){
		System.out.println(output);
	}

}
