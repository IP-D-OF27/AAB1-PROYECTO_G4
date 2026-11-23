import java.util.Scanner;
public class UsoMoviles {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int tacademico, trecreativo, ttotal= 0, tdia = 0, dias = 0, tiempoAA = 0, tiempoAR = 0, metad, supmeta = 0;
        System.out.println("#######################################################");
        System.out.println("Aplicacion de analisis de tiempo de uso del dispositivo");
        System.out.println("#######################################################");
        System.out.print("\n -Cual es su meta diaria de uso recreativo del dispositivo movil: ");
            metad = tcl.nextInt();
            while (metad < 0 || metad > 24){
                System.out.print("Entrada no valida, vuelva a ingresar: ");
                metad = tcl.nextInt();
            }
        while (dias != 7){
            dias++;
            System.out.println("\nDIA " + dias);
            System.out.print("\n -Cuanto tiempo uso su dispositivo movil hoy?: ");
            tdia = tcl.nextInt();
            while (tdia < 0 || tdia > 24){
                System.out.print("Entrada no valida, vuelva a ingresar: ");
                tdia = tcl.nextInt();
            }
            System.out.print(" -Cuanto de ese tiempo lo uso en actividades academicas?: ");
            tacademico = tcl.nextInt();
            while (tacademico < 0 || tacademico > tdia){
                System.out.print("Entrada no valida, vuelva a ingresar: ");
                tacademico = tcl.nextInt();
            }
            trecreativo = tdia - tacademico;
            tiempoAR += trecreativo;
            tiempoAA += tacademico;
            ttotal += tdia;
            System.out.println("\nINFORME DIARIO");
            if (trecreativo <= metad) {
                System.out.println("\n -El tiempo recreativo de " + trecreativo + " horas esta dentro de la meta de " + metad + " horas de hoy");
            } else {
                System.out.println("Supero el tiempo recreativo de hoy");
                supmeta ++;
            }
        }
        System.out.println("\n================ RESUMEN SEMANAL ================");
        System.out.println("En la semana se uso el dispositivo un total de: " + ttotal + " horas de las cuales");
        System.out.println("-" + tiempoAA + " horas en actividades academicas");
        System.out.println("-" + tiempoAR + " horas en actividades recreativas");
        System.out.println("En promedio, usted usa el dispositivo " + (ttotal / 7.0) + " horas diarias");
        System.out.println("Cantidad de dias que supero la meta recreativa: " + supmeta);
        System.out.println("El porcentaje de uso del dispositivo en la semana esta dividido en:");
        if (ttotal > 0) {
            System.out.println("-Uso recreativo: " + ((tiempoAR * 100.0) / ttotal) + "%");
            System.out.println("-Uso academico: " + ((tiempoAA * 100.0) / ttotal) + "%");
        } else {
            System.out.println("-Uso recreativo: 0%");
            System.out.println("-Uso academico: 0%");
        }
    }
}
