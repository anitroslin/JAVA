import java.awt.*;
import java.awt.event.*;
public class area2 extends Frame implements ActionListener
{
Label l1,l2;
TextArea area;
Button b;
area2(){
l1=new Label(); 
l1.setBounds(50,50,100,30); 
l2=new Label(); 
l2.setBounds(160,50,100,30); 
area=new TextArea();
area.setBounds(20,100,300,300);
b=new Button("Count Words"); 
b.setBounds(100,400,100,30); 
b.addActionListener(this); 
add(l1);
add(l2);
add(area);
add(b); 
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e) { 
System.out.println("Window Closing");
dispose(); }
});
setSize(400,450); 
setLayout(null); 
setVisible(true);
}
public void actionPerformed(ActionEvent e){
String text=area.getText();
String words[]=text.split("\\s"); 
l1.setText("Words: "+words.length); 
l2.setText("Characters: "+text.length());
}
public static void main(String[] args) {
new area2(); }
}

