
package BingoGui;

import java.awt.ComponentOrientation;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {
    
    public Interfaz() {
        initComponents();
        llenarArray();
        setLocationRelativeTo(null);
    }

    //VARIABLES
    static int NumeroEnPantalla;
    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    private String Resultados="";
    static int contador;
    //VARIABLES
    
    //Funciones
    /*
    Funcion que llena el array con los numeros desde el cero hasta el 100
    incluidos para luego llamarlos con el boton.
    */
    public void llenarArray(){
        for(int i=0;i<= 100; i++){
            numeros.add(i);
        }
    }
    
    /*
    Funcion que elige un numero aleatorio dentro del array y despues lo saca 
    para que no se repitan los numeros dentro de la misma partida
    */
    public void elegirNumero(){
        if(numeros.size()==0){
            JOptionPane.showMessageDialog(null, "Ya no quedan mas numeros!\n"
                    + "Para jugar de nuevo apreta Reiniciar");
            generar.setEnabled(false);
            
        }
        int NumeroRandom= (int) (Math.random()* numeros.size());
        NumeroEnPantalla=numeros.get(NumeroRandom);
        lblNumero.setText(String.valueOf(NumeroEnPantalla));
        numeros.remove(NumeroRandom);
        contador++;
    }
    
    
   
    //Funciones
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistroNumeros = new javax.swing.JTextArea();
        lblNumero = new javax.swing.JLabel();
        generar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BINGO");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(getIconImage());
        setName("Bingo"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1070, 654));
        setResizable(false);
        setSize(new java.awt.Dimension(1070, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1070, 654));

        RegistroNumeros.setEditable(false);
        RegistroNumeros.setBackground(new java.awt.Color(255, 255, 51));
        RegistroNumeros.setColumns(1);
        RegistroNumeros.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        RegistroNumeros.setForeground(new java.awt.Color(0, 0, 0));
        RegistroNumeros.setRows(5);
        RegistroNumeros.setBorder(null);
        RegistroNumeros.setLineWrap(true);
        jScrollPane1.setViewportView(RegistroNumeros);

        lblNumero.setBackground(new java.awt.Color(255, 255, 0));
        lblNumero.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 100)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(0, 0, 0));
        lblNumero.setBorder(new javax.swing.border.MatteBorder(null));
        lblNumero.setFocusable(false);
        lblNumero.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        lblNumero.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lblNumero.setOpaque(true);

        generar.setBackground(new java.awt.Color(255, 255, 51));
        generar.setForeground(new java.awt.Color(0, 0, 0));
        generar.setText("Sacar Numero");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bingo/1464047903.gif"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Reiniciar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generar, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(generar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1070, 654);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        elegirNumero();
        Resultados=Resultados+NumeroEnPantalla+"-";
        RegistroNumeros.setText(Resultados);
        
        
      
        
    }//GEN-LAST:event_generarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Interfaz i = new Interfaz();
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    
    
//MAIN
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea RegistroNumeros;
    private javax.swing.JButton generar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumero;
    // End of variables declaration//GEN-END:variables
}
