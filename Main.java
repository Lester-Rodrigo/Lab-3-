import java.util.Scanner;

import TiposDeMedicos.*;
public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int pagina;

    ControladorCreadorImprimir controladorCreadorImprimir = new ControladorCreadorImprimir();

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
                controladorCreadorImprimir.imprimirControladorCraedor();
                    for (DoctorGeneral string : controladorCreadorImprimir.controladorCreador.getDoctoresGenerales()) {
                        System.out.println(string.getNombre());
                    }
                break;
        
            case 2:
                
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
