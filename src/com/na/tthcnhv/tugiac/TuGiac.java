package com.na.tthcnhv.tugiac;
import com.na.tthcnhv.dinh.Dinh;


public abstract class TuGiac {
    protected Dinh dinhA, dinhB, dinhC, dinhD;
    protected double chuVi, dienTich;

    public void nhapTT(Dinh giaTriDinhA, Dinh giaTriDinhB, Dinh giaTriDinhC, Dinh giaTriDinhD) {
        dinhA = giaTriDinhA;
        dinhB = giaTriDinhB;
        dinhC = giaTriDinhC;
        dinhD = giaTriDinhD;
    }

    protected abstract void tinhChuVi();

    protected abstract void tinhDienTich();

    public void inTT() {
        dinhA.inXY();
        dinhB.inXY();
        dinhC.inXY();
        dinhD.inXY();

        System.out.println("Chu  vi:" + chuVi);
        System.out.println("Dien tich" + dienTich) ;
    }
}
