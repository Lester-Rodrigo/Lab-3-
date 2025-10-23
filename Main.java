import java.util.Scanner;

import TiposDeMedicos.*;
public class Main {

    //Controladores
    private static ControladorCreadorImprimir controladorCreadorImprimir = new ControladorCreadorImprimir();
    private static ControladorCreadorCitaImprimir controladorCreadorCitaImprimir = new ControladorCreadorCitaImprimir();
    private static ControladorSalarioImprimir controladorSalarioImprimir = new ControladorSalarioImprimir();

    public static ControladorCreadorImprimir getControladorCreadorImprimir() {
        return controladorCreadorImprimir;
    }
    public static ControladorCreadorCitaImprimir getControladorCreadorCitaImprimir() {
        return controladorCreadorCitaImprimir;
    }
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int pagina;
    int opcion;

       do {
        do {
            System.out.println("1. Ingresar núevo doctor: ");
            System.out.println("2. Agendar nueva cita: ");
            System.out.println("3. Ver departamentos/doctores: ");
            System.out.println("4. Ver citas: ");
            System.out.println("5. Salir: ");
            System.out.println("Seleccione una opción del 1 al 5: ");
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
                    ", Doctor: " + citaMedica.getNombreDoctor() + ", Enfermero: "+ citaMedica.getNombreEnfermero()+ 
                    ", Fecha: " + citaMedica.getFecha().toString());
                    }
                }
                break;

            case 3:
            if (controladorCreadorImprimir.getControladorCreador().getDoctoresGenerales().isEmpty() && 
                    controladorCreadorImprimir.getControladorCreador().getCirujanos().isEmpty() &&
                    controladorCreadorImprimir.getControladorCreador().getEnfermeros().isEmpty() &&
                    controladorCreadorImprimir.getControladorCreador().getFarmaceuticos().isEmpty() &&
                    controladorCreadorImprimir.getControladorCreador().getRadiologos().isEmpty() &&
                    controladorCreadorImprimir.getControladorCreador().getTerapeutas().isEmpty()) {
                    System.out.println("No hay doctores disponibles. Por favor, ingrese un doctor primero.");
                }
                
            else {
                do {
                System.out.println("1. Ver doctores: ");
                System.out.println("2. Calcular salarios: ");
                System.out.println("3. Salir: ");
                System.out.println("Seleccione una opción del 1 al 3: ");
                opcion = input.nextInt();
                } while (pagina < 1 && pagina > 3);
                switch (opcion) {
                    case 1:
                        System.out.println("----- Ingresar el departamento del doctor -----");
                        System.out.println("1. Medicina General");
                        System.out.println("2. Cirujia");
                        System.out.println("3. Enfermería");
                        System.out.println("4. Farmaceutica");
                        System.out.println("5. Radiologia");
                        System.out.println("6. Terapia");
                        System.out.println("Seleccione una opción del 1 al 6: ");
                        pagina = input.nextInt();
                        switch (pagina) {
                            case 1:

                                for (DoctorGeneral doctorGeneral : controladorCreadorImprimir.getControladorCreador().getDoctoresGenerales()) {
                                    System.out.println(doctorGeneral.getId() + ") " + doctorGeneral.getNombre());
                                }
                                break;
                            case 2:
                                for (Cirujano cirujano : controladorCreadorImprimir.getControladorCreador().getCirujanos()) {
                                    System.out.println(cirujano.getId() + ") " + cirujano.getNombre());
                                }
                                break;
                            case 3:
                                for (Enfermero enfermero : controladorCreadorImprimir.getControladorCreador().getEnfermeros()) {
                                    System.out.println(enfermero.getId() + ") " + enfermero.getNombre());
                                }
                                break;
                            case 4:
                                for (Farmaceutico farmaceutico : controladorCreadorImprimir.getControladorCreador().getFarmaceuticos()) {
                                    System.out.println(farmaceutico.getId() + ") " + farmaceutico.getNombre());
                                }
                                break;
                            case 5:
                                for (Radiologo radiologo : controladorCreadorImprimir.getControladorCreador().getRadiologos()) {
                                    System.out.println(radiologo.getId() + ") " + radiologo.getNombre());
                                }
                                break;
                            case 6:
                                for (Terapeuta terapeuta : controladorCreadorImprimir.getControladorCreador().getTerapeutas()) {
                                    System.out.println(terapeuta.getId() + ") " + terapeuta.getNombre());
                                }
                                break;
                        }
                        break;
                
                    case 2:
                        System.out.println(controladorSalarioImprimir.imprimirControladorSalario());
                        break;

                    case 3:
                        System.exit(0);
                        break;
                }
            }
                break;

            case 4:
                for (CitaMedica citaMedica : controladorCreadorCitaImprimir.getControladorCreadorCita().getCitasMedicas()) {
                    System.out.println(citaMedica.getFecha() + " - " + citaMedica.getNobrePaciente() + " con el Dr. " + citaMedica.getNombreDoctor());
                }
                break;

            case 5:
                System.exit(0);
                break;
        }

       } while (pagina != 5);
    }
}
