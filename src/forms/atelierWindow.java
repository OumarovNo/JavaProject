/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import activites.*;
import dialog.*;
import network.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import Serializer.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import MyVariousUtils.*;

/**
 *
 * @author Nohch
 */
public class atelierWindow extends javax.swing.JFrame implements ActionListener, Serializable {



    private List<travail> travauxAFaire;
    private List<travailEnCours> travauxEnCours,travauxTermines;
    private FichierLog fLog;
    private NetworkBasicClient client;
    private JMenuItem menuItemPropos ;
    private JMenuItem menuItemInfosSys;
    private JMenuItem menuItemDebuter;
     

    /**
     * Creates new form atelierWindow
     */
    public atelierWindow() {
        fLog = new FichierLog("log/logsGarage");
        try
        {
            fLog.writeLine("Reconstruction application");
            containerListe container = new containerListe();
            BinarySerializer.deserializeAtelier(container);
            this.travauxAFaire = container.getTravauxAFaire();
            this.travauxEnCours = container.getTravauxEnCours();
            this.travauxTermines = container.getTravauxTermines();
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Deserialize Error");
        }
        if(travauxAFaire != null && travauxEnCours != null && travauxTermines != null)
        {
            fLog.writeLine("Initialisation components");
            initComponents();
            initMyComponents();       
        }
        else
        {
            fLog.writeLine("Erreur lors de lancement de l'app");
            JOptionPane.showMessageDialog(null,"Erreur lors de lancement de l'app");
        }
       
    }
    public atelierWindow(int role) {
        initComponents();
        initMyComponents(role);
        travauxAFaire = new LinkedList();
        travauxEnCours = new LinkedList();
        travauxTermines = new LinkedList();
        if(role == 0)
        {
            
        }
        
    }
    
    
    private void initMyComponents(int role)
    {
        try
        {
            client = new NetworkBasicClient("192.168.1.54",50001);    
        }
        catch(Exception ex)
        {
            System.out.println("Erreur lors connexion au serveur :: "+ ex.getMessage());
        }
        
        Color couleur = new Color(0,162,232);
        
        pont1Txt.setText("--libre--");
        pont1Txt.setBackground(couleur);
        pont1Txt.setOpaque(true);
        
        pont2Txt.setText("--libre--");
        pont2Txt.setBackground(couleur);
        pont2Txt.setOpaque(true);
                
        pont3Txt.setText("--libre--");
        pont3Txt.setBackground(couleur);
        pont3Txt.setOpaque(true);
                
        solTxt.setText("--libre--");
        solTxt.setBackground(couleur);
        solTxt.setOpaque(true);
        menuBarAtelier.add(Box.createHorizontalGlue());
        JMenu menu = new JMenu("Aide");
        JMenu menuParametre = new JMenu("Paramètres");
        
        menuItemPropos = new JMenuItem("A propos");
        menuItemInfosSys = new JMenuItem("Infos système");
        menuItemDebuter = new JMenuItem("Pour débuter");
        
        
        menuItemPropos.addActionListener(this);
        menuItemInfosSys.addActionListener(this);
        menuItemDebuter.addActionListener(this);
        
        menu.add(menuItemPropos);
        menuParametre.add(menuItemInfosSys);
        menu.add(menuItemDebuter);
        menuBarAtelier.add(menu);
        menuBarAtelier.add(menuParametre);
        
        for(int i = 0; i < travauxEnCours.size();i++)
        {
            switch(travauxEnCours.get(i).getNumPont())
            {
                case 0:
                    solTxt.setText(travauxEnCours.get(i).toString());
                    solTxt.setBackground(Color.yellow);
                    solTxt.setOpaque(true);
                    break;
                case 1:
                    pont1Txt.setText(travauxEnCours.get(i).toString());
                    pont1Txt.setBackground(Color.yellow);
                    pont1Txt.setOpaque(true);
                    break;
                case 2:
                    pont2Txt.setText(travauxEnCours.get(i).toString());
                    pont2Txt.setBackground(Color.yellow);
                    pont2Txt.setOpaque(true);  
                    break;
                case 3:
                    pont3Txt.setText(travauxEnCours.get(i).toString());
                    pont3Txt.setBackground(Color.yellow);
                    pont3Txt.setOpaque(true);
                    break;
                default:
                    break;
            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        diversTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bureauClientTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        checkBoxPatronDisp = new javax.swing.JCheckBox();
        checkBoxPauseMidi = new javax.swing.JCheckBox();
        buttonPresent = new javax.swing.JRadioButton();
        buttonAbsent = new javax.swing.JRadioButton();
        labelImage = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pont1Txt = new javax.swing.JLabel();
        pont3Txt = new javax.swing.JLabel();
        solTxt = new javax.swing.JLabel();
        pont2Txt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        menuBarAtelier = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuBarItemAPrevoir = new javax.swing.JMenuItem();
        menuBarItemPriseEnCharge = new javax.swing.JMenuItem();
        menuBarTerminerTrav = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Atelier");

        jLabel2.setText("Pont n°1 :");

        jLabel3.setText("Pont n°2 :");

        jLabel4.setText("Pont n°3 :");

        jLabel5.setText("Sol :");

        jLabel6.setText("Divers :");

        diversTxt.setText("Attention! Accident sur l'autoroute");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Bureau");

        bureauClientTxt.setBackground(new java.awt.Color(0, 204, 255));
        bureauClientTxt.setText("--libre--");

        jLabel8.setText("Bureau client:");

        jLabel9.setText("Bureau comptabilité : ");

        jLabel10.setText("Me Boulier est là");

        checkBoxPatronDisp.setText("Patron Disponible");

        checkBoxPauseMidi.setText("Pause-Midi");

        buttonPresent.setText("Tout le monde présent");

        buttonAbsent.setText("Certains absents");

        jLabel11.setText("12:44");

        pont1Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pont3Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        solTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pont2Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        menuBarItemAPrevoir.setText("A prévoir");
        menuBarItemAPrevoir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarItemAPrevoirActionPerformed(evt);
            }
        });
        jMenu1.add(menuBarItemAPrevoir);

