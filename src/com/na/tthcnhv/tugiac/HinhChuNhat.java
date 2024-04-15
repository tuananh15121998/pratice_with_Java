package com.na.tthcnhv.tugiac;

public class HinhChuNhat extends TuGiac{
    private double chieuDai, chieuRong;

    public void tinhChieuDaiChieuRong() {
        double powX = Math.pow(dinhA.getX() - dinhB.getX(), 2);
        double powY = Math.pow(dinhA.getY() - dinhB.getY(), 2);
        chieuDai = Math.sqrt(powX + powY);

        powX = Math.pow(dinhA.getX() - dinhD.getX(), 2);
        powY = Math.pow(dinhA.getY() - dinhD.getY(), 2);
        chieuRong = Math.sqrt(powX + powY);
    }
    @Override
    public void tinhChuVi() {
        chuVi = (chieuDai + chieuRong) * 2;
    }

    @Override
    public void tinhDienTich() {
        dienTich = chieuDai * chieuRong;
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Chieu dai: " + chieuDai);
        System.out.println("Chieu rong: " + chieuRong);
    }
}
