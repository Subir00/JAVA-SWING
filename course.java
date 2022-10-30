import java.awt.Color;

import javax.swing.*;
import javax.swing.event.*;
public class course {
    course() {
        JFrame f = new JFrame("Courses Offered");

        String data[][]={{"E123","B_TECH","600"},
                {"E134","DIPLOMA","500"},
                {"E156","MBA","150"},
                {"E110","BCA","250"},
                {"E121","MCA","300"},
                {"E178","M_TECH","100"},
                {"E543","BSC","400"},
                {"E100","MSC","200"}};
        String column[]={"COURSE ID","COURSE NAME","NO_OF_SEATS_AVAILABLE"};
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
        new course();
    }
}