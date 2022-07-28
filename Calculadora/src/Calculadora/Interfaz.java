
package Calculadora;

 
public class Interfaz extends javax.swing.JFrame {

    double dato=0;
    int operacion;
    double dato1=0;
    double dato2=0;
    String Cadena = "";
    String Operador1= "";
   public void numeros (String dato){
       
       Cadena= Cadena+dato;
   }
   public void habilitar (){
       Resultado.setText(Double.toString(dato));
            Operacion.setText("0");
            Cadena= Double.toString(dato);
          resta.setEnabled(true);
            multiplicacion.setEnabled(true);
            division.setEnabled(true);
            cuadrado.setEnabled(true);
            raiz.setEnabled(true);
            porcentaje.setEnabled(true);
            sumaa.setEnabled(true);
   }
   
    public Interfaz() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Resultado = new javax.swing.JTextField();
        Operacion = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        cuadrado = new javax.swing.JButton();
        sumaa = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        division = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        porcentaje = new javax.swing.JButton();
        Igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA");
        setBounds(new java.awt.Rectangle(200, 200, 200, 150));

        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        Resultado.setEditable(false);
        Resultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Resultado.setMinimumSize(new java.awt.Dimension(20, 22));
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        jPanel1.add(Resultado, gridBagConstraints);

