package Model;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao( ) {

    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void inPut() {
        super.inPut();
        System.out.println("nhap ngay phat hanh");
        this.setNgayPhatHanh(sc.nextLine());
    }
}
