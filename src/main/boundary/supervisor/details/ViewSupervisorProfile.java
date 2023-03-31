package main.boundary.supervisor.details;

import main.model.user.Student;
import main.model.user.Supervisor;
import main.utils.exception.ui.PageBackException;
import main.utils.ui.ChangePage;

import java.util.Scanner;

public class ViewSupervisorProfile {
    public static void viewSupervisorProfile(Supervisor supervisor) throws PageBackException {
        ChangePage.changePage();
        System.out.println("Welcome to View Student Profile");
        System.out.println("┌---------------------------------------------------------------┐");
        System.out.printf("| %-15s | %-30s | %-10s |\n", "Name", "Email", "Student ID");
        System.out.println("|-----------------|--------------------------------|------------|");
        System.out.printf("| %-15s | %-30s | %-10s |\n", supervisor.getUserName(), supervisor.getEmail(), supervisor.getID());
        System.out.println("└---------------------------------------------------------------┘");
        System.out.println("Press enter to go back.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        throw new PageBackException();
    }
}