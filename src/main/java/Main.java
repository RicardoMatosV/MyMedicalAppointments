import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

//Import de elementos static de la clase UIMenu del package ui
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Ahora solo consideramos mostrar menu
//        showMenu();

        //Se crea el objeto myDoctor de Clase Doctor
        Doctor myDoctor = new Doctor("Carlo Ancceloti","cancceloti@xmail.com");
        //Se añade nueva cita al doctor de myDoctor
        myDoctor.addAvailableAppointment(new Date(), "04:00pm");
        myDoctor.addAvailableAppointment(new Date(), "10:00am");
        myDoctor.addAvailableAppointment(new Date(), "01:00pm");

        //Se ordena que imprima los datos de myDoctor de Clase Doctor, imprimirá con la sobreescritura a los toString() de la Clase Principal y la Clase Anidada
        System.out.println(myDoctor);

        //Se un for each para imprimir todas las citas guardadas en el ArrayList usando su getter
       /* for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/

        System.out.println("\n");
        Patient patient = new Patient("Marcelo Andrade","mandrade@xmail.com");
        Patient patient2 = new Patient("Oliver Sonne","osonne@xmail.com");

        System.out.println(patient2);
        System.out.println(myDoctor);

        User user = new Doctor("Alonso Cuaron", "acuaron@xmail.com");
        user.showDataUser(); //El objeto User se está comportando como el objeto Doctor

        User userPat = new Patient("Luis Juvenal", "ljuvenal@xmail.com");
        System.out.println();
        userPat.showDataUser(); //El objeto User se está comportando como el objeto Patient

        //Aplicando el concepto de Clases Anónimas, ya que User viene a ser una Clase Abstracta
        User user1 = new User("Leandro Martínez", "lmartinez@xmail.com") {
            @Override
            public void showDataUser() { //Aquí puedo darle el comportamiento quiera en este momento
                System.out.println("\nDoctor");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();

     /*   System.out.println("\n");
        Model.Patient patient = new Model.Patient("Susan","susan@xmail.com");
        Model.Patient patient2 = new Model.Patient("Lorena","lorena@xmail.com");

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