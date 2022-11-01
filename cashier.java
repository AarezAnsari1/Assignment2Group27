import javax.swing.*;
import com.jgoodies.forms.factories.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Mon Oct 31 23:35:26 EDT 2022
 */



/**
 * @author Aarez Ansari
 */
public class cashier  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Aarez Ansari
		DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
		frame1 = new JFrame();
		title1 = compFactory.createTitle("Cashier System");
		label1 = new JLabel();
		scrollPane2 = new JScrollPane();
		list1 = new JList();
		label3 = new JLabel();
		formattedTextField1 = new JFormattedTextField();
		label2 = new JLabel();
		button5 = new JButton();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();

		//======== frame1 ========
		{
			var frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new MigLayout(
				"hidemode 3",
				// columns
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]",
				// rows
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]"));
			frame1ContentPane.add(title1, "cell 3 1 2 1");

			//---- label1 ----
			label1.setText("Scanned Items:");
			frame1ContentPane.add(label1, "cell 2 2");

			//======== scrollPane2 ========
			{
				scrollPane2.setViewportView(list1);
			}
			frame1ContentPane.add(scrollPane2, "cell 2 4 2 6");

			//---- label3 ----
			label3.setText("Enter Product ID:");
			frame1ContentPane.add(label3, "cell 5 9");
			frame1ContentPane.add(formattedTextField1, "cell 5 9");

			//---- label2 ----
			label2.setText("Total:   $79.63");
			frame1ContentPane.add(label2, "cell 2 10");

			//---- button5 ----
			button5.setText("Enter Product to list");
			frame1ContentPane.add(button5, "cell 5 10");

			//---- button1 ----
			button1.setText("Checkout");
			frame1ContentPane.add(button1, "cell 2 14");

			//---- button2 ----
			button2.setText("Print Receipt");
			frame1ContentPane.add(button2, "cell 3 14");

			//---- button3 ----
			button3.setText("Start Session");
			frame1ContentPane.add(button3, "cell 2 18");

			//---- button4 ----
			button4.setText("End Session");
			frame1ContentPane.add(button4, "cell 3 18");
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Aarez Ansari
	private JFrame frame1;
	private JLabel title1;
	private JLabel label1;
	private JScrollPane scrollPane2;
	private JList list1;
	private JLabel label3;
	private JFormattedTextField formattedTextField1;
	private JLabel label2;
	private JButton button5;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
