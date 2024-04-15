package com.na.tthcnhv.tugiac;

public class HinhVuong extends TuGiac{
    private double doDaiCanh;

    public void tinhDoDaiCanh(){
        double powX = Math.pow(dinhA.getX() - dinhB.getX(), 2);
        double powY = Math.pow(dinhA.getY() - dinhB.getY(), 2);
        doDaiCanh = Math.sqrt(powX + powY);
    }


    @Override
    public void tinhChuVi() {
        chuVi = doDaiCanh * 4;

    }

    @Override
    public void tinhDienTich() {
        dienTich = doDaiCanh * doDaiCanh;
    }
}
