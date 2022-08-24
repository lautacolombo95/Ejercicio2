public class Electrodomestico {

    //Constants
    public static final int VALOR_DEF_PRECIOB = 100;
    public static final String VALOR_DEF_COLOR = "Gris Plata";
    public static final int VALOR_DEF_CONSUMO = 10;
    public static final int VALOR_DEF_PESO = 2;
    public static final int VALOR_BAJO_CONS = 45;
    public static final int VALOR_MIN_BALANCE = 3;

    //Attributes
    String nombre;
    double precioBase;
    String color;
    int    consumo;
    int    peso;

    //Constructors
    public Electrodomestico (String nom, double precio, String col, int cons, int weight ){
        this.nombre = nom;
        this.precioBase = precio;
        this.color = col;
        this.consumo = cons;
        this.peso = weight;
    }

    public Electrodomestico (String nom){

        this(nom,VALOR_DEF_PRECIOB,VALOR_DEF_COLOR,VALOR_DEF_CONSUMO,VALOR_DEF_PESO);
    }

    public Electrodomestico (String nom, double precio){

        this(nom,precio,VALOR_DEF_COLOR,VALOR_DEF_CONSUMO,VALOR_DEF_PESO);
    }

    public Electrodomestico (String nom, double precio, String col ){
        this(nom,precio,col,VALOR_DEF_CONSUMO,VALOR_DEF_PESO);
    }

    public Electrodomestico (String nom, double precio, String col, int cons ){
        this(nom,precio,col,cons,VALOR_DEF_PESO);
    }


    //Getters & Setters

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public double getPrecioBase() {

        return precioBase;
    }

    public void setPrecioBase(double precioBase) {

        this.precioBase = precioBase;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public int getConsumo() {

        return consumo;
    }

    public void setConsumo(int consumo) {

        this.consumo = consumo;
    }

    public int getPeso() {

        return peso;
    }

    public void setPeso(int peso) {

        this.peso = peso;
    }

    //Class Methods
    public boolean esBajoConsumo (){

        return getConsumo() < VALOR_BAJO_CONS;
    }

    public double getBalance (){

        return getPrecioBase() / getPeso();
    }

    public boolean esAltaGama(double balance){

        return balance > VALOR_MIN_BALANCE;
    }




//Main
    public static void main(String args[]) {
       Electrodomestico ejemploElectro = new Electrodomestico("Heladera",10000,"Blanco",35,90);
       System.out.println(ejemploElectro.esBajoConsumo());
       double balance = ejemploElectro.getBalance();
       System.out.println(balance);
       System.out.println(ejemploElectro.esAltaGama(balance));
    }
}
