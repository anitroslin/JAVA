import java.awt.*;
import java.awt.event.*;
public class temperature extends Frame implements ActionListener{
private Label Celsius,Fahrenheit;
private TextField tf1,tf2;
public temperature(){
setLayout(new FlowLayout());
Celsius=new Label("Celsius:");
add(Celsius);
tf1=new TextField(10);
add(tf1);
tf1.addActionListener(this);
Fahrenheit=new Label("Fahrenheit:");  
add(Fahrenheit);
tf2= new TextField(10);   
add(tf2);
setTitle("Temperature Converter"); 
setSize(600,300);    
setVisible(true);  
}
public void actionPerformed(ActionEvent e){
double c,f;
f=Float.parseFloat(tf2.getText());
c=(f-32)*5/9;
tf2.setText("" + c);
}
public static void main(String[] args){
new temperature();
}
}

