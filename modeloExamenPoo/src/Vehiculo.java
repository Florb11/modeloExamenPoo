import java.time.LocalDate;

public class Vehiculo {
    //Atributos
    private String modelo;
    private LocalDate anio;
    private String marca;
    private LocalDate fechavtv;
    private boolean motor;
    private boolean frenos;
    private boolean suspension;


    //constructor

    public Vehiculo(String modelo,LocalDate anio,String marca, LocalDate fechavtv
    ,boolean motor,boolean frenos,boolean suspension){
        this.modelo=modelo;
        this.anio=anio;
        this.marca=marca;
        this.fechavtv=fechavtv;
        this.motor=motor;
        this.frenos=frenos;
        this.suspension=suspension;

    }
    //get y set

    public String getModelo() {
        return modelo;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public String getMarca() {
        return marca;
    }

    public LocalDate getFechavtv() {
        return fechavtv;
    }
    public boolean getMotor(){
        return motor;
    }

    public boolean getFrenos() {
        return frenos;
    }
    public boolean getSuspension(){
        return suspension;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setFechavtv(LocalDate fechavtv) {
        this.fechavtv = fechavtv;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public void setFrenos(boolean frenos) {
        this.frenos = frenos;
    }

    public void setSuspension(boolean suspension) {
        this.suspension = suspension;
    }
    //metodos
}
