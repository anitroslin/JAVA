import java.awt.*;
import java.awt.event.*;
public class accumulator extends Frame implements ActionListener{
Label label1,label2;
TextField tf1,tf2;
accumulator(){
CloseMe cm=new CloseMe();
addWindowListener(cm);;
label1=new Label("enter an integer");
add(label1);
tf1=new TextField(10);
add(tf1);
tf1.addActionListener(this);
label2=new Label("accumulated sum");
add(label2);
tf2=new TextField(10);
tf2.setEditable(false);
add(tf2);
setTitle("AWT Accumulator");
setSize(600,300);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
int sum=0;
int n=Integer.parseInt(tf1.getText());
sum+=n;
tf1.setText("");
tf2.setText("" + sum);
}
public static void main(String[] args){
new accumulator();
}
}
