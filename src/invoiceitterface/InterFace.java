package invoiceitterface;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



 
public class InterFace extends HttpGet implements ActionListener{
	static JMenuItem item1 = new JMenuItem("開獎日期");
	//static JMenuItem  item2 = new JMenuItem("two");
	static JMenuItem  item4 = new JMenuItem("中獎號碼");
	static JMenuItem item5 = new JMenuItem("說明");
	//static JMenu item3 = new JMenu("three");
	static  JMenu jMenu = new JMenu("設定");
    static  JFrame demo = new JFrame("統一發票對獎");
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
    			JOptionPane.showMessageDialog(null, "資料已清空", "清空資料", JOptionPane.PLAIN_MESSAGE );
    		}else if(e.getSource()==item4){
    		 JOptionPane.showMessageDialog(null, "特別獎："+"\n"+a+"\n"+"特獎："+"\n"+b+"\n"+"頭獎："+"\n"+c1+"\n"+c2+"\n"+"增開六獎："+"\n"+l1+"\n"+l2+"\n"+l3+"\n"+l4, "中獎號碼", JOptionPane.PLAIN_MESSAGE );
    			
    		}else if(e.getSource()==item5){
   			 JOptionPane.showMessageDialog(null, "請輸入發票數字八碼按下ENTER即可對獎!!", "使用說明", JOptionPane.PLAIN_MESSAGE );
 			
   		}
    		
     }
        
}
   