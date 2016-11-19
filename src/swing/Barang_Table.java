package swing;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Barang_Table extends AbstractTableModel {
List<barang_class> daftarbarang = new ArrayList<>();
String[] kolom = {"Kode", "Nama Barang", "Harga"};

    public Barang_Table(List<barang_class> daftarbarang) {
        this.daftarbarang = daftarbarang;
    }

    public String getColumnName(int index) {
        return kolom[index];
    } 
                 
    @Override
    public int getRowCount() {
        return daftarbarang.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return daftarbarang.get(rowIndex).getKode();
            case 1: return daftarbarang.get(rowIndex).getNama();
            case 2: return daftarbarang.get(rowIndex).getHarga();
            default: return null;
        }
    }
  
}
