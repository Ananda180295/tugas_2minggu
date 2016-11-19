package swing;
public class pelanggan_class {
    private String kode, nama, alamat, telepon;

public pelanggan_class(String kode, String nama, String alamat, String telepon) {
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public pelanggan_class() {
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }


}
