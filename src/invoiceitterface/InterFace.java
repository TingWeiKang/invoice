package invoiceitterface;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



 
public class InterFace extends HttpGet implements ActionListener{
	static JMenuItem item1 = new JMenuItem("�}�����");
	//static JMenuItem  item2 = new JMenuItem("two");
	static JMenuItem  item4 = new JMenuItem("�������X");
	static JMenuItem item5 = new JMenuItem("����");
	//static JMenu item3 = new JMenu("three");
	static  JMenu jMenu = new JMenu("�]�w");
    static  JFrame demo = new JFrame("�Τ@�o�����");
    static  JLabel label = new JLabel("");
    static   JTextField jtextfield = new JTextField(""); 
	
{
	    demo.setSize(400, 150);
	    demo.setLayout(new GridBagLayout());
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagConstraints bag1 = new GridBagConstraints();
        bag1.gridx = 0;
        bag1.gridy = 0;
        bag1.gridwidth = 0;
        bag1.gridheight = 1;
        bag1.weightx = 0;
        bag1.weighty = 0;
        bag1.fill = GridBagConstraints.HORIZONTAL;
        bag1.anchor = GridBagConstraints.WEST;
        demo.add(label, bag1);
        GridBagConstraints bag2 = new GridBagConstraints();
        bag2.gridx = 0;
        bag2.gridy = 0;
        bag2.gridwidth = 5;
        bag2.gridheight = 5;
        bag2.weightx = 5;
        bag2.weighty = 5;
        bag2.fill = GridBagConstraints.HORIZONTAL;
        bag2.anchor = GridBagConstraints.WEST;
        demo.add(jtextfield, bag2);
         
        //demo.getContentPane().add(BorderLayout.LINE_START , label);
       // demo.getContentPane().add(BorderLayout.PAGE_END, jtextfield);
        jMenu.add(item1);
        jMenu.add(item4);
        jMenu.add(item5);
        JMenuBar menubar = new JMenuBar();
        menubar.add(jMenu);
        demo.setJMenuBar(menubar);
        demo.setVisible(true);
        jtextfield.addKeyListener(new KeyLiserener());
        item1.addActionListener(this);
        item4.addActionListener(this);
        item5.addActionListener(this);
       

        }

        public void actionPerformed(ActionEvent e) {
    		if (e.getSource()==item1){
    			label.setText("");
    			jtextfield.setText("");
    			JOptionPane.showMessageDialog(null, "��Ƥw�M��", "�M�Ÿ��", JOptionPane.PLAIN_MESSAGE );
    		}else if(e.getSource()==item4){
    		 JOptionPane.showMessageDialog(null, "�S�O���G"+"\n"+a+"\n"+"�S���G"+"\n"+b+"\n"+"�Y���G"+"\n"+c1+"\n"+c2+"\n"+"�W�}�����G"+"\n"+l1+"\n"+l2+"\n"+l3+"\n"+l4, "�������X", JOptionPane.PLAIN_MESSAGE );
    			
    		}else if(e.getSource()==item5){
   			 JOptionPane.showMessageDialog(null, "�п�J�o���Ʀr�K�X���UENTER�Y�i���!!", "�ϥλ���", JOptionPane.PLAIN_MESSAGE );
 			
   		}
    		
     }
        
}
   