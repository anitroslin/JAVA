import java.awt.*;
import java.awt.event.*;
public class MyFrame1 extends Frame{
 MyFrame1(){ 
Button b1=new Button("click1");
 Button b2=new Button("click 2");
 Button b3=new Button("click3");

 Button b4=new Button("click 4");
 Button b5=new Button("click5");
 Button b6=new Button("click 6");
 Button b7=new Button("click7");
 Button b8=new Button("click 8"); 
b1.setBounds(30,100,80,30); 
b2.setBounds(30,100,80,30); 
b3.setBounds(30,100,80,30); 
b4.setBounds(30,100,80,30); 
b5.setBounds(30,100,80,30); 
b6.setBounds(30,100,80,30); 
b7.setBounds(30,100,80,30); 
b8.setBounds(30,100,80,30); 

add(b1);add(b2);add(b3);add(b4); 
add(b5);add(b6);add(b7);add(b8); 
setLayout( new FlowLayout()); 
setLayout( new GridLayout(2,4)); 
setLayout(new GridBagLayout() ); 
setSize(300,300);
setTitle("MyFrame");
setVisible(true);
} 
public static void main(String args[]){ MyFrame1 f=new MyFrame1(); 
}} 

