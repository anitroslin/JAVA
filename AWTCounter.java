import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AWTCounter extends JFrame implements ActionListener {
   private JLabel label;
   private JTextField tf;
   private JButton b1,b2,b3;
   private int c;
   AWTCounter() {
      CloseMe cm = new CloseMe(); 
      addWindowListener(cm);
      setTitle("AWT COUNTER");
      setLayout(new FlowLayout());
      c=0;
      label = new JLabel("Counter");
      tf = new JTextField("0",3);
      b1 = new JButton("count up");
      b2 = new JButton("count down");
      b3 = new JButton("Reset");
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      add(label);
      add(tf);
      add(b1);
      add(b2);
      add(b3);
      setSize(600,300);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e) {
      if (e.getSource()==b1) {
         c++;
         tf.setText(String.valueOf(c));
      } else if (e.getSource()==b2) {
         c--;
         tf.setText(String.valueOf(c));
      } else if (e.getSource() ==b3) {
         c = 0;
         tf.setText(String.valueOf(c));
         repaint();
      }
   }
   public static void main(String[] args) {
      new AWTCounter();
   }
}
 class CloseMe extends WindowAdapter 
 {
public void windowClosing(WindowEvent e) {
System.exit(0); 
}
}
