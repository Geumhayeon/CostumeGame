import java.awt.*;
import javax.swing.*;

// Cloth클래스를 상속받음
public class Top extends Cloth {
	
	private int score;
	
	// Cloth클래스의 생성자 호출 
	public Top( int s , String n, ImageIcon img ) { 
		super(n,img); score = s;
		}
	
	// 스코어 set,get 함수
	void setScore(int s) { score = s; }
	int getScore() { return score; }
}
