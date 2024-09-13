import javax.swing.*;
import java.time.LocalDate;

public class Vehiculo {
    //Atributos
    private String modelo;
    private int anio;
    private String marca;
    private String patente;
    private LocalDate fechavtv;
    private boolean motor;
    private boolean frenos;
    private boolean suspension;


    //constructor

    public Vehiculo(String modelo,int anio,String marca, String patente, LocalDate fechavtv
    ,boolean motor,boolean frenos,boolean suspension){
        this.modelo=modelo;
        this.anio=anio;
        this.marca=marca;
        this.patente=patente;
        this.fechavtv=fechavtv;
        this.motor=motor;
        this.frenos=frenos;
        this.suspension=suspension;

    }
    //get y set

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getMarca() {
        return marca;
    }
    public String getPatente(){
        return patente;
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

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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
    public boolean motorPasoVtv(){
        return motor;
    }
    public boolean frenosPasoVtv(){
        return frenos;
    }
    public boolean suspensionPasoVtv(){
        return suspension;
    }
    public void mostrarInforme(){
        JOptionPane.showMessageDialog(null,"Vtv para el vehiculo: " +
                "\nMarca: "+ this.marca +
                "\nN° Patente: " + this.patente +
                "\nModelo: " + this.modelo +
                "\nAño: "+ this.anio +
                "\nFecha de vtv: " + this.fechavtv);

        if (motorPasoVtv()){
            JOptionPane.showMessageDialog(null,"el motor esta habilitado");

        }
        if(frenosPasoVtv()){
            JOptionPane.showMessageDialog(null,"los frenos estan habilitados" );

        }
        if (suspensionPasoVtv()){

            JOptionPane.showMessageDialog(null,"las suspensiones estan habilitadas ");
        }

        if (!motorPasoVtv() || !frenosPasoVtv() || !suspensionPasoVtv()) {

                JOptionPane.showMessageDialog(null, "El vehiculo necesita reparacion");

                if (!motorPasoVtv()) {

                    JOptionPane.showMessageDialog(null, "El motor necesita reparacion");
                }

                if (!frenosPasoVtv()) {

                    JOptionPane.showMessageDialog(null, "Los frenos necesitan reparacion");
                }

                if (!suspensionPasoVtv()) {

                    JOptionPane.showMessageDialog(null, "La suspension necesita reparacion");
                }
            }
        if (motorPasoVtv() && frenosPasoVtv() && suspensionPasoVtv()) {
            JOptionPane.showMessageDialog(null, "El vehiculo paso el VTV hasta " + fechavtv.plusYears(1));
        }



    }







}
