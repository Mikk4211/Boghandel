public class Bog {
    public int antal;
    public double pris;
    public String titel;
    public String forfatter;

    public Bog(double pris, String titel, String forfatter){
    this.antal = antal;
    this.forfatter = forfatter;
    this.pris = pris;
    this.titel = titel;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }
}

