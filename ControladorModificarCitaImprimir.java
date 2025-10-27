import java.time.LocalDateTime;
import java.util.Scanner;

import TiposDeMedicos.DoctorGeneral;

public class ControladorModificarCitaImprimir {

    public ControladorModificarCitaImprimir (){
    }

    ControladorCreadorCita controladorCreadorCita = new ControladorCreadorCita();
    Main main = new Main();

    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    private int opcion;

    private String tipoCita;
    private String nobrePaciente;
    private String nombreDoctor;
    private LocalDateTime fecha;
    private String nombreEnfermero;

    //Partes de la fecha
    private int year;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    //Confirmar la necesidad de enfermero
    private boolean necesitaEnfermero = false;

    public String modificarCita () {
        System.out.println("----- Reagendar citas -----");
        System.out.println("Ingrese el ID de la cita a reagendar: ");
        int idCita = input1.nextInt();
        System.out.println("Ingrese el nuevo año de la cita (YYYY): ");
        year = input2.nextInt();
        System.out.println("Ingrese el nuevo mes de la cita (MM): ");
        mes = input2.nextInt();
        System.out.println("Ingrese el nuevo día de la cita (dd): ");
        dia = input2.nextInt();
        System.out.println("Ingrese la nueva hora de la cita (formato 24 horas HH): ");
        hora = input2.nextInt();
        System.out.println("Ingrese los nuevos minutos de la cita (mm): ");
        minutos = input2.nextInt();
        fecha = LocalDateTime.of(year, mes, dia, hora, minutos);
        for (CitaMedica citaMedica : main.getControladorCreadorCitaImprimir().getControladorCreadorCita().getCitasMedicas()) {
            if (citaMedica.getIdCita() == idCita) {
                tipoCita = citaMedica.getTipoCita();
                nobrePaciente = citaMedica.getNobrePaciente();
                if (citaMedica.getNombreEnfermero() != null) {
                    necesitaEnfermero = true;
                }
                main.getControladorCreadorCitaImprimir().getControladorCreadorCita().getCitasMedicas().remove(citaMedica);
                break;
            }
            
        }
        switch (tipoCita) {
            case "Medicina General":
            
                break;
        
            case "Cirugia":

                break;

            case "Farmaceutica":

                break;

            case "Radiologia":

                break;

            case "Terapia":

                break;
        }

        return "Cita modificada con éxito";
    }

    public ControladorCreadorCita getControladorCreadorCita() {
        return controladorCreadorCita;
    }
}
