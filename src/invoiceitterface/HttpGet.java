package invoiceitterface;

import java.net.*;
import java.io.*;
 
public class HttpGet 
{
	 //public static void main(String args[])
	// {

	String str,a,b,h,c,c1,c2,c3,l,l1,l2,l3,l4;

	int h1 = 0;
	int h2 = 0;
	int h3 = 0;
	int h4 = 0;
	int h5 = 0;
	
  {

    try
    {
      URL u=new URL("http://invoice.etax.nat.gov.tw/invoice.xml");
      
      Object obj=u.getContent();
      InputStreamReader isr=new InputStreamReader((InputStream) obj,"UTF-8");      
      BufferedReader br=new BufferedReader(isr);
      while((str=br.readLine())!=null)
    	  
   
   if (str.indexOf("103�~11��B12")!=-1){
	    h3=(str.indexOf("103�~11��B12")); 
	    h4=str.length();
	    h5=h4-h3;
	    str=str.substring(h3,h5);
		h1= (str.indexOf("�S�O���G"));
		h2=h1+12;
        h=str.substring(h1,h2);
        a=h.replaceAll("[^0-9]","");
        System.out.println(h.replaceAll("[^0-9]",""));
		//System.out.println(h3+","+h4+","+h5);
        h1=(str.indexOf("�S���G"));
        h2=h1+11;
        h=str.substring(h1,h2);
        b=h.replaceAll("[^0-9]","");
        System.out.println(h.replaceAll("[^0-9]",""));
		//System.out.println(h);
        h1=(str.indexOf("�Y���G"));
        h2=h1+29;
        h=str.substring(h1,h2);
        c=h.replaceAll("[^0-9]","");
        c1= (String)c.subSequence(0, 8);
        c2= (String)c.subSequence(8, 16);
        c3= (String)c.subSequence(16, 24);
       //System.out.println(h.replaceAll("[^0-9]",""));
		System.out.println(c1+","+c2+","+c3);
		h1=(str.indexOf("�W�}�����G"));
        h2=h1+20;
        
        h=str.substring(h1,h2);
        l=h.replaceAll("[^0-9]","");
        l1= (String)l.subSequence(0, 3);
        l2= (String)l.subSequence(3, 6);
        if (l.length()==12){
        	l3= (String)l.subSequence(6, 9);
            l4= (String)l.subSequence(9, 12);
            //System.out.println(h.replaceAll("[^0-9]",""));
      	  System.out.println(l1+","+l2+","+l3+","+l4);
      	 
      
        }else{
        	 l3=null;
         	 l4=null;
     
       	  System.out.println(l1+","+l2);
      }
      
   }else{

        
		
    	 
       System.out.println(str);
	
     
       
      br.close();            //��ܦbCMD
      
      /*
      try                      //��X��TXT��
      {
        fwriter = new FileWriter("temp.txt");
        while((str=br.readLine())!=null)
        {
          fwriter.write(str + "\r\n");
        }
        fwriter.close();
      }
      
      catch(IOException e1)
      {
        System.out.println("�o�ͤF"+e1+"���ҥ~");
      }
      */
   }

    }
    catch(IOException e)
    {
      System.out.println("�o�ͤF"+e+"���ҥ~");
    }
  }
	 }
//}