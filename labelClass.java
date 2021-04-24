import java.awt.*;
import java.awt.event.*;
public class labelClass extends WindowAdapter {
Label lab1, lab2, lab3; public labelClass()
{ Frame f= new Frame();
f.setLayout(new GridLayout(3,1)); 
lab1 = new Label("Center aligned text", Label.CENTER);
 lab2 = new Label("Left aligned text", Label.LEFT);
lab3 = new Label();
lab3.setText("Right aligned text");
 lab3.setAlignment(Label.RIGHT);
f.add(lab1);
f.add(lab2);
f.add(lab3);
f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e) {
 System.out.println("Window Closing");
f.dispose(); }
});
lab1.setBackground(Color.yellow);
 lab1.setForeground(Color.blue);
 System.out.println("lab1 text: " + lab1.getText());
System.out.println("lab1 alignment: " + lab1.getAlignment());
 f.setTitle("Labels Do not Have Any Action");
f.setSize(450, 700);
 f.setVisible(true);
}
public static void main(String args[ ]) { 
new labelClass(); }
}

