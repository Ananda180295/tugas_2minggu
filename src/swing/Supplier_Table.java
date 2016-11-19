package swing;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Supplier_Table extends AbstractTableModel {
    List<supplier_class> daftarsupplier = new ArrayList<>();
    String[] kolom = {"Kode", "Nama", "Alamat", "Telepon", "Nama Kontak"};
    
public Supplier_Table (List<supplier_class> daftarsupplier) {
    this.daftarsupplier = daftarsupplier;
}

public String getColumnName(int index) {
        return kolom[index];
        
    }

    @Override
    public int getRowCount() {
        return daftarsupplier.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return kolom.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return daftarsupplier.get(rowIndex).getKode();
            case 1: return daftarsupplier.get(rowIndex).getNama();
            case 2: return daftarsupplier.get(rowIndex).getAlamat();
            case 3: return daftarsupplier.get(rowIndex).getTelepon();
            case 4: return daftarsupplier.get(rowIndex).getKontak();
            default: return null;
        }
    }
}
