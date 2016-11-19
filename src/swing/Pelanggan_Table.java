package swing;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Pelanggan_Table extends AbstractTableModel {
    List<pelanggan_class> daftarpelanggan = new ArrayList<>();
    String[] kolom = {"Kode", "Nama", "Alamat", "Telepon"};
    
public Pelanggan_Table (List<pelanggan_class> daftarpelanggan) {
    this.daftarpelanggan = daftarpelanggan;
}

public String getColumnName(int index) {
        return kolom[index];
        
    }

    @Override
    public int getRowCount() {
        return daftarpelanggan.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return kolom.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return daftarpelanggan.get(rowIndex).getKode();
            case 1: return daftarpelanggan.get(rowIndex).getNama();
            case 2: return daftarpelanggan.get(rowIndex).getAlamat();
            case 3: return daftarpelanggan.get(rowIndex).getTelepon();
            default: return null;
        }
    }
}
