package com.na.tthcnhv.main;
import com.na.tthcnhv.dinh.Dinh;
import com.na.tthcnhv.tugiac.HinhChuNhat;
import com.na.tthcnhv.tugiac.TuGiac;
import com.na.tthcnhv.tugiac.HinhVuong;

public class Main {
    public static void main(String[] args) {
        Dinh d_A = new Dinh();
        d_A.nhapXY(0 ,0);
        Dinh d_B = new Dinh();
        d_B.nhapXY(2, 3);

        Dinh d_C = new Dinh();
        d_C.nhapXY(4, 5);

        Dinh d_D = new Dinh();
        d_D.nhapXY(6, 7);

        HinhVuong hv = new HinhVuong();
        hv.nhapTT(d_A, d_B, d_C, d_D);
        hv.tinhDoDaiCanh();
        hv.tinhChuVi();

        hv.inTT();
    }
}
