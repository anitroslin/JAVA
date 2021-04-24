import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class counter extends JFrame implements ActionListener {
   private JLabel label;
   private JTextField tf;
   private JButton b;
   private int c;
   counter() {
      CloseMe cm = new CloseMe();
      addWindowListener(cm);
      setTitle("AWT Counter");
      setLayout(new FlowLayout());
      c=0;
      label=new JLabel("Counter");
      tf=new JTextField("0",4);
      b= new JButton("count");
      b.addActionListener(this);
      add(label);
      add(tf);
      add(b);
      setSize(600, 300);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e) {
      if (e.getSource()==b) {
         c++; 
       tf.setText(String.valueOf(c));
   }
}
   public static void main(String[] args) {
      new counter();
   }
}
class CloseMe extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
    System.exit(0); 
 }
}
