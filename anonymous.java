import java.awt.*;
import java.awt.event.*;
public class anonymous extends Frame{
 
TextField tf;
anonymous (){
tf=new TextField(); 
tf.setBounds(60,50,170,20);
 Button b=new Button("click me");
 b.setBounds(50,120,80,30);
b.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent e){ tf.setText("hello");
}
});
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e)
 {
 System.out.println("Window Closing");
dispose();
 }
});
add(b);
add(tf);
 setSize(300,300);
 setLayout(null);
 setVisible(true);
 }
public static void main(String args[]){
 new anonymous();
}
}
