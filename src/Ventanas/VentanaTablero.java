/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Excepciones.ExcepcionJuego;
import java.awt.Color;
import javax.swing.JOptionPane;
import Juego.*;

/**
 *
 * @author Alvaro y Patricia
 */
public class VentanaTablero extends javax.swing.JFrame {

    Tablero tablero = new Tablero();

    /**
     * Creates new form Tablero
     */
    public VentanaTablero() {
        initComponents();
        celda00.setBackground(Color.LIGHT_GRAY);
        celda00.setOpaque(true);
        celda01.setBackground(Color.LIGHT_GRAY);
        celda01.setOpaque(true);
        celda02.setBackground(Color.LIGHT_GRAY);
        celda02.setOpaque(true);
        celda03.setBackground(Color.LIGHT_GRAY);
        celda03.setOpaque(true);
        celda04.setBackground(Color.LIGHT_GRAY);
        celda04.setOpaque(true);
        celda05.setBackground(Color.LIGHT_GRAY);
        celda05.setOpaque(true);
        celda06.setBackground(Color.LIGHT_GRAY);
        celda06.setOpaque(true);
        celda07.setBackground(Color.LIGHT_GRAY);
        celda07.setOpaque(true);
        celda10.setBackground(Color.LIGHT_GRAY);
        celda10.setOpaque(true);
        celda11.setBackground(Color.LIGHT_GRAY);
        celda11.setOpaque(true);
        celda12.setBackground(Color.LIGHT_GRAY);
        celda12.setOpaque(true);
        celda13.setBackground(Color.LIGHT_GRAY);
        celda13.setOpaque(true);
        celda14.setBackground(Color.LIGHT_GRAY);
        celda14.setOpaque(true);
        celda15.setBackground(Color.LIGHT_GRAY);
        celda15.setOpaque(true);
        celda16.setBackground(Color.LIGHT_GRAY);
        celda16.setOpaque(true);
        celda17.setBackground(Color.LIGHT_GRAY);
        celda17.setOpaque(true);
        celda20.setBackground(Color.LIGHT_GRAY);
        celda20.setOpaque(true);
        celda21.setBackground(Color.LIGHT_GRAY);
        celda21.setOpaque(true);
        celda22.setBackground(Color.LIGHT_GRAY);
        celda22.setOpaque(true);
        celda23.setBackground(Color.LIGHT_GRAY);
        celda23.setOpaque(true);
        celda24.setBackground(Color.LIGHT_GRAY);
        celda24.setOpaque(true);
        celda25.setBackground(Color.LIGHT_GRAY);
        celda25.setOpaque(true);
        celda26.setBackground(Color.LIGHT_GRAY);
        celda26.setOpaque(true);
        celda27.setBackground(Color.LIGHT_GRAY);
        celda27.setOpaque(true);
        celda30.setBackground(Color.LIGHT_GRAY);
        celda30.setOpaque(true);
        celda31.setBackground(Color.LIGHT_GRAY);
        celda31.setOpaque(true);
        celda32.setBackground(Color.LIGHT_GRAY);
        celda32.setOpaque(true);
        celda33.setBackground(Color.LIGHT_GRAY);
        celda33.setOpaque(true);
        celda34.setBackground(Color.LIGHT_GRAY);
        celda34.setOpaque(true);
        celda35.setBackground(Color.LIGHT_GRAY);
        celda35.setOpaque(true);
        celda36.setBackground(Color.LIGHT_GRAY);
        celda36.setOpaque(true);
        celda37.setBackground(Color.LIGHT_GRAY);
        celda37.setOpaque(true);
        celda40.setBackground(Color.LIGHT_GRAY);
        celda40.setOpaque(true);
        celda41.setBackground(Color.LIGHT_GRAY);
        celda41.setOpaque(true);
        celda42.setBackground(Color.LIGHT_GRAY);
        celda42.setOpaque(true);
        celda43.setBackground(Color.LIGHT_GRAY);
        celda43.setOpaque(true);
        celda44.setBackground(Color.LIGHT_GRAY);
        celda44.setOpaque(true);
        celda45.setBackground(Color.LIGHT_GRAY);
        celda45.setOpaque(true);
        celda46.setBackground(Color.LIGHT_GRAY);
        celda46.setOpaque(true);
        celda47.setBackground(Color.LIGHT_GRAY);
        celda47.setOpaque(true);
        celda50.setBackground(Color.LIGHT_GRAY);
        celda50.setOpaque(true);
        celda51.setBackground(Color.LIGHT_GRAY);
        celda51.setOpaque(true);
        celda52.setBackground(Color.LIGHT_GRAY);
        celda52.setOpaque(true);
        celda53.setBackground(Color.LIGHT_GRAY);
        celda53.setOpaque(true);
        celda54.setBackground(Color.LIGHT_GRAY);
        celda54.setOpaque(true);
        celda55.setBackground(Color.LIGHT_GRAY);
        celda55.setOpaque(true);
        celda56.setBackground(Color.LIGHT_GRAY);
        celda56.setOpaque(true);
        celda57.setBackground(Color.LIGHT_GRAY);
        celda57.setOpaque(true);
        celda60.setBackground(Color.LIGHT_GRAY);
        celda60.setOpaque(true);
        celda61.setBackground(Color.LIGHT_GRAY);
        celda61.setOpaque(true);
        celda62.setBackground(Color.LIGHT_GRAY);
        celda62.setOpaque(true);
        celda63.setBackground(Color.LIGHT_GRAY);
        celda63.setOpaque(true);
        celda64.setBackground(Color.LIGHT_GRAY);
        celda64.setOpaque(true);
        celda65.setBackground(Color.LIGHT_GRAY);
        celda65.setOpaque(true);
        celda66.setBackground(Color.LIGHT_GRAY);
        celda66.setOpaque(true);
        celda67.setBackground(Color.LIGHT_GRAY);
        celda67.setOpaque(true);

        this.getContentPane().setBackground(Color.DARK_GRAY);
        lectorComando.setToolTipText("G 0 0");
        tablero.crearMatrizTablero();
        tablero.setDificultad(VentanaDificultad.dificultad);
        this.imprimirTablero();
        switch (tablero.getDificultad()) {
            case "BAJA":
                tablero.setContadorZombies(5);
                break;
            case "MEDIA":
                tablero.setContadorZombies(15);
                break;
            case "ALTA":
                tablero.setContadorZombies(25);
                break;
            case "IMPOSIBLE":
                tablero.setContadorZombies(50);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lectorComando = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BotonPasarTurno = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BotonInsertarComando = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        celda00 = new javax.swing.JLabel();
        celda10 = new javax.swing.JLabel();
        celda20 = new javax.swing.JLabel();
        celda30 = new javax.swing.JLabel();
        celda40 = new javax.swing.JLabel();
        celda50 = new javax.swing.JLabel();
        celda60 = new javax.swing.JLabel();
        celda01 = new javax.swing.JLabel();
        celda11 = new javax.swing.JLabel();
        celda21 = new javax.swing.JLabel();
        celda31 = new javax.swing.JLabel();
        celda41 = new javax.swing.JLabel();
        celda51 = new javax.swing.JLabel();
        celda61 = new javax.swing.JLabel();
        celda02 = new javax.swing.JLabel();
        celda12 = new javax.swing.JLabel();
        celda22 = new javax.swing.JLabel();
        celda32 = new javax.swing.JLabel();
        celda42 = new javax.swing.JLabel();
        celda52 = new javax.swing.JLabel();
        celda62 = new javax.swing.JLabel();
        celda03 = new javax.swing.JLabel();
        celda13 = new javax.swing.JLabel();
        celda23 = new javax.swing.JLabel();
        celda33 = new javax.swing.JLabel();
        celda43 = new javax.swing.JLabel();
        celda53 = new javax.swing.JLabel();
        celda63 = new javax.swing.JLabel();
        celda04 = new javax.swing.JLabel();
        celda14 = new javax.swing.JLabel();
        celda24 = new javax.swing.JLabel();
        celda34 = new javax.swing.JLabel();
        celda44 = new javax.swing.JLabel();
        celda54 = new javax.swing.JLabel();
        celda64 = new javax.swing.JLabel();
        celda05 = new javax.swing.JLabel();
        celda15 = new javax.swing.JLabel();
        celda25 = new javax.swing.JLabel();
        celda35 = new javax.swing.JLabel();
        celda45 = new javax.swing.JLabel();
        celda55 = new javax.swing.JLabel();
        celda65 = new javax.swing.JLabel();
        celda06 = new javax.swing.JLabel();
        celda16 = new javax.swing.JLabel();
        celda26 = new javax.swing.JLabel();
        celda36 = new javax.swing.JLabel();
        celda46 = new javax.swing.JLabel();
        celda56 = new javax.swing.JLabel();
        celda66 = new javax.swing.JLabel();
        celda07 = new javax.swing.JLabel();
        celda17 = new javax.swing.JLabel();
        celda27 = new javax.swing.JLabel();
        celda37 = new javax.swing.JLabel();
        celda47 = new javax.swing.JLabel();
        celda57 = new javax.swing.JLabel();
        celda67 = new javax.swing.JLabel();
        labelContadorZombies = new javax.swing.JLabel();
        labelTurno = new javax.swing.JLabel();
        labelSoles = new javax.swing.JLabel();
        botonAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botonSalir.setBackground(new java.awt.Color(102, 102, 102));
        botonSalir.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contador de zombies:");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Turno:");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PlantosVsZombos2");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("0");

        lectorComando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectorComandoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Comando:");

        BotonPasarTurno.setBackground(new java.awt.Color(102, 102, 102));
        BotonPasarTurno.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        BotonPasarTurno.setForeground(new java.awt.Color(255, 255, 255));
        BotonPasarTurno.setText("PASAR TURNO");
        BotonPasarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPasarTurnoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Soles:");

        BotonInsertarComando.setBackground(new java.awt.Color(102, 102, 102));
        BotonInsertarComando.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        BotonInsertarComando.setForeground(new java.awt.Color(255, 255, 255));
        BotonInsertarComando.setText("INSERTAR COMANDO");
        BotonInsertarComando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarComandoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("1");

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("2");

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("3");

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("4");

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("5");

        jLabel12.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("6");

        jLabel13.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("0");

        jLabel14.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("1");

        jLabel15.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("2");

        jLabel16.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("3");

        jLabel17.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("4");

        jLabel18.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("5");

        jLabel19.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("6");

        jLabel20.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("7");

        celda00.setBackground(new java.awt.Color(204, 255, 153));
        celda00.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda00.setForeground(new java.awt.Color(0, 0, 0));

        celda10.setBackground(new java.awt.Color(0, 255, 0));
        celda10.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda10.setForeground(new java.awt.Color(0, 0, 0));

        celda20.setBackground(new java.awt.Color(0, 255, 0));
        celda20.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda20.setForeground(new java.awt.Color(0, 0, 0));

        celda30.setBackground(new java.awt.Color(0, 255, 0));
        celda30.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda30.setForeground(new java.awt.Color(0, 0, 0));

        celda40.setBackground(new java.awt.Color(0, 255, 0));
        celda40.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda40.setForeground(new java.awt.Color(0, 0, 0));

        celda50.setBackground(new java.awt.Color(0, 255, 0));
        celda50.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda50.setForeground(new java.awt.Color(0, 0, 0));

        celda60.setBackground(new java.awt.Color(0, 255, 0));
        celda60.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda60.setForeground(new java.awt.Color(0, 0, 0));

        celda01.setBackground(new java.awt.Color(0, 255, 0));
        celda01.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda01.setForeground(new java.awt.Color(0, 0, 0));

        celda11.setBackground(new java.awt.Color(0, 255, 0));
        celda11.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda11.setForeground(new java.awt.Color(0, 0, 0));

        celda21.setBackground(new java.awt.Color(0, 255, 0));
        celda21.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda21.setForeground(new java.awt.Color(0, 0, 0));

        celda31.setBackground(new java.awt.Color(0, 255, 0));
        celda31.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda31.setForeground(new java.awt.Color(0, 0, 0));

        celda41.setBackground(new java.awt.Color(0, 255, 0));
        celda41.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda41.setForeground(new java.awt.Color(0, 0, 0));

        celda51.setBackground(new java.awt.Color(0, 255, 0));
        celda51.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda51.setForeground(new java.awt.Color(0, 0, 0));

        celda61.setBackground(new java.awt.Color(0, 255, 0));
        celda61.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda61.setForeground(new java.awt.Color(0, 0, 0));

        celda02.setBackground(new java.awt.Color(0, 255, 0));
        celda02.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda02.setForeground(new java.awt.Color(0, 0, 0));

        celda12.setBackground(new java.awt.Color(0, 255, 0));
        celda12.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda12.setForeground(new java.awt.Color(0, 0, 0));

        celda22.setBackground(new java.awt.Color(0, 255, 0));
        celda22.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda22.setForeground(new java.awt.Color(0, 0, 0));

        celda32.setBackground(new java.awt.Color(0, 255, 0));
        celda32.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda32.setForeground(new java.awt.Color(0, 0, 0));

        celda42.setBackground(new java.awt.Color(0, 255, 0));
        celda42.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda42.setForeground(new java.awt.Color(0, 0, 0));

        celda52.setBackground(new java.awt.Color(0, 255, 0));
        celda52.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda52.setForeground(new java.awt.Color(0, 0, 0));

        celda62.setBackground(new java.awt.Color(0, 255, 0));
        celda62.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda62.setForeground(new java.awt.Color(0, 0, 0));

        celda03.setBackground(new java.awt.Color(0, 255, 0));
        celda03.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda03.setForeground(new java.awt.Color(0, 0, 0));

        celda13.setBackground(new java.awt.Color(0, 255, 0));
        celda13.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda13.setForeground(new java.awt.Color(0, 0, 0));

        celda23.setBackground(new java.awt.Color(0, 255, 0));
        celda23.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda23.setForeground(new java.awt.Color(0, 0, 0));

        celda33.setBackground(new java.awt.Color(0, 255, 0));
        celda33.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda33.setForeground(new java.awt.Color(0, 0, 0));

        celda43.setBackground(new java.awt.Color(0, 255, 0));
        celda43.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda43.setForeground(new java.awt.Color(0, 0, 0));

        celda53.setBackground(new java.awt.Color(0, 255, 0));
        celda53.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda53.setForeground(new java.awt.Color(0, 0, 0));

        celda63.setBackground(new java.awt.Color(0, 255, 0));
        celda63.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda63.setForeground(new java.awt.Color(0, 0, 0));

        celda04.setBackground(new java.awt.Color(0, 255, 0));
        celda04.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda04.setForeground(new java.awt.Color(0, 0, 0));

        celda14.setBackground(new java.awt.Color(0, 255, 0));
        celda14.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda14.setForeground(new java.awt.Color(0, 0, 0));

        celda24.setBackground(new java.awt.Color(0, 255, 0));
        celda24.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda24.setForeground(new java.awt.Color(0, 0, 0));

        celda34.setBackground(new java.awt.Color(0, 255, 0));
        celda34.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda34.setForeground(new java.awt.Color(0, 0, 0));

        celda44.setBackground(new java.awt.Color(0, 255, 0));
        celda44.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda44.setForeground(new java.awt.Color(0, 0, 0));

        celda54.setBackground(new java.awt.Color(0, 255, 0));
        celda54.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda54.setForeground(new java.awt.Color(0, 0, 0));

        celda64.setBackground(new java.awt.Color(0, 255, 0));
        celda64.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda64.setForeground(new java.awt.Color(0, 0, 0));

        celda05.setBackground(new java.awt.Color(0, 255, 0));
        celda05.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda05.setForeground(new java.awt.Color(0, 0, 0));

        celda15.setBackground(new java.awt.Color(0, 255, 0));
        celda15.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda15.setForeground(new java.awt.Color(0, 0, 0));

        celda25.setBackground(new java.awt.Color(0, 255, 0));
        celda25.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda25.setForeground(new java.awt.Color(0, 0, 0));

        celda35.setBackground(new java.awt.Color(0, 255, 0));
        celda35.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda35.setForeground(new java.awt.Color(0, 0, 0));

        celda45.setBackground(new java.awt.Color(0, 255, 0));
        celda45.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda45.setForeground(new java.awt.Color(0, 0, 0));

        celda55.setBackground(new java.awt.Color(0, 255, 0));
        celda55.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda55.setForeground(new java.awt.Color(0, 0, 0));

        celda65.setBackground(new java.awt.Color(0, 255, 0));
        celda65.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda65.setForeground(new java.awt.Color(0, 0, 0));

        celda06.setBackground(new java.awt.Color(0, 255, 0));
        celda06.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda06.setForeground(new java.awt.Color(0, 0, 0));

        celda16.setBackground(new java.awt.Color(0, 255, 0));
        celda16.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda16.setForeground(new java.awt.Color(0, 0, 0));

        celda26.setBackground(new java.awt.Color(0, 255, 0));
        celda26.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda26.setForeground(new java.awt.Color(0, 0, 0));

        celda36.setBackground(new java.awt.Color(0, 255, 0));
        celda36.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda36.setForeground(new java.awt.Color(0, 0, 0));

        celda46.setBackground(new java.awt.Color(0, 255, 0));
        celda46.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda46.setForeground(new java.awt.Color(0, 0, 0));

        celda56.setBackground(new java.awt.Color(0, 255, 0));
        celda56.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda56.setForeground(new java.awt.Color(0, 0, 0));

        celda66.setBackground(new java.awt.Color(0, 255, 0));
        celda66.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda66.setForeground(new java.awt.Color(0, 0, 0));

        celda07.setBackground(new java.awt.Color(0, 255, 0));
        celda07.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda07.setForeground(new java.awt.Color(0, 0, 0));

        celda17.setBackground(new java.awt.Color(0, 255, 0));
        celda17.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda17.setForeground(new java.awt.Color(0, 0, 0));

        celda27.setBackground(new java.awt.Color(0, 255, 0));
        celda27.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda27.setForeground(new java.awt.Color(0, 0, 0));

        celda37.setBackground(new java.awt.Color(0, 255, 0));
        celda37.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda37.setForeground(new java.awt.Color(0, 0, 0));

        celda47.setBackground(new java.awt.Color(0, 255, 0));
        celda47.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda47.setForeground(new java.awt.Color(0, 0, 0));

        celda57.setBackground(new java.awt.Color(0, 255, 0));
        celda57.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda57.setForeground(new java.awt.Color(0, 0, 0));

        celda67.setBackground(new java.awt.Color(0, 255, 0));
        celda67.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        celda67.setForeground(new java.awt.Color(0, 0, 0));

        labelContadorZombies.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        labelContadorZombies.setForeground(new java.awt.Color(255, 255, 255));

        labelTurno.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        labelTurno.setForeground(new java.awt.Color(255, 255, 255));

        labelSoles.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        labelSoles.setForeground(new java.awt.Color(255, 255, 255));

        botonAyuda.setBackground(new java.awt.Color(102, 102, 102));
        botonAyuda.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        botonAyuda.setForeground(new java.awt.Color(255, 255, 255));
        botonAyuda.setText("AYUDA");
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel13)
                .addGap(80, 80, 80)
                .addComponent(jLabel14)
                .addGap(86, 86, 86)
                .addComponent(jLabel15)
                .addGap(84, 84, 84)
                .addComponent(jLabel16)
                .addGap(87, 87, 87)
                .addComponent(jLabel17)
                .addGap(85, 85, 85)
                .addComponent(jLabel18)
                .addGap(83, 83, 83)
                .addComponent(jLabel19)
                .addGap(96, 96, 96)
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(celda10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda40, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda50, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda60, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda00, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(celda61, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda62, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(celda21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(celda31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(celda22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(celda32, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(celda41, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(celda51, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(celda42, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(celda52, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(celda11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(celda01, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(celda02, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(celda12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(celda63, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda03, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(celda44, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda45, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda46, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda47, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(celda34, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda35, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda37, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(celda04, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celda14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(celda05, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celda15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(celda06, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celda16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(celda07, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celda17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(celda24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celda27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(celda64, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celda54, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(celda55, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(celda56, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(celda57, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(celda65, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(celda66, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(celda67, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelContadorZombies, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(labelSoles, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(labelTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BotonPasarTurno)))
                            .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonInsertarComando, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(lectorComando))
                        .addGap(30, 30, 30))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {celda00, celda01, celda02, celda03, celda04, celda05, celda06, celda07, celda10, celda11, celda12, celda13, celda14, celda15, celda16, celda17, celda20, celda21, celda22, celda23, celda24, celda25, celda26, celda27, celda30, celda31, celda32, celda33, celda34, celda35, celda36, celda37, celda40, celda41, celda42, celda43, celda44, celda45, celda46, celda47, celda50, celda51, celda52, celda53, celda54, celda55, celda56, celda57, celda60, celda61, celda62, celda63, celda64, celda65, celda66, celda67});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel14))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celda06, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda05, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelContadorZombies, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(celda01, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda00, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda02, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda03, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda04, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda07, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BotonPasarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(celda12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(celda13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(celda14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(celda15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(celda16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(celda17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(celda10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(celda11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 12, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celda27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(celda37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celda36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celda35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celda30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celda31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celda32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celda33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celda34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lectorComando, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(celda41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celda57, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda56, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda55, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda54, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda52, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda51, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addComponent(BotonInsertarComando))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(celda47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celda60, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda61, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda62, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda63, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda64, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda65, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda66, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda67, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)))
                        .addGap(37, 37, 37))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {celda00, celda01, celda02, celda03, celda04, celda05, celda06, celda07, celda10, celda11, celda12, celda13, celda14, celda15, celda16, celda17, celda20, celda21, celda22, celda23, celda24, celda25, celda26, celda27, celda30, celda31, celda32, celda33, celda34, celda35, celda36, celda37, celda40, celda41, celda42, celda43, celda44, celda45, celda46, celda47, celda50, celda51, celda52, celda53, celda54, celda55, celda56, celda57, celda60, celda61, celda62, celda63, celda64, celda65, celda66, celda67});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "¿Realmente desea salir del juego?", "Perderás todo el progreso.", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        new VentanaInicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void BotonPasarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPasarTurnoActionPerformed
        // TODO add your handling code here:
        try {
            if (tablero.getTurno() < 30) {
                if (!(tablero.zombiesLlegan())) {
                    tablero.sumarGirasoles(); //Se suman los soles cada dos turnos
                    tablero.ataquePlanta();  //Las plantas atacan
                    tablero.ataqueZombie(); //Los zombies atacan
                    tablero.moverZombie(); //Los zombies se mueven
                    if (tablero.getContadorZombies() > 0) {
                        tablero.insertarZombieAleatorio(); //Metemos zombies nuevos    
                    }
                    tablero.limpiarTablero(); //Limpiamos el tablero
                    tablero.comprobarVictoria();
                    tablero.setTurno(tablero.getTurno() + 1); //Aumentamos el turno
                    this.imprimirTablero();
                } else {
                    JOptionPane.showMessageDialog(this, "¡Has perdido! Los zombies han llegado a tu casa.", "DERROTA", JOptionPane.PLAIN_MESSAGE);
                    new VentanaInicio().setVisible(true);
                    dispose();
                }
            } else {
                if (tablero.isVictoria()) {
                    JOptionPane.showMessageDialog(this, "¡Has ganado! Han ganado las plantas.", "VICTORIA", JOptionPane.PLAIN_MESSAGE);
                    this.darPuntos();
                    BBDDJuego.guardarDatos();
                    new VentanaInicio().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "¡Has perdido! Han ganado los zombies.", "DERROTA", JOptionPane.PLAIN_MESSAGE);
                    new VentanaInicio().setVisible(true);
                    dispose();
                }
            }
        } catch (Exception ej) {
            JOptionPane.showMessageDialog(this, "Error:" + ej.toString(), "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonPasarTurnoActionPerformed

    private void BotonInsertarComandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarComandoActionPerformed

        try {
            String comando = lectorComando.getText();

            //if (!(tablero.comprobarComando(comando))) {
            if (!(tablero.comprobarPosicionMatriz(comando))) {
                tablero.actualizarTablero(comando);
            } else {
                throw new ExcepcionJuego(ExcepcionJuego.NO_EXISTE_POSICION);
            }
            //} else {
            //throw new ExcepcionJuego(ExcepcionJuego.ERROR_COMANDO);
            //}
        } catch (Exception x) {
            JOptionPane.showMessageDialog(this, "Error:" + x.toString(), "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }

        this.imprimirTablero();
        lectorComando.setText("");
    }//GEN-LAST:event_BotonInsertarComandoActionPerformed

    private void lectorComandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectorComandoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_lectorComandoActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        // TODO add your handling code here:
        new VentanaAyuda().setVisible(true);
    }//GEN-LAST:event_botonAyudaActionPerformed

    /*
    El método darPuntos otorga puntos si el jugador ha ganado.
    */
    public void darPuntos() {

        BBDDJuego.cargarDatos();
        //Si te has registrado:
        if (VentanaRegistro.isInicioSes()) {
            for (int i = 0; i < tablero.getFilas(); i++) {
                for (int j = 0; j < tablero.getColumnas(); j++) {
                    if (tablero.getMatrizTablero()[i][j].getNPC() instanceof Girasol
                            || tablero.getMatrizTablero()[i][j].getNPC() instanceof LanzaGuisantes
                            || tablero.getMatrizTablero()[i][j].getNPC() instanceof Petacereza
                            || tablero.getMatrizTablero()[i][j].getNPC() instanceof Nuez) {
                        VentanaRegistro.jugadorAc.setPuntos(VentanaRegistro.jugadorAc.getPuntos() + 1);
                    }
                }
            }
            VentanaRegistro.jugadorAc.setPuntos(VentanaRegistro.jugadorAc.getPuntos() + tablero.getSoles());
            BBDDJuego.jugadoresR.replace(VentanaRegistro.jugadorAc.getDNI(), VentanaRegistro.jugadorAc);
        }
        //Si vienes de un jugadoe ya registrado:
        if (VentanaIniciarSesion.isInicioSes()) {
            for (int i = 0; i < tablero.getFilas(); i++) {
                for (int j = 0; j < tablero.getColumnas(); j++) {
                    if (tablero.getMatrizTablero()[i][j].getNPC() instanceof Girasol
                            || tablero.getMatrizTablero()[i][j].getNPC() instanceof LanzaGuisantes
                            || tablero.getMatrizTablero()[i][j].getNPC() instanceof Petacereza
                            || tablero.getMatrizTablero()[i][j].getNPC() instanceof Nuez) {
                        VentanaIniciarSesion.jugadorReg.setPuntos(VentanaIniciarSesion.jugadorReg.getPuntos() + 1);
                    }
                }
            }
            VentanaIniciarSesion.jugadorReg.setPuntos(VentanaIniciarSesion.jugadorReg.getPuntos() + tablero.getSoles());
            BBDDJuego.jugadoresR.replace(VentanaIniciarSesion.jugadorReg.getDNI(), VentanaIniciarSesion.jugadorReg);
            BBDDJuego.guardarDatos();
        }
    }

    /*
     Esta funcion imprime el tablero en la interfaz
     */
    public void imprimirTablero() {

        this.labelContadorZombies.setText(Integer.toString(tablero.getContadorZombies()));
        this.labelSoles.setText(Integer.toString(tablero.getSoles()));
        this.labelTurno.setText(Integer.toString(tablero.getTurno()));

        this.celda00.setText(tablero.getMatrizTablero()[0][0].toString());
        this.celda01.setText(tablero.getMatrizTablero()[0][1].toString());
        this.celda02.setText(tablero.getMatrizTablero()[0][2].toString());
        this.celda03.setText(tablero.getMatrizTablero()[0][3].toString());
        this.celda04.setText(tablero.getMatrizTablero()[0][4].toString());
        this.celda05.setText(tablero.getMatrizTablero()[0][5].toString());
        this.celda06.setText(tablero.getMatrizTablero()[0][6].toString());
        this.celda07.setText(tablero.getMatrizTablero()[0][7].toString());
        this.celda10.setText(tablero.getMatrizTablero()[1][0].toString());
        this.celda11.setText(tablero.getMatrizTablero()[1][1].toString());
        this.celda12.setText(tablero.getMatrizTablero()[1][2].toString());
        this.celda13.setText(tablero.getMatrizTablero()[1][3].toString());
        this.celda14.setText(tablero.getMatrizTablero()[1][4].toString());
        this.celda15.setText(tablero.getMatrizTablero()[1][5].toString());
        this.celda16.setText(tablero.getMatrizTablero()[1][6].toString());
        this.celda17.setText(tablero.getMatrizTablero()[1][7].toString());
        this.celda20.setText(tablero.getMatrizTablero()[2][0].toString());
        this.celda21.setText(tablero.getMatrizTablero()[2][1].toString());
        this.celda22.setText(tablero.getMatrizTablero()[2][2].toString());
        this.celda23.setText(tablero.getMatrizTablero()[2][3].toString());
        this.celda24.setText(tablero.getMatrizTablero()[2][4].toString());
        this.celda25.setText(tablero.getMatrizTablero()[2][5].toString());
        this.celda26.setText(tablero.getMatrizTablero()[2][6].toString());
        this.celda27.setText(tablero.getMatrizTablero()[2][7].toString());
        this.celda30.setText(tablero.getMatrizTablero()[3][0].toString());
        this.celda31.setText(tablero.getMatrizTablero()[3][1].toString());
        this.celda32.setText(tablero.getMatrizTablero()[3][2].toString());
        this.celda33.setText(tablero.getMatrizTablero()[3][3].toString());
        this.celda34.setText(tablero.getMatrizTablero()[3][4].toString());
        this.celda35.setText(tablero.getMatrizTablero()[3][5].toString());
        this.celda36.setText(tablero.getMatrizTablero()[3][6].toString());
        this.celda37.setText(tablero.getMatrizTablero()[3][7].toString());
        this.celda40.setText(tablero.getMatrizTablero()[4][0].toString());
        this.celda41.setText(tablero.getMatrizTablero()[4][1].toString());
        this.celda42.setText(tablero.getMatrizTablero()[4][2].toString());
        this.celda43.setText(tablero.getMatrizTablero()[4][3].toString());
        this.celda44.setText(tablero.getMatrizTablero()[4][4].toString());
        this.celda45.setText(tablero.getMatrizTablero()[4][5].toString());
        this.celda46.setText(tablero.getMatrizTablero()[4][6].toString());
        this.celda47.setText(tablero.getMatrizTablero()[4][7].toString());
        this.celda50.setText(tablero.getMatrizTablero()[5][0].toString());
        this.celda51.setText(tablero.getMatrizTablero()[5][1].toString());
        this.celda52.setText(tablero.getMatrizTablero()[5][2].toString());
        this.celda53.setText(tablero.getMatrizTablero()[5][3].toString());
        this.celda54.setText(tablero.getMatrizTablero()[5][4].toString());
        this.celda55.setText(tablero.getMatrizTablero()[5][5].toString());
        this.celda56.setText(tablero.getMatrizTablero()[5][6].toString());
        this.celda57.setText(tablero.getMatrizTablero()[5][7].toString());
        this.celda60.setText(tablero.getMatrizTablero()[6][0].toString());
        this.celda61.setText(tablero.getMatrizTablero()[6][1].toString());
        this.celda62.setText(tablero.getMatrizTablero()[6][2].toString());
        this.celda63.setText(tablero.getMatrizTablero()[6][3].toString());
        this.celda64.setText(tablero.getMatrizTablero()[6][4].toString());
        this.celda65.setText(tablero.getMatrizTablero()[6][5].toString());
        this.celda66.setText(tablero.getMatrizTablero()[6][6].toString());
        this.celda67.setText(tablero.getMatrizTablero()[6][7].toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInsertarComando;
    private javax.swing.JButton BotonPasarTurno;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel celda00;
    private javax.swing.JLabel celda01;
    private javax.swing.JLabel celda02;
    private javax.swing.JLabel celda03;
    private javax.swing.JLabel celda04;
    private javax.swing.JLabel celda05;
    private javax.swing.JLabel celda06;
    private javax.swing.JLabel celda07;
    private javax.swing.JLabel celda10;
    private javax.swing.JLabel celda11;
    private javax.swing.JLabel celda12;
    private javax.swing.JLabel celda13;
    private javax.swing.JLabel celda14;
    private javax.swing.JLabel celda15;
    private javax.swing.JLabel celda16;
    private javax.swing.JLabel celda17;
    private javax.swing.JLabel celda20;
    private javax.swing.JLabel celda21;
    private javax.swing.JLabel celda22;
    private javax.swing.JLabel celda23;
    private javax.swing.JLabel celda24;
    private javax.swing.JLabel celda25;
    private javax.swing.JLabel celda26;
    private javax.swing.JLabel celda27;
    private javax.swing.JLabel celda30;
    private javax.swing.JLabel celda31;
    private javax.swing.JLabel celda32;
    private javax.swing.JLabel celda33;
    private javax.swing.JLabel celda34;
    private javax.swing.JLabel celda35;
    private javax.swing.JLabel celda36;
    private javax.swing.JLabel celda37;
    private javax.swing.JLabel celda40;
    private javax.swing.JLabel celda41;
    private javax.swing.JLabel celda42;
    private javax.swing.JLabel celda43;
    private javax.swing.JLabel celda44;
    private javax.swing.JLabel celda45;
    private javax.swing.JLabel celda46;
    private javax.swing.JLabel celda47;
    private javax.swing.JLabel celda50;
    private javax.swing.JLabel celda51;
    private javax.swing.JLabel celda52;
    private javax.swing.JLabel celda53;
    private javax.swing.JLabel celda54;
    private javax.swing.JLabel celda55;
    private javax.swing.JLabel celda56;
    private javax.swing.JLabel celda57;
    private javax.swing.JLabel celda60;
    private javax.swing.JLabel celda61;
    private javax.swing.JLabel celda62;
    private javax.swing.JLabel celda63;
    private javax.swing.JLabel celda64;
    private javax.swing.JLabel celda65;
    private javax.swing.JLabel celda66;
    private javax.swing.JLabel celda67;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelContadorZombies;
    private javax.swing.JLabel labelSoles;
    private javax.swing.JLabel labelTurno;
    private javax.swing.JTextField lectorComando;
    // End of variables declaration//GEN-END:variables
}
