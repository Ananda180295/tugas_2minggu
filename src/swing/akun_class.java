package swing;
public class akun_class {
    private String username, nama, password, status;

    public akun_class() {
    }

public akun_class(String username, String nama, String password, String status) {
        this.username = username;
        this.nama = nama;
        this.password = password;
        this.status = status;
}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
