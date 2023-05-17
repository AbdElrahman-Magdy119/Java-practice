import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IpFinder extends JFrame{
    public JPanel panel1;
    private JButton findHostButton;
    private JTextField enterIPTextField;
public IpFinder() {
    findHostButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            String url = enterIPTextField.getText();
            try{
                InetAddress address = InetAddress.getByName(url);
                JOptionPane.showMessageDialog(null,"the url : "+ url +"\n has IP : " + address.getHostAddress(),"IP for url" ,JOptionPane.INFORMATION_MESSAGE);

            }catch (UnknownHostException ex){
                Logger.getLogger(IpFinder.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    });
}

}
