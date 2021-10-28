package com.sist.game;

import javax.swing.JPanel;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics;

//적,미사일.우주선을 동시에(한꺼번에) 담을 수 있는 '패널'클래스
//또, '패널'에 키보드가 눌러지는 이벤트를 처리하기 위하여 KeyListener도 구현
public class MyPanel extends JPanel implements KeyListener {
	
	//적,미사일,우주선을 패널의 멤버변수로 선언
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;
	
	//생성자에 즉, 패널이 생성됨에 동시에 동작하여
	public MyPanel() {
		super();
		this.addKeyListener(this);  //패널의 키보드 이벤트를 등록
		this.requestFocus();        //패널의 키보드 요청을 설정한다 A
		setFocusable(true);			//패널의 포커스를 설정        B
		//패널은 화면구성요소중에 원래부터 키보드로부터 입력받아 들이는 용도가 아니기 때문에
		//키보드로부터 입력을 받아들이게 하려면 '패널'에 일단 '포커스(활성화)'를 설정해야 한다.
		
		enermy = new Enermy("enermy.png");		//이미지파일명을 갖고 '적' 객체를 생성
		spaceship = new SpaceShip("spaceship.png");   //이미지파일명을 갖고 '우주선' 객체를 생성
		missile = new Missile("missile.png");   //이미지파일명을 갖고 '미사일' 객체를 생성
		
		
		//패널의 구성요소인 '적', '미사일' , '우주선'이 서로 독립적으로(=동시에=공평하게) 
		//움직이도록 하기 위헤 멀티스레드 구현
		//동시에 움직이게 하는 기능은 패널에서만 필요하다. 이럴 때 클래스 안에 클래스를 만들수 있다
		//이것을 inner class라고 한다.
		class MyThread extends Thread{		//Thread클래스를 상속받아 멀티스레드 구현
			public void run() {				//run을 오버라이딩 하여 동시에 실행시킬 명령어(들)을 써준다
				while(true) {				//계속 움직이게 하기 위해 while문 이용
					enermy.update();		//'적'을 움직이게 하기 위해 '적'의 위치를 변경하는 메소드 호출
					//spaceship.update();		//'우주선'을 움직이게 하기 위헤 '우주선'의 위치를 변경하는 메소드 호출
												//'우주선'은 키보드가 눌러진 방향으로 한번 움직이도록 되어 있어 호출하지 않아도 된다.
					
					
					missile.update();		//'미사일'을 움직이도록 하기 위해 '미사일'의 위치를 변경하는 메소드 호출
					
					//'적'이 '미사일'에 맞았는지 판별하는 메소드 호출
					
					
					enermy.crush(missile);
					
					
					repaint();				//'적','미사일','우주선'의 변경된 위치에 다시 그리기 위한 요청을 한다
											//화면에 그래픽을 그려주는 메소드는 paintComponent메소드이다
											//사용자가 직접 paintComponecnt를 호출할 수는 없고
											//repaint를 호출하여 paintComponent를 호출할 수 있다
					
					try {Thread.sleep(50);}
					catch(InterruptedException e) {}
				}
			}
		}
		
		//'적','미사일','우주선'이 서로 독립적으로 움직이도록 만든 
		//멀티스레드 객체 MyThread를 생성
		Thread t = new MyThread();
		
		//스레드를 가동한다.
		t.start();
	}
	
	
	
	//'적','미사일','우주선'의 변경된 위치에 그래픽을 다시 그려준다.
	//'패널'에 그래픽을 표현하기 위해서 paintComponent를 오버라이딩 해준다
	//이때 매개변수로 전달받은 Graphics에 그래픽을 표현하기위한 다양한 메소드들이 있다.
	public void paint(Graphics g) { 
		super.paint(g);
		
		//그래픽을 그리기 위한 그래픽스의 g를 '적','미사일','우주선'에게 전달하여 다시 변경된 위치에 그리도록
		enermy.draw(g);     
		spaceship.draw(g);
		missile.draw(g);
	}
	
	
	//'패널'에서 키보드가 눌러지면
	public void keyPressed(KeyEvent event) {
		spaceship.keyPressed(event);    	//눌러진 키보드이벤트의 정보를 '우주선'에게 전달
		missile.keyPressed(event, spaceship.x,spaceship.y);
		//눌러진 키보드이벤트의 정보와 우주선의 위치를 '미사일'에게 전달
		
	}
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}

	
}
