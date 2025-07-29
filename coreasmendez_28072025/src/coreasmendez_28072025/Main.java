/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coreasmendez_28072025;

/**
 *
 * @author UFG
 */
public class Main {
    
    /*VARIABLES GLOBALES*/
    public static String nombres = "Pamela Cristina";
    public static String apellidos = "Coreas Mendez";
    public static int anio_nacimiento = 2002;
    public static int mes_nacimiento = 9;
    public static float estatura = 1.56f; //ESTATURA EN METROS
    public static float peso = 132.9f; //PESO EN LIBRAS
    public static char genero = 'F';
    public static String estado_familiar = "Soltera";
    public static double salario_mensual = 365.43d;
    
    
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
     double imc = 0.0d;
     float tasa_kilogramo = 0.453592f; //1 LIBRA EQUIVALE A 0.453592 KILOGRAMOS 
     int dias_laborales = 22; //22 DIAS LABORALES AL MES
     int horas_laborales = 8; //8 HORAS LABORALES AL DIA
     
     
     //CONVERTIR PESO DE LIBRAS A KILOGRAMOS
     float peso_kilogramos = Main.peso * tasa_kilogramo;
     
     //ELEVANDO EL VALOR DE LA ESTATURA AL CUADRADO
     float estatura_al_cuadrado = Main.estatura * Main.estatura;
     
     //CALCULAR EL INDICE DE MASA CORPORAL
     imc = peso_kilogramos/estatura_al_cuadrado;
     
     //CALCULANDO EL SALARIO DIARIO
     double salario_diario = Main.salario_mensual/dias_laborales; 
     
     //CALCULANDO SALARIO POR HORAS
     double salario_hora = salario_diario/horas_laborales;
     
     //SALIDA DE DATOS
     
     System.out.println("Saludos "+Main.nombres+ " "+Main.apellidos);
     System.out.println("Su peso en libras es : "+Main.peso+", pero en kilogramos es:"+peso_kilogramos);
     System.out.println("Su Indice de Masa Corporal es: "+imc);
     System.out.println("Su salario Mensual es: "+Main.salario_mensual);
     System.out.println("Su salario diario es: "+salario_diario);
     System.out.println("Su salario por hora es: "+salario_hora);
     
     
     
    
        
    }
    
    
}
