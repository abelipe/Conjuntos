package proyecto;
import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;


public class conjuntos extends javax.swing.JFrame {
   public conjuntos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("SubConjunto D");

        jButton1.setText("Generar aleatoriamente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ingresar datos manualmente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Union");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Interseccion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Complemento");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Resta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("SubConjunto A");

        jLabel3.setBackground(new java.awt.Color(153, 255, 153));
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("SubConjunto B");

        jLabel4.setBackground(new java.awt.Color(153, 255, 153));
        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        jLabel4.setText("SubConjunto C");

        jLabel5.setBackground(new java.awt.Color(153, 255, 153));
        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        jLabel5.setText("Conjunto Universal");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        jButton7.setText("Borrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Graficar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);

        jLabel6.setBackground(new java.awt.Color(153, 255, 153));
        jLabel6.setForeground(new java.awt.Color(0, 255, 204));
        jLabel6.setText("RESULTADOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(jButton6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton4)
                                            .addComponent(jButton7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton8)
                                            .addComponent(jButton5)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int vu[] = new int[20];
        int va[] = new int[5];
        int vb[] = new int[5];
        int vc[] = new int[5];
        int vd[] = new int[5];
        int nRan;
        int nRan1;
        int nRan2;
        int nRan3;
        int nRan4;
        String strvu = "";
        String strva = "";
        String strvb = "";
        String strvc = "";
        String strvd = "";
        Random ran = new Random();
        Set<Integer> nUnicos = new HashSet<>();
        Set<Integer> nUnicos1 = new HashSet<>();
        Set<Integer> nUnicos2 = new HashSet<>();
        Set<Integer> nUnicos3 = new HashSet<>();
        Set<Integer> nUnicos4 = new HashSet<>();
        for (int i = 0;i<vu.length;i++){
            do {
            nRan = ran.nextInt(40);
            } while (!nUnicos.add(nRan));
            vu[i] = nRan;
        }
        for (int i=0;i<va.length;i++){
            do{
                nRan1 = ran.nextInt(19);
            } while (!nUnicos1.add(nRan1));
        va[i]= vu[nRan1];
        }
        for (int i=0;i<va.length;i++){
            do{
                nRan2 = ran.nextInt(19);
            } while (!nUnicos2.add(nRan2));
        vb[i]= vu[nRan2];
        }
        for (int i=0;i<va.length;i++){
            do{
                nRan3 = ran.nextInt(19);
            } while (!nUnicos3.add(nRan3));
        vc[i]= vu[nRan3];
        }
        for (int i=0;i<va.length;i++){
            do{
                nRan4 = ran.nextInt(19);
            } while (!nUnicos4.add(nRan4));
        vd[i]= vu[nRan4];
        }
        for (int g = 0;g<vu.length;g++){
            strvu+= vu[g] + ",";
        }
        for (int g = 0;g<va.length;g++){
            strva+= va[g] + ",";
            strvb+= vb[g] + ",";
            strvc+= vc[g] + ",";
            strvd+= vd[g] + ",";
        }
        jTextField1.setText(strvu);
        jTextField2.setText(strva);
        jTextField3.setText(strvb);
        jTextField4.setText(strvc);
        jTextField5.setText(strvd);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int u = 20;
        int a = 5;
        int b = 5;
        int c = 5;
        int d = 5;
        int vu[] = new int[u];
        int va[] = new int[a];
        int vb[] = new int[b];
        int vc[] = new int[c];
        int vd[] = new int[d];
        int n;
        String strvu = "";
        String strva = "";
        String strvb = "";
        String strvc = "";
        String strvd = "";
        Set<Integer> nUnicos = new HashSet<>();
        Set<Integer> nUnicosa = new HashSet<>();
        Set<Integer> nUnicosb = new HashSet<>();
        Set<Integer> nUnicosc = new HashSet<>();
        Set<Integer> nUnicosd = new HashSet<>();
        String input;
        for (int i = 0;i<u;){
            do {
            input = JOptionPane.showInputDialog("Ingresa un numero para el conjunto universal: ");
            n = Integer.parseInt(input);
            } while (!nUnicos.add(n));
            vu[i] = n;
            i++;
        }
        for (int i = 0;i<a;){
            do {
            input = JOptionPane.showInputDialog("Ingresa un numero para el conjunto A: ");
            n = Integer.parseInt(input);
            } while (!nUnicosa.add(n));
            va[i] = n;
            i++;
        }
        for (int i = 0;i<b;){
            do {
            input = JOptionPane.showInputDialog("Ingresa un numero para el conjunto B: ");
            n = Integer.parseInt(input);
            } while (!nUnicosb.add(n));
            vb[i] = n;
            i++;
        }
        for (int i = 0;i<c;){
            do {
            input = JOptionPane.showInputDialog("Ingresa un numero para el conjunto C: ");
            n = Integer.parseInt(input);
            } while (!nUnicosc.add(n));
            vc[i] = n;
            i++;
        }
        for (int i = 0;i<d;){
            do {
            input = JOptionPane.showInputDialog("Ingresa un numero para el conjunto D: ");
            n = Integer.parseInt(input);
            } while (!nUnicosd.add(n));
            vd[i] = n;
            i++;
        }
        for (int g = 0;g<vu.length;g++){
            strvu+= vu[g] + ",";
        }
        for (int g = 0;g<va.length;g++){
            strva+= va[g] + ",";
            strvb+= vb[g] + ",";
            strvc+= vc[g] + ",";
            strvd+= vd[g] + ",";
        }
        jTextField1.setText(strvu);
        jTextField2.setText(strva);
        jTextField3.setText(strvb);
        jTextField4.setText(strvc);
        jTextField5.setText(strvd);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String inputa = jTextField2.getText();
        String inputb = jTextField3.getText();
        String inputc = jTextField4.getText();
        String inputd = jTextField5.getText();
        ArrayList<Integer> va = new ArrayList<>();
        ArrayList<Integer> vb = new ArrayList<>();
        ArrayList<Integer> vc = new ArrayList<>();
        ArrayList<Integer> vd = new ArrayList<>();
        ArrayList<Integer> union = new ArrayList<>();
        String[] digitsa = inputa.split(",");
        String[] digitsb = inputb.split(",");
        String[] digitsc = inputc.split(",");
        String[] digitsd = inputd.split(",");
        for (String digitaStr : digitsa) {
            int digit = Integer.parseInt(digitaStr.trim());
            va.add(digit);
        }
        for (String digitbStr : digitsb) {
            int digit = Integer.parseInt(digitbStr.trim());
            vb.add(digit);
        }
        for (String digitcStr : digitsc) {
            int digit = Integer.parseInt(digitcStr.trim());
            vc.add(digit);
        }
        for (String digitdStr : digitsd) {
            int digit = Integer.parseInt(digitdStr.trim());
            vd.add(digit);
        }
        union.addAll(va);
        union.addAll(vb);
        union.addAll(vc);
        union.addAll(vd);
        Set<Integer> limpiar = new HashSet<>(union);
        union.clear();
        union.addAll(limpiar);
        jTextField6.setText(union.toString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            
        String input = jTextField1.getText();
        String inputa = jTextField2.getText();
        String inputb = jTextField3.getText();
        String inputc = jTextField4.getText();
        String inputd = jTextField5.getText();
        ArrayList<Integer> vu = new ArrayList<>();
        ArrayList<Integer> va = new ArrayList<>();
        ArrayList<Integer> vb = new ArrayList<>();
        ArrayList<Integer> vc = new ArrayList<>();
        ArrayList<Integer> vd = new ArrayList<>();
        ArrayList<Integer> interseccion = new ArrayList<>();
        String[] digits = input.split(",");
        String[] digitsa = inputa.split(",");
        String[] digitsb = inputb.split(",");
        String[] digitsc = inputc.split(",");
        String[] digitsd = inputd.split(",");
        for (String digitStr : digits) {
            int digit = Integer.parseInt(digitStr.trim());
            vu.add(digit);
        }
        for (String digitaStr : digitsa) {
            int digit = Integer.parseInt(digitaStr.trim());
            va.add(digit);
        }
        for (String digitbStr : digitsb) {
            int digit = Integer.parseInt(digitbStr.trim());
            vb.add(digit);
        }
        for (String digitcStr : digitsc) {
            int digit = Integer.parseInt(digitcStr.trim());
            vc.add(digit);
        }
        for (String digitdStr : digitsd) {
            int digit = Integer.parseInt(digitdStr.trim());
            vd.add(digit);
        }
        Set<Integer> intersecciona = new HashSet<>(va);
        intersecciona.retainAll(vb);
        intersecciona.retainAll(vc);
        intersecciona.retainAll(vd);
        interseccion.addAll(intersecciona);
        jTextField6.setText(interseccion.toString());
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String input = jTextField1.getText();
        String inputa = jTextField2.getText();
        String inputb = jTextField3.getText();
        String inputc = jTextField4.getText();
        String inputd = jTextField5.getText();
        ArrayList<Integer> vu = new ArrayList<>();
        ArrayList<Integer> va = new ArrayList<>();
        ArrayList<Integer> vb = new ArrayList<>();
        ArrayList<Integer> vc = new ArrayList<>();
        ArrayList<Integer> vd = new ArrayList<>();
        ArrayList<Integer> vf = new ArrayList<>();
        String[] digits = input.split(",");
        String[] digitsa = inputa.split(",");
        String[] digitsb = inputb.split(",");
        String[] digitsc = inputc.split(",");
        String[] digitsd = inputd.split(",");
        JOptionPane.showMessageDialog(null,"opcion 1: A \n"+"opcion 2: B \n"+"opcion 3: C \n"
                +"opcion 4: D \n","OPCIONES", JOptionPane.OK_OPTION);
        String a = JOptionPane.showInputDialog("Ingresa que subconjunto quieres complementar 1, 2, 3 o 4: ");
        int n = Integer.parseInt(a);
        for (String digitStr : digits) {
            int digit = Integer.parseInt(digitStr.trim());
            vu.add(digit);
        }
        for (String digitaStr : digitsa) {
            int digit = Integer.parseInt(digitaStr.trim());
            va.add(digit);
        }
        for (String digitbStr : digitsb) {
            int digit = Integer.parseInt(digitbStr.trim());
            vb.add(digit);
        }
        for (String digitcStr : digitsc) {
            int digit = Integer.parseInt(digitcStr.trim());
            vc.add(digit);
        }
        for (String digitdStr : digitsd) {
            int digit = Integer.parseInt(digitdStr.trim());
            vd.add(digit);
        }
        if (n == 1){
            vf.addAll(vu);
            vf.removeAll(va);
        }
        if (n == 2){
            vf.addAll(vu);
            vf.removeAll(vb);
        }
        if (n == 3){
            vf.addAll(vu);
            vf.removeAll(vc);
        }
        if (n == 4){
            vf.addAll(vu);
            vf.removeAll(vd);
        }
        jTextField6.setText(vf.toString());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String input = jTextField1.getText();
        String inputa = jTextField2.getText();
        String inputb = jTextField3.getText();
        String inputc = jTextField4.getText();
        String inputd = jTextField5.getText();
        ArrayList<Integer> vu = new ArrayList<>();
        ArrayList<Integer> va = new ArrayList<>();
        ArrayList<Integer> vb = new ArrayList<>();
        ArrayList<Integer> vc = new ArrayList<>();
        ArrayList<Integer> vd = new ArrayList<>();
        ArrayList<Integer> vf = new ArrayList<>();
        String[] digits = input.split(",");
        String[] digitsa = inputa.split(",");
        String[] digitsb = inputb.split(",");
        String[] digitsc = inputc.split(",");
        String[] digitsd = inputd.split(",");
        JOptionPane.showMessageDialog(null,"opcion 1:A-B \n"+"opcion 2:A-C \n"+"opcion 3:A-D \n"
                +"opcion 4:B-A \n"+"opcion 5:B-C \n"+"opcion 6:B-D \n"+"opcion 7:C-A \n"+"opcion 8:C-B \n"
                +"opcion 9:C-D \n"+"opcion 10:D-A \n"+"opcion 11:D-B \n"+"opcion 12:D-C \n","OPCIONES", JOptionPane.OK_OPTION);
        String a = JOptionPane.showInputDialog("Ingresa cual de las opciones: ");
        int n = Integer.parseInt(a);
        for (String digitStr : digits) {
            int digit = Integer.parseInt(digitStr.trim());
            vu.add(digit);
        }
        for (String digitaStr : digitsa) {
            int digit = Integer.parseInt(digitaStr.trim());
            va.add(digit);
        }
        for (String digitbStr : digitsb) {
            int digit = Integer.parseInt(digitbStr.trim());
            vb.add(digit);
        }
        for (String digitcStr : digitsc) {
            int digit = Integer.parseInt(digitcStr.trim());
            vc.add(digit);
        }
        for (String digitdStr : digitsd) {
            int digit = Integer.parseInt(digitdStr.trim());
            vd.add(digit);
        }
        if (n == 1){
            vf.addAll(va);
            vf.removeAll(vb);
        }
        if (n == 2){
            vf.addAll(va);
            vf.removeAll(vc);
        }
        if (n == 3){
            vf.addAll(va);
            vf.removeAll(vd);
        }
        if (n == 4){
            vf.addAll(vb);
            vf.removeAll(va);
        }
        if (n == 5){
            vf.addAll(vb);
            vf.removeAll(vc);
        }
        if (n == 6){
            vf.addAll(vb);
            vf.removeAll(vd);
        }
        if (n == 7){
            vf.addAll(vc);
            vf.removeAll(va);
        }
        if (n == 8){
            vf.addAll(vc);
            vf.removeAll(vb);
        }
        if (n == 9){
            vf.addAll(vc);
            vf.removeAll(vd);
        }
        if (n == 10){
            vf.addAll(vd);
            vf.removeAll(va);
        }
        if (n == 11){
            vf.addAll(vd);
            vf.removeAll(vb);
        }
        if (n == 12){
            vf.addAll(vd);
            vf.removeAll(vc);
        } 
        if (a == ""){
        }else{
        }
        jTextField6.setText(vf.toString());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:;
    }//GEN-LAST:event_jButton8ActionPerformed
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conjuntos().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
