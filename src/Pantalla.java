import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla extends JLabel implements ActionListener {
    public static Color colorPantalla = new Color( 195, 217, 141 );
    String numeros;
    Font fuentePantalla = new Font("serif", Font.BOLD, 25);
    Pantalla(String numeros){
        this.setBackground(colorPantalla);
        this.setBounds(50,50,300,50);
        this.setOpaque(true);
        this.numeros = numeros;
        this.setText(numeros);
        this.setFont(fuentePantalla);
        //this.setHorizontalAlignment();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
