import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Lamina extends JPanel implements ActionListener {
    String numeros = "0";
    double primerNumero, segundoNumero;
    //int contadorTecla = 0;
    boolean hayNumeros = false;
    boolean hayPunto = false;
    boolean operador = false;
    boolean resultado = false;
    char operacion;
    JLabel miniPantalla = new JLabel();
    Pantalla pantalla = new Pantalla(numeros);
    //Color colorPantalla = new Color( 195, 217, 141 );
    Color colorLamina = new Color( 33, 35, 30 );
    Color rojo = new Color( 110, 15, 0 );
    Color azulOscuro = new Color(2, 4, 80);
    //Color amarilloSuave = new Color( 252, 255, 146 );
    //Color gris = new Color( 148, 148, 148 );
    Color verdeEsmeralda = new Color(  196, 255, 125 );
    Color amarilloYema = new Color( 240, 211, 0  );
    Color rosa = new Color( 255, 65, 160 );
    Color rosadoSuave = new Color( 255, 141, 151 );
    Color turquesa = new Color( 0, 77, 95  );
    Color magentaOscuro = new Color(  220, 0, 103 );
    Color blanco = new Color( 255, 255, 255 );
    Font fuente = new Font("serif", Font.BOLD, 16);
    Color grisMuyMuyClaro = new Color( 222, 222, 222 );
    Color purpura = new Color( 143, 0, 255 );
    int contadorEstilo = 0;
    BotonNumero escribe1 = new BotonNumero();
    BotonNumero escribe2 = new BotonNumero();
    BotonNumero escribe3 = new BotonNumero();
    BotonSimbolo botonSuma = new BotonSimbolo();
    BotonNumero escribe4 = new BotonNumero();
    BotonNumero escribe5 = new BotonNumero();
    BotonNumero escribe6 = new BotonNumero();
    BotonSimbolo botonResta = new BotonSimbolo();
    BotonNumero escribe7 = new BotonNumero();
    BotonNumero escribe8 = new BotonNumero();
    BotonNumero escribe9 = new BotonNumero();
    BotonSimbolo botonProducto = new BotonSimbolo();
    BotonSimbolo botonPunto = new BotonSimbolo();
    BotonNumero escribe0 = new BotonNumero();
    BotonSimbolo botonIgual = new BotonSimbolo();
    BotonSimbolo botonCociente = new BotonSimbolo();
    BotonEstiloReset botonEstilo = new BotonEstiloReset();
    BotonEstiloReset botonReinicio = new BotonEstiloReset();

    Lamina(){
        this.setLayout(null);
        this.setBackground(colorLamina);
        this.add(pantalla);
        //pantalla.setHorizontalAlignment(3);
        this.add(miniPantalla);
        miniPantalla.setBounds(50,10,300,40);
        miniPantalla.setForeground(grisMuyMuyClaro);

        this.add(escribe1);
        escribe1.setText("1");
        escribe1.setLocation(50,140);
        escribe1.setBackground(azulOscuro);
        escribe1.setFont(fuente);
        escribe1.setForeground(grisMuyMuyClaro);
        escribe1.addActionListener(this);

        this.add(escribe2);
        escribe2.setText("2");
        escribe2.setLocation(130,140);
        escribe2.setBackground(azulOscuro);
        escribe2.setFont(fuente);
        escribe2.setForeground(grisMuyMuyClaro);
        escribe2.addActionListener(this);

        this.add(escribe3);
        escribe3.setText("3");
        escribe3.setLocation(210,140);
        escribe3.setBackground(azulOscuro);
        escribe3.setFont(fuente);
        escribe3.setForeground(grisMuyMuyClaro);
        escribe3.addActionListener(this);

        this.add(botonSuma);
        botonSuma.setText("+");
        botonSuma.setLocation(290,140);
        botonSuma.setBackground(grisMuyMuyClaro);
        botonSuma.setFont(fuente);
        botonSuma.setForeground(colorLamina);
        botonSuma.addActionListener(this);

        this.add(escribe4);
        escribe4.setText("4");
        escribe4.setLocation(50,200);
        escribe4.setBackground(azulOscuro);
        escribe4.setFont(fuente);
        escribe4.setForeground(grisMuyMuyClaro);
        escribe4.addActionListener(this);

        this.add(escribe5);
        escribe5.setText("5");
        escribe5.setLocation(130,200);
        escribe5.setBackground(azulOscuro);
        escribe5.setFont(fuente);
        escribe5.setForeground(grisMuyMuyClaro);
        escribe5.addActionListener(this);

        this.add(escribe6);
        escribe6.setText("6");
        escribe6.setLocation(210,200);
        escribe6.setBackground(azulOscuro);
        escribe6.setFont(fuente);
        escribe6.setForeground(grisMuyMuyClaro);
        escribe6.addActionListener(this);

        this.add(botonResta);
        botonResta.setText("-");
        botonResta.setLocation(290,200);
        botonResta.setBackground(grisMuyMuyClaro);
        botonResta.setFont(fuente);
        botonResta.setForeground(colorLamina);
        botonResta.addActionListener(this);

        this.add(escribe7);
        escribe7.setText("7");
        escribe7.setLocation(50,260);
        escribe7.setBackground(azulOscuro);
        escribe7.setFont(fuente);
        escribe7.setForeground(grisMuyMuyClaro);
        escribe7.addActionListener(this);

        this.add(escribe8);
        escribe8.setText("8");
        escribe8.setLocation(130,260);
        escribe8.setBackground(azulOscuro);
        escribe8.setFont(fuente);
        escribe8.setForeground(grisMuyMuyClaro);
        escribe8.addActionListener(this);

        this.add(escribe9);
        escribe9.setText("9");
        escribe9.setLocation(210,260);
        escribe9.setBackground(azulOscuro);
        escribe9.setFont(fuente);
        escribe9.setForeground(grisMuyMuyClaro);
        escribe9.addActionListener(this);

        this.add(botonProducto);
        botonProducto.setText("x");
        botonProducto.setLocation(290,260);
        botonProducto.setBackground(grisMuyMuyClaro);
        botonProducto.setFont(fuente);
        botonProducto.setForeground(colorLamina);
        botonProducto.addActionListener(this);

        this.add(botonPunto);
        botonPunto.setText(".");
        botonPunto.setLocation(50,320);
        botonPunto.setBackground(grisMuyMuyClaro);
        botonPunto.setFont(fuente);
        botonPunto.setForeground(colorLamina);
        botonPunto.addActionListener(this);

        this.add(escribe0);
        escribe0.setText("0");
        escribe0.setLocation(130,320);
        escribe0.setBackground(azulOscuro);
        escribe0.setFont(fuente);
        escribe0.setForeground(grisMuyMuyClaro);
        escribe0.addActionListener(this);

        this.add(botonIgual);
        botonIgual.setText("=");
        botonIgual.setLocation(210,320);
        botonIgual.setBackground(grisMuyMuyClaro);
        botonIgual.setFont(fuente);
        botonIgual.setForeground(colorLamina);
        botonIgual.addActionListener(this);

        this.add(botonCociente);
        botonCociente.setText("/");
        botonCociente.setLocation(290,320);
        botonCociente.setBackground(grisMuyMuyClaro);
        botonCociente.setFont(fuente);
        botonCociente.setForeground(colorLamina);
        botonCociente.addActionListener(this);

        this.add(botonEstilo);
        botonEstilo.setText("Estilo");
        botonEstilo.setLocation(50,380);
        botonEstilo.setBackground(azulOscuro);
        botonEstilo.setFont(fuente);
        botonEstilo.setForeground(grisMuyMuyClaro);
        botonEstilo.addActionListener(this);

        this.add(botonReinicio);
        botonReinicio.setText("Reinicio");
        botonReinicio.setLocation(210,380);
        botonReinicio.setBackground(azulOscuro);
        botonReinicio.setFont(fuente);
        botonReinicio.setForeground(grisMuyMuyClaro);
        botonReinicio.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object fuenteEvento;
        fuenteEvento = e.getSource();


        if(fuenteEvento==botonEstilo){
            contadorEstilo++;
            if(contadorEstilo==0){
                this.setBackground(colorLamina);

                escribe1.setBackground(azulOscuro);
                escribe1.setForeground(grisMuyMuyClaro);

                escribe2.setBackground(azulOscuro);
                escribe2.setForeground(grisMuyMuyClaro);

                escribe3.setBackground(azulOscuro);
                escribe3.setForeground(grisMuyMuyClaro);

                escribe4.setBackground(azulOscuro);
                escribe4.setForeground(grisMuyMuyClaro);

                escribe5.setBackground(azulOscuro);
                escribe5.setForeground(grisMuyMuyClaro);

                escribe6.setBackground(azulOscuro);
                escribe6.setForeground(grisMuyMuyClaro);

                escribe7.setBackground(azulOscuro);
                escribe7.setForeground(grisMuyMuyClaro);

                escribe8.setBackground(azulOscuro);
                escribe8.setForeground(grisMuyMuyClaro);

                escribe9.setBackground(azulOscuro);
                escribe9.setForeground(grisMuyMuyClaro);

                escribe0.setBackground(azulOscuro);
                escribe0.setForeground(grisMuyMuyClaro);

                botonEstilo.setBackground(azulOscuro);
                botonEstilo.setForeground(grisMuyMuyClaro);

                botonReinicio.setBackground(azulOscuro);
                botonReinicio.setForeground(grisMuyMuyClaro);

                botonSuma.setBackground(grisMuyMuyClaro);
                botonSuma.setForeground(colorLamina);

                botonResta.setBackground(grisMuyMuyClaro);
                botonResta.setForeground(colorLamina);

                botonProducto.setBackground(grisMuyMuyClaro);
                botonProducto.setForeground(colorLamina);

                botonCociente.setBackground(grisMuyMuyClaro);
                botonCociente.setForeground(colorLamina);

                botonPunto.setBackground(grisMuyMuyClaro);
                botonPunto.setForeground(colorLamina);

                botonIgual.setBackground(grisMuyMuyClaro);
                botonIgual.setForeground(colorLamina);

                miniPantalla.setForeground(grisMuyMuyClaro);
            }
            else if(contadorEstilo==1){
                this.setBackground(grisMuyMuyClaro);

                escribe1.setBackground(azulOscuro);
                escribe1.setForeground(grisMuyMuyClaro);

                escribe2.setBackground(azulOscuro);
                escribe2.setForeground(grisMuyMuyClaro);

                escribe3.setBackground(azulOscuro);
                escribe3.setForeground(grisMuyMuyClaro);

                escribe4.setBackground(azulOscuro);
                escribe4.setForeground(grisMuyMuyClaro);

                escribe5.setBackground(azulOscuro);
                escribe5.setForeground(grisMuyMuyClaro);

                escribe6.setBackground(azulOscuro);
                escribe6.setForeground(grisMuyMuyClaro);

                escribe7.setBackground(azulOscuro);
                escribe7.setForeground(grisMuyMuyClaro);

                escribe8.setBackground(azulOscuro);
                escribe8.setForeground(grisMuyMuyClaro);

                escribe9.setBackground(azulOscuro);
                escribe9.setForeground(grisMuyMuyClaro);

                escribe0.setBackground(azulOscuro);
                escribe0.setForeground(grisMuyMuyClaro);

                botonEstilo.setBackground(azulOscuro);
                botonEstilo.setForeground(grisMuyMuyClaro);

                botonReinicio.setBackground(azulOscuro);
                botonReinicio.setForeground(grisMuyMuyClaro);

                botonSuma.setBackground(rojo);
                botonSuma.setForeground(grisMuyMuyClaro);

                botonResta.setBackground(rojo);
                botonResta.setForeground(grisMuyMuyClaro);

                botonProducto.setBackground(rojo);
                botonProducto.setForeground(grisMuyMuyClaro);

                botonCociente.setBackground(rojo);
                botonCociente.setForeground(grisMuyMuyClaro);

                botonPunto.setBackground(rojo);
                botonPunto.setForeground(grisMuyMuyClaro);

                botonIgual.setBackground(rojo);
                botonIgual.setForeground(grisMuyMuyClaro);

                miniPantalla.setForeground(rojo);
            }
            else if(contadorEstilo==2){
                this.setBackground(rojo);

                escribe1.setBackground(blanco);
                escribe1.setForeground(colorLamina);

                escribe2.setBackground(blanco);
                escribe2.setForeground(colorLamina);

                escribe3.setBackground(blanco);
                escribe3.setForeground(colorLamina);

                escribe4.setBackground(blanco);
                escribe4.setForeground(colorLamina);

                escribe5.setBackground(blanco);
                escribe5.setForeground(colorLamina);

                escribe6.setBackground(blanco);
                escribe6.setForeground(colorLamina);

                escribe7.setBackground(blanco);
                escribe7.setForeground(colorLamina);

                escribe8.setBackground(blanco);
                escribe8.setForeground(colorLamina);

                escribe9.setBackground(blanco);
                escribe9.setForeground(colorLamina);

                escribe0.setBackground(blanco);
                escribe0.setForeground(colorLamina);

                botonEstilo.setBackground(blanco);
                botonEstilo.setForeground(colorLamina);

                botonReinicio.setBackground(blanco);
                botonReinicio.setForeground(colorLamina);

                botonSuma.setBackground(amarilloYema);
                botonSuma.setForeground(colorLamina);

                botonResta.setBackground(amarilloYema);
                botonResta.setForeground(colorLamina);

                botonProducto.setBackground(amarilloYema);
                botonProducto.setForeground(colorLamina);

                botonCociente.setBackground(amarilloYema);
                botonCociente.setForeground(colorLamina);

                botonPunto.setBackground(amarilloYema);
                botonPunto.setForeground(colorLamina);

                botonIgual.setBackground(amarilloYema);
                botonIgual.setForeground(colorLamina);

                miniPantalla.setForeground(amarilloYema);
            }
            else if(contadorEstilo==3){
                this.setBackground(verdeEsmeralda);

                escribe1.setBackground(blanco);
                escribe1.setForeground(colorLamina);

                escribe2.setBackground(blanco);
                escribe2.setForeground(colorLamina);

                escribe3.setBackground(blanco);
                escribe3.setForeground(colorLamina);

                escribe4.setBackground(blanco);
                escribe4.setForeground(colorLamina);

                escribe5.setBackground(blanco);
                escribe5.setForeground(colorLamina);

                escribe6.setBackground(blanco);
                escribe6.setForeground(colorLamina);

                escribe7.setBackground(blanco);
                escribe7.setForeground(colorLamina);

                escribe8.setBackground(blanco);
                escribe8.setForeground(colorLamina);

                escribe9.setBackground(blanco);
                escribe9.setForeground(colorLamina);

                escribe0.setBackground(blanco);
                escribe0.setForeground(colorLamina);

                botonEstilo.setBackground(blanco);
                botonEstilo.setForeground(colorLamina);

                botonReinicio.setBackground(blanco);
                botonReinicio.setForeground(colorLamina);

                botonSuma.setBackground(purpura);
                botonSuma.setForeground(blanco);

                botonResta.setBackground(purpura);
                botonResta.setForeground(blanco);

                botonProducto.setBackground(purpura);
                botonProducto.setForeground(blanco);

                botonCociente.setBackground(purpura);
                botonCociente.setForeground(blanco);

                botonPunto.setBackground(purpura);
                botonPunto.setForeground(blanco);

                botonIgual.setBackground(purpura);
                botonIgual.setForeground(blanco);

                miniPantalla.setForeground(purpura);
            }
            else if(contadorEstilo==4){
                this.setBackground(rosa);

                escribe1.setBackground(grisMuyMuyClaro);
                escribe1.setForeground(magentaOscuro);

                escribe2.setBackground(grisMuyMuyClaro);
                escribe2.setForeground(magentaOscuro);

                escribe3.setBackground(grisMuyMuyClaro);
                escribe3.setForeground(magentaOscuro);

                escribe4.setBackground(grisMuyMuyClaro);
                escribe4.setForeground(magentaOscuro);

                escribe5.setBackground(grisMuyMuyClaro);
                escribe5.setForeground(magentaOscuro);

                escribe6.setBackground(grisMuyMuyClaro);
                escribe6.setForeground(magentaOscuro);

                escribe7.setBackground(grisMuyMuyClaro);
                escribe7.setForeground(magentaOscuro);

                escribe8.setBackground(grisMuyMuyClaro);
                escribe8.setForeground(magentaOscuro);

                escribe9.setBackground(grisMuyMuyClaro);
                escribe9.setForeground(magentaOscuro);

                escribe0.setBackground(grisMuyMuyClaro);
                escribe0.setForeground(magentaOscuro);

                botonEstilo.setBackground(grisMuyMuyClaro);
                botonEstilo.setForeground(magentaOscuro);

                botonReinicio.setBackground(grisMuyMuyClaro);
                botonReinicio.setForeground(magentaOscuro);

                botonSuma.setBackground(rosadoSuave);
                botonSuma.setForeground(grisMuyMuyClaro);

                botonResta.setBackground(rosadoSuave);
                botonResta.setForeground(grisMuyMuyClaro);

                botonProducto.setBackground(rosadoSuave);
                botonProducto.setForeground(grisMuyMuyClaro);

                botonCociente.setBackground(rosadoSuave);
                botonCociente.setForeground(grisMuyMuyClaro);

                botonPunto.setBackground(rosadoSuave);
                botonPunto.setForeground(grisMuyMuyClaro);

                botonIgual.setBackground(rosadoSuave);
                botonIgual.setForeground(grisMuyMuyClaro);

                miniPantalla.setForeground(grisMuyMuyClaro);
            }
            else if(contadorEstilo==5){
                this.setBackground(turquesa);

                escribe1.setBackground(grisMuyMuyClaro);
                escribe1.setForeground(colorLamina);

                escribe2.setBackground(grisMuyMuyClaro);
                escribe2.setForeground(colorLamina);

                escribe3.setBackground(grisMuyMuyClaro);
                escribe3.setForeground(colorLamina);

                escribe4.setBackground(grisMuyMuyClaro);
                escribe4.setForeground(colorLamina);

                escribe5.setBackground(grisMuyMuyClaro);
                escribe5.setForeground(colorLamina);

                escribe6.setBackground(grisMuyMuyClaro);
                escribe6.setForeground(colorLamina);

                escribe7.setBackground(grisMuyMuyClaro);
                escribe7.setForeground(colorLamina);

                escribe8.setBackground(grisMuyMuyClaro);
                escribe8.setForeground(colorLamina);

                escribe9.setBackground(grisMuyMuyClaro);
                escribe9.setForeground(colorLamina);

                escribe0.setBackground(grisMuyMuyClaro);
                escribe0.setForeground(colorLamina);

                botonEstilo.setBackground(grisMuyMuyClaro);
                botonEstilo.setForeground(colorLamina);

                botonReinicio.setBackground(grisMuyMuyClaro);
                botonReinicio.setForeground(colorLamina);

                botonSuma.setBackground(amarilloYema);
                botonSuma.setForeground(colorLamina);

                botonResta.setBackground(amarilloYema);
                botonResta.setForeground(colorLamina);

                botonProducto.setBackground(amarilloYema);
                botonProducto.setForeground(colorLamina);

                botonCociente.setBackground(amarilloYema);
                botonCociente.setForeground(colorLamina);

                botonPunto.setBackground(amarilloYema);
                botonPunto.setForeground(colorLamina);

                botonIgual.setBackground(amarilloYema);
                botonIgual.setForeground(colorLamina);

                miniPantalla.setForeground(amarilloYema);

                contadorEstilo=-1;
            }

        }
        else if(fuenteEvento==escribe1){
            if(numeros.length()<8){
                if(numeros!="0" && numeros!=" "){
                    numeros = numeros + "1";
                }else{
                    numeros = "1";
                }
                hayNumeros = true;
                pantalla.setText(numeros);
                resultado = false;
            }

        }
        else if(fuenteEvento==escribe2){
            if(numeros.length()<8){
                if(numeros!="0" && numeros!=" "){
                    numeros = numeros + "2";
                }else{
                    numeros = "2";
                }
                hayNumeros = true;
                pantalla.setText(numeros);
                resultado = false;
            }
        }
        else if(fuenteEvento==escribe3){
            if(numeros.length()<8){
                if(numeros!="0" && numeros!=" "){
                    numeros = numeros + "3";
                }else{
                    numeros = "3";
                }
                hayNumeros = true;
                pantalla.setText(numeros);
                resultado = false;
            }
        }
        else if(fuenteEvento==escribe4){
            if(numeros.length()<8){
                if(numeros!="0" && numeros!=" "){
                    numeros = numeros + "4";
                }else{
                    numeros = "4";
                }
                hayNumeros = true;
                pantalla.setText(numeros);
                resultado = false;
            }
        }
        else if(fuenteEvento==escribe5){
            if(numeros.length()<8){
                if(numeros!="0" && numeros!=" "){
                    numeros = numeros + "5";
                }else{
                    numeros = "5";
                }
                hayNumeros = true;
                pantalla.setText(numeros);
                resultado = false;
            }
        }
        else if(fuenteEvento==escribe6){
            if(numeros.length()<8){
                if(numeros!="0" && numeros!=" "){
                    numeros = numeros + "6";
                }else{
                    numeros = "6";
                }
                hayNumeros = true;
                pantalla.setText(numeros);
                resultado = false;
            }
        }
        else if(fuenteEvento==escribe7){
            if(numeros.length()<8){
                if(numeros!="0" && numeros!=" "){
                    numeros = numeros + "7";
                }else{
                    numeros = "7";
                }
                hayNumeros = true;
                pantalla.setText(numeros);
                resultado = false;
            }

        }
        else if(fuenteEvento==escribe8){
            if(numeros.length()<8){
                if(numeros!="0" && numeros!=" "){
                    numeros = numeros + "8";
                }else{
                    numeros = "8";
                }
                hayNumeros = true;
                pantalla.setText(numeros);
                resultado = false;
            }
        }
        else if(fuenteEvento==escribe9){
            if(numeros.length()<8){
                if(numeros!="0" && numeros!=" "){
                    numeros = numeros + "9";
                }else{
                    numeros = "9";
                }
                hayNumeros = true;
                pantalla.setText(numeros);
                resultado = false;
            }
        }
        else if((fuenteEvento==escribe0)&&(hayNumeros||hayPunto)){
            if(numeros.length()<8){
                numeros = numeros + "0";
                //contadorTecla++;
                pantalla.setText(numeros);
            }
            resultado = false;
        }
        else if((fuenteEvento==escribe0)&&(pantalla.getBackground()==Color.black)){
            numeros = "0";
            pantalla.setText(numeros);
            resultado = false;
        }
        else if((fuenteEvento==botonPunto)&&hayPunto==false){
            if(numeros=="0" || resultado){
                numeros = "0.";
            }
            else{
                numeros = numeros + ".";
            }
            pantalla.setText(numeros);
            hayPunto = true;
            resultado = false;
        }
        else if((fuenteEvento==botonSuma)&&(operador==false)){
            primerNumero = Double.parseDouble(numeros);
            miniPantalla.setText(numeros+"+");
            numeros = "0";
            botonSuma.setBorder(BorderFactory.createLineBorder(Color.green,3));
            pantalla.setText(numeros);
            operador = true;
            operacion = 's';
            hayPunto = false;
            hayNumeros = false;
            //System.out.println(primerNumero);
        }
        else if((fuenteEvento==botonResta)&&(operador==false)){
            primerNumero = Double.parseDouble(numeros);
            miniPantalla.setText(numeros+"-");
            numeros = "0";
            pantalla.setText(numeros);
            operador = true;
            operacion = 'r';
            hayPunto = false;
            hayNumeros = false;
        }
        else if((fuenteEvento==botonProducto)&&(operador==false)){
            primerNumero = Double.parseDouble(numeros);
            miniPantalla.setText(numeros+"x");
            numeros = "0";
            pantalla.setText(numeros);
            operador = true;
            operacion = 'm';
            hayPunto = false;
            hayNumeros = false;
        }
        else if((fuenteEvento==botonCociente)&&(operador==false)){
            primerNumero = Double.parseDouble(numeros);
            miniPantalla.setText(numeros+"/");
            numeros = "0";
            pantalla.setText(numeros);
            operador = true;
            operacion = 'd';
            hayPunto = false;
            hayNumeros = false;
        }
        else if((fuenteEvento==botonIgual)&&(operador)){
            segundoNumero = Double.parseDouble(numeros);

            if(operacion=='s'){
                if(((int)(primerNumero+segundoNumero))==(primerNumero+segundoNumero)){
                    pantalla.setText(String.valueOf((int)(primerNumero+segundoNumero)));
                }else{
                    pantalla.setText(String.valueOf(primerNumero+segundoNumero));
                }
            }
            else if(operacion=='r'){
                if(((int)(primerNumero-segundoNumero))==(primerNumero-segundoNumero)){
                    pantalla.setText(String.valueOf((int)(primerNumero-segundoNumero)));
                }else{
                    pantalla.setText(String.valueOf(primerNumero-segundoNumero));
                }
            }
            else if(operacion=='m'){
                if(((int)(primerNumero*segundoNumero))==(primerNumero*segundoNumero)){
                    pantalla.setText(String.valueOf((int)(primerNumero*segundoNumero)));
                }else{
                    pantalla.setText(String.valueOf(primerNumero*segundoNumero));
                }
            }
            else if(operacion=='d'){
                if(((int)(primerNumero/segundoNumero))==(primerNumero/segundoNumero)){
                    pantalla.setText(String.valueOf((int)(primerNumero/segundoNumero)));
                }else if(segundoNumero==0){
                    pantalla.setText("error");
                    JOptionPane.showMessageDialog(null,"No se puede dividir por cero");
                }
                else{
                    pantalla.setText(String.valueOf(primerNumero/segundoNumero));
                }
            }
            miniPantalla.setText("");
            numeros = "";
            operador = false;
            hayPunto = false;
            hayNumeros = false;
            resultado = true;
            primerNumero = 0;
            segundoNumero = 0;
        }
        else if(fuenteEvento==botonReinicio){
            operador = false;
            hayPunto = false;
            hayNumeros = false;
            resultado = false;
            numeros = "0";
            pantalla.setText(numeros);
            primerNumero = 0;
            segundoNumero = 0;
            operacion = 'n';
            miniPantalla.setText("");
        }

        if(resultado){
            pantalla.setBackground(Color.black);
            pantalla.setForeground(Color.green);
        }else{
            pantalla.setBackground(Pantalla.colorPantalla);
            pantalla.setForeground(Color.black);
        }
    }

    private class BotonNumero extends JButton implements MouseListener {

        BotonNumero(){

            this.setSize(60,40);
            this.setBorder(null);
            this.addMouseListener(this);
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            this.setBorder(BorderFactory.createLineBorder(Color.green, 2));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            this.setBorder(null);
        }
    }

    private class BotonSimbolo extends JButton implements MouseListener{

        BotonSimbolo(){

            this.setSize(60,40);
            this.setBorder(null);
            this.addMouseListener(this);
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            this.setBorder(BorderFactory.createLineBorder(Color.green,2));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            this.setBorder(null);
        }
    }

    private class BotonEstiloReset extends JButton implements MouseListener{

        BotonEstiloReset(){
            this.setSize(140,40);
            this.setBorder(null);
            this.addMouseListener(this);
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            this.setBorder(BorderFactory.createLineBorder(Color.green,2));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            this.setBorder(null);
        }
    }


}
