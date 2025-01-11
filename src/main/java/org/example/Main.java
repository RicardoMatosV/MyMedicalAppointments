//Import de elementos static de la clase Math
import java.sql.SQLOutput;

import static java.lang.Math.*;

//Import de elementos static de la clase UIMenu del package ui
import static ui.UIMenu.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Ahora solo consideramos mostrar menu
//        showMenu();

        Doctor myDoctor = new Doctor("Carlo Ancceloti","cancceloti@xmail.com");
        //Se añade nueva cita al doctor de myDoctor
        myDoctor.addAvailableAppointment(new Date(), "04:00pm");
        myDoctor.addAvailableAppointment(new Date(), "10:00am");
        myDoctor.addAvailableAppointment(new Date(), "01:00pm");

        //Se un for each para imprimir todas las citas guardadas en el ArrayList usando su getter
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        System.out.println("\n");
        Patient patient = new Patient("Marcelo Andrade","mandrade@xmail.com");
        Patient patient2 = new Patient("Oliver Sonne","osonne@xmail.com");

        System.out.println(patient2);
        System.out.println(myDoctor);

     /*   System.out.println("\n");
        Patient patient = new Patient("Susan","susan@xmail.com");
        Patient patient2 = new Patient("Lorena","lorena@xmail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/

 /*       patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("966062060");
        System.out.println(patient.getPhoneNumber());*/
    }
}