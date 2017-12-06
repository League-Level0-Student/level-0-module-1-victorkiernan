import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {

	String birthday=JOptionPane.showInputDialog("What is your birthday");
	if(birthday.equals("12/6")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Merry Unbirthday!");
	}
}
}
