import javax.swing.*;

public class Main {
    public static void main(String[] args) { //JLabel en la clase Lamina para indicar la operacion elegida o alguna alternativa
        JFrame marco = new JFrame("versión 1.05");
        Lamina panel = new Lamina();
        marco.setBounds(50,50,415,510);
        marco.setResizable(false);
        marco.add(panel);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //System.out.println("Hello world!");
    }
}