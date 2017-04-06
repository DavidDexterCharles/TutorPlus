package com.tutorplus.views;

import com.tutorplus.controllers.TutorialClient;


/**
 *
 * @author elleb
 */
public class EditTutor extends javax.swing.JFrame {

    /**
     * Creates new form EditTutor
     */
    public EditTutor() {
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

        jPanel1 = new javax.swing.JPanel();
        MyProfileJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ViewTutorInfo = new javax.swing.JButton();
        LogOutTutor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ManageSudents = new javax.swing.JButton();
        ManageCourses = new javax.swing.JButton();
        ManageTutorials = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        TutorFirstNameJLabel = new javax.swing.JLabel();
        TutorLastNameJLabel = new javax.swing.JLabel();
        TutorEmailJLabel = new javax.swing.JLabel();
        TutorMiddleNamejLabel = new javax.swing.JLabel();
        TutorFN = new javax.swing.JTextField();
        TutorLN = new javax.swing.JTextField();
        TutorMN = new javax.swing.JTextField();
        DepartmentJLabel = new javax.swing.JLabel();
        TutorEmail = new javax.swing.JTextField();
        TutorDept = new javax.swing.JComboBox<>();
        UpdateTutor = new javax.swing.JButton();
        CoursesJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TutorCourses = new javax.swing.JList<>();
        PasswordJLabel = new javax.swing.JLabel();
        TutorPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        TutursJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tutors = new javax.swing.JList<>();
        EditTutor = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        PageLabel2 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MyDashboardMenu = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MyProfileJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("My Profile"));

//        jLabel2.setText("UserName of logged in user");

        //load user data
        if (TutorialClient.user !=  null) {
            
            jLabel2.setText(TutorialClient.user.getFirstName()+ " " + TutorialClient.user.getLastName());
            TutorFN.setText(TutorialClient.user.getFirstName());
            TutorLN.setText(TutorialClient.user.getLastName());
            TutorEmail.setText(TutorialClient.user.getEmail());
        }


        jLabel1.setText("Welcome");

        ViewTutorInfo.setText("View my information");

        LogOutTutor.setText("Log Out");

        javax.swing.GroupLayout MyProfileJPanelLayout = new javax.swing.GroupLayout(MyProfileJPanel);
        MyProfileJPanel.setLayout(MyProfileJPanelLayout);
        MyProfileJPanelLayout.setHorizontalGroup(
            MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyProfileJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MyProfileJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LogOutTutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewTutorInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MyProfileJPanelLayout.setVerticalGroup(
            MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyProfileJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(ViewTutorInfo)
                .addGap(18, 18, 18)
                .addComponent(LogOutTutor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        ManageSudents.setText("Manage Sudents");
        ManageSudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSudentsActionPerformed(evt);
            }
        });

        ManageCourses.setText("Manage Courses");

        ManageTutorials.setText("Manage Tutorials");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ManageSudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageTutorials, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ManageSudents)
                .addGap(18, 18, 18)
                .addComponent(ManageCourses)
                .addGap(18, 18, 18)
                .addComponent(ManageTutorials)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MyProfileJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MyProfileJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TutorFirstNameJLabel.setText("Tutor First Name");

        TutorLastNameJLabel.setText("Tutor Last Name");

        TutorEmailJLabel.setText("Email");

        TutorMiddleNamejLabel.setText("Middle Name");

        DepartmentJLabel.setText("Department");

        TutorDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TutorDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorDeptActionPerformed(evt);
            }
        });

        UpdateTutor.setText("Update Tutor");
        UpdateTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTutorActionPerformed(evt);
            }
        });

        CoursesJLabel.setText("Courses");

        TutorCourses.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(TutorCourses);

        PasswordJLabel.setText("Password");

        TutorPassword.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TutorEmailJLabel)
                            .addComponent(PasswordJLabel))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TutorEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(TutorPassword, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(UpdateTutor)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TutorFirstNameJLabel)
                            .addComponent(TutorLastNameJLabel)
                            .addComponent(TutorMiddleNamejLabel)
                            .addComponent(DepartmentJLabel)
                            .addComponent(CoursesJLabel))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TutorMN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TutorLN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TutorFN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(TutorDept, javax.swing.GroupLayout.Alignment.LEADING, 0, 306, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TutorFirstNameJLabel)
                    .addComponent(TutorFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TutorLastNameJLabel)
                    .addComponent(TutorLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TutorMiddleNamejLabel)
                    .addComponent(TutorMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepartmentJLabel)
                    .addComponent(TutorDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CoursesJLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TutorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TutorEmailJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordJLabel)
                    .addComponent(TutorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateTutor)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TutursJLabel.setText("All Tutors");

        Tutors.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Tutors);

        EditTutor.setText("Edit Tutor");
        EditTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TutursJLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 114, Short.MAX_VALUE)
                        .addComponent(EditTutor)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TutursJLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditTutor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PageLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PageLabel2.setText("Edit Tutor");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PageLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PageLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MyDashboardMenu.setText("My Dashboard");
        MyDashboardMenu.setActionCommand("");
        MyDashboardMenu.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        MyDashboardMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyDashboardMenuMouseClicked(evt);
            }
        });
        MenuBar.add(MyDashboardMenu);

        Exit.setText("Exit");
        Exit.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        MenuBar.add(Exit);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageSudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSudentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageSudentsActionPerformed

    private void UpdateTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateTutorActionPerformed

    private void EditTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditTutorActionPerformed

    private void TutorDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TutorDeptActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void MyDashboardMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyDashboardMenuMouseClicked
        // TODO add your handling code here:
        TutorDashboard regFace =new TutorDashboard();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_MyDashboardMenuMouseClicked

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
            java.util.logging.Logger.getLogger(EditTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EditTutor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CoursesJLabel;
    private javax.swing.JLabel DepartmentJLabel;
    private javax.swing.JButton EditTutor;
    private javax.swing.JMenu Exit;
    private javax.swing.JButton LogOutTutor;
    private javax.swing.JButton ManageCourses;
    private javax.swing.JButton ManageSudents;
    private javax.swing.JButton ManageTutorials;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MyDashboardMenu;
    private javax.swing.JPanel MyProfileJPanel;
    private javax.swing.JLabel PageLabel2;
    private javax.swing.JLabel PasswordJLabel;
    private javax.swing.JList<String> TutorCourses;
    private javax.swing.JComboBox<String> TutorDept;
    private javax.swing.JTextField TutorEmail;
    private javax.swing.JLabel TutorEmailJLabel;
    private javax.swing.JTextField TutorFN;
    private javax.swing.JLabel TutorFirstNameJLabel;
    private javax.swing.JTextField TutorLN;
    private javax.swing.JLabel TutorLastNameJLabel;
    private javax.swing.JTextField TutorMN;
    private javax.swing.JLabel TutorMiddleNamejLabel;
    private javax.swing.JPasswordField TutorPassword;
    private javax.swing.JList<String> Tutors;
    private javax.swing.JLabel TutursJLabel;
    private javax.swing.JButton UpdateTutor;
    private javax.swing.JButton ViewTutorInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
