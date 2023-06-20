package Model;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach() {

    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void inPut() {
        super.inPut();
        System.out.println("nhap ten tac gia");
        this.setTenTacGia(sc.nextLine());
        System.out.println("nhap so trang");
        this.setSoTrang(sc.nextInt());

    }
}
