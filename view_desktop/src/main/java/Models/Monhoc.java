package Models;

public class Monhoc {

    private String mamon;
    private String tenmon;
    private int sotinchi;
    private double giaTinchi;
    private String mahk;

    public Monhoc() {
    }

    public Monhoc(String mamon, String tenmon, int sotinchi, double giaTinchi, String mahk) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotinchi = sotinchi;
        this.giaTinchi = giaTinchi;
        this.mahk = mahk;
    }

    @Override
    public String toString() {
        return mamon + " - " + tenmon;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }

    public double getGiaTinchi() {
        return giaTinchi;
    }

    public void setGiaTinchi(double giaTinchi) {
        this.giaTinchi = giaTinchi;
    }

    public String getMahk() {
        return mahk;
    }

    public void setMahk(String mahk) {
        this.mahk = mahk;
    }
}
