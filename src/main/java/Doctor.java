import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User { //Se aplica Herencia a la Clase padre User
    //Atributos
    private String speciality;

    //Constructor parametrizado
    Doctor(String name, String email){
        super(name, email); //El contructor padre siempre debe estar al inicio en el contructor hijo
        System.out.println("El nombre del Doctor asigando es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Se define un Array dinamica para guardar las citas
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    //Se crea un metodo para añadir una nueva cita al Array
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    //Se creo un getter para mostrar todas las citas guardadas en el Array (se muestra las direcciones de memoria)
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    //Definiendo la Clase Estática Anidada
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
