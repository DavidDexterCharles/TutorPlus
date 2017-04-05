package com.tutorplus.views;

import com.tutorplus.application_core.TutorPlusApplicationIntf;
import com.tutorplus.controllers.TutorialClient;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author elleb
 */
public class StudentDashboard extends javax.swing.JFrame {
    TutorialClient client;
    TutorPlusApplicationIntf loginInterface;

    /**
     * Creates new form StudentDashboard
     */
    public StudentDashboard() {
        initComponents();
        
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
                 client=new TutorialClient();
                 loginInterface=client.tutorplusIntf;
//            }
//        });
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ViewStudentInfo = new javax.swing.JButton();
        LogOutStudent = new javax.swing.JButton();
        StudentCoursesJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentCourseListPrintout = new javax.swing.JList<>();
        UnregiesterCourse = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CourseSearchJPanel = new javax.swing.JPanel();
        SearchCourseInput = new javax.swing.JTextField();
        SearchCourse = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        SearchCoursePrintout = new javax.swing.JList<>();
        RegisterCourse = new javax.swing.JButton();
        ViewCourseInfo = new javax.swing.JButton();
        CourseOverviewJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentTutorialMainListPrintout = new javax.swing.JList<>();
        OpenStudentTutorial = new javax.swing.JButton();
        PageLabel = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MyDashboardMenu = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1030, 650));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MyProfileJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("My Profile"));

        jLabel1.setText("Welcome");

        jLabel2.setText("UserName of logged in user");

        ViewStudentInfo.setText("View my information");
        ViewStudentInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewStudentInfoMouseClicked(evt);
            }
        });

        LogOutStudent.setText("Log Out");
        LogOutStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutStudentMouseClicked(evt);
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
                        .addComponent(LogOutStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewStudentInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(ViewStudentInfo)
                .addGap(18, 18, 18)
                .addComponent(LogOutStudent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StudentCoursesJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("My Courses"));

        StudentCourseListPrintout.setBackground(new java.awt.Color(240, 240, 240));
        StudentCourseListPrintout.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "List of all registered courses" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(StudentCourseListPrintout);

        UnregiesterCourse.setText("Unregister for course");
        UnregiesterCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UnregiesterCourseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout StudentCoursesJPanelLayout = new javax.swing.GroupLayout(StudentCoursesJPanel);
        StudentCoursesJPanel.setLayout(StudentCoursesJPanelLayout);
        StudentCoursesJPanelLayout.setHorizontalGroup(
            StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                        .addComponent(UnregiesterCourse)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        StudentCoursesJPanelLayout.setVerticalGroup(
            StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(UnregiesterCourse)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StudentCoursesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MyProfileJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        RegisterCourse.setText("Register for course");
        RegisterCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterCourseMouseClicked(evt);
            }
        });

        ViewCourseInfo.setText("View Course Information");
        ViewCourseInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewCourseInfoMouseClicked(evt);
            }
        });

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
                        .addGroup(CourseSearchJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchCourse)
                            .addComponent(ViewCourseInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegisterCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(ViewCourseInfo)
                .addGap(18, 18, 18)
                .addComponent(RegisterCourse)
                .addContainerGap())
        );

        CourseOverviewJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tutorial Overview"));

        StudentTutorialMainListPrintout.setBackground(new java.awt.Color(240, 240, 240));
        StudentTutorialMainListPrintout.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Print out of all tutorials registered for" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(StudentTutorialMainListPrintout);

        OpenStudentTutorial.setText("Open Tutorial");
        OpenStudentTutorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenStudentTutorialMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CourseOverviewJPanelLayout = new javax.swing.GroupLayout(CourseOverviewJPanel);
        CourseOverviewJPanel.setLayout(CourseOverviewJPanelLayout);
        CourseOverviewJPanelLayout.setHorizontalGroup(
            CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                        .addComponent(OpenStudentTutorial)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CourseOverviewJPanelLayout.setVerticalGroup(
            CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OpenStudentTutorial)
                .addContainerGap())
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CourseOverviewJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CourseSearchJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PageLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PageLabel.setText("Student Dashboard");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PageLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchCourseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCourseInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchCourseInputActionPerformed

    private void ViewStudentInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStudentInfoMouseClicked
        // TODO add your handling code here:
        EditStudent regFace =new EditStudent();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewStudentInfoMouseClicked

    private void LogOutStudentMouseClicked(java.awt.event.MouseEvent evt) {
        
        
        try {
        //GEN-FIRST:event_LogOutStudentMouseClicked
        
        TutorialClient.tutorplusIntf.logout(TutorialClient.userSession);
        // TODO add your handling code here:
        Login regFace =new Login();
        regFace.setVisible(true);
        dispose();
        
        } //GEN-LAST:event_LogOutStudentMouseClicked
        catch (RemoteException ex) {
            Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void UnregiesterCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnregiesterCourseMouseClicked
        // TODO add your handling code here:
        if (!"".equals(StudentCourseListPrintout.getSelectedValue())){
          JOptionPane.showMessageDialog(null,"You have just unregistered for "+StudentCourseListPrintout.getSelectedValue());  
        }       
    }//GEN-LAST:event_UnregiesterCourseMouseClicked

    private void RegisterCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterCourseMouseClicked
        // TODO add your handling code here:
        if (!"".equals(SearchCoursePrintout.getSelectedValue())){
          JOptionPane.showMessageDialog(null,"You have just registered for "+SearchCoursePrintout.getSelectedValue()); 
        }
    }//GEN-LAST:event_RegisterCourseMouseClicked

    private void ViewCourseInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewCourseInfoMouseClicked
        // TODO add your handling code here:
        StudenCourse regFace =new StudenCourse();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewCourseInfoMouseClicked

    private void MyDashboardMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyDashboardMenuMouseClicked
        // TODO add your handling code here:
        StudentDashboard regFace =new StudentDashboard();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_MyDashboardMenuMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void OpenStudentTutorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenStudentTutorialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenStudentTutorialMouseClicked

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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StudentDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CourseOverviewJPanel;
    private javax.swing.JPanel CourseSearchJPanel;
    private javax.swing.JMenu Exit;
    private javax.swing.JButton LogOutStudent;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MyDashboardMenu;
    private javax.swing.JPanel MyProfileJPanel;
    private javax.swing.JButton OpenStudentTutorial;
    private javax.swing.JLabel PageLabel;
    private javax.swing.JButton RegisterCourse;
    private javax.swing.JButton SearchCourse;
    private javax.swing.JTextField SearchCourseInput;
    private javax.swing.JList<String> SearchCoursePrintout;
    private javax.swing.JList<String> StudentCourseListPrintout;
    private javax.swing.JPanel StudentCoursesJPanel;
    private javax.swing.JList<String> StudentTutorialMainListPrintout;
    private javax.swing.JButton UnregiesterCourse;
    private javax.swing.JButton ViewCourseInfo;
    private javax.swing.JButton ViewStudentInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void Exit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
