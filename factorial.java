import java.awt.*;       
import java.awt.event.*; 
public class factorial  extends Frame implements ActionListener {
   private Label l1,l2;    
   private TextField tf1,tf2; 
   private int fact=1,i;       
   public factorial() {
      setLayout(new FlowLayout());
      l1= new Label("Enter a positive integer"); 
      add(l1);
      tf1= new TextField(10); 
      add(tf1);
      tf1.addActionListener(this);
      l2= new Label("factorial is");  
      add(l2);
      tf2= new TextField(10); 
      tf2.setEditable(false);  
      add(tf2);
      setTitle("AWT Factorial"); 
      setSize(600,300);    
      setVisible(true);  
   }
     public void actionPerformed(ActionEvent e) {
      int i,fact=1;
      int n = Integer.parseInt(tf1.getText());
      for(i=1;i<=n;i++){
      fact*=i;
      }
      tf1.setText(""); 
      tf2.setText("" + fact); 
  }
  public static void main(String[] args) {
      new factorial();
}
   }
