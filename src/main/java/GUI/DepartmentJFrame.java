/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.DepartmentBLL;
import DAL.MyDatabaseManager;
import DTO.Department;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class DepartmentJFrame extends javax.swing.JFrame {

    DepartmentBLL depa = new DepartmentBLL();
    
    public DepartmentJFrame() {
        initComponents();
        try {
            listDepartment();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    private void listDepartment() throws SQLException {
        List<Department> list = depa.LoadDepartments(1);
        DefaultTableModel model = convertDepartment(list);
        jTable1.setModel(model);    
    }
    private DefaultTableModel convertDepartment(List list) {
        String[] columnNames = { "Mã chuyên ngành", "Tên chuyên ngành", "Học phí", "Ngày bắt đầu", "Mã quản lý"};
        Object[][] data = new Object[list.size()][5];
        for (int i = 0;i < list.size(); i++) {
            Department d = (Department) list.get(i);
            //data[i][0] = i +1;
            data[i][0] = d.getDepartmentID();
            data[i][1] = d.getName();
            data[i][2] = d.getBudget();
            data[i][3] = d.getStartDate();
            data[i][4] = d.getAdministrator();
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        return model;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtMaCN = new javax.swing.JTextField();
        jtxtTenCN = new javax.swing.JTextField();
        jtxtDate = new javax.swing.JTextField();
        jtxtHocphi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtMaQL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnAdd = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã khoa: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tên khoa :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Học phí :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ngày bắt đầu :");

        jtxtMaCN.setEditable(false);
        jtxtMaCN.setBackground(new java.awt.Color(255, 255, 255));
        jtxtMaCN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtMaCN.setCaretColor(new java.awt.Color(204, 204, 204));
        jtxtMaCN.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxtMaCN.setSelectionColor(new java.awt.Color(51, 51, 51));

        jtxtTenCN.setEditable(false);
        jtxtTenCN.setBackground(new java.awt.Color(255, 255, 255));
        jtxtTenCN.setCaretColor(new java.awt.Color(204, 204, 204));
        jtxtTenCN.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxtTenCN.setSelectionColor(new java.awt.Color(0, 0, 0));

        jtxtDate.setEditable(false);
        jtxtDate.setBackground(new java.awt.Color(255, 255, 255));
        jtxtDate.setCaretColor(new java.awt.Color(204, 204, 204));
        jtxtDate.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxtDate.setSelectionColor(new java.awt.Color(0, 0, 0));

        jtxtHocphi.setEditable(false);
        jtxtHocphi.setBackground(new java.awt.Color(255, 255, 255));
        jtxtHocphi.setCaretColor(new java.awt.Color(204, 204, 204));
        jtxtHocphi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxtHocphi.setSelectionColor(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mã quản lý:");

        jtxtMaQL.setEditable(false);
        jtxtMaQL.setBackground(new java.awt.Color(255, 255, 255));
        jtxtMaQL.setCaretColor(new java.awt.Color(204, 204, 204));
        jtxtMaQL.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxtMaQL.setSelectionColor(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Thông Tin Các Khoa");

        jbtnAdd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jbtnAdd.setText("Add");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jbtnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbtnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnUpdate)
                .addGap(18, 18, 18)
                .addComponent(jbtnReset)
                .addGap(18, 18, 18)
                .addComponent(jbtnExit)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtHocphi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtMaQL, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtMaCN, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtMaCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtxtHocphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtMaQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
       int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        System.exit(0); // Thoát ứng dụng
    }
    }//GEN-LAST:event_jbtnExitActionPerformed
 

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // đặt lại các textField
        
        
        loadDepartmentData();
        
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
       
        AddDepartment add = new AddDepartment();
        add.setVisible(true);
   
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed

    String maCN = jtxtMaCN.getText();    
    
    int row = jTable1.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một chuyên ngành để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }
   
    int confirmed = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa chuyên ngành này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
    if (confirmed == JOptionPane.YES_OPTION) {     
        String deleteQuery = "DELETE FROM department WHERE DepartmentID = ?";
        try {
            MyDatabaseManager.connectDB(); 
            PreparedStatement ps = MyDatabaseManager.getConnection().prepareStatement(deleteQuery);
            ps.setString(1, maCN);
            
            int result = ps.executeUpdate();
            
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Chuyên ngành đã được xóa thành công!");

            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy chuyên ngành với Mã CH: " + maCN);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi xóa dữ liệu từ CSDL.");
        }
        loadDepartmentData();
    }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        // Lấy thông tin của dòng đã chọn trên bảng
    int row = jTable1.getSelectedRow();
    
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một chuyên ngành để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Lấy thông tin từ dòng đã chọn
    String maCN = jTable1.getValueAt(row, 0).toString();
    String tenCN = jTable1.getValueAt(row, 1).toString();
    String hocPhi = jTable1.getValueAt(row, 2).toString();
    String ngayBatdau = jTable1.getValueAt(row, 3).toString();
    String maQuanly = jTable1.getValueAt(row, 4).toString();
    
    // Hiển thị form UpdateDepartment và truyền thông tin đã lấy được
    UpdateDepartment updateForm = new UpdateDepartment();
    updateForm.setDepartmentInfo(maCN, tenCN, hocPhi, ngayBatdau, maQuanly);
    updateForm.setVisible(true);
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        
        String maCN = jTable1.getValueAt(row, 0).toString();
        String tenCN = jTable1.getValueAt(row, 1).toString();
        String hocPhi = jTable1.getValueAt(row, 2).toString();
        String ngayBatdau = jTable1.getValueAt(row, 3).toString();
        String maQuanly = jTable1.getValueAt(row, 4).toString();
        
        
        jtxtMaCN.setText(maCN);
        jtxtTenCN.setText(tenCN);
        jtxtHocphi.setText(hocPhi);
        jtxtDate.setText(ngayBatdau);
        jtxtMaQL.setText(maQuanly);
    }//GEN-LAST:event_jTable1MouseClicked

    public void loadDepartmentData() {
    DepartmentBLL departmentBLL = new DepartmentBLL();
    ArrayList<Department> departmentList = departmentBLL.getAllDepartments();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Xóa dữ liệu hiện có trên bảng
        jtxtMaCN.setText(" ");
        jtxtTenCN.setText(" ");
        jtxtHocphi.setText(" ");
        jtxtDate.setText(" ");
        jtxtMaQL.setText("");

    for (Department d : departmentList) {
        Object[] row = new Object[5];
        row[0] = d.getDepartmentID();
        row[1] = d.getName();
        row[2] = d.getBudget();
        row[3] = d.getStartDate();
        row[4] = d.getAdministrator();
        model.addRow(row);
    }
}
    

    
   
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
            java.util.logging.Logger.getLogger(DepartmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtDate;
    private javax.swing.JTextField jtxtHocphi;
    private javax.swing.JTextField jtxtMaCN;
    private javax.swing.JTextField jtxtMaQL;
    private javax.swing.JTextField jtxtTenCN;
    // End of variables declaration//GEN-END:variables
}
