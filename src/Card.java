import java.util.Arrays;

public class Card {
    private int soPhieuMuon;
    private int ngayMuon;
    private int hanTra;
    private int soHieuSach;

    public Card() { }

    public Card(int soPhieuMuon, int ngayMuon, int hanTra, int soHieuSach) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public int getSoPhieuMuon() { return soPhieuMuon; }

    public void setSoPhieuMuon(int soPhieuMuon) { this.soPhieuMuon = soPhieuMuon; }

    public int getNgayMuon() { return ngayMuon; }

    public void setNgayMuon(int ngayMuon) { this.ngayMuon = ngayMuon; }

    public int getHanTra() { return hanTra; }

    public void setHanTra(int hanTra) { this.hanTra = hanTra; }

    public int getSoHieuSach() { return soHieuSach; }

    public void setSoHieuSach(int soHieuSach) { this.soHieuSach = soHieuSach; }

    @Override
    public String toString() {
        return "Card{" +
                "soPhieuMuon=" + soPhieuMuon +
                ", ngayMuon=" + ngayMuon +
                ", hanTra=" + hanTra +
                ", soHieuSach=" + soHieuSach +
                '}';
    }
}
