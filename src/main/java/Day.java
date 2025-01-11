public enum Day {
    SUNDAY("Domingo"),
    MONDAY("Lunes"),
    TUESDAY("Martes"),
    WEDNESDAY("Miércoles"),
    THURSDAY("Jueves"),
    FRIDAY("Viernes"),
    SATURDAY("Sábado");

    private String spanish;
    private Day(String s){
        spanish = s;
    }

    public String getSpanish(){
        return spanish;
    }
}
