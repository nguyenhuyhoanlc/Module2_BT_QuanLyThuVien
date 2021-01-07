import java.util.Scanner;

public class main {
    static Manager manager = new Manager();
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1.Add new Studenr");
            System.out.println("2.Add new Card");
            System.out.println("3.Show new Student");
            System.out.println("4.Show new Card");
            System.out.println("5.Show all Student up to date");
            System.out.println("6.Seach Student");
            System.out.println("0.Exit");
            System.out.println("enter choice");
            choice =Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập họ và tên SV :");
                    String hoTen = sc.nextLine();
                    System.out.println("Nhập mã SV :");
                    int maSV = sc1.nextInt();
                    System.out.println("Nhập ngày tháng năm sinh :");
                    int ngaySinh = sc.nextInt();
                    System.out.println("Nhập lớp học:");
                    int lopHoc = sc1.nextInt();
                    Student student = new Student(hoTen, maSV, ngaySinh,lopHoc);
                    manager.addNewStudent(student);
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Nhập số phiếu mượn :");
                    int soPhieuMuon = sc.nextInt();
                    System.out.println("Nhập ngày mượn :");
                    int ngayMuon = sc1.nextInt();
                    System.out.println("Nhập số hiệu sách");
                    int sohieuSach = sc.nextInt();
                    System.out.println("Nhập hạn trả");
                    int ngayTra = sc1.nextInt();
                    Card card = new Card(ngayMuon, ngayTra, soPhieuMuon, sohieuSach);
                    manager.addNewCard(card);
                    sc.nextLine();
                    break;
                case 3:
                    manager.showAllStudent();
                    break;
                case 4:
                    manager.showAllCard();
                    break;
                case 5:
                    manager.showAllStudentUpToDate();
                    break;
                case 6:
                    manager.seachStudent();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
            }
        } while (choice !=0);
        System.exit(0);

    }
}
