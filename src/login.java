
//import newpackage.AdminHome;
//import newpackage.TeacherHome;
//import newpackage.TeacherDetails;
//import newpackage.Register;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import mypack.connect_me;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.security.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    private String unm,pass,role2,fnm="",lnm="";
    public login() {
        initComponents();
        connect_me.connect_all();
        //login lo=new login
       
          /* Toolkit tk= Toolkit.getDefaultToolkit();
           Dimension d= tk.getScreenSize();
           this.setBounds(0,0, d.width, d.height);
           
           Image i=Toolkit.getDefaultToolkit().getImage(getClass().getResource("\\images\\abstract-pastel-blue-white-background-design-34948659.jpg"));
           Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
       
        Image j=i.getScaledInstance(dim.width, dim.height, Image.SCALE_REPLICATE);
        ImageIcon img=new ImageIcon(j);
        //jLabel4.setIcon(img);*/

           
        
        
        
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        unmtxt = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        btnclr = new javax.swing.JButton();
        btnforgot = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autopapergenerator Login");
        setName("Login"); // NOI18N

        jPanel2.setName("Login"); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 80, 80, 30);

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 150, 80, 16);

        unmtxt.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jPanel2.add(unmtxt);
        unmtxt.setBounds(180, 80, 160, 30);

        pwd.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jPanel2.add(pwd);
        pwd.setBounds(180, 140, 160, 30);

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel3.setText("Role");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 200, 70, 20);

        btnlogin.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin);
        btnlogin.setBounds(220, 340, 100, 30);

        btnclr.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnclr.setText("Clear");
        btnclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrActionPerformed(evt);
            }
        });
        jPanel2.add(btnclr);
        btnclr.setBounds(370, 340, 80, 30);

        btnforgot.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnforgot.setText("Forgot Password");
        btnforgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforgotActionPerformed(evt);
            }
        });
        jPanel2.add(btnforgot);
        btnforgot.setBounds(30, 340, 150, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jRadioButton1.setText("Admin");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(180, 200, 80, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jRadioButton2.setText("Teacher");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(300, 200, 90, 25);

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(170, 20, 140, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abstract-pastel-blue-white-background-design-34948659.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 510, 440);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-529)/2, (screenSize.height-477)/2, 529, 477);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:

        try
        {
            connect_me.st=connect_me.con.createStatement();
            unm=unmtxt.getText();
            pass=pwd.getText();
          
            
            
            if(unm.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Enter Username");
                unmtxt.grabFocus();
                
                return;
            }
            if(pass.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Enter password");
                pwd.grabFocus();
                return;
            }
            
            
            
            if(connect_me.role.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Select a valid role");
                return;
            }
          
                connect_me.st1=connect_me.con1.createStatement();
                connect_me.rs1=connect_me.st1.executeQuery("select firstnm,lastnm from teachermaster where tchr_id='"+unm+"'");
                if(connect_me.rs1.next())
                {
                    fnm=connect_me.rs1.getString(1);
                    lnm=connect_me.rs1.getString(2);
                }
                connect_me.st1.close();
            
                String sql="select userid,pwd,rol from login where userid='"+unm+"'";
                connect_me.rs=connect_me.st.executeQuery(sql);
                
                
                
                
                if(connect_me.rs.next())
                {
                    
                    String password=connect_me.rs.getString(2);
                    role2=connect_me.rs.getString(3);
                    if(password.equals(pass))
                    {
                        
                    
                        if(connect_me.role.equalsIgnoreCase(role2))
                        {
                            DisplayMenu dm=new DisplayMenu(unm,fnm,lnm);
                            dm.show();
                            this.dispose();
                        
                        
                        
                        JOptionPane.showMessageDialog(rootPane, "Login Successful");
                        connect_me.teachr_id=unm;
                        
                      
                    }
                    else
                        {
                        JOptionPane.showMessageDialog(rootPane, "Invalid Role!");
                        }
                    
                }
                
                
                //login lo=new login();
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Invalid password");
                        
                    }
                
               
           
            }
        
            else
                {
                    JOptionPane.showMessageDialog(rootPane, "Login Unsuccessfull,Please Register");
                }
                connect_me.st.close();
                  
            

        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
            connect_me.role="Admin";
        }
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        
        if(jRadioButton2.isSelected())
        {
            connect_me.role="Teacher";
        }
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrActionPerformed
        // TODO add your handling code here:
        unmtxt.setText("");
        pwd.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        //jRadioButton3.setSelected(false);
      
    }//GEN-LAST:event_btnclrActionPerformed

    private void btnforgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforgotActionPerformed
        // TODO add your handling code here:
       String nm=unmtxt.getText();
       if(nm.equalsIgnoreCase(""))
       {
           JOptionPane.showMessageDialog(rootPane, "Please enter username");
       }
       
       Forgot fo=new Forgot(nm);
       fo.show();
       
    }//GEN-LAST:event_btnforgotActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclr;
    private javax.swing.JButton btnforgot;
    private javax.swing.JButton btnlogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField unmtxt;
    // End of variables declaration//GEN-END:variables
}
