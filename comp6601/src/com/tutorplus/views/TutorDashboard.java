package com.tutorplus.views;

import com.tutorplus.controllers.TutorialClient;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elleb
 */
public class TutorDashboard extends javax.swing.JFrame {

    /**
     * Creates new form TutorDashboard
     */
    public TutorDashboard() {
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
        EditCourse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TutorCourseListPrintout = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        CourseOverviewJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TutorCourseMainListPrintout = new javax.swing.JList<>();
        TutorCreateCourse = new javax.swing.JButton();
        CourseSearchJPanel = new javax.swing.JPanel();
        SearchCourseInput = new javax.swing.JTextField();
        SearchCourse = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        SearchCoursePrintout = new javax.swing.JList<>();
        ViewSearchedCourseInfo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        PageLabel = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MyDashboardMenu = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 1000));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MyProfileJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("My Profile"));
        if (TutorialClient.user != null) {

         jLabel2.setText(TutorialClient.user.getFirstName()+ " " + TutorialClient.user.getLastName());
        }

        jLabel1.setText("Welcome");

        ViewTutorInfo.setText("View my information");
        ViewTutorInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewTutorInfoMouseClicked(evt);
            }
        });

        LogOutTutor.setText("Log Out");
        LogOutTutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutTutorMouseClicked(evt);
            }
        });

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

        EditCourse.setText("Edit Course Information");

        TutorCourseListPrintout.setBackground(new java.awt.Color(240, 240, 240));
        TutorCourseListPrintout.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "List of all courses tutor created" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(TutorCourseListPrintout);

        javax.swing.GroupLayout StudentCoursesJPanelLayout = new javax.swing.GroupLayout(StudentCoursesJPanel);
        StudentCoursesJPanel.setLayout(StudentCoursesJPanelLayout);
        StudentCoursesJPanelLayout.setHorizontalGroup(
            StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                        .addComponent(EditCourse)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        StudentCoursesJPanelLayout.setVerticalGroup(
            StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentCoursesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(EditCourse)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MyProfileJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(StudentCoursesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CourseOverviewJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Overview"));

        TutorCourseMainListPrintout.setBackground(new java.awt.Color(240, 240, 240));
        TutorCourseMainListPrintout.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Print out of all courses tutor teaches" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(TutorCourseMainListPrintout);

        TutorCreateCourse.setText("Create Course");

        javax.swing.GroupLayout CourseOverviewJPanelLayout = new javax.swing.GroupLayout(CourseOverviewJPanel);
        CourseOverviewJPanel.setLayout(CourseOverviewJPanelLayout);
        CourseOverviewJPanelLayout.setHorizontalGroup(
            CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                        .addComponent(TutorCreateCourse)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CourseOverviewJPanelLayout.setVerticalGroup(
            CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TutorCreateCourse)
                .addGap(26, 26, 26))
        );

        CourseSearchJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Search"));

        SearchCourseInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCourseInputActionPerformed(evt);
            }
        });

        SearchCourse.setText("Search for course");

        SearchCoursePrintout.setBackground(new java.awt.Color(240, 240, 240));
        SearchCoursePrintout.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Print out of all searched courses" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(SearchCoursePrintout);

        ViewSearchedCourseInfo.setText("View Course Information");

        javax.swing.GroupLayout CourseSearchJPanelLayout = new javax.swing.GroupLayout(CourseSearchJPanel);
        CourseSearchJPanel.setLayout(CourseSearchJPanelLayout);
        CourseSearchJPanelLayout.setHorizontalGroup(
            CourseSearchJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseSearchJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CourseSearchJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(SearchCourseInput)
                    .addGroup(CourseSearchJPanelLayout.createSequentialGroup()
                        .addGroup(CourseSearchJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchCourse)
                            .addComponent(ViewSearchedCourseInfo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CourseSearchJPanelLayout.setVerticalGroup(
            CourseSearchJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseSearchJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchCourseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchCourse)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewSearchedCourseInfo)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CourseOverviewJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CourseSearchJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CourseOverviewJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CourseSearchJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PageLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PageLabel.setText("Tutor Dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PageLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PageLabel)
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchCourseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCourseInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchCourseInputActionPerformed

    private void ViewTutorInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewTutorInfoMouseClicked
        // TODO add your handling code here:
        EditTutor regFace =new EditTutor();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewTutorInfoMouseClicked

    private void LogOutTutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutTutorMouseClicked
        // TODO add your handling code here:
        Login regFace =new Login();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutTutorMouseClicked

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
            java.util.logging.Logger.getLogger(TutorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TutorDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CourseOverviewJPanel;
    private javax.swing.JPanel CourseSearchJPanel;
    private javax.swing.JButton EditCourse;
    private javax.swing.JMenu Exit;
    private javax.swing.JButton LogOutTutor;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MyDashboardMenu;
    private javax.swing.JPanel MyProfileJPanel;
    private javax.swing.JLabel PageLabel;
    private javax.swing.JButton SearchCourse;
    private javax.swing.JTextField SearchCourseInput;
    private javax.swing.JList<String> SearchCoursePrintout;
    private javax.swing.JPanel StudentCoursesJPanel;
    private javax.swing.JList<String> TutorCourseListPrintout;
    private javax.swing.JList<String> TutorCourseMainListPrintout;
    private javax.swing.JButton TutorCreateCourse;
    private javax.swing.JButton ViewSearchedCourseInfo;
    private javax.swing.JButton ViewTutorInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
