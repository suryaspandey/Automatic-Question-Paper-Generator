
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mypack.connect_me;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Subjects_frame extends javax.swing.JInternalFrame {

    /**
     * Creates new form Subjects_frame
     */
    String stream,sub,streamId="s";
     int sem,subId;
    public Subjects_frame() {
        initComponents();
         connect_me.connect_all();
         
         Image im= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/abstract-pastel-blue-white-background-design-34948659.jpg"));
      
        Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
        Image j= im.getScaledInstance(dim.width,dim.height, Image.SCALE_DEFAULT);
        ImageIcon img = new ImageIcon(j);
        
        jLabel8.setIcon(img);
        jLabel8.setSize(DisplayMenu.jDesktopPane1.getWidth(), DisplayMenu.jDesktopPane1.getHeight());
        
        jLabel9.setIcon(img);
        jLabel9.setSize(DisplayMenu.jDesktopPane1.getWidth(), DisplayMenu.jDesktopPane1.getHeight());
        
       
        
        try
        {
            String sql="select stream_name from stream";
            connect_me.st=connect_me.con.createStatement();
            connect_me.rs=connect_me.st.executeQuery(sql);
            while(connect_me.rs.next())
            {
                streamCombo.addItem(connect_me.rs.getString(1));
                
            }
            connect_me.st.close();
            streamCombo.setSelectedIndex(-1);
            jPanel4.setVisible(false);
            jPanel5.setLocation(40, 100);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.toString());
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

        deltab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        streamCombo = new javax.swing.JComboBox();
        addstrm = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        newStream = new javax.swing.JTextField();
        btnSub = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        semCombo = new javax.swing.JComboBox();
        subTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnclr = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        strcombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        semcombo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        subcombo = new javax.swing.JComboBox();
        btndel = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Add/Delete Subjects");
        setVisible(true);

        deltab.setBackground(new java.awt.Color(255, 204, 204));
        deltab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                deltabFocusGained(evt);
            }
        });
        deltab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deltabKeyPressed(evt);
            }
        });

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel1.setText("Stream");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 50, 100, 40);

        streamCombo.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        streamCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                streamComboItemStateChanged(evt);
            }
        });
        streamCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streamComboActionPerformed(evt);
            }
        });
        jPanel2.add(streamCombo);
        streamCombo.setBounds(180, 50, 270, 30);

        addstrm.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        addstrm.setText("Add Stream");
        addstrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstrmActionPerformed(evt);
            }
        });
        jPanel2.add(addstrm);
        addstrm.setBounds(480, 40, 120, 40);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel2.setText("Stream Name");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(30, 10, 90, 30);

        btnAdd.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd);
        btnAdd.setBounds(440, 10, 120, 40);

        newStream.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jPanel4.add(newStream);
        newStream.setBounds(140, 10, 280, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(40, 100, 580, 60);

        btnSub.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnSub.setText("Add Subject");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        jPanel2.add(btnSub);
        btnSub.setBounds(180, 370, 140, 40);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        semCombo.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jPanel5.add(semCombo);
        semCombo.setBounds(150, 20, 70, 30);

        subTxt.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jPanel5.add(subTxt);
        subTxt.setBounds(150, 80, 410, 30);

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel3.setText("Semester");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(30, 30, 70, 20);

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel4.setText("Subject");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(30, 70, 80, 40);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(40, 160, 570, 140);

        btnclr.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnclr.setText("Clear");
        btnclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrActionPerformed(evt);
            }
        });
        jPanel2.add(btnclr);
        btnclr.setBounds(350, 370, 130, 40);

        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 620, 460);

        deltab.addTab("Insert", jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        strcombo.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        strcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                strcomboItemStateChanged(evt);
            }
        });
        jPanel3.add(strcombo);
        strcombo.setBounds(240, 70, 270, 40);

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel5.setText("Select Stream");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(110, 80, 110, 16);

        jLabel6.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel6.setText("Select Semester");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(110, 170, 110, 16);

        semcombo.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        semcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semcomboItemStateChanged(evt);
            }
        });
        semcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semcomboActionPerformed(evt);
            }
        });
        jPanel3.add(semcombo);
        semcombo.setBounds(240, 160, 110, 30);

        jLabel7.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel7.setText("Select Subject");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(110, 260, 100, 16);

        subcombo.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jPanel3.add(subcombo);
        subcombo.setBounds(240, 240, 280, 40);

        btndel.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btndel.setText("Delete Subject");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel3.add(btndel);
        btndel.setBounds(180, 340, 160, 50);

        btnClr.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });
        jPanel3.add(btnClr);
        btnClr.setBounds(360, 340, 150, 50);

        jLabel9.setText("jLabel9");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 610, 460);

        deltab.addTab("Delete", jPanel3);

        getContentPane().add(deltab, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-632)/2, (screenSize.height-518)/2, 632, 518);
    }// </editor-fold>//GEN-END:initComponents

    private void addstrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstrmActionPerformed
        // TODO add your handling code here:
        streamCombo.setSelectedIndex(-1);
        semCombo.setSelectedIndex(-1);
        jPanel5.setLocation(40, 160);
        jPanel4.setVisible(true);
        //btnSub.setEnabled(false);
    }//GEN-LAST:event_addstrmActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        int n=0,i=0,count;
        stream= newStream.getText();
        if(stream.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter valid Stream.");
            newStream.grabFocus();
            return;
        }
        else
        {
            for(i=0;i<streamCombo.getItemCount(); i++)
            {
                if(stream.equals(streamCombo.getItemAt(i).toString()))
                {
                    JOptionPane.showMessageDialog(this, "Stream Already Present.");
                    streamCombo.setSelectedIndex(i);
                    newStream.setText("");
                    //jPanel4.setVisible(false);
                    return;
                }
            }
        }

        try
        {
            int x= connect_me.autogen("stream", "stream_id");
            //JOptionPane.showMessageDialog(null,x);
            streamId= "S-" +x;

            String sql1="insert into stream values('"+streamId+"','"+stream+"')";
            connect_me.st1=connect_me.con.createStatement();
            connect_me.st1.executeUpdate(sql1);

            JOptionPane.showMessageDialog(rootPane, "Stream Added Successfully");
            

            sql1="select stream_name from stream where stream_id=(select isnull(max(stream_id),0) from stream)";
            connect_me.st=connect_me.con.createStatement();
            connect_me.rs1=connect_me.st.executeQuery(sql1);
            while(connect_me.rs1.next())
            {
                streamCombo.addItem(connect_me.rs1.getString(1));

            }

            connect_me.st.close();
            connect_me.st1.close();
            newStream.setText("");
            jPanel4.setVisible(false);
            jPanel5.setLocation(40, 100);
            btnSub.setEnabled(true);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(streamCombo, e.toString());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        

        
        if(streamCombo.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(rootPane, "Please Select Stream");
                return;
        }
        /*
        if(newStream.getText().equals("") && jPanel4.isVisible())
        {
            JOptionPane.showMessageDialog(rootPane, "Enter valid stream ");
                return;
        }*/
        if(semCombo.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(rootPane, "Please Select Semester");
                return;
        }
        if(subTxt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter valid subject.");
            subTxt.grabFocus();
            return;
        }
        
        stream=streamCombo.getSelectedItem().toString();
        sem=Integer.parseInt(semCombo.getSelectedItem().toString());
        sub=subTxt.getText();
        String stream_id="";
        boolean flag=false;

        try
        {
            String x;
            connect_me.st=connect_me.con.createStatement();
            x="select stream_id from stream where stream_name='"+stream+"'";
            connect_me.rs=connect_me.st.executeQuery(x);
            if(connect_me.rs.next())
            {
                stream_id=connect_me.rs.getString(1);
            }
            connect_me.st.close();

            connect_me.st=connect_me.con.createStatement();
            x="select sub_name from subject where stream_id='"+stream_id+"'";
            connect_me.rs=connect_me.st.executeQuery(x);
            while(connect_me.rs.next())
            {
                if(sub.equals(connect_me.rs.getString(1)))
                {
                    //flag=true;
                    JOptionPane.showMessageDialog(this, "Subject "+sub+" already exists");
                    subTxt.setText("");
                    subTxt.grabFocus();
                    connect_me.st.close();
                    return;
                }
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.toString());
        }
        try
        {
            //if(flag==false)

            connect_me.st1=connect_me.con.createStatement();
            String sql="select stream_id from stream where stream_name='"+stream+"'";
            connect_me.rs=connect_me.st1.executeQuery(sql);
            if(connect_me.rs.next())
            {
                stream_id=connect_me.rs.getString(1);
            }
            connect_me.st1.close();

            connect_me.st1=connect_me.con1.createStatement();
            sql="select isnull(max(sub_id),0) from subject";
            connect_me.rs1=connect_me.st1.executeQuery(sql);
            int n=0;
            if(connect_me.rs1.next())
            {
                n=Integer.parseInt(connect_me.rs1.getString(1));
                n+=1;
                String sql1="insert into subject values("+n+",'"+stream_id+"','"+sub+"','"+sem+"')";
                connect_me.st2=connect_me.con2.createStatement();
                connect_me.st2.executeUpdate(sql1);
                int wish=JOptionPane.showConfirmDialog(rootPane, "Subject Added Successfully.Do you wish to continue?");
                if(wish==0)
                {
                    subTxt.setText("");
                }
                else if(wish==1)
                {
                    streamCombo.setSelectedIndex(-1);
                    newStream.setText("");
                    semCombo.setSelectedIndex(-1);
                    subTxt.setText("");
                }
                else
                {
                    return;
                }

            }
            connect_me.st2.close();
            connect_me.st1.close();
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(streamCombo, e.toString());
        }
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrActionPerformed
        // TODO add your handling code here:
        streamCombo.setSelectedIndex(-1);
        newStream.setText("");
        semCombo.setSelectedIndex(-1);
        subTxt.setText("");
    }//GEN-LAST:event_btnclrActionPerformed

    private void semcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semcomboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_semcomboActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
        String sub,del,snm;
        try
        {
            if(strcombo.getSelectedIndex()==-1)
            {
                JOptionPane.showMessageDialog(streamCombo, "Please select Stream");
                return;
            }
            if(semcombo.getSelectedIndex()==-1)
            {
                JOptionPane.showMessageDialog(streamCombo, "Please select semester");
                return;
            }
            if(subcombo.getSelectedIndex()==-1)
            {
                JOptionPane.showMessageDialog(streamCombo, "Please select Subject");
                return;
            }
            snm=strcombo.getSelectedItem().toString();
            sub=subcombo.getSelectedItem().toString();
            connect_me.st=connect_me.con.createStatement();
            del="delete from subject where sub_name='"+sub+"' and stream_id=(select stream_id from stream where stream_name='"+snm+"')";
            connect_me.st.executeUpdate(del);
            JOptionPane.showConfirmDialog(this, "Do you really want to delete "+sub+"?");

            subcombo.removeItemAt(subcombo.getSelectedIndex());

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_btndelActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
        // TODO add your handling code here:
        strcombo.setSelectedIndex(-1);
        subcombo.removeAllItems();
        semcombo.setSelectedIndex(-1);
    }//GEN-LAST:event_btnClrActionPerformed

    private void deltabFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deltabFocusGained
        // TODO add your handling code here:
        String s1;

        try
        {
            connect_me.st=connect_me.con.createStatement();
            s1="select stream_name from stream";
            connect_me.rs=connect_me.st.executeQuery(s1);
            while(connect_me.rs.next())
            {
                strcombo.addItem(connect_me.rs.getString(1));
            }

        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,e.toString());
        }
    }//GEN-LAST:event_deltabFocusGained

    private void deltabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deltabKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_deltabKeyPressed

    private void semcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semcomboItemStateChanged
        // TODO add your handling code here:
        String snm,s3;
        try
        {

            if(strcombo.getSelectedIndex()!=-1)
            {
                snm=strcombo.getSelectedItem().toString();

                if(semcombo.getSelectedIndex()!=-1)
                {
                    sem=Integer.parseInt(semcombo.getSelectedItem().toString());

                    s3="select sub_name from subject where semester='"+sem+"'and stream_id=(select stream_id from stream where stream_name='"+snm+"')";
                    connect_me.rs=connect_me.st.executeQuery(s3);
                    while(connect_me.rs.next())
                    {
                        subcombo.addItem(connect_me.rs.getString(1));
                    }
                }

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "subject not found");
        }
    }//GEN-LAST:event_semcomboItemStateChanged

    private void streamComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_streamComboItemStateChanged
        // TODO add your handling code here:
      if(streamCombo.getSelectedIndex()==-1)
      {
          return;
      }
        
        if(streamCombo.getSelectedItem().toString().equals("All"))
{
	semCombo.removeAllItems();
	semCombo.addItem('1');
	semCombo.addItem('2');
	semCombo.setSelectedIndex(-1);
}
else
{
	semCombo.removeAllItems();
	for(int i=3;i<=8;i++)
	{
		semCombo.addItem(i);
	}
	semCombo.setSelectedIndex(-1);	
} 
    }//GEN-LAST:event_streamComboItemStateChanged

    private void strcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_strcomboItemStateChanged
        // TODO add your handling code here:
        if(strcombo.getSelectedIndex()==-1)
        {
            return;
        }
        if(strcombo.getSelectedItem().toString().equals("All"))
{
	semcombo.removeAllItems();
	semcombo.addItem('1');
	semcombo.addItem('2');
	semcombo.setSelectedIndex(-1);
}
else
{
	semcombo.removeAllItems();
	for(int i=3;i<=8;i++)
	{
		semcombo.addItem(i);
	}
	semcombo.setSelectedIndex(-1);	
} 

    }//GEN-LAST:event_strcomboItemStateChanged

    private void streamComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streamComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streamComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addstrm;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnclr;
    private javax.swing.JButton btndel;
    public javax.swing.JTabbedPane deltab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField newStream;
    private javax.swing.JComboBox semCombo;
    private javax.swing.JComboBox semcombo;
    private javax.swing.JComboBox strcombo;
    private javax.swing.JComboBox streamCombo;
    private javax.swing.JTextField subTxt;
    private javax.swing.JComboBox subcombo;
    // End of variables declaration//GEN-END:variables
}
