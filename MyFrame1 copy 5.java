import java.awt.*;
import java.awt.event.*;
public class MyFrame1 extends Frame implements ActionListener{
TextField tf1,tf2,tf3,tf4; Button b1,b2,b3; MyFrame1(){
CloseMe cm = new CloseMe(); addWindowListener(cm);
tf1=new TextField();
 tf1.setBounds(50,50,150,20);
 tf2=new TextField();
 tf2.setBounds(50,100,150,20);
 tf3=new TextField();
 tf3.setBounds(50,150,150,20);// tf3.setEditable(false);
b1=new Button("+");
b1.setBounds(50,200,50,50);
b2=new Button("-");
b2.setBounds(120,200,50,50); b1.addActionListener(this); b2.addActionListener(this);
b3=new Button("Factorial"); b3.setBounds(190,200,50,50); b3.addActionListener(this); add(tf1);add(tf2);add(tf3);add(b1);add(b2); ;add(b3); setSize(600,300);
setLayout(null);
setVisible(true); }
public void actionPerformed(ActionEvent e) { String s1=tf1.getText();
String s2=tf2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
 int n=Integer.parseInt(s1);
int i=1,c=0,fact=1; if(e.getSource()==b1){
c=a+b;
}else if(e.getSource()==b2){
c=a-b; }
else if(e.getSource()==b3){
 for(;i<=n; ++i){
 fact*=i;
}
 c=fact;
}
String result=String.valueOf(c); tf3.setText(result);
}
public static void main(String[] args) {
new MyFrame1(); }
}
class CloseMe extends WindowAdapter {
public void windowClosing(WindowEvent e) {
System.exit(0); }
}
