import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class demo {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JToggleButton Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); // Set the layout manager

        // Create a JToggleButton
        JToggleButton toggleButton = new JToggleButton("OFF");

        // Create a JLabel to show the state of the button
        JLabel label = new JLabel("Button is OFF");

        // Add an ItemListener to the toggle button to detect state changes
        toggleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (toggleButton.isSelected()) {
                    toggleButton.setText("ON");
                    label.setText("Button is ON");
                } else {
                    toggleButton.setText("OFF");
                    label.setText("Button is OFF");
                }
            }
        });

        // Add the toggle button and label to the frame
        frame.add(toggleButton);
        frame.add(label);

        // Set the frame's visibility
        frame.setVisible(true);
    }
}
