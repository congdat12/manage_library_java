package Controller;

import Model.Bao;
import Model.Sach;
import Model.TaiLieu;
import Model.TapChi;
import View.MenuUI;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<TaiLieu> quanLySach = new ArrayList<>();
    public void addSach(Sach sach){
        quanLySach.add(sach);
    }
    public void addTapChi(TapChi tapChi){
        quanLySach.add(tapChi);
    }
    public void addBao(Bao bao){
        quanLySach.add(bao);

    }
    public void deleteTaiLieu(int maTaiLieu){
        for (TaiLieu tl : quanLySach){
            if (tl.getMaTaiLieu() == maTaiLieu){
                quanLySach.remove(tl);
            }
        }
    }
    public void menuController(){
        MenuUI menuUI = new MenuUI();
        menuUI.ui();
        boolean isChecked = true;
        Scanner sc = new Scanner(System.in);
        while (isChecked){
            System.out.println("xin moi chon");
            int choose = sc.nextInt();
            switch (choose){
                case 1: Sach sach = new Sach();
                sach.inPut();
                addSach(sach);
                break;
                case 2: TapChi tapChi = new TapChi();
                tapChi.inPut();
                addTapChi(tapChi);
                break;
                case 3: Bao bao = new Bao();
                bao.inPut();
                addBao(bao);
                break;
                case 4 :
                    System.out.println("nhap ma tai lieu");
                    int maTailieu = sc.nextInt();
                    deleteTaiLieu(maTailieu);
                    break;
                case 5: isChecked = false;

            }
        }
    }
}
