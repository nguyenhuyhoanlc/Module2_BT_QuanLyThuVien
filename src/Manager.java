import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    List<Student> studentList = new ArrayList<>();
    List<Card> cardList = new ArrayList<>();

    public void addNewStudent(Student student){
        studentList.add(student);
    }


    public void showAllStudent(){
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    public void showAllCard(){
        for (int i = 0; i < cardList.size();i++){
            System.out.println(cardList.get(i));
        }
    }

    public void addNewCard(Card card){
        cardList.add(card);
    }

    public void showAllStudentUpToDate(){

    }

    public void seachStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID sinh viên cần tìm :");
        int seachID = sc.nextInt();
        for (int i = 0; i < studentList.size(); i++){
            if (seachID == studentList.get(i).getMaSV()) {
                System.out.println(studentList.get(i));
                return;
            }
        } System.out.println("Không tìm thấy sinh viên");
    }


}
