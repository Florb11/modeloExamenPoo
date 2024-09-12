import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        String modelo = JOptionPane.showInputDialog(null,"Ingrese el modelo del vehiculo");
        int anioVehiculo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la fecha del Vehiculo"));
        String marca = JOptionPane.showInputDialog(null,"Ingrese la marca del vehiculo");
        String patente = JOptionPane.showInputDialog(null,"Ingrese la patente del vehiculo");
        LocalDate fechaVtv = LocalDate.parse(JOptionPane.showInputDialog(null,"Ingrese la fecha del Vtv"));
        boolean motor = false;
        boolean frenos = false;
        boolean suspension = false;

        String [] opciones = {"Motor","Frenos","Suspension","Salir"};
        String seleccion;

        do{
            seleccion= (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione opcion",
                    "Menu de opciones",
                    0,
                    null,
                    opciones,
                    opciones[0]
            );
            switch (seleccion){
                case "Motor":
                     String motorStr = JOptionPane.showInputDialog("¿El motor esta en buen estado?");
                     if (motorStr.equalsIgnoreCase("Si")){
                         motor = true;
                     }else{
                         motor = false;
                     }
                    break;

                case"Frenos":
                     String frenosStr = JOptionPane.showInputDialog("¿Los frenos estan en buen estado?");
                    if (frenosStr.equalsIgnoreCase("Si")){
                        frenos = true;
                    }else{
                        frenos = false;
                    }
                    break;
                case"Suspension":
                     String suspensionStr = JOptionPane.showInputDialog("¿La suspension esta en buen estado?");
                    if (suspensionStr.equalsIgnoreCase("Si")){
                        suspension = true;
                    }else{
                        suspension = false;
                    }
                    break;
                case"Salir":
                    JOptionPane.showMessageDialog(null,"saliendo");
                    break;
            }

        }while(!seleccion.equals("Salir"));

        Vehiculo vehiculo1 = new Vehiculo(modelo,anioVehiculo,marca,patente,fechaVtv,motor,frenos,suspension);

        vehiculo1.mostrarInforme();





    }
}