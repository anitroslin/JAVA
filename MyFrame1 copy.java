import java.awt.*;
import java.awt.event.*;
public class MyFrame1 extends Frame{ MyFrame1(){
setSize(300,300);
 setTitle("MyFrame");
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e)
 {
 System.out.println("Window Closing");
dispose();
 }
 
});
setVisible(true);
 }
public static void main(String args[]){
MyFrame1 f=new MyFrame1(); }}

