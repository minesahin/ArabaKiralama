package arabakiralama2;

public class AracIsteme {
    //pojo class

    //Kiralama bilgileri
    private String alinacakSehir;
    private String alinacakGun;
    private double alisSaati;
    private String teslimGunu;
    private double teslimSaati;

    //Araba özellikleri
    private String marka;
    private String model;
    private String yakitTuru;
    private String vites;
    private double gunlukKiralamaUcreti;

    public AracIsteme(){
    }

    public AracIsteme(String alinacakSehir, String alinacakGun, double alisSaati, String teslimGunu, double teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.alisSaati = alisSaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }
    public AracIsteme(String marka, String model, String yakitTuru, String vites, double gunlukKiralamaUcreti) {
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
        this.vites = vites;
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;

    }

    @Override
    public String toString() {
        return "AracIsteme{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTürü='" + yakitTuru + '\'' +
                ", vites='" + vites + '\'' +
                ", günlükKiralamaÜcreti=" + gunlukKiralamaUcreti +
                '}';
    }

    public String getAlinacakSehir() {

        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(String alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public double getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(double alisSaati) {
        this.alisSaati = alisSaati;
    }

    public String getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(String teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public double getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(double teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGunlukKiralamaUcreti() {
        return gunlukKiralamaUcreti;
    }

    public void setGunlukKiralamaUcreti(double gunlukKiralamaUcreti) {
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }
}
