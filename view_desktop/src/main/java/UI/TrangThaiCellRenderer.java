/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/**
 *
 * @author LNV
 */
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class TrangThaiCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        String trangThai = table.getModel().getValueAt(row, 4).toString();

        if (!isSelected) {
            if ("Đã nộp".equalsIgnoreCase(trangThai)) {
                c.setForeground(new Color(0, 128, 0)); // Xanh
            } else if ("Chưa nộp".equalsIgnoreCase(trangThai)) {
                c.setForeground(Color.RED); // Đỏ
            } else {
                c.setForeground(Color.BLACK);
            }
        } else {
            c.setForeground(Color.WHITE);
        }

        return c;
    }
}