        Operacion.setEditable(false);
        Operacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Operacion.setForeground(new java.awt.Color(51, 0, 0));
        Operacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Operacion.setText("0");
        Operacion.setMinimumSize(new java.awt.Dimension(20, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(Operacion, gridBagConstraints);

        borrar.setText("CE");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(borrar, gridBagConstraints);

        raiz.setText("SQR");
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(raiz, gridBagConstraints);

        cuadrado.setText("^ ");
        cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(cuadrado, gridBagConstraints);

        sumaa.setText("+");
        sumaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 3.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        jPanel1.add(sumaa, gridBagConstraints);

        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(uno, gridBagConstraints);

        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(dos, gridBagConstraints);

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(tres, gridBagConstraints);

        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(resta, gridBagConstraints);

        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(cuatro, gridBagConstraints);

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(cinco, gridBagConstraints);

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(seis, gridBagConstraints);

        multiplicacion.setText("X");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(multiplicacion, gridBagConstraints);

        siete.setText("7");
        siete.setMaximumSize(new java.awt.Dimension(22, 22));
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel1.add(siete, gridBagConstraints);

        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(ocho, gridBagConstraints);

        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(nueve, gridBagConstraints);

        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(division, gridBagConstraints);

        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(cero, gridBagConstraints);

        porcentaje.setText("%");
        porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(porcentaje, gridBagConstraints);

        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(Igual, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        dato=0;
        dato1=0;
        dato2=0;
        Cadena="";
        operacion=0;
        Operacion.setText("0");
        Resultado.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        numeros("1");
       Operacion.setText(Cadena);
        
    }//GEN-LAST:event_unoActionPerformed

    private void cuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoActionPerformed
       operacion=5;
       dato1=Double.parseDouble(Cadena);
        numeros(" ^ ");
        Resultado.setText(Cadena);
        Cadena="";
        resta.setEnabled(false);
       multiplicacion.setEnabled(false);
       division.setEnabled(false);
       sumaa.setEnabled(false);
       raiz.setEnabled(false);
       porcentaje.setEnabled(false);
    }//GEN-LAST:event_cuadradoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
         numeros("2");
         Operacion.setText(Cadena);
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
         numeros("3");
         Operacion.setText(Cadena);
    }//GEN-LAST:event_tresActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        operacion=6;
       dato1=Double.parseDouble(Cadena);
        numeros(" SQR ");
        Resultado.setText(Cadena);
        Cadena="";
        resta.setEnabled(false);
       multiplicacion.setEnabled(false);
       division.setEnabled(false);
       cuadrado.setEnabled(false);
       sumaa.setEnabled(false);
       porcentaje.setEnabled(false);
    }//GEN-LAST:event_raizActionPerformed

    private void sumaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaaActionPerformed
       operacion=1;
        dato1= Double.parseDouble(Cadena);
       numeros(" + ");        
       Resultado.setText(Cadena);
       Cadena="";
       resta.setEnabled(false);
       multiplicacion.setEnabled(false);
       division.setEnabled(false);
       cuadrado.setEnabled(false);
       raiz.setEnabled(false);
       porcentaje.setEnabled(false);
       
    }//GEN-LAST:event_sumaaActionPerformed

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        numeros("4");
        Operacion.setText(Cadena);
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        numeros("5");
        Operacion.setText(Cadena);
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
         numeros("6");
         Operacion.setText(Cadena);
    }//GEN-LAST:event_seisActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        operacion=2;
        dato1= Double.parseDouble(Cadena);
       numeros(" X ");
        Resultado.setText(Cadena);
       Cadena="";
       resta.setEnabled(false);
       sumaa.setEnabled(false);
       division.setEnabled(false);
       cuadrado.setEnabled(false);
       raiz.setEnabled(false);
       porcentaje.setEnabled(false);
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        numeros("7");
        Operacion.setText(Cadena);
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
         numeros("8");
         Operacion.setText(Cadena);
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        numeros("9");
        Operacion.setText(Cadena);
    }//GEN-LAST:event_nueveActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        operacion=4;
        dato1= Double.parseDouble(Cadena);
       numeros(" / ");
        Resultado.setText(Cadena);
       Cadena="";
       resta.setEnabled(false);
       multiplicacion.setEnabled(false);
       sumaa.setEnabled(false);
       cuadrado.setEnabled(false);
       raiz.setEnabled(false);
       porcentaje.setEnabled(false);
    }//GEN-LAST:event_divisionActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
         numeros("0");
         Operacion.setText(Cadena);
    }//GEN-LAST:event_ceroActionPerformed

    private void porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeActionPerformed
        operacion=7;
       dato1=Double.parseDouble(Cadena);
        numeros(" % ");
        Resultado.setText(Cadena);
        Cadena="";
        resta.setEnabled(false);
       multiplicacion.setEnabled(false);
       division.setEnabled(false);
       cuadrado.setEnabled(false);
       raiz.setEnabled(false);
       sumaa.setEnabled(false);
    }//GEN-LAST:event_porcentajeActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
         operacion=3;
        dato1= Double.parseDouble(Cadena);
       numeros(" - ");
        Resultado.setText(Cadena);
       Cadena="";
       sumaa.setEnabled(false);
       multiplicacion.setEnabled(false);
       division.setEnabled(false);
       cuadrado.setEnabled(false);
       raiz.setEnabled(false);
       porcentaje.setEnabled(false);
    }//GEN-LAST:event_restaActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        dato2= Double.parseDouble(Cadena);
        
        switch (operacion){
            case 1: dato= dato1+dato2;
            break;
            case 2: dato= dato1*dato2;
            habilitar();
            break;
            case 3: dato= dato1-dato2;
            habilitar();
            break;
            case 4: dato= dato1/dato2;
            habilitar();
            break;
            case 5: dato= Math.pow(dato1, dato2);
            habilitar();
            break;
            case 6: dato= Math.sqrt(dato1);
            habilitar();
            break;
            case 7: dato= (dato1/dato2)*100;
            Resultado.setText(Double.toString(dato)+"%");
            Operacion.setText("0");
            Cadena= Double.toString(dato);
            resta.setEnabled(true);
            multiplicacion.setEnabled(true);
            division.setEnabled(true);
            cuadrado.setEnabled(true);
            raiz.setEnabled(true);
            porcentaje.setEnabled(true);
            sumaa.setEnabled(true);
            break;
            
            
    }//GEN-LAST:event_IgualActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Igual;
    private javax.swing.JTextField Operacion;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuadrado;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton division;
    private javax.swing.JButton dos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton porcentaje;
    private javax.swing.JButton raiz;
    private javax.swing.JButton resta;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton sumaa;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
