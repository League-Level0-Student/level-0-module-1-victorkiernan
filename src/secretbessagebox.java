import javax.swing.JOptionPane;

public class secretbessagebox {
public static void main(String[] args)  {
	String password=JOptionPane.showInputDialog("Please put in password to continue");
	String real=("Fallout4IsAwesome");
	if(real.equals(password)) {
		JOptionPane.showMessageDialog(null, "The lore of the X0-1 power armor needs to be resolved in Fallout 4!!!!!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Intruder reported to RobCo Industries {TM 2076-2077}. Sentry bot sent in to deal with: unknown user code Alpha32B");
	}
}
}
