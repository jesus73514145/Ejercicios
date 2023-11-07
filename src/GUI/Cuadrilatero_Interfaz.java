
package GUI;
import javax.swing.JOptionPane;
public class Cuadrilatero_Interfaz extends javax.swing.JFrame {

    public Cuadrilatero_Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);     
    }

    public void Rectangulo(){ 
        double base=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa la base"));
        double altura=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa la altura"));
        
        if(base!=altura && base>altura){
            Rectangulo r1=new Rectangulo(base,altura);         
            txtMostrar.setText(null);   
            txtMostrar.append("Rectangulo 1:\n");  
            txtMostrar.append("Base: "+r1.getBase()+"\n");         
            txtMostrar.append("Altura: "+r1.getAltura() +"\n");         
            txtMostrar.append("AREA: "+r1.area()+"\n");         
            txtMostrar.append("PERIMETRO: "+r1.perimetro()+"\n\n");  
            
            /*Rectangulo r2=new Rectangulo();         
            r2.setBase(5.0);         
            r2.setAltura(3.0);  
        
            txtMostrar.append("Rectangulo 2:\n");
            txtMostrar.append("Base: "+r2.getBase()+"\n");         
            txtMostrar.append("Altura: "+r2.getAltura() +"\n");         
            txtMostrar.append("AREA: "+r2.area()+"\n");         
            txtMostrar.append("PERIMETRO: "+r2.perimetro());  */ 
        }else{
            JOptionPane.showMessageDialog(null, "ERROR ","ALERTA ",JOptionPane.WARNING_MESSAGE);
        }
   
    }
    
    public void Paralelogramo(){ 
        double base=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa la base"));
        double altura=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa la altura"));
        double ladoInclinado=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa los lados inclinados"));
        if(base>ladoInclinado && base>altura && ladoInclinado>altura){
            Paralelogramo p1=new Paralelogramo(base, altura, ladoInclinado);
            txtMostrar.setText(null);
            txtMostrar.append("Paralelogramo 1:\n");
            txtMostrar.append("La base es: "+p1.getBase()+"\n");
            txtMostrar.append("La altura es: "+p1.getAltura()+"\n");
            txtMostrar.append("Lado inclinado es: "+p1.getLadoI()+"\n");       
            txtMostrar.append("AREA: "+p1.area()+"\n");
            txtMostrar.append("PERIMETRO: "+p1.perimetro()+"\n\n");
        
            /*Paralelogramo p2=new Paralelogramo();
            p2.setBase(9.0);
            p2.setAltura(4.0);
            p2.setLadoI(6.0);

            txtMostrar.append("Paralelogramo 2:\n");
            txtMostrar.append("La base es: "+p2.getBase()+"\n");
            txtMostrar.append("La altura es: "+p2.getAltura()+"\n");
            txtMostrar.append("Lado inclinado es: "+p2.getLadoI()+"\n");
            txtMostrar.append("AREA: "+p2.area()+"\n");
            txtMostrar.append("PERIMETRO: "+p2.perimetro());*/ 
        }else{
            JOptionPane.showMessageDialog(null, "ERROR ","ALERTA ",JOptionPane.WARNING_MESSAGE);
        }
        
    }   
        
    public void Rombo(){ 
        double diaMa=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa la diagonal mayor"));
        double diaMe=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa la diagonal menor"));
        
        if(diaMa>diaMe){
            Rombo ro1=new Rombo(diaMa, diaMe);
            txtMostrar.setText(null);
            txtMostrar.append("Rombo 1:\n");
            txtMostrar.append("La diagonal mayor es: "+ro1.getDiaMay()+"\n");
            txtMostrar.append("La diagonal menor es: "+ro1.getDiaMen()+"\n");
            txtMostrar.append("Los lados son: "+ro1.getlados()+"\n");
            txtMostrar.append("AREA: "+ro1.area()+"\n");
            txtMostrar.append("PERIMETRO: "+ro1.perimetro()+"\n\n");
        
            /*Rombo ro2=new Rombo();
            ro2.setDiaMay(6.0);
            ro2.setDiaMen(5.0);

            txtMostrar.append("Rombo 2:\n");
            txtMostrar.append("La diagonal mayor es: "+ro2.getDiaMay()+"\n");
            txtMostrar.append("La diagonal menor es: "+ro2.getDiaMen()+"\n");
            txtMostrar.append("Los lados son: "+ro2.getlados()+"\n");
            txtMostrar.append("AREA: "+ro2.area()+"\n");
            txtMostrar.append("PERIMETRO: "+ro2.perimetro());*/      
        }else{
            JOptionPane.showMessageDialog(null, "ERROR ","ALERTA ",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public void Trapecio(){ 
        double baseMa=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa la base mayor"));
        double baMe=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa la base menor"));
        double ladosIncli=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingresa los lados inclinados"));
        if(baseMa > baMe && baseMa > ladosIncli){
            Trapecio t1=new Trapecio(baseMa, baMe, ladosIncli);
            txtMostrar.setText(null);
            txtMostrar.append("Trapecio 1:\n");
            txtMostrar.append("La base mayor es: "+t1.getBaseMayor()+"\n");
            txtMostrar.append("La base menor es: "+t1.getBaseMenor()+"\n");
            txtMostrar.append("Los lados inclinados son: "+t1.getLadosI()+"\n");
            txtMostrar.append("La altura es: "+t1.getAltura()+"\n");
            txtMostrar.append("AREA: "+t1.area()+"\n");
            txtMostrar.append("PERIMETRO: "+t1.perimetro()+"\n\n");
        
            /*Trapecio t2=new Trapecio();
            t2.setBaseMayor(6.0);
            t2.setBaseMenor(5.0);
            t2.setLadosI(3.0);
        
            txtMostrar.append("Trapecio 2:\n");
            txtMostrar.append("La base mayor es: "+t2.getBaseMayor()+"\n");
            txtMostrar.append("La base menor es: "+t2.getBaseMenor()+"\n");
            txtMostrar.append("Los lados inclinados son: "+t2.getLadosI()+"\n");
            txtMostrar.append("La altura es: "+t2.getAltura()+"\n");
            txtMostrar.append("AREA: "+t2.area()+"\n");
            txtMostrar.append("PERIMETRO: "+t2.perimetro());*/
            
        }else
            JOptionPane.showMessageDialog(null, "ERROR ","ALERTA ",JOptionPane.WARNING_MESSAGE);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        cboOpciones = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Elige tu cuadrilatero:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 28));

        txtMostrar.setColumns(20);
        txtMostrar.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 360, 310));

        cboOpciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cboOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RECTANGULO", "PARALELOGRAMO", "ROMBO", "TRAPECIO ISOSCELES" }));
        cboOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(cboOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Area y Perimetro de 4 cuadrilateros");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 253, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOpcionesActionPerformed
        
        int opc=cboOpciones.getSelectedIndex(); 
        switch(opc){ 
            case 0: Rectangulo(); break; 
            case 1: Paralelogramo();break; 
            case 2: Rombo();break; 
            default: Trapecio();     
        } 
    }//GEN-LAST:event_cboOpcionesActionPerformed

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
            java.util.logging.Logger.getLogger(Cuadrilatero_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuadrilatero_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuadrilatero_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuadrilatero_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuadrilatero_Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboOpciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMostrar;
    // End of variables declaration//GEN-END:variables
}
