public class Patient extends User{ //Se aplica Herencia a la Clase padre User
    //Atributos
    private String birthday;
    private String blood;
    private Double weight;
    private Double height;

    //Constructor parametrizado usando la Clase Padre
    Patient(String name, String email){
        super(name,email); //Metodo constructor de la Clase User
    }

    //54.5
    public void setWeight(Double weight){
        this.weight = weight;
    }

    //54.5 Kg String
    public String getWeight(){
        return this.weight + " kg";
    }

    public String getHeight() {
        return height + " m";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAge: " + birthday +
                "\nWeight: " + getWeight() +
                "\nHeight: " + getHeight() +
                "\nBlood: " + blood;
    }
}
