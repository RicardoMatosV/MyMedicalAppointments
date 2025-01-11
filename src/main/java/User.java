public class User { //Vendría a ser una Clase padre
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        //Generar lógica de validación de phoneNumber
        if (phoneNumber.length() > 9){
            System.out.println("El número telefónico debe ser de 9 dígitos máximo.");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override //Indica que se está sobreescribiendo a la Clase padre toString()
    public String toString() { // Modifica el resultado de System.out.println()
        return "User: " + name + ", Email: " + email +
                "\nAddress: " + address + ", Phone: " + phoneNumber;
    }
}
