import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Hello there");
String name=JOptionPane.showInputDialog("What is your name");	
if(name.equalsIgnoreCase("Victor")) {
	JOptionPane.showMessageDialog(null, "Hello Victor. You are the victor of anything you try at!");
}
else if(name.equalsIgnoreCase("Yasir")) {
	JOptionPane.showMessageDialog(null, "Hi Yasir! You are a very kind and humble person");
}
else if(name.equalsIgnoreCase("Max")){
	JOptionPane.showMessageDialog(null, "Hi Max! You are the maximum amout of awesomeness possible!");
}
else if(name.equalsIgnoreCase("Emil")) {
	JOptionPane.showMessageDialog(null, "Emil, you are an awesome person to know!");
	}
else if(name.equalsIgnoreCase("Callum")) {
	JOptionPane.showMessageDialog(null,"Callum, you are an awesome person" );
}
else if(name.equalsIgnoreCase("Lauren")) {
	JOptionPane.showMessageDialog(null, "Lauren, you are a very smart!");
}
else if(name.equalsIgnoreCase("Cruz")) {
	JOptionPane.showMessageDialog(null, "Hello Cruz. You are a very funny person");
}
else if(name.equalsIgnoreCase("Derp")){
		JOptionPane.showMessageDialog(null, "INFINITE CHEESE ADDED");
	}

else {
	JOptionPane.showMessageDialog(null,  "USER: "+name+" NOT IN DATABASE! YOU ARE NOT SUPPOSED TO BE HERE SELF DESTRUCT BEGUN! THIS COMPUTER WILL BLOW UP IN 2453 MONTHS!");
}
}
}