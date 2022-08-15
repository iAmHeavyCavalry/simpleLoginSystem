import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Login");
    JButton button2 = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID: ");
    JLabel userPassLabel = new JLabel("pass: ");
    JLabel msgLabel = new JLabel();

    HashMap<String, String> log = new HashMap<String, String>();
    Login(HashMap<String, String> loginfo){
        log = loginfo;

        userIDLabel.setBounds(50,100, 75,25);
        userPassLabel.setBounds(50,150, 75,25);
        msgLabel.setBounds(125, 250, 250, 35);
        msgLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(125,100,200,25);
        userPassField.setBounds(125,150,200,25);

        button.setBounds(125,200,100,25);
        button.setFocusable(false);
        button.addActionListener(this);
        button2.setBounds(225,200,100,25);
        button2.setFocusable(false);
        button2.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPassLabel);
        frame.add(msgLabel);
        frame.add(userIDField);
        frame.add(userPassField);
        frame.add(button);
        frame.add(button2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button2){
            userIDField.setText("");
            userPassField.setText("");
        }

        if(e.getSource()==button){
            String userID = userIDField.getText();
            String passID = String.valueOf(userPassField.getPassword());
            if(log.containsKey(userID)){
                if(log.get(userID).equals(passID)){
                    msgLabel.setForeground(Color.GREEN);
                    msgLabel.setText("Login successful");
                    frame.dispose();
                    Window window = new Window();
                }
                else{
                    msgLabel.setForeground(Color.RED);
                    msgLabel.setText("Wrong password");
                }
            }
            else{
                msgLabel.setForeground(Color.GREEN);
                msgLabel.setText("Username not found");
            }
        }
    }
}
