import java.util.Scanner;

public class ControladorCreadorImprimir {

    private ControladorCreador controladorCreador = new ControladorCreador();

    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    private int opcion;
    private String nombre;
    private String tiempoEjerciendo;
    private double salarioBase;
    private String especializacion;
    private int maxCantidad;
    private double tarifaConsulta; 
    private String tipoActividad;
    private double bono;
    private String nivelCertificacion;
    private int duracionTratamiento;
    
    public ControladorCreadorImprimir (){
    }

    public String imprimirControladorCraedor() {
        System.out.println("----- Ingresar nuevo doctor -----");
        System.out.println("Seleccione el tipo de doctor que desea ingresar: ");
        System.out.println("1. Doctor General");
        System.out.println("2. Cirujano");
        System.out.println("3. Enfermero");
        System.out.println("4. Farmaceutico");
        System.out.println("5. Radiologo");
        System.out.println("6. Terapeuta");
        System.out.println("Seleccione una opción del 1 al 6: ");
        opcion = input1.nextInt();

        System.out.println("----- Ingrese los datos del doctor -----");
        System.out.println("Ingrese el nombre del doctor: ");
        nombre = input2.nextLine();

        System.out.println("Ingrese el tiempo ejerciendo del doctor: ");
        tiempoEjerciendo = input2.nextLine();

        System.out.println("Ingrese el salario base del doctor: ");
        salarioBase = input2.nextDouble();
        input2.nextLine();

       switch (opcion) {
        case 1:
            System.out.println("Ingrese la especialización del doctor: ");
            especializacion = input2.nextLine();

            System.out.println("Ingrese la tarifa por consulta del doctor: ");
            tarifaConsulta = input2.nextDouble();

            System.out.println("Ingrese la cantidad máxima de pacientes que puede atender el doctor: ");
            maxCantidad = input2.nextInt();
            input2.nextLine();

            controladorCreador.nuevoDoctor(opcion, nombre, "Medicina general", tiempoEjerciendo, salarioBase, 
            especializacion, maxCantidad, tarifaConsulta, null, 0.0, null, 0);
            break;
       
        case 2:
            System.out.println("Ingrese la actividad que realiza el cirujano: ");
            tipoActividad = input2.nextLine();

            System.out.println("Ingrese la tarifa por consulta del cirujano: ");
            tarifaConsulta = input2.nextDouble();

            System.out.println("Ingrese el bono por cirugía del cirujano: ");
            bono = input2.nextDouble();

            System.out.println("Ingrese la duración del tratamiento del cirujano (ingrese el número de horas): ");
            duracionTratamiento = input2.nextInt();
            input2.nextLine();

            controladorCreador.nuevoDoctor(opcion, nombre, "Cirujia", tiempoEjerciendo, salarioBase, 
            null, 0, tarifaConsulta, tipoActividad, bono, null, duracionTratamiento);
                break;
        
            case 3:
                System.out.println("Ingrese la actividad que realiza el enfermero (Si es Nocturno o Diurno): ");
                tipoActividad = input2.nextLine();

                System.out.println("Ingrese el nivel de certificación del enfermero: ");
                nivelCertificacion = input2.nextLine();

                controladorCreador.nuevoDoctor(opcion, nombre, "Enfermería", tiempoEjerciendo, salarioBase, 
            null, 0, 0, tipoActividad, 0, nivelCertificacion, 0);
                break;

            case 4:
                System.out.println("Ingrese el nivel de certificación del farmacéutico: ");
                nivelCertificacion = input2.nextLine();

                System.out.println("Ingrese la cantidad máxima de recetas que puede hacer el farmacéutico: ");
                maxCantidad = input2.nextInt(); 
                input2.nextLine();

                controladorCreador.nuevoDoctor(opcion, nombre, "Farmaceútica", tiempoEjerciendo, salarioBase, 
            null, maxCantidad, 0, null, 0, nivelCertificacion, 0);
                break;

            case 5:
                System.out.println("Ingrese el nivel de certificación del radiólogo: ");
                nivelCertificacion = input2.nextLine();

                System.out.println("Ingrese la tarifa por consulta del radiólogo: ");
                tarifaConsulta = input2.nextInt(); 
                input2.nextLine();

                controladorCreador.nuevoDoctor(opcion, nombre, "Radiología", tiempoEjerciendo, salarioBase, 
            null, 0, tarifaConsulta, null, 0, nivelCertificacion, 0);
                break;

            case 6:
                System.out.println("Ingrese la especialización del terapéuta: ");
                especializacion = input2.nextLine();

                System.out.println("Ingrese la duración del tratamiento del terapéuta (ingrese el número de horas): ");
                duracionTratamiento = input2.nextInt();

                System.out.println("Ingrese la tarifa por consulta del terapéuta: ");
                tarifaConsulta = input2.nextInt(); 
                input2.nextLine();

                controladorCreador.nuevoDoctor(opcion, nombre, "Terapia", tiempoEjerciendo, salarioBase, 
            especializacion, 0, tarifaConsulta, null, 0, null, duracionTratamiento);
                break;
        } 
        return "Doctor agregado exitosamente.";
    }

     public ControladorCreador getControladorCreador() {
        return controladorCreador;
    }
}
