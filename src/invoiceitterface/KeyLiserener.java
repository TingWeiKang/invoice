package invoiceitterface;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyLiserener extends HttpGet implements KeyListener  {
public void keyPressed(KeyEvent e) {
	HttpGet httpGet = new HttpGet();
	String ss,s,h,h2,h3,j,j1,j2,j3,k;
	
	ss=httpGet.a; //�S�O��
	s=httpGet.b;//�S��
	h=httpGet.c1;//�Y��
	h2=httpGet.c2;//�Y��
	h3=httpGet.c3;//�Y��
	j=httpGet.l1;//6��
	j1=httpGet.l2;//6��
	j2=httpGet.l3;//6��
	j3=httpGet.l4;//6��
    k=(InterFace.jtextfield.getText());
	// �p�GEnter��Q���U

  if (e.getKeyCode() == 10) {
	  
	  if(k.length()==8){
		  if (k.equals(ss)){
			  InterFace.label.setText("�S�O��1000�U");
		    }else if (k.equals(s)){
		    	InterFace.label.setText("�S��200�U");
		    }else if (k.equals(h)||k.equals(h2)||k.equals(h3)){
		    	InterFace.label.setText("�Y��20�U");
	        }else if  ((k.subSequence(1, 8)).equals(h.subSequence(1, 8))||(k.subSequence(1, 8)).equals(h2.subSequence(1, 8))||(k.subSequence(1, 8)).equals(h3.subSequence(1, 8))){
	        	InterFace.label.setText("�G��4�U");
	        }else if  ((k.subSequence(2, 8)).equals(h.subSequence(2, 8))||(k.subSequence(2, 8)).equals(h2.subSequence(2, 8))||(k.subSequence(2, 8)).equals(h3.subSequence(2, 8))){
	        	InterFace.label.setText("�T��1�U");
	        }else if  ((k.subSequence(3, 8)).equals(h.subSequence(3, 8))||(k.subSequence(3, 8)).equals(h2.subSequence(3, 8))||(k.subSequence(3, 8)).equals(h3.subSequence(3, 8))){
	        	InterFace.label.setText("�|��4�d");
	        }else if  ((k.subSequence(4, 8)).equals(h.subSequence(4, 8))||(k.subSequence(4, 8)).equals(h2.subSequence(4, 8))||(k.subSequence(4, 8)).equals(h3.subSequence(4, 8))){
	        	InterFace.label.setText("����1�d");
	        }else if ((k.subSequence(5, 8)).equals(h.subSequence(5, 8))||(k.subSequence(5, 8)).equals(h2.subSequence(5, 8))||(k.subSequence(5, 8)).equals(h3.subSequence(5, 8))){
	        	InterFace.label.setText("����200��");
	        }else if ((k.subSequence(5, 8)).equals(j)||(k.subSequence(5, 8)).equals(j1)||(k.subSequence(5, 8)).equals(j2)||(k.subSequence(5, 8)).equals(j3)){
	        	InterFace.label.setText("����200��");
	     }else{
	    	 InterFace.label.setText("������");
	          }
		
	  }else{
		  InterFace.label.setText("��J���~�A�нT�{��J�K�X");
	  }
  }
}

public void keyReleased(KeyEvent e) {
}
@Override
// ������U��L�P������L�������ʧ@
public void keyTyped(KeyEvent e) {
}
}