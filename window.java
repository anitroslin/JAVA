import java.awt.*;
import java.awt.event.*;
class window extends Frame implements ActionListener {
 TextField tf;
window(){
tf=new TextField();
 tf.setBounds(60,50,170,20);
 Button b=new Button("click me");
 b.setBounds(100,120,80,30);
 b.addActionListener(this);
addWindowListener(new WindowAdapter()
{
 public void windowClosing(WindowEvent e) {
System.out.println("Window Closing");
 dispose();
} });
add(b);
 add(tf);
setSize(300,300); setLayout(null); setVisible(true); }
public void actionPerformed(ActionEvent e){
tf.setText("Welcome"); }
public static void main(String args[]){ //create container
new window( );
}
}
