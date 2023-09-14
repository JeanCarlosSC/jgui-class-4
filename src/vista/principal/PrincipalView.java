package vista.principal;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalView extends JFrame{

    public PrincipalView() {
        JPanel pLogin = new JPanel();
        pLogin.setBounds(32, 32, 745, 405);
        pLogin.setBackground(new Color(219,237,91));
        pLogin.setLayout(null);
        add(pLogin);

        ImageIcon logo = new ImageIcon("resources/amazon.png");
        ImageIcon logoEscalado = new ImageIcon(logo.getImage().getScaledInstance(111, 50, Image.SCALE_AREA_AVERAGING));
        JLabel lLogo = new JLabel(logoEscalado);
        lLogo.setBounds(10, 5, 111, 50);
        pLogin.add(lLogo);

        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
}
