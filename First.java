import java.awt.*;
public class First extends Frame{
First(){
}
Button b=new Button("click me");
b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setLayout(null);
setTitle("First Frame");  
setBackground(Color.green);
setForeground(Color.white);
setVisible(true);
public static void main(String args[]){ 
	First f=new First();
}

}
