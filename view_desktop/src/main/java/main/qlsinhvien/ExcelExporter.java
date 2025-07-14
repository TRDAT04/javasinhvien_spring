package main.qlsinhvien;


import java.io.FileOutputStream;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExporter {

    public static void exportTable(JTable table, String filePath) throws Exception {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Dữ liệu Sinh viên");

        TableModel model = table.getModel();

        // Tạo header
        Row headerRow = sheet.createRow(0);
        for (int col = 0; col < model.getColumnCount(); col++) {
            Cell cell = headerRow.createCell(col);
            cell.setCellValue(model.getColumnName(col));
        }

        // Điền dữ liệu
        for (int row = 0; row < model.getRowCount(); row++) {
            Row excelRow = sheet.createRow(row + 1);
            for (int col = 0; col < model.getColumnCount(); col++) {
                Cell cell = excelRow.createCell(col);
                Object value = model.getValueAt(row, col);
                if (value != null) {
                    if (value instanceof Number) {
                        cell.setCellValue(((Number) value).doubleValue());
                    } else if (value instanceof java.util.Date) {
                        CellStyle cellStyle = workbook.createCellStyle();
                        CreationHelper createHelper = workbook.getCreationHelper();
                        cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd/MM/yyyy"));
                        cell.setCellStyle(cellStyle);
                        cell.setCellValue((java.util.Date) value);
                    } else {
                        cell.setCellValue(value.toString());
                    }
                }
            }
        }

        // Tự động chỉnh kích thước cột
        for (int col = 0; col < model.getColumnCount(); col++) {
            sheet.autoSizeColumn(col);
        }

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
        }
        workbook.close();
    }
}
