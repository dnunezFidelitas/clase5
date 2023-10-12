/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //metodo1();
       //metodo2();
       //metodo3();
       metodo4();
        
    }
    
    /**
     * Metodo1 
     * Crear un metodo (calculadora) que tengo 3 parametros un String (sumar, restar, 
     * dividir, multiplicar ) Parametro2 double parametro3 double  
     */
    public static void metodo1(){
        String solicitar = "Por favor escriba el tipo de operación que desea realizar "
                + "\n Valores esperados (sumar, restar, dividir, multiplicar) "
                + "\n respetar las minusculas";
        String solicitarNumero = "Por favor digitar un número para realizar el calculo parametro ";
        double resultado =calculadora(getString(solicitar), getDouble(solicitarNumero + "1"), getDouble(solicitarNumero + "2"));
        printMessage("El resultado es "+ resultado);
    }
    
    /**
     * Metodo2
     * Crear un metodo que me sume n numeros y me saque el promedio 
     */
    public static void metodo2(){
        double result;
        String solicitar = "Por favor escriba la cantidad de numeros para sacar el promedio";
        String solicitarNumero ="Por favor escriba el número ";
        result=promedio(getInteger(solicitar), solicitarNumero);
        printMessage("El resultado es "+ result);
    }
    
    /**
     * Metodo3
     * Crear un metodo que calcule el area de un cuadrado 
     */
    public static void metodo3(){
         String solicitar = "Por favor digite el tamaño del lado de un cuadrado en centimetros";
         double area=areaCuadrado(getInteger(solicitar));
         printMessage("El area del cuadro es " + area + " cm2");
    }
    /**
     * Metodo4
     * Crear un metodo que imprima los datos de una persona el ced, nombre, telefono 
     */
    public static void metodo4(){
        int id=41202399;
        String nombre="David Núñez Araya";
        int telefono=88882222;
        String resultado="------------------------------------------------------\n"
                       + "Id: "+id +"\n"
                       + "Nombre: "+nombre +"\n"
                       + "Teléfono: "+telefono +"\n"
                       + "------------------------------------------------------" ;  
        printMessage(resultado);
    }
    
    
    /**
     * Metodo encargado de solicitar un valor double
     * @param s String como solicita la data
     * @return devuelve valor double
     */
    public static double getDouble(String s){
        return Double.parseDouble(JOptionPane.showInputDialog(s));
    }
    
    /**
     * Metodo encargado de solicitar un valor entero
     * @param s String como solicita la data
     * @return devuelve valor integer
     */
    public static int getInteger(String s){
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }
    
    /**
     * Metodo encargad de solicitar un valor String
     * @param s String como solicita la data
     * @return devuelve valor String
     */
    public static String getString(String s){
        return JOptionPane.showInputDialog( s);
    }
    
    /**
     * Metodo utilizado para imprimir en pantalla
     * @param s 
     */
    public static void printMessage(String s){
        JOptionPane.showMessageDialog(null, s);
    }
    
    
    /**
     * Metodo (calculadora) es el encargado de realizar la operación aritmetica de dos numeros
     * @param type su valor puede ser sumar, restar, dividir, multiplicar
     * @param a valor double 
     * @param b valor double
     * @return devuelvela operación aritmetica 
     */
    public static double calculadora (String type, double a, double b){
        double result =0;
        switch (type) {
            case "sumar":
                result=a+b;
                break;
            case "restar":
                result=a-b;
                break;
            case "dividir":
                result=a/b;
                break;    
            case "multiplicar":
                result=a*b;
                break;     
            default:
                throw new AssertionError();
        }
        
        return result;
    }
    

    /**
     * Metodo que suma n numeros y saca el promedio
     * @param cantidad
     * @param texto
     * @return 
     */
    public static double promedio(int cantidad, String texto){
        double result = 0;
        for (int i = 1; i < cantidad+1; i++) {
            result=result+getDouble(texto +""+i);
        }
        return result/cantidad;
    }
    
    /**
     * calcula el area de un cuadrado
     * @param lado tamaño del cuadrado
     * @return devuele el area total
     */
    public static int areaCuadrado(int lado){
        return lado*lado;
    }
    

    
    
}






    