        menuBarItemPriseEnCharge.setText("Prise en charge");
        menuBarItemPriseEnCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarItemPriseEnChargeActionPerformed(evt);
            }
        });
        jMenu1.add(menuBarItemPriseEnCharge);

        menuBarTerminerTrav.setText("Terminer un travail");
        menuBarTerminerTrav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarTerminerTravActionPerformed(evt);
            }
        });
        jMenu1.add(menuBarTerminerTrav);

        menuBarAtelier.add(jMenu1);

        jMenu2.setText("Edit");
        menuBarAtelier.add(jMenu2);

        setJMenuBar(menuBarAtelier);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(475, 475, 475))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bureauClientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(diversTxt, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(92, 92, 92)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pont1Txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pont2Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(solTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(92, 92, 92)
                                        .addComponent(pont3Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxPatronDisp)
                                    .addComponent(checkBoxPauseMidi))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonAbsent)
                                    .addComponent(buttonPresent)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(labelImage))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jButton1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(labelImage)
                        .addGap(150, 150, 150)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(pont1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(pont2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(pont3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(solTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(diversTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bureauClientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkBoxPatronDisp)
                        .addComponent(buttonPresent))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxPauseMidi)
                    .addComponent(buttonAbsent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBarItemAPrevoirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarItemAPrevoirActionPerformed
        aPrevoir rdv =  new aPrevoir(this,true);
        Vector v = rdv.runDialog();
        if(v != null)
        {
            System.out.println(v.get(4).toString());
            if(v.get(4).toString().equals("Entretien"))
            {
                Entretien ent = new Entretien(v);
                System.out.println("AJOUT LISTE (ENTRETIEN)");
                travauxAFaire.add(ent);
                try
                {
                    fLog.writeLine("Serialisation: Ajout RDV -> ENTRETIEN");
            
                    BinarySerializer.serializeAtelier(new containerListe(travauxAFaire,travauxEnCours,travauxTermines));    
                }
                catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null,"Serialize Error : " + ex.getMessage());
                }
                
            }
            else if(v.get(4).toString().equals("Reparation"))
            {
                Reparation rep = new Reparation(v);
                fLog.writeLine("AJOUT LISTE (REPARATION)");
                travauxAFaire.add(rep);
                try
                {
                    fLog.writeLine("Serialisation: Ajout RDV -> REPARATION");
                    BinarySerializer.serializeAtelier(new containerListe(travauxAFaire,travauxEnCours,travauxTermines));    
                }
                catch(IOException ex)
                {
                    fLog.writeLine("Serialize Error : "+ ex.getMessage());
                    JOptionPane.showMessageDialog(null,"Serialize Error : " + ex.getMessage());
                }
            }
               
        }
        
    }//GEN-LAST:event_menuBarItemAPrevoirActionPerformed

    private void menuBarItemPriseEnChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarItemPriseEnChargeActionPerformed
        
        for(int i = 0;i < travauxAFaire.size();i++)
            travauxAFaire.get(i).afficheTravail();
        priseEnCharge p = new priseEnCharge(this,true,travauxAFaire,travauxEnCours);
        travailEnCours t = p.runDialog();
        if(t != null)
        {
            fLog.writeLine("AJOUT ITEM PRISEENCHARGE");
            //travail tmp = new travail(t);// remove return false si on envoie t c pas pk
            travauxAFaire.remove(t);    // on supprime le NOUVEAU travail en cours de la liste des travaux A FAIRE 
            travauxEnCours.add(t);      // l'élément est ensuite ajouté a la liste travauxEnCours
            try
            {
                fLog.writeLine("Serialisation Liste EnCours: nouveau item prise en charge");
                BinarySerializer.serializeAtelier(new containerListe(travauxAFaire,travauxEnCours,travauxTermines));    
            }
            catch(IOException ex)
            {
               JOptionPane.showMessageDialog(null,"Serialize Error : " + ex.getMessage());
            }
            t.afficheTravail();
            switch(t.getNumPont())
            {
                case 1:
                    pont1Txt.setText(t.toString());
                    pont1Txt.setBackground(Color.yellow);
                    pont1Txt.setOpaque(true);
                    break;
                case 2:
                    pont2Txt.setText(t.toString());
                    pont2Txt.setBackground(Color.yellow);
                    pont2Txt.setOpaque(true);
                    break;
                case 3:
                    pont3Txt.setText(t.toString());
                    pont3Txt.setBackground(Color.yellow);
                    pont3Txt.setOpaque(true);
                    break;
                case 0:
                    solTxt.setText(t.toString());
                    solTxt.setBackground(Color.yellow);
                    solTxt.setOpaque(true);
                    break;
                default:break;
            }
        }
    }//GEN-LAST:event_menuBarItemPriseEnChargeActionPerformed

    private void menuBarTerminerTravActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarTerminerTravActionPerformed
        
        terminerTrav t = new terminerTrav(this,true,travauxEnCours);
        travailEnCours tmp = t.runDialog();
        if(tmp != null) // else button annuler appuyé
        {
            travauxEnCours.remove(tmp);
            travauxTermines.add(tmp);
            try
            {
                BinarySerializer.serializeAtelier(new containerListe(travauxAFaire,travauxEnCours,travauxTermines));    
            }
            catch(IOException ex)
            {
                fLog.writeLine("Serialize Liste Termine Error : " + ex.getMessage());
               JOptionPane.showMessageDialog(null,"Serialize Error : " + ex.getMessage());
            }
            Color couleur = new Color(4,199,232);
            switch(tmp.getNumPont())
            {
                case 0:
                    solTxt.setText("--libre--");
                    solTxt.setBackground(couleur);
                    break;
                case 1:
                    pont1Txt.setText("--libre--");
                    pont1Txt.setBackground(couleur);
                    break;
                case 2:
                    pont2Txt.setText("--libre--");
                    pont2Txt.setBackground(couleur);
                    break;
                case 3:
                    pont3Txt.setText("--libre--");
                    pont3Txt.setBackground(couleur);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Valeur de numPont invalide!");
                    break;
            }
        }
    }//GEN-LAST:event_menuBarTerminerTravActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        client.sendStringWithoutWaiting("caca");
        client.setEndSending();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(atelierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atelierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atelierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atelierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atelierWindow().setVisible(true);
            }
        });
    }
    
    public void serializeAtelier(String filePath) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(this);
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menuItemPropos )
        {
            fLog.writeLine("Appui Bouton A Propos : " );
            new aPropos(this,true).setVisible(true);
        }
        else if(e.getSource() == menuItemInfosSys)
        {
            fLog.writeLine("Appui Bouton A Infos système : " );
            new infoSys(this,true).setVisible(true);
        }
        else if(e.getSource() == menuItemDebuter)
        {
            fLog.writeLine("Appui Bouton Debuter : " );
            new debuter(this,true).setVisible(true);
        }
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bureauClientTxt;
    private javax.swing.JRadioButton buttonAbsent;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton buttonPresent;
    private javax.swing.JCheckBox checkBoxPatronDisp;
    private javax.swing.JCheckBox checkBoxPauseMidi;
    private javax.swing.JTextField diversTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel labelImage;
    private javax.swing.JMenuBar menuBarAtelier;
    private javax.swing.JMenuItem menuBarItemAPrevoir;
    private javax.swing.JMenuItem menuBarItemPriseEnCharge;
    private javax.swing.JMenuItem menuBarTerminerTrav;
    private javax.swing.JLabel pont1Txt;
    private javax.swing.JLabel pont2Txt;
    private javax.swing.JLabel pont3Txt;
    private javax.swing.JLabel solTxt;
    // End of variables declaration//GEN-END:variables


}
