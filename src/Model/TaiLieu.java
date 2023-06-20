package Model;

import java.util.Scanner;

public class TaiLieu {
     Scanner sc = new Scanner(System.in);
    private int maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }
    public TaiLieu(){}

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    public void inPut(){

        System.out.println("nhap ma tai lieu: ");
        this. setMaTaiLieu(sc.nextInt());
        System.out.println("nhap ten nha xuat ban");
        this.setTenNhaXuatBan(sc.nextLine());
        System.out.println("nhap so ban phat hanh");
        this.setSoBanPhatHanh(sc.nextInt());
    }
}
