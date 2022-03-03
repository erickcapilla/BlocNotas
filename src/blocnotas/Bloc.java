package blocnotas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Bloc extends java.awt.Frame {
    
    DefaultTableModel model = new DefaultTableModel();
    int id = 1;
    
    /**
     * Creates new form Bloc1
     */
    public Bloc() {
        initComponents();
        this.setBounds(0, 0, 750, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        model.addColumn("ID");
        model.addColumn("Cadena");
        model.addColumn("Estado");
        model.addColumn("Final");
        
        this.TEstado.setModel(model);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEstado = new javax.swing.JTable();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menuItem1 = new java.awt.MenuItem();
        menuItem2 = new java.awt.MenuItem();
        menuItem3 = new java.awt.MenuItem();
        menuItem5 = new java.awt.MenuItem();
        menuItem4 = new java.awt.MenuItem();
        analizar = new java.awt.Menu();
        iniciar = new java.awt.MenuItem();
        modificar = new java.awt.Menu();
        editar = new java.awt.MenuItem();

        label1.setText("label1");

        jButton1.setText("jButton1");

        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setTitle("Bloc de notas-Juan Dotor/Erick Capilla");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Cadena", "Estado", "Final"
            }
        ));
        jScrollPane1.setViewportView(TEstado);

        menu1.setLabel("Archivo");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        menuItem1.setLabel("Nuevo");
        menuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem1ActionPerformed(evt);
            }
        });
        menu1.add(menuItem1);

        menuItem2.setLabel("Abrir");
        menuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem2ActionPerformed(evt);
            }
        });
        menu1.add(menuItem2);

        menuItem3.setLabel("Guardar");
        menuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem3ActionPerformed(evt);
            }
        });
        menu1.add(menuItem3);

        menuItem5.setLabel("Guardar como...");
        menu1.add(menuItem5);

        menuItem4.setLabel("Salir");
        menuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem4ActionPerformed(evt);
            }
        });
        menu1.add(menuItem4);

        menuBar1.add(menu1);

        analizar.setLabel("Analizar");
        analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarActionPerformed(evt);
            }
        });

        iniciar.setLabel("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        analizar.add(iniciar);

        menuBar1.add(analizar);

        modificar.setLabel("Modificar");

        editar.setLabel("Editar");
        modificar.add(editar);

        menuBar1.add(modificar);

        setMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
       
         if(!"".equals(this.textArea1.getText())){
        int n=JOptionPane.showConfirmDialog(this, "Desea Salir Sin Guardar Documento?", "Confimacion", JOptionPane.OK_CANCEL_OPTION);
        
         if(n==JOptionPane.OK_OPTION){
        System.exit(0);
         }
         }
         
           if("".equals(this.textArea1.getText())){
        
        System.exit(0);
         }
         
         
    }//GEN-LAST:event_exitForm

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1ActionPerformed

    private void menuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem1ActionPerformed
      if(!"".equals(this.textArea1.getText())){
   
        int n=JOptionPane.showConfirmDialog(this, "Desea Continuar Sin Guardar Documento?", "Confimacion", JOptionPane.OK_CANCEL_OPTION);
        
      
       if(n==JOptionPane.OK_OPTION){
        this.textArea1.setText(null);   
       }
      }
    }//GEN-LAST:event_menuItem1ActionPerformed

    private void menuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem2ActionPerformed
        // TODO add your handling code here:
        if(!"".equals(this.textArea1.getText())){
        int n=JOptionPane.showConfirmDialog(this, "Desea Continuar Sin Guardar Documento?", "Confimacion", JOptionPane.OK_CANCEL_OPTION);
        
         if(n==JOptionPane.OK_OPTION){
        try {
          
            Abrir();
            
           // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bloc.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
        }
        if("".equals(this.textArea1.getText())){
            try {
                Abrir();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Bloc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_menuItem2ActionPerformed

    private void menuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem3ActionPerformed
        // TODO add your handling code here:
         if("".equals(this.textArea1.getText())){
        int n=JOptionPane.showConfirmDialog(this, "Desea Guardar Documento Vacio?", "Confimacion", JOptionPane.OK_CANCEL_OPTION);
        if(n==JOptionPane.OK_OPTION){
        Guardar();
        }
         }
        if(!"".equals(this.textArea1.getText())){
      
        Guardar();
         
         }
        
    }//GEN-LAST:event_menuItem3ActionPerformed

    private void menuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem4ActionPerformed
      if(!"".equals(this.textArea1.getText())){
       int n= JOptionPane.showConfirmDialog(this, "Desea Salir Sin Guardar Documento?", "Confimacion", JOptionPane.OK_CANCEL_OPTION);
        
         if(n==JOptionPane.OK_OPTION){
        System.exit(0);
         }
      }
      
       if("".equals(this.textArea1.getText())){
           System.exit(0);
       }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItem4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_analizarActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        String cadena = textArea1.getText();
        
        boolean error = false;
        
        for(int i = 0; i <= 47; i++){
            String l = Character.toString((char) i);
            if(cadena.contains(l)) {
                error = true;
                break;
            }
        }
        
        for(int i = 50; i <= 127; i++){
            String l = Character.toString((char) i);
            if(cadena.contains(l)) {
                error = true;
                break;
            }
        }
        
        
        if(!error) {
            Analizar(cadena);
        } else {
            JOptionPane.showMessageDialog(null, "La cadena solo debe ser de 0 y 1");
        }
       
        
    }//GEN-LAST:event_iniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Bloc().setVisible(true);
            
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TEstado;
    private java.awt.Menu analizar;
    private java.awt.MenuItem editar;
    private java.awt.MenuItem iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Menu menu1;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuItem menuItem1;
    private java.awt.MenuItem menuItem2;
    private java.awt.MenuItem menuItem3;
    private java.awt.MenuItem menuItem4;
    private java.awt.MenuItem menuItem5;
    private java.awt.Menu modificar;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

 public File ObtenerArchivo(){
     
     JFileChooser SelecArchiv = new JFileChooser();
     SelecArchiv.setFileSelectionMode(JFileChooser.FILES_ONLY);
     int Resultado = SelecArchiv.showOpenDialog(this);
     if(Resultado == JFileChooser.CANCEL_OPTION){
        return null; 
     }
     
     File NombreArchivo = SelecArchiv.getSelectedFile();
     if(NombreArchivo == null || "".equals(NombreArchivo.getName())){
         JOptionPane.showMessageDialog(this, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
         return null;
     }
     
     return NombreArchivo;
        }
 
 public void Abrir () throws FileNotFoundException{
     
     File Archivo = ObtenerArchivo ();
     
     if(Archivo.exists() && Archivo != null){
         this.label1.setText(Archivo.getPath());
         if(Archivo.isFile()){
             
             BufferedReader entrada = new BufferedReader(new FileReader(Archivo));
             StringBuffer buffer = new StringBuffer();
             String texto;
             this.textArea1.setText("");
             try {
                 while((texto = entrada.readLine())!=null){
                     buffer.append(texto+"\n");  
                 }
            
             
             this.textArea1.append(buffer.toString());
              } catch (IOException ex) {  
                 JOptionPane.showMessageDialog(this, "Error: "+ ex);
              }
              
         }
        
     }
 }
 
 public void Guardar(){  
     JFileChooser ArchivEleg = new JFileChooser();
     ArchivEleg.setFileSelectionMode(JFileChooser.FILES_ONLY);
     int Resultado = ArchivEleg.showSaveDialog(this);
     
     if(Resultado==JFileChooser.CANCEL_OPTION){
         return;
     }
     
     File Nombre = ArchivEleg.getSelectedFile();
     if(!Nombre.exists()){
         try{
         PrintWriter salida = new PrintWriter(new FileWriter(Nombre+".txt"));
         salida.write(this.textArea1.getText());
         salida.close();
         }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error en El Archivo", "Error", JOptionPane.ERROR_MESSAGE);
         }
     }
 }
 
 public void Analizar(String cadena) {
    String[][] m = {{"s0","s1","s2","s3"},{"0","1"},{"s0"},{"s0","s3"}};
    String[][] flujo = {{"s0","0","s0"},{"s0","1","s1"},{"s1","0","s3"},{"s1","1","s2"},
    {"s2","0","s3"},{"s2","1","s0"},{"s3","0","s0"},{"s3","1","s2"}};
    ArrayList<String[]> estado = new ArrayList<>();
    
    String[] inicial = {"",(m[2][0])};
    estado.add(inicial);
    
        for(int i = 0; i < cadena.length(); i++){
            char l = cadena.charAt(i);
            for(int j = 0; j < flujo.length; j++) {
                if(flujo[j][0].equals(inicial[1]) && flujo[j][1].equals(String.valueOf(l))) {                
                    String siguiente = flujo[j][2];
                    String[] update = {String.valueOf(l),siguiente};
                    inicial = update;
                    estado.add(inicial);
                    break;
                }
            }
        }

        String es = "";

        for(int i = 0; i < m[3].length; i++) {
            if(inicial[1].equals(m[3][0]) || inicial[1].equals(m[3][1])) {
                es = "Aceptada";
            } else {
                es = "Rechazada";
            }
            if(es != "") {
                break;
            }
        }

        String[] fila = new String[4];

        fila[0] = String.valueOf(id);  
        fila[1] = cadena;
        fila[2] = es;
        fila[3] = inicial[1];

        model.addRow(fila);

        String txt = "La cadena " + cadena + " ha sido " + es;

        JOptionPane.showMessageDialog(null, txt);
        id++;
 }

}
