import java.awt.Color;

import javax.swing.*;
import javax.swing.event.*;
public class f_detail {
    f_detail() {
        JFrame f = new JFrame("Faculty Details");

        String data[][]={{"Sampa sahoo","FID004","CSE"},
                {"Subasish Pattnaik","FID005","CSE"},
                {"Sanchita Mohanty","FID008","CSE"},
                {"Anoop Gupta","FID000","ETC"},
                {"Swati Sipra Das","FID014","CIVIL"},
                {"Mamta Wagh","FID002","CSE"},
                {"Prashant Mohanty","FID003","CSE"},
                {"Chandan Sahoo","FID015","CSE"},
                {"Bichitrananda Behera","FID016","CSE"},
                {"Santosh Sahoo","FID017","CSE"}};
        String column[]={"FACULTY NAME","FID","DEPARTMENT"};
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
        new f_detail();
    }
}