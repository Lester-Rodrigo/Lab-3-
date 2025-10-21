import java.util.Scanner;

import TiposDeMedicos.*;
public class Main {

    //Controladores
    private static ControladorCreadorImprimir controladorCreadorImprimir = new ControladorCreadorImprimir();
    private static ControladorCreadorCitaImprimir controladorCreadorCitaImprimir = new ControladorCreadorCitaImprimir();

    public static ControladorCreadorImprimir getControladorCreadorImprimir() {
        return controladorCreadorImprimir;
    }
    public static ControladorCreadorCitaImprimir getControladorCreadorCitaImprimir() {
        return controladorCreadorCitaImprimir;
    }
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int pagina;

       do {
        do {
            System.out.println("1. Ingresar núevo doctor: ");
            System.out.println("2. Agendar nueva cita: ");
            System.out.println("3. Ver departamentos/doctores: ");
            System.out.println("4. Ver citas: ");
            System.out.println("5. Salir: ");
            pagina = input.nextInt();

        } while (pagina < 1 && pagina > 5);
        switch (pagina) {
            case 1:
                System.out.println(controladorCreadorImprimir.imprimirControladorCraedor());
                    for (DoctorGeneral string : controladorCreadorImprimir.getControladorCreador().getDoctoresGenerales()) {
                        System.out.println(string.getNombre());
                        System.out.println(string.getId());
                    }
                break;
        
            case 2:
                if (controladorCreadorImprimir.getControladorCreador().getDoctoresGenerales().isEmpty() && 
                    controladorCreadorImprimir.getControladorCreador().getCirujanos().isEmpty() &&
                    controladorCreadorImprimir.getControladorCreador().getEnfermeros().isEmpty() &&
                    controladorCreadorImprimir.getControladorCreador().getFarmaceuticos().isEmpty() &&
                    controladorCreadorImprimir.getControladorCreador().getRadiologos().isEmpty() &&
                    controladorCreadorImprimir.getControladorCreador().getTerapeutas().isEmpty()) {
                    System.out.println("No hay doctores disponibles. Por favor, ingrese un doctor primero.");
                } 
                else {
                    System.out.println(controladorCreadorCitaImprimir.agendarCita());
                    for (CitaMedica citaMedica : controladorCreadorCitaImprimir.getControladorCreadorCita().getCitasMedicas()) {
                    System.out.println("ID Cita: " + citaMedica.getIdCita() + ", Paciente: " + citaMedica.getNobrePaciente() + 
                    ", Doctor: " + citaMedica.getNombreDoctor() + ", Fecha: " + citaMedica.getFecha().toString());
                    }
                }
                break;

            case 3:
                
                break;

            case 4:
                
                break;

            case 5:
                System.exit(0);
                break;
        }

       } while (pagina != 5);
    }
}
