import java.awt.*; 
import java.awt.event.*;
public class choiceCompo2 {
private Frame mainFrame; 
private Label headerLabel; 
private Label statusLabel; 
private Panel controlPanel;
public choiceCompo2() {
prepareGUI();
}
public static void main(String[] args){ 
choiceCompo2 M = new choiceCompo2();
M.showChoiceDemo(); }
private void prepareGUI(){
mainFrame = new Frame("Java AWT Examples");
mainFrame.setSize(400,400);
mainFrame.setLayout(new GridLayout(3, 1)); 
mainFrame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent windowEvent){ 
System.exit(0);
} });
headerLabel = new Label(); 
headerLabel.setAlignment(Label.CENTER); 
statusLabel = new Label(); 
statusLabel.setAlignment(Label.CENTER); 
statusLabel.setSize(350,100);
controlPanel = new Panel(); 
controlPanel.setLayout(new FlowLayout());
mainFrame.add(headerLabel); 
mainFrame.add(controlPanel); 
mainFrame.add(statusLabel); 
mainFrame.setVisible(true);
}
private void showChoiceDemo(){
headerLabel.setText("Component : Choice"); 
final Choice vehicleChoice = new Choice();
vehicleChoice.add("Car"); 
vehicleChoice.add("Bike"); 
vehicleChoice.add("Bicycle"); 
vehicleChoice.add("Aeroplane");
Button showButton = new Button("Show");
showButton.addActionListener(new ActionListener() { 
public void actionPerformed(ActionEvent e) {
String data = "Vehicle Selected: "
+ vehicleChoice.getItem(vehicleChoice.getSelectedIndex()); 
statusLabel.setText(data);
} });
controlPanel.add(vehicleChoice); 
controlPanel.add(showButton);
mainFrame.setVisible(true);

}
}