
package studentdbapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LUU THE TRUNG
 */
public class StudentDBapp {

    /**
     * @param args the command line arguments
     */
    
    static List<Student> studentList = new ArrayList<>();
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
	int choose;
	Menu();
	do {
            System.out.println("Choose: ");
            choose = Integer.parseInt(ip.nextLine());
            switch (choose) {
		case 1:
                    System.out.println("Nhap so sinh vien: ");
                    int n = Integer.parseInt(ip.nextLine());
                    for (int i = 0; i < n; i++) {
			Student student = new Student();
			student.inputInfo();
			student.dangKiHoc();
			studentList.add(student);
                    }
                    break;
		case 2:
                    int num;
                    miniMenu();
                    System.out.print("Find by: ");
                    num = Integer.parseInt(ip.nextLine());
                    switch (num) {
			case 1:
                            System.out.print("Enter Name: ");
                            String nameFind = ip.nextLine();
                            if(findByName(nameFind) != -1) {
                            System.out.println(studentList.get(findByName(nameFind)).toString());
                            studentList.get(findByName(nameFind)).dangKiHoc();;
                            }
                            break;
                        case 2:
                            System.out.print("Enter ID: ");
                            String codeFind = ip.nextLine();
                            if(findByCode(codeFind) != -1) {
                                System.out.println(studentList.get(findByCode(codeFind)).toString());
				studentList.get(findByName(codeFind)).dangKiHoc();
                            }
                            break;
                    }
                    break;
                case 3:
                    int num1;
                    miniMenu();
                    System.out.print("Find by: ");
                    num1 = Integer.parseInt(ip.nextLine());
                    switch (num1) {
			case 1:
                            System.out.print("Enter Name: ");
                            String nameFind = ip.nextLine();
                            if(findByName(nameFind) != -1) {
                                System.out.println(studentList.get(findByName(nameFind)).toString());
                                studentList.get(findByName(nameFind)).napTien();
                            }
                            break;
			case 2:
                            System.out.print("Enter ID: ");
                            String codeFind = ip.nextLine();
                            if(findByCode(codeFind) != -1) {
				System.out.println(studentList.get(findByCode(codeFind)).toString());
				studentList.get(findByName(codeFind)).napTien();
                            }
                            break;
                    }
                    break;
                case 4:
                    int num2;
                    miniMenu();
                    System.out.print("Find by: ");
                    num2 = Integer.parseInt(ip.nextLine());
                    switch (num2) {
			case 1:
                            System.out.print("Enter Name: ");
                            String nameFind = ip.nextLine();
                            if(findByName(nameFind) != -1) {
				System.out.println(studentList.get(findByName(nameFind)).toString());
                            }
                            break;
                        case 2:
                            System.out.print("Enter ID: ");
                            String codeFind = ip.nextLine();
                            if(findByCode(codeFind) != -1) {
				System.out.println(studentList.get(findByCode(codeFind)).toString());
                            }
                            break;
                    }
                    break;
		case 5:
                    for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).toString());
                    }
                    break;
		case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Nhap sai moi nhap lai");
            }
	} while (choose != 6);
    }
	
    public static void Menu() {
	System.out.println("1. Nhap thong tin va dang ki mon hoc");
	System.out.println("2. Dang ki mon hoc");
	System.out.println("3. Nap tien");
	System.out.println("4. Tra cuu thong tin");
	System.out.println("5. Kiem tra danh sach sinh vien dang ki");
	System.out.println("6. Thoat");
    }
	
    public static void miniMenu() {
	System.out.println("1.Find by name");
	System.out.println("2.Find by ID");
    }
	
    public static int findByName(String nameFind) {
	int count = 0;
	for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(nameFind)) {
		count++;
		return i;
            }
            if(count == 0) {
		System.out.println("Not found information");
		return -1;
            }
	}
	return -1;
    }
    public static int findByCode(String ID) {
	int count = 0;
	for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getID().equals(ID)) {
		count++;
		return i;
            }
            if(count == 0) {
		System.out.println("Not found information");
		return -1;
            }
        }
	return -1;
    }
}
    
