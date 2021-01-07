public class Student {
    private String hoTen;
    private int maSV;
    private int ngaySinh;
    private int lopHoc;

    public Student(int id) {
    }

    public Student(String hoTen, int maSV, int ngaySinh, int lopHoc) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.ngaySinh = ngaySinh;
        this.lopHoc = lopHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(int lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "sinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", maSV=" + maSV +
                ", ngaySinh=" + ngaySinh +
                ", lopHoc=" + lopHoc +
                '}';
    }
}
