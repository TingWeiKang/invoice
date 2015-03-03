package invoiceitterface;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyLiserener extends HttpGet implements KeyListener  {
public void keyPressed(KeyEvent e) {
	HttpGet httpGet = new HttpGet();
	String ss,s,h,h2,h3,j,j1,j2,j3,k;
	
	ss=httpGet.a; //特別獎
	s=httpGet.b;//特獎
	h=httpGet.c1;//頭獎
	h2=httpGet.c2;//頭獎
	h3=httpGet.c3;//頭獎
	j=httpGet.l1;//6獎
	j1=httpGet.l2;//6獎
	j2=httpGet.l3;//6獎
	j3=httpGet.l4;//6獎
    k=(InterFace.jtextfield.getText());
	// 如果Enter鍵被按下

  if (e.getKeyCode() == 10) {
	  
	  if(k.length()==8){
		  if (k.equals(ss)){
			  InterFace.label.setText("特別獎1000萬");
		    }else if (k.equals(s)){
		    	InterFace.label.setText("特獎200萬");
		    }else if (k.equals(h)||k.equals(h2)||k.equals(h3)){
		    	InterFace.label.setText("頭獎20萬");
	        }else if  ((k.subSequence(1, 8)).equals(h.subSequence(1, 8))||(k.subSequence(1, 8)).equals(h2.subSequence(1, 8))||(k.subSequence(1, 8)).equals(h3.subSequence(1, 8))){
	        	InterFace.label.setText("二獎4萬");
	        }else if  ((k.subSequence(2, 8)).equals(h.subSequence(2, 8))||(k.subSequence(2, 8)).equals(h2.subSequence(2, 8))||(k.subSequence(2, 8)).equals(h3.subSequence(2, 8))){
	        	InterFace.label.setText("三獎1萬");
	        }else if  ((k.subSequence(3, 8)).equals(h.subSequence(3, 8))||(k.subSequence(3, 8)).equals(h2.subSequence(3, 8))||(k.subSequence(3, 8)).equals(h3.subSequence(3, 8))){
	        	InterFace.label.setText("四獎4千");
	        }else if  ((k.subSequence(4, 8)).equals(h.subSequence(4, 8))||(k.subSequence(4, 8)).equals(h2.subSequence(4, 8))||(k.subSequence(4, 8)).equals(h3.subSequence(4, 8))){
	        	InterFace.label.setText("五獎1千");
	        }else if ((k.subSequence(5, 8)).equals(h.subSequence(5, 8))||(k.subSequence(5, 8)).equals(h2.subSequence(5, 8))||(k.subSequence(5, 8)).equals(h3.subSequence(5, 8))){
	        	InterFace.label.setText("六獎200元");
	        }else if ((k.subSequence(5, 8)).equals(j)||(k.subSequence(5, 8)).equals(j1)||(k.subSequence(5, 8)).equals(j2)||(k.subSequence(5, 8)).equals(j3)){
	        	InterFace.label.setText("六獎200元");
	     }else{
	    	 InterFace.label.setText("未中獎");
	          }
		
	  }else{
		  InterFace.label.setText("輸入錯誤，請確認輸入八碼");
	  }
  }
}

public void keyReleased(KeyEvent e) {
}
@Override
// 介於按下鍵盤與釋放鍵盤之間的動作
public void keyTyped(KeyEvent e) {
}
}