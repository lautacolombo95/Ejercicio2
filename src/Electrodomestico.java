public class Electrodomestico {
    String nombre;
    double precioBase;
    String color;
    int    consumo;
    int    peso;

    public Electrodomestico (String nom){
        this.nombre = nom;
        this.precioBase = 100;
        this.color = "Gris Plata";
        this.consumo = 10;
        this.peso = 2;
    }

    public Electrodomestico (String nom, double precio){
        this.nombre = nom;
        this.precioBase = precio;
        this.color = "Gris Plata";
        this.consumo = 10;
        this.peso = 2;
    }

    public Electrodomestico (String nom, double precio, String col ){
        this.nombre = nom;
        this.precioBase = precio;
        this.color = col;
        this.consumo = 10;
        this.peso = 2;
    }

    public Electrodomestico (String nom, double precio, String col, int cons ){
        this.nombre = nom;
        this.precioBase = precio;
        this.color = col;
        this.consumo = cons;
        this.peso = 2;
    }

    public Electrodomestico (String nom, double precio, String col, int cons, int weight ){
        this.nombre = nom;
        this.precioBase = precio;
        this.color = col;
        this.consumo = cons;
        this.peso = weight;
    }


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

    public boolean esBajoConsumo (){
        if (this.consumo < 45){
            return true;
        }
        else return false;
    }

    public double getBalance (){
        return (this.precioBase / this.peso);
    }

    public boolean esAltaGama(double balance){
        if (balance > 3 ){
            return true;
        }
        else return false;
    }





    public static void main(String args[]) {
       Electrodomestico ejemploElectro = new Electrodomestico("Heladera",10000,"Blanco",35,90);
       System.out.println(ejemploElectro.esBajoConsumo());
       double balance = ejemploElectro.getBalance();
       System.out.println(balance);
       System.out.println(ejemploElectro.esAltaGama(balance));
    }
}
