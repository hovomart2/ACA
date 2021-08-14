package week4HomeworkTask3;

import week4HomeworkTask1.User;
import week4HomeworkTask1.UserGroup;
import week4HomeworkTask2.ImmutablePoint;
import week4HomeworkTask2.Triangle;

import java.sql.PreparedStatement;

public class Printer {
    public static void specialPrint(Object obj){
        System.out.println("************************************");
        System.out.println(obj.toString());
        System.out.println("************************************");
    }

    public static void main(String[] args) {
        User user1 = new User("Petros", "Petrosyan", "Petros_1982","petros_petrosyan@gmail.com");
        Printer.specialPrint(user1);
        System.out.println();
        User user2 = new User("Hakob", "Hakobyan", "Hakob_1972", "hakob_hakobyan@gmail.com");
        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user1);
        userGroup.addUser(user2);
        Printer.specialPrint(userGroup);
        System.out.println();
        ImmutablePoint immutablePoint1 = new ImmutablePoint(2,3);
        Printer.specialPrint(immutablePoint1);
        System.out.println();
        ImmutablePoint immutablePoint2 = new ImmutablePoint(5,1);
        ImmutablePoint immutablePoint3 = new ImmutablePoint(5,9);
        Triangle triangle = new Triangle(immutablePoint1,immutablePoint2,immutablePoint3);
        Printer.specialPrint(triangle);
    }
}

