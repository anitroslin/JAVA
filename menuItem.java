import java.io.*;
import java.awt.event.*;
import java.awt.*;
public class menuItem extends Frame implements ActionListener {
TextArea ta ; 
public menuItem() {
MenuBar mBar = new MenuBar(); 
setMenuBar(mBar); 
Menu files = new Menu("Files"); 
Menu date = new Menu("Date"); 
Menu exit = new Menu("Exit"); 
ta = new TextArea(10, 40); 
ta.setBackground(Color.cyan);
mBar.add(files); 
mBar.add(date); 
mBar.add(exit);
MenuItem mi1 = new MenuItem("GLDemo.java"); 
files.add(mi1);
files.add(new MenuItem("LabelTest.java")); 
files.addSeparator();
files.add(new MenuItem("UsingFonts.class"));
files.add(new MenuItem("FLDemo.class"));
date.add(new MenuItem("Today")); 
exit.add(new MenuItem("Close"));
files.addActionListener(this); 
date.addActionListener(this); 
exit.addActionListener(this);
add(ta, "Center");
setTitle("Menu Practice"); 
setSize(400, 400); 
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
String str = e.getActionCommand();
if(str.equals("Close")) {
System.exit(0); }
else if(str.equals("Today")) {
ta.setText("Today: " + new java.util.Date()); }
else
{
try
{
FileReader fr = new FileReader(str); 
ta.setText("Folloiwing are file contents:\n\n"); 
int temp;
while( (temp = fr.read()) != -1)
{

char ch = (char) temp;
String s1 = String.valueOf(ch); 
ta.append(s1);
}
fr.close(); }
catch(IOException e1) {
ta.setText("Exception: " + e1); }
} }
public static void main(String args[]) {
new menuItem(); }
}
