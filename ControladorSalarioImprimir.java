import java.util.Scanner;

import TiposDeMedicos.Cirujano;
import TiposDeMedicos.DoctorGeneral;
import TiposDeMedicos.Enfermero;
import TiposDeMedicos.Farmaceutico;
import TiposDeMedicos.Radiologo;
import TiposDeMedicos.Terapeuta;

public class ControladorSalarioImprimir {

    ControladorSalario controladorSalario = new ControladorSalario();
    Main main = new Main();

    Scanner input = new Scanner(System.in);

    private int pagina;
    private int opcion;
    private int id;
    private String resultado;
    
    public ControladorSalarioImprimir (){
    }

    public String imprimirControladorSalario() {
        System.out.println("----- Calcular salario -----");
        System.out.println("1. Calcular salario de un doctor específico.");
        System.out.println("2. Calcular salario total de un departamento.");
        System.out.println("Seleccione una opción del 1 al 2: ");
        pagina = input.nextInt();
        switch (pagina) {
            case 1:
                System.out.println("Seleccione el departamento del doctor: ");
                System.out.println("1. Medicina General");
                System.out.println("2. Cirujia");
                System.out.println("3. Enfermería");
                System.out.println("4. Farmaceutica");
                System.out.println("5. Radiologia");
                System.out.println("6. Terapia");
                System.out.println("Seleccione una opción del 1 al 6: ");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                    for (DoctorGeneral doctorGeneral : main.getControladorCreadorImprimir().getControladorCreador().getDoctoresGenerales()) {
                        System.out.println("Doctor disponible: " +doctorGeneral.getId()+ ") " + doctorGeneral.getNombre());
                        }
                        System.out.println("Ingrese el id del doctor: ");
                        id = input.nextInt();
                        resultado = ("El salario calculado del doctor es: " + controladorSalario.CalcularSalarioDepartamento(opcion));
                    break;
        
                    case 2:
                    for (Cirujano cirujano : main.getControladorCreadorImprimir().getControladorCreador().getCirujanos()) {
                        System.out.println("Doctor disponible: " +cirujano.getId()+ ") " + cirujano.getNombre());
                        }
                        System.out.println("Ingrese el id del doctor: ");
                        id = input.nextInt();
                        resultado = ("El salario calculado del doctor es: " + controladorSalario.CalcularSalarioDepartamento(opcion));
                    break;

                    case 3:
                    for (Enfermero enfermero : main.getControladorCreadorImprimir().getControladorCreador().getEnfermeros()) {
                            System.out.println(enfermero.getId() + ") " + enfermero.getNombre());
                        }
                        System.out.println("Ingrese el id del doctor: ");
                        id = input.nextInt();
                        resultado = ("El salario calculado del doctor es: " + controladorSalario.CalcularSalarioDepartamento(opcion));
                    break;

                    case 4:
                    for (Farmaceutico farmaceutico : main.getControladorCreadorImprimir().getControladorCreador().getFarmaceuticos()) {
                            System.out.println("Doctor disponible: " +farmaceutico.getId()+ ") " + farmaceutico.getNombre());
                        }
                        System.out.println("Ingrese el id del doctor: ");
                        id = input.nextInt();
                        resultado = ("El salario calculado del doctor es: " + controladorSalario.CalcularSalarioDepartamento(opcion));
                    break;

                    case 5:
                    for (Radiologo radiologo : main.getControladorCreadorImprimir().getControladorCreador().getRadiologos()) {
                        System.out.println("Doctor disponible: " +radiologo.getId()+ ") " + radiologo.getNombre());  
                        }
                        System.out.println("Ingrese el id del doctor: ");
                        id = input.nextInt();
                        resultado = ("El salario calculado del doctor es: " + controladorSalario.CalcularSalarioDepartamento(opcion));
                    break;

                    case 6:
                    for (Terapeuta terapeuta : main.getControladorCreadorImprimir().getControladorCreador().getTerapeutas()) {
                        System.out.println("Doctor disponible: " +terapeuta.getId()+ ") " + terapeuta.getNombre());         
                        }
                        System.out.println("Ingrese el id del doctor: ");
                        id = input.nextInt();
                        resultado = ("El salario calculado del doctor es: " + controladorSalario.CalcularSalarioDepartamento(opcion));
                    break;
                }
                break;
        
            case 2:
                System.out.println("Seleccione el departamento: ");
                System.out.println("1. Medicina General");
                System.out.println("2. Cirujia");
                System.out.println("3. Enfermería");
                System.out.println("4. Farmaceutica");
                System.out.println("5. Radiologia");
                System.out.println("6. Terapia");
                System.out.println("Seleccione una opción del 1 al 6: ");
                opcion = input.nextInt();
                resultado = ("El salario calculado del departamento es: " + controladorSalario.CalcularSalarioDepartamento(opcion));
        }
        return resultado;
    }
}
