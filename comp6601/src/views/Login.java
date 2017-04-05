package views;


import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elleb
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SI_JPanel = new javax.swing.JPanel();
        SI_UNLabel = new javax.swing.JLabel();
        SI_PasswordLabel = new javax.swing.JLabel();
        SI_Username = new javax.swing.JTextField();
        SI_Password = new javax.swing.JPasswordField();
        SI_Button = new javax.swing.JButton();
        userTypeList = new javax.swing.JComboBox<>();
        UserTypeLabel = new javax.swing.JLabel();
        SU_JPanel = new javax.swing.JPanel();
        SU_FNLabel = new javax.swing.JLabel();
        SU_LNLabel = new javax.swing.JLabel();
        SU_ELabel = new javax.swing.JLabel();
        SU_PWLabel = new javax.swing.JLabel();
        SU_FName = new javax.swing.JTextField();
        SU_LName = new javax.swing.JTextField();
        SU_Email = new javax.swing.JTextField();
        SU_PW = new javax.swing.JPasswordField();
        SU_Button = new javax.swing.JButton();
        Welcome_JPanel = new javax.swing.JPanel();
        TP_Icon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TP_Description = new javax.swing.JTextArea();
        Login_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SI_JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign In", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13), new java.awt.Color(102, 102, 102))); // NOI18N

        SI_UNLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        SI_UNLabel.setText("Username");

        SI_PasswordLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        SI_PasswordLabel.setText("Password");

        SI_Username.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        SI_Password.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        SI_Button.setBackground(new java.awt.Color(255, 255, 255));
        SI_Button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        SI_Button.setForeground(new java.awt.Color(0, 204, 204));
        SI_Button.setText("Sign In");
        SI_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        SI_Button.setBorderPainted(false);
        SI_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SI_ButtonMouseClicked(evt);
            }
        });
        SI_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SI_ButtonActionPerformed(evt);
            }
        });

        userTypeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Tutor", "Admin" }));

        UserTypeLabel.setText("User Type");

        javax.swing.GroupLayout SI_JPanelLayout = new javax.swing.GroupLayout(SI_JPanel);
        SI_JPanel.setLayout(SI_JPanelLayout);
        SI_JPanelLayout.setHorizontalGroup(
            SI_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SI_JPanelLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(SI_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(SI_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SI_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SI_UNLabel)
                    .addComponent(SI_PasswordLabel)
                    .addComponent(UserTypeLabel))
                .addGap(18, 18, 18)
                .addGroup(SI_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SI_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(SI_Username)
                    .addComponent(userTypeList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SI_JPanelLayout.setVerticalGroup(
            SI_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SI_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SI_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SI_UNLabel)
                    .addComponent(SI_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SI_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SI_PasswordLabel)
                    .addComponent(SI_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SI_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userTypeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(SI_Button)
                .addContainerGap())
        );

        SI_Username.getAccessibleContext().setAccessibleName("Usernsme");
        SI_Password.getAccessibleContext().setAccessibleName("SignInPassword");

        SU_JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign Up", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13), new java.awt.Color(102, 102, 102))); // NOI18N

        SU_FNLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        SU_FNLabel.setText("First Name");

        SU_LNLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        SU_LNLabel.setText("Last Name");

        SU_ELabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        SU_ELabel.setText("Email");

        SU_PWLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        SU_PWLabel.setText("Password");

        SU_FName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        SU_LName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        SU_Button.setBackground(new java.awt.Color(255, 255, 255));
        SU_Button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        SU_Button.setForeground(new java.awt.Color(0, 204, 204));
        SU_Button.setText("Sign Up");
        SU_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        SU_Button.setBorderPainted(false);
        SU_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SU_ButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SU_JPanelLayout = new javax.swing.GroupLayout(SU_JPanel);
        SU_JPanel.setLayout(SU_JPanelLayout);
        SU_JPanelLayout.setHorizontalGroup(
            SU_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SU_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SU_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SU_JPanelLayout.createSequentialGroup()
                        .addComponent(SU_FNLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SU_FName))
                    .addGroup(SU_JPanelLayout.createSequentialGroup()
                        .addGroup(SU_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SU_LNLabel)
                            .addComponent(SU_ELabel)
                            .addComponent(SU_PWLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SU_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SU_LName)
                            .addComponent(SU_Email)
                            .addComponent(SU_PW)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SU_JPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SU_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        SU_JPanelLayout.setVerticalGroup(
            SU_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SU_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SU_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SU_FNLabel)
                    .addComponent(SU_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SU_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SU_LNLabel)
                    .addComponent(SU_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SU_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SU_ELabel)
                    .addComponent(SU_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SU_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SU_PWLabel)
                    .addComponent(SU_PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(SU_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SU_FName.getAccessibleContext().setAccessibleName("FirstName");
        SU_LName.getAccessibleContext().setAccessibleName("LastName");
        SU_Email.getAccessibleContext().setAccessibleName("Email");
        SU_PW.getAccessibleContext().setAccessibleName("SignUpPassword");

        Welcome_JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome to TutorPlus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(0, 204, 204))); // NOI18N

        TP_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\elleb\\Desktop\\Files\\Massy Ltd Intranet\\i1.png")); // NOI18N

        TP_Description.setEditable(false);
        TP_Description.setColumns(20);
        TP_Description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TP_Description.setLineWrap(true);
        TP_Description.setRows(5);
        TP_Description.setText("TutorPlus is a software application for the administration, documentation, tracking, reporting and delivery of educational courses and programs.\n\nWe aim to help the tutors deliver material to the students, assignments, track student progress, and manage record-keeping.");
        TP_Description.setWrapStyleWord(true);
        TP_Description.setAutoscrolls(false);
        TP_Description.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        TP_Description.setOpaque(false);
        jScrollPane1.setViewportView(TP_Description);

        javax.swing.GroupLayout Welcome_JPanelLayout = new javax.swing.GroupLayout(Welcome_JPanel);
        Welcome_JPanel.setLayout(Welcome_JPanelLayout);
        Welcome_JPanelLayout.setHorizontalGroup(
            Welcome_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Welcome_JPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TP_Icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        Welcome_JPanelLayout.setVerticalGroup(
            Welcome_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Welcome_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Welcome_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Welcome_JPanelLayout.createSequentialGroup()
                        .addComponent(TP_Icon)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        Login_Exit.setBackground(new java.awt.Color(255, 255, 255));
        Login_Exit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Login_Exit.setForeground(new java.awt.Color(0, 204, 204));
        Login_Exit.setText("Exit");
        Login_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Welcome_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Login_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(SI_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SU_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SI_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(SU_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Login_Exit))
                    .addComponent(Welcome_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_ExitMouseClicked
        // TODO add your handling code here:
        Exit(0);
    }//GEN-LAST:event_Login_ExitMouseClicked

    private void SI_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SI_ButtonMouseClicked
        // TODO add your handling code here:
        if(SI_Username.getText().equals("123") && SI_Password.getText().equals("123") && userTypeList.getSelectedItem().equals("Student")) 
        {
            StudentDashboard regFace =new StudentDashboard();
            regFace.setVisible(true);
            dispose();
        }
        else if(SI_Username.getText().equals("123") && SI_Password.getText().equals("123") && userTypeList.getSelectedItem().equals("Tutor"))
        {
            TutorDashboard regFace =new TutorDashboard();
            regFace.setVisible(true);
            dispose();
        }  
        else if(SI_Username.getText().equals("123") && SI_Password.getText().equals("123") && userTypeList.getSelectedItem().equals("Admin"))
        {
            AdminDashboard regFace =new AdminDashboard();
            regFace.setVisible(true);
            dispose();
        } 
        else 
        {
            JOptionPane.showMessageDialog(null,"Wrong Password / Username");
            SI_Username.setText("");
            SI_Password.setText("");
            SI_Username.requestFocus();
        }
    }//GEN-LAST:event_SI_ButtonMouseClicked

    private void SU_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SU_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SU_ButtonMouseClicked

    private void SI_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SI_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SI_ButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_Exit;
    private javax.swing.JButton SI_Button;
    private javax.swing.JPanel SI_JPanel;
    private javax.swing.JPasswordField SI_Password;
    private javax.swing.JLabel SI_PasswordLabel;
    private javax.swing.JLabel SI_UNLabel;
    private javax.swing.JTextField SI_Username;
    private javax.swing.JButton SU_Button;
    private javax.swing.JLabel SU_ELabel;
    private javax.swing.JTextField SU_Email;
    private javax.swing.JLabel SU_FNLabel;
    private javax.swing.JTextField SU_FName;
    private javax.swing.JPanel SU_JPanel;
    private javax.swing.JLabel SU_LNLabel;
    private javax.swing.JTextField SU_LName;
    private javax.swing.JPasswordField SU_PW;
    private javax.swing.JLabel SU_PWLabel;
    private javax.swing.JTextArea TP_Description;
    private javax.swing.JLabel TP_Icon;
    private javax.swing.JLabel UserTypeLabel;
    private javax.swing.JPanel Welcome_JPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> userTypeList;
    // End of variables declaration//GEN-END:variables

    private void Exit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
