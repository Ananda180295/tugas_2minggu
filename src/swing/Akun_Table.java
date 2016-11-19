package swing;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Akun_Table extends AbstractTableModel {
    List<akun_class> akun = new ArrayList<>();
    String[] kolom = {"Username", "Nama", "Password", "Status"};
    
public Akun_Table (List<akun_class> akun) {
    this.akun = akun;
}

public String getColumnName(int index) {
        return kolom[index];
        
    }

    @Override
    public int getRowCount() {
        return akun.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return kolom.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return akun.get(rowIndex).getUsername();
            case 1: return akun.get(rowIndex).getNama();
            case 2: return akun.get(rowIndex).getPassword();
            case 3: return akun.get(rowIndex).getStatus();
            default: return null;
        }
    }
}

