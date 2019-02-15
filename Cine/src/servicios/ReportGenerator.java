package servicios;

import dao.Conexion;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class ReportGenerator extends Conexion {

    public static final String REPORTE_SIMPLE_CLIENTE = "ListClientes.jasper";
    public static final String REPORTE_SIMPLE_PERSONAL = "ListPersonal.jasper";
    public static final String REPORTE_SIMPLE_PELICULA = "ListPelicula.jasper";

    public static JasperPrint generarReporteSimplePaciente() throws JRException, ClassNotFoundException {
        try {
            JasperPrint reporteLleno = JasperFillManager.fillReport(REPORTE_SIMPLE_CLIENTE, new HashMap(), conectar());
            return reporteLleno;
        } catch (Exception e) {
            System.out.println("Error en generarReporteSimplePaciente " + e.getMessage());
        }
        return null;
    }

    public static JasperPrint generarReporteSimplePersonal() throws JRException, ClassNotFoundException {
        try {
            JasperPrint reporteLleno = JasperFillManager.fillReport(REPORTE_SIMPLE_PERSONAL, new HashMap(), conectar());
            return reporteLleno;
        } catch (Exception e) {
            System.out.println("Error en generarReporteSimplePersonal " + e.getMessage());
        }
        return null;
    }
    
        public static JasperPrint generarReporteSimplePelicula() throws JRException, ClassNotFoundException {
        try {
            JasperPrint reporteLleno = JasperFillManager.fillReport(REPORTE_SIMPLE_PELICULA, new HashMap(), conectar());
            return reporteLleno;
        } catch (Exception e) {
            System.out.println("Error en generarReporteSimplePelicula " + e.getMessage());
        }
        return null;
    }
}
