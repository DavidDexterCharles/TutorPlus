/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elleb
 */
public class EditStudent extends javax.swing.JFrame {

    /**
     * Creates new form EditStudent
     */
    public EditStudent() {
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
        StudentCoursesJPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        StudentCourseListPrintout = new javax.swing.JList<>();
        UnregiesterCourse = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        TutorFirstNameJLabel = new javax.swing.JLabel();
        TutorLastNameJLabel = new javax.swing.JLabel();
        TutorEmailJLabel = new javax.swing.JLabel();
        TutorMiddleNamejLabel = new javax.swing.JLabel();
        StudentFN = new javax.swing.JTextField();
        StudentLN = new javax.swing.JTextField();
        StudentMN = new javax.swing.JTextField();
        StudentEmail = new javax.swing.JTextField();
        UpdateStudent = new javax.swing.JButton();
        PasswordJLabel = new javax.swing.JLabel();
        StudentPassword = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        PageLabel2 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MyDashboardMenu = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MyProfileJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("My Profile"));

        jLabel2.setText("UserName of logged in user");

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

        StudentCoursesJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("My Courses"));

        StudentCourseListPrintout.setBackground(new java.awt.Color(240, 240, 240));
        StudentCourseListPrintout.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "List of all registered courses" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        StudentCourseListPrintout.setMaximumSize(new java.awt.Dimension(500, 18));
        jScrollPane3.setViewportView(StudentCourseListPrintout);

        UnregiesterCourse.setText("Unregister for course");

        javax.swing.GroupLayout StudentCoursesJPanelLayout = new javax.swing.GroupLayout(StudentCoursesJPanel);
        StudentCoursesJPanel.setLayout(StudentCoursesJPanelLayout);
        StudentCoursesJPanelLayout.setHorizontalGroup(
            StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                        .addComponent(UnregiesterCourse)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        StudentCoursesJPanelLayout.setVerticalGroup(
            StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(UnregiesterCourse)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MyProfileJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StudentCoursesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MyProfileJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StudentCoursesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TutorFirstNameJLabel.setText("First Name");

        TutorLastNameJLabel.setText("Last Name");

        TutorEmailJLabel.setText("Email");

        TutorMiddleNamejLabel.setText("Middle Name");

        UpdateStudent.setText("Update Profile");
        UpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentActionPerformed(evt);
            }
        });

        PasswordJLabel.setText("Password");

        StudentPassword.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TutorEmailJLabel)
                            .addComponent(PasswordJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(StudentEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                    .addComponent(UpdateStudent)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TutorFirstNameJLabel)
                            .addComponent(TutorLastNameJLabel)
                            .addComponent(TutorMiddleNamejLabel))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(StudentMN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(StudentLN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentFN, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TutorFirstNameJLabel)
                    .addComponent(StudentFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TutorLastNameJLabel)
                    .addComponent(StudentLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TutorMiddleNamejLabel)
                    .addComponent(StudentMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TutorEmailJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordJLabel)
                    .addComponent(StudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateStudent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PageLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PageLabel2.setText("Edit My Profile");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PageLabel2)
                .addContainerGap(540, Short.MAX_VALUE))
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
        MenuBar.add(MyDashboardMenu);

        Exit.setText("Exit");
        Exit.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
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
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateStudentActionPerformed

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
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EditStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Exit;
    private javax.swing.JButton LogOutTutor;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MyDashboardMenu;
    private javax.swing.JPanel MyProfileJPanel;
    private javax.swing.JLabel PageLabel2;
    private javax.swing.JLabel PasswordJLabel;
    private javax.swing.JList<String> StudentCourseListPrintout;
    private javax.swing.JPanel StudentCoursesJPanel;
    private javax.swing.JTextField StudentEmail;
    private javax.swing.JTextField StudentFN;
    private javax.swing.JTextField StudentLN;
    private javax.swing.JTextField StudentMN;
    private javax.swing.JPasswordField StudentPassword;
    private javax.swing.JLabel TutorEmailJLabel;
    private javax.swing.JLabel TutorFirstNameJLabel;
    private javax.swing.JLabel TutorLastNameJLabel;
    private javax.swing.JLabel TutorMiddleNamejLabel;
    private javax.swing.JButton UnregiesterCourse;
    private javax.swing.JButton UpdateStudent;
    private javax.swing.JButton ViewTutorInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
