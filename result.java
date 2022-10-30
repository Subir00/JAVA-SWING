import java.awt.Color;

import javax.swing.*;
import javax.swing.event.*;
public class result {
    result() {
        JFrame f = new JFrame("Result");

        String data[][]={ {"SUMIT","20010200","B-TECH","4th","9.5"},
                {"FAIZ","20010201","B-TECH","4th","9.2"},
                {"SUBIR","20010202","B-TECH","4th","9.3"},
                {"PIYUSH","20010203","B-TECH","4th","9.4"},
                {"AKANSHYA","20010204","B-TECH","4th","9.8"},
                {"AKASH","20010205","B-TECH","4th","9.0"},
                {"APARNA","20010206","B-TECH","4th","9.1"},
                {"SHWETA","20010207","B-TECH","4th","9.6"},
                {"SAHIL","20010208","B-TECH","4th","9.7"},
        };
        String column[]={"NAME","REGD_NO","COURSE","SEMESTER","CGPA"};
        final JTable jt=new JTable(data,column);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select= jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String Data = null;
                int[] row = jt.getSelectedRows();
                int[] columns = jt.getSelectedColumns();
                for (int i = 0; i < row.length; i++) {
                    for (int j = 0; j < columns.length; j++) {
                        Data = (String) jt.getValueAt(row[i], columns[j]);
                    } }
                System.out.println("Table element selected is: " + Data);
            }
        });
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(900, 600);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new result();
    }
}