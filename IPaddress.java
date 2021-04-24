import java.awt.*;
import java.awt.event.*;
public class IPaddress extends Frame implements ActionListener{
TextField tf;
 Label l;
 Button b;
 IPaddress(){
tf=new TextField();
 tf.setBounds(50,50, 150,20);
CloseMe cm = new CloseMe();
 addWindowListener(cm);
l=new Label();
l.setText(" After Clicking");
 l.setBounds(50,100, 250,20);
 b=new Button("Find IP");
 b.setBounds(50,150,60,30);
 b.addActionListener(this);
 add(b);
add(tf);
add(l);
 setSize(400,400);
 setLayout(null); 
setVisible(true);
 }
public void actionPerformed(ActionEvent e) {
 try{
String host=tf.getText();
String ip=java.net.InetAddress.getByName(host).getHostAddress();
 l.setText("IP of "+host+" is: "+ip);
}catch(Exception ex){System.out.println(ex);}
}
public static void main(String[] args) {
new IPaddress(); }
}
class CloseMe extends WindowAdapter {
public void windowClosing(WindowEvent e) {
System.exit(0); }
}

