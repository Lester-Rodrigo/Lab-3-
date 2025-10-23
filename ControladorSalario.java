import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import TiposDeMedicos.Cirujano;
import TiposDeMedicos.DoctorGeneral;
import TiposDeMedicos.Enfermero;
import TiposDeMedicos.Farmaceutico;
import TiposDeMedicos.Radiologo;
import TiposDeMedicos.Terapeuta;

public class ControladorSalario {

    Main main = new Main();
    private double salarioObtenido = 0;

    public ControladorSalario (){
    }

    public double CalcularSalarioDepartamento(int opcion){
        salarioObtenido = 0;
        switch (opcion) {
            case 1:
                for (DoctorGeneral doctorGeneral : main.getControladorCreadorImprimir().getControladorCreador().getDoctoresGenerales()) {
                    salarioObtenido += doctorGeneral.CalcularSalario();
                }
                break;
        
            case 2:
                for (Cirujano cirujano : main.getControladorCreadorImprimir().getControladorCreador().getCirujanos()) {
                    salarioObtenido += cirujano.CalcularSalario();
                }   
                break;

            case 3:
                for (Enfermero enfermero : main.getControladorCreadorImprimir().getControladorCreador().getEnfermeros()) {
                    salarioObtenido += enfermero.CalcularSalario();
                }
                break;

            case 4:
                for (Farmaceutico farmaceutico : main.getControladorCreadorImprimir().getControladorCreador().getFarmaceuticos()) {
                    salarioObtenido += farmaceutico.CalcularSalario();
                }
                break;

            case 5:
                for (Radiologo radiologo : main.getControladorCreadorImprimir().getControladorCreador().getRadiologos()) {
                    salarioObtenido += radiologo.CalcularSalario();
                }
                break;

            case 6:
                for (Terapeuta terapeuta : main.getControladorCreadorImprimir().getControladorCreador().getTerapeutas()) {
                    salarioObtenido += terapeuta.CalcularSalario();
                }
                break;
        }
        return salarioObtenido;
    }

    public double CalcularSalarioDoctor(int opcion, int id){
        salarioObtenido = 0;
        switch (opcion) {
            case 1:
                for (DoctorGeneral doctorGeneral : main.getControladorCreadorImprimir().getControladorCreador().getDoctoresGenerales()) {
                    if (doctorGeneral.getId() == id) {
                        salarioObtenido += doctorGeneral.CalcularSalario();
                    }
                }
                break;
        
            case 2:
                for (Cirujano cirujano : main.getControladorCreadorImprimir().getControladorCreador().getCirujanos()) {
                    if (cirujano.getId() == id) {
                        salarioObtenido += cirujano.CalcularSalario();
                    }
                }   
                break;

            case 3:
                for (Enfermero enfermero : main.getControladorCreadorImprimir().getControladorCreador().getEnfermeros()) {
                    if ( enfermero.getId() == id) {
                        salarioObtenido += enfermero.CalcularSalario();
                    }
                }
                break;

            case 4:
                for (Farmaceutico farmaceutico : main.getControladorCreadorImprimir().getControladorCreador().getFarmaceuticos()) {
                    if (farmaceutico.getId() == id) {
                        salarioObtenido += farmaceutico.CalcularSalario();
                    }
                }
                break;

            case 5:
                for (Radiologo radiologo : main.getControladorCreadorImprimir().getControladorCreador().getRadiologos()) {
                    if (radiologo.getId() == id) {
                        salarioObtenido += radiologo.CalcularSalario();
                    }
                }
                break;

            case 6:
                for (Terapeuta terapeuta : main.getControladorCreadorImprimir().getControladorCreador().getTerapeutas()) {
                    if (terapeuta.getId() == id) {
                        salarioObtenido += terapeuta.CalcularSalario();
                    }
                }
                break;
        }
        return salarioObtenido;
    }
}
