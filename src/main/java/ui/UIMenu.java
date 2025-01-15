package ui;

import com.sun.source.doctree.DocCommentTree;
import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
            "Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to my Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    //Autenticación de usuario
    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient

        //Simulando una Base de Datos de usuarios Doctor y Patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejando Martinelli", "amartinelli@xmail.com"));
        doctors.add(new Doctor("Karen Soza", "ksoza@xmail.com"));
        doctors.add(new Doctor("Rocío Gómez", "rgomez@xmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Julián Toribio","jtoribio@xmail.com"));
        patients.add(new Patient("Roberto Martínez","rmartinez@xmail.com"));
        patients.add(new Patient("Carlos Sánchez","csanchez@xmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){ //Autenticación para Doctor
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2){ //Autenticación para Patient
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }

        }while (!emailCorrect);
    }

    static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i-1]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointment");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
