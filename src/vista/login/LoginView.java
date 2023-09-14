package vista.login;
import javax.swing.*;
import javax.swing.border.Border;

import services.ObjGraficosService;

import java.awt.*;

public class LoginView extends JFrame {
    JPanel pIzquierdo, pDerecho;
    Color colorPrincipal, colorGrisOscuro;
    Font fuenteTituloPrincipal, fuenteTitulo, fuenteTexto;
    Cursor cMano;
    Border bInferiorAzul;
    ImageIcon iFondo, iLogo, iUsuario2, iClave2, iFacebook1, iTwitter1;
    ImageIcon iYoutube1, iImg, iCerrar;

    public LoginView() { 
        cargarRecursos();
        cargarPaneles();
        cargarLabels();
        cargarBotones();
        cargarOtros();
        cargarPropiedades();
    }

    private void cargarRecursos() {
        colorPrincipal = new Color(60, 78, 120);
        colorGrisOscuro = new Color(80, 80, 80);

        fuenteTituloPrincipal = new Font("Tahoma", Font.PLAIN, 24);
        fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 18);
        fuenteTexto = new Font("Calibri Light", Font.PLAIN, 14);

        cMano = new Cursor(Cursor.HAND_CURSOR);
        bInferiorAzul = BorderFactory.createMatteBorder(0, 0, 0, 0, colorPrincipal);
        iFondo = new ImageIcon("resources/images/fondo.png");
        iLogo = new ImageIcon("resources/images/logo.png");
        iUsuario2 = new ImageIcon("resources/images/usuario2.png");
        iClave2 = new ImageIcon("resources/images/clave2.png");
        iFacebook1 = new ImageIcon("resources/images/facebook1.png");
        iTwitter1 = new ImageIcon("resources/images/twitter1.png");
        iYoutube1 = new ImageIcon("resources/images/youtube1.png");
        iImg = new ImageIcon("resources/images/imagen1.png");
    }

    private void cargarPaneles() {
        pIzquierdo = new JPanel();
        pIzquierdo.setBounds(0, 0, 853, 720); // coordenadas y tamaño
        pIzquierdo.setBackground(Color.WHITE);
        pIzquierdo.setLayout(null);
        add(pIzquierdo);

        pDerecho = new JPanel();
        pDerecho.setBounds(853, 0, 427, 720);
        pDerecho.setBackground(Color.WHITE);
        pDerecho.setLayout(null);
        add(pDerecho);
    }
    
    private void cargarLabels() {
        JLabel lLogo = new JLabel();
        lLogo.setBounds(50, 20, 40, 40);
        lLogo.setIcon(new ImageIcon(
                iLogo.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)
        ));
        pIzquierdo.add(lLogo);

        JLabel lTituloApp = new JLabel("Login de usuario");
        lTituloApp.setBounds(100, 18, 220, 40);
        lTituloApp.setForeground(Color.WHITE);
        lTituloApp.setFont(fuenteTituloPrincipal);
        pIzquierdo.add(lTituloApp);

        JLabel lSvg1 = new JLabel();
        lSvg1.setBounds(150, 120, 600, 414);
        lSvg1.setIcon(new ImageIcon(
                iImg.getImage().getScaledInstance(600, 414, Image.SCALE_AREA_AVERAGING)
        ));
        pIzquierdo.add(lSvg1);

        JLabel lEslogan = new JLabel("Te ayudamos con todo"); // etiqueta de texto
        lEslogan.setBounds(138, 110, 150, 20);
        lEslogan.setForeground(colorGrisOscuro); // cambiar el color de la fuente
        lEslogan.setHorizontalAlignment(JLabel.CENTER); // centrar con respecto al ancho
        lEslogan.setFont(fuenteTexto);
        pDerecho.add(lEslogan);

        JLabel lTituloLogin = new JLabel("Registra tus datos");
        lTituloLogin.setBounds(110, 140, 200, 30);
        lTituloLogin.setForeground(colorGrisOscuro); // cambiar el color de la fuente
        lTituloLogin.setHorizontalAlignment(JLabel.CENTER);
        lTituloLogin.setFont(fuenteTitulo);
        pDerecho.add(lTituloLogin);

        JLabel lNotificaciones = new JLabel("¿Desea recibir notificaciones?");
        lNotificaciones.setBounds(100, 400, 200, 20);
        lNotificaciones.setForeground(colorGrisOscuro);
        lNotificaciones.setFont(fuenteTexto);
        lNotificaciones.setHorizontalAlignment(JLabel.CENTER);
        pDerecho.add(lNotificaciones);

        JLabel lUsuario = new JLabel();
        lUsuario.setBounds(40, 200, 30, 30);
        lUsuario.setIcon(new ImageIcon(
                iUsuario2.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        pDerecho.add(lUsuario);

        JLabel lClave = new JLabel();
        lClave.setBounds(40, 270, 30, 30);
        lClave.setIcon(new ImageIcon(
                iClave2.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        pDerecho.add(lClave);

        JLabel lFacebook = new JLabel();
        lFacebook.setBounds(30, 630, 30, 30);
        lFacebook.setIcon(new ImageIcon(
                iFacebook1.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        lFacebook.setCursor(cMano);
        pIzquierdo.add(lFacebook);

        JLabel lTwitter = new JLabel();
        lTwitter.setBounds(80, 630, 30, 30);
        lTwitter.setIcon(new ImageIcon(
                iTwitter1.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        lTwitter.setCursor(cMano);
        pIzquierdo.add(lTwitter);

        JLabel lYoutube = new JLabel();
        lYoutube.setBounds(130, 630, 30, 30);
        lYoutube.setIcon(new ImageIcon(
                iYoutube1.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        lYoutube.setCursor(cMano);
        pIzquierdo.add(lYoutube);

        JLabel lFondo = new JLabel();
        lFondo.setBounds(0, 0, 720, 720);
        lFondo.setIcon(new ImageIcon(
                iFondo.getImage().getScaledInstance(721, 721, Image.SCALE_AREA_AVERAGING)
        ));
        pIzquierdo.add(lFondo);
    }

    private void cargarBotones() {
        JButton bEntrar = ObjGraficosService.crearBotonTexto(
                110 ,490, 200, 40, "Ingresar", colorPrincipal, Color.WHITE);
        bEntrar.setBorder(bInferiorAzul);
        pDerecho.add(bEntrar);

        JButton bCerrar = ObjGraficosService.crearBotonImagen(
                350, 15, 45, 30, "resources/images/cerrar.png");
        pDerecho.add(bCerrar);

        JButton bOpcion1 = ObjGraficosService.crearBotonImagen(
                32, 250, 30, 20, "resources/images/punto1.png");
        pIzquierdo.add(bOpcion1);

        JButton bOpcion2 = ObjGraficosService.crearBotonImagen(
                32, 300, 30, 20, "resources/images/punto1.png");
        pIzquierdo.add(bOpcion2);

        JButton bOpcion3 = ObjGraficosService.crearBotonImagen(
                32, 350, 30, 20, "resources/images/punto1.png");
        pIzquierdo.add(bOpcion3);

    }

    private void cargarOtros() {
        JTextField tNombreUsuario = new JTextField("Nombre de usuario");
        tNombreUsuario.setBounds(80, 200, 260, 40);
        tNombreUsuario.setForeground(colorPrincipal);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(colorGrisOscuro); // Color de la línea que parpadea
        tNombreUsuario.setBorder(bInferiorAzul);
        tNombreUsuario.setHorizontalAlignment(JTextField.CENTER);
        pDerecho.add(tNombreUsuario);

        JPasswordField tClaveUsuario = new JPasswordField("Clave usuario");
        tClaveUsuario.setBounds(80, 250, 260, 40);
        tClaveUsuario.setForeground(colorPrincipal);
        tClaveUsuario.setBackground(Color.WHITE);
        tClaveUsuario.setCaretColor(colorGrisOscuro);
        tClaveUsuario.setBorder(bInferiorAzul);
        tClaveUsuario.setHorizontalAlignment(JPasswordField.CENTER);
        pDerecho.add(tClaveUsuario);

        JComboBox<String> cbTipoUsuario = new JComboBox<>();
        cbTipoUsuario.addItem("Cliente");
        cbTipoUsuario.addItem("Cajero");
        cbTipoUsuario.addItem("Administrador");
        cbTipoUsuario.setBounds(120, 330, 180, 30);
        cbTipoUsuario.setForeground(colorPrincipal);
        cbTipoUsuario.setBackground(Color.WHITE);
        ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
        pDerecho.add(cbTipoUsuario);

        JRadioButton checkNo = new JRadioButton("No");
        checkNo.setBounds(170, 420, 40, 40);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        pDerecho.add(checkNo);

        JRadioButton checkSi = new JRadioButton("Si");
        checkSi.setBounds(220, 420, 40, 40);
        checkSi.setFocusable(false);
        checkSi.setBackground(Color.WHITE);
        pDerecho.add(checkSi);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(checkNo);
        grupo.add(checkSi);

    }

    private void cargarPropiedades() {
        setSize(1280, 720); // tamaño
        setLayout(null); // layout null
        setLocationRelativeTo(null); // centrar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
        setUndecorated(true); // elimina barra superior por defecto
        setVisible(true); // hacer ventana visible
        setTitle("Componentes básicos de la interfaz gráfica");
    }
}