/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Default;

import Common.Validation;
import Controller.Manager;
import Model.Student;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Main 
{
    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        ls.add(new Student("1", "Phan Gia Huy", "Spring", "java"));
        ls.add(new Student("2", "Pham Phu Dong", "Summer", ".net"));
        ls.add(new Student("3", "Tran Luong Thao Chi", "Spring", "c/c++"));
        int count = 3;
        //loop until user want to exit program
        while (true) {
            //Show menu option4
            Manager.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    Manager.createStudent(count, ls);
                    break;
                case 2:
                    Manager.findAndSort(ls);
                    break;
                case 3:
                    Manager.updateOrDelete(count, ls);
                    break;
                case 4:
                    Manager.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }
}
