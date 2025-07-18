/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Models.HocKy;
import Models.Monhoc;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.qlsinhvien.ExcelExporter;

/**
 *
 * @author LNV
 */
public class MonView extends javax.swing.JPanel {

    private java.util.HashMap<String, String> hkMap = new java.util.HashMap<>(); // key = tên hk, value = mã hk
    private java.util.HashMap<String, String> hkMapReverse = new java.util.HashMap<>();  // key = mã hk, value = tên hk

    /**
     * Creates new form MonView
     */
    public MonView() {
        initComponents();
        loadhocky();
        loadtb();
        btncapnhat.setEnabled(false);
        btnluu.setEnabled(false);
        btnxoa.setEnabled(false);
        cbxfindhocky.addActionListener(e -> loadmonhoctheohk());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttenmon = new javax.swing.JTextField();
        txtmamon = new javax.swing.JTextField();
        txtsotinchi = new javax.swing.JTextField();
        btnluu = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btncapnhat = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnxuatexxcel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtgiatin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxhocky = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtfindmalop = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfindtenlop = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        cbxfindhocky = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã môn", "Tên môn", "Số tín chỉ", "Giá tín chỉ", "Học kì"
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
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel2.setText("Mã môn:");

        jLabel3.setText("Tên môn:");

        jLabel4.setText("Số tín chỉ:");

        txtsotinchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsotinchiActionPerformed(evt);
            }
        });

        btnluu.setText("Lưu");
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btncapnhat.setText("Cập nhật");
        btncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnxuatexxcel.setText("Xuất Excel");
        btnxuatexxcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxuatexxcelActionPerformed(evt);
            }
        });

        jLabel7.setText("Giá tín chỉ :");

        jLabel8.setText("Học kì:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnthem)
                        .addGap(18, 18, 18)
                        .addComponent(btnluu)
                        .addGap(18, 18, 18)
                        .addComponent(btncapnhat)
                        .addGap(18, 18, 18)
                        .addComponent(btnxoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnxuatexxcel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmamon)
                            .addComponent(txtsotinchi)
                            .addComponent(cbxhocky, 0, 129, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttenmon)
                            .addComponent(txtgiatin, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txttenmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsotinchi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtgiatin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxhocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnluu)
                    .addComponent(btncapnhat)
                    .addComponent(btnxoa)
                    .addComponent(btnxuatexxcel))
                .addGap(27, 27, 27))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý môn học");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Mã môn:");

        jLabel6.setText("Tên môn:");

        btntimkiem.setText("Tìm kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        cbxfindhocky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxfindhockyActionPerformed(evt);
            }
        });

        jLabel9.setText("Học kì:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtfindmalop, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfindtenlop, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxfindhocky, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntimkiem)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfindmalop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtfindtenlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem)
                    .addComponent(cbxfindhocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 private void loadhocky() {
        try {
            URL url = new URL("http://localhost:8080/api/hocky");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            Gson gson = new Gson();
            HocKy[] list = gson.fromJson(response.toString(), HocKy[].class);

            cbxhocky.removeAllItems();
            cbxhocky.addItem("---Chọn học kỳ---");
            cbxfindhocky.addItem("---Chọn học kỳ---");
            for (HocKy hk : list) {
                cbxhocky.addItem(hk.getTenhk());
                cbxfindhocky.addItem(hk.getTenhk());
                hkMap.put(hk.getTenhk(), hk.getMahk());
                hkMapReverse.put(hk.getMahk(), hk.getTenhk());
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi nạp dữ liệu học kỳ!");
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        btnluu.setEnabled(false);
        btncapnhat.setEnabled(true);
        btnxoa.setEnabled(true);
        int selectedRow = jTable1.getSelectedRow();
        txtmamon.setEnabled(false);
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String malop = jTable1.getValueAt(selectedRow, 0).toString();
            String tenlop = jTable1.getValueAt(selectedRow, 1).toString();
            String khoa = jTable1.getValueAt(selectedRow, 2).toString();
            String giatin = jTable1.getValueAt(selectedRow, 3).toString();
            String hocki = jTable1.getValueAt(selectedRow, 4).toString();
            // Hiển thị lên các ô nhập liệu
            txtmamon.setText(malop);
            txttenmon.setText(tenlop);
            txtsotinchi.setText(khoa);
            txtgiatin.setText(giatin);
            cbxhocky.setSelectedItem(hocki);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtsotinchiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsotinchiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsotinchiActionPerformed

    private Monhoc validateAndGetMonhoc() {
        String mamon = txtmamon.getText().trim();
        String tenmon = txttenmon.getText().trim();
        String sotinchiStr = txtsotinchi.getText().trim();
        String giatinStr = txtgiatin.getText().trim();
        String mahk = hkMap.get(cbxhocky.getSelectedItem().toString());
        if (mamon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã môn!");
            return null;
        }

        if (tenmon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên môn!");
            return null;
        }

        int sotinchi;
        try {
            sotinchi = Integer.parseInt(sotinchiStr);
            if (sotinchi <= 0) {
                JOptionPane.showMessageDialog(this, "Số tín chỉ phải lớn hơn 0!");
                return null;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số tín chỉ phải là số nguyên!");
            return null;
        }

        double giatin;
        try {
            giatin = Double.parseDouble(giatinStr);
            if (giatin <= 0) {
                JOptionPane.showMessageDialog(this, "Giá tín chỉ phải lớn hơn 0!");
                return null;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá tín chỉ phải là số!");
            return null;
        }
        if (cbxhocky.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn học kỳ!");
            return null;
        }

        return new Monhoc(mamon, tenmon, sotinchi, giatin, mahk);
    }

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        Monhoc mon = validateAndGetMonhoc();
        if (mon == null) {
            return;
        }
        Gson gson = new Gson();
        String jsonInputString = gson.toJson(mon);

        try {
            URL url = new URL("http://localhost:8080/api/mon");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setDoOutput(true);

            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);

            }
            int code = con.getResponseCode();
            if (code == HttpURLConnection.HTTP_CREATED || code == HttpURLConnection.HTTP_OK) {
                JOptionPane.showMessageDialog(this, "Thêm mới thành công");
                loadtb();
            } else {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "utf-8"))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }

                    JOptionPane.showMessageDialog(this, "Thêm mới thất bại: " + response.toString());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnluuActionPerformed

    private void clear() {
        txtmamon.setText("");
        txttenmon.setText("");
        txtsotinchi.setText("");
        txtgiatin.setText("");
    }
    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        clear();
        txtmamon.setEnabled(true);
        btnluu.setEnabled(true);
        btncapnhat.setEnabled(false);
        btnxoa.setEnabled(false);
    }//GEN-LAST:event_btnthemActionPerformed

    private void btncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatActionPerformed
        Monhoc mon = validateAndGetMonhoc();
        if (mon == null) {
            return;
        }
        String mamon = txtmamon.getText().trim();
        Gson gson = new Gson();
        String jsonInputString = gson.toJson(mon);
        try {
            URL url = new URL("http://localhost:8080/api/mon/" + mamon);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("PUT");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setDoOutput(true);

            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_NO_CONTENT) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                loadtb();
                txtmamon.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại. Mã lỗi: " + responseCode);
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối: " + e.getMessage());
        }
    }//GEN-LAST:event_btncapnhatActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        int selectRow = jTable1.getSelectedRow();

        if (selectRow < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.");
            return;
        }
        String mamon = jTable1.getValueAt(selectRow, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa", "Xác nhận xóa", JOptionPane.YES_NO_OPTION
        );
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String encodedMaMon = URLEncoder.encode(mamon, "UTF-8");
                URL url = new URL("http://localhost:8080/api/mon/" + encodedMaMon);

                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("DELETE");
                con.setRequestProperty("Content-Type", "application/json; utf-8");

                int responseCode = con.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_NO_CONTENT) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    loadtb();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại ");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnxuatexxcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxuatexxcelActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Lưu file Excel");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            // Nếu chưa có đuôi .xlsx thì thêm vào
            if (!path.toLowerCase().endsWith(".xlsx")) {
                path += ".xlsx";
            }
            try {
                ExcelExporter.exportTable(jTable1, path);
                JOptionPane.showMessageDialog(this, "Xuất file Excel thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi xuất file Excel: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnxuatexxcelActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        String mamon = txtfindmalop.getText().trim();
        String tenmon = txtfindtenlop.getText().trim();
        try {
            String urlStr = String.format(
                    "http://localhost:8080/api/mon/search?mamon=%s&tenmon=%s",
                    URLEncoder.encode(mamon, StandardCharsets.UTF_8),
                    URLEncoder.encode(tenmon, StandardCharsets.UTF_8)
            );

            HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Lỗi HTTP: " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            conn.disconnect();

            Gson gson = new Gson();
            Monhoc[] dsmon = gson.fromJson(sb.toString(), Monhoc[].class);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            for (Monhoc mon : dsmon) {
                model.addRow(new Object[]{
                    mon.getMamon(),
                    mon.getTenmon(),
                    mon.getSotinchi(),
                    mon.getGiaTinchi()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm sinh viên: " + e.getMessage());
        }
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void cbxfindhockyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxfindhockyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxfindhockyActionPerformed

    private void loadtb() {
        try {
            URL url = new URL("http://localhost:8080/api/mon");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            Gson gson = new Gson();
            Monhoc[] dsmon = gson.fromJson(response.toString(), Monhoc[].class);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            for (Monhoc mon : dsmon) {
                String tenhk = hkMapReverse.get(mon.getMahk());
                model.addRow(new Object[]{
                    mon.getMamon(),
                    mon.getTenmon(),
                    mon.getSotinchi(),
                    mon.getGiaTinchi(),
                    tenhk
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi gọi API" + e.getMessage());
        }
    }

    private void loadmonhoctheohk() {
        String selectedText = cbxfindhocky.getSelectedItem().toString();
        String selectedhk = hkMap.get(selectedText);

        if (selectedhk == null) {
            loadtb();
        } else {
            try {
                URL url = new URL("http://localhost:8080/api/mon/theohocky/" + URLEncoder.encode(selectedhk, "UTF-8"));
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));

                StringBuilder response = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
                br.close();

                Gson gson = new Gson();
                Monhoc[] dsmon = gson.fromJson(response.toString(), Monhoc[].class);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                for (Monhoc mon : dsmon) {
                    String tenhk = hkMapReverse.get(mon.getMahk());
                    model.addRow(new Object[]{
                        mon.getMamon(),
                        mon.getTenmon(),
                        mon.getSotinchi(),
                        mon.getGiaTinchi(),
                        tenhk
                    });
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi tải môn học theo học kỳ");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapnhat;
    private javax.swing.JButton btnluu;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxuatexxcel;
    private javax.swing.JComboBox<String> cbxfindhocky;
    private javax.swing.JComboBox<String> cbxhocky;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtfindmalop;
    private javax.swing.JTextField txtfindtenlop;
    private javax.swing.JTextField txtgiatin;
    private javax.swing.JTextField txtmamon;
    private javax.swing.JTextField txtsotinchi;
    private javax.swing.JTextField txttenmon;
    // End of variables declaration//GEN-END:variables
}
