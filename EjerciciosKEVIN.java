
package com.sena.ejercicioskevin;
import java.util.Scanner;
public class EjerciciosKEVIN {
static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
   int His;
   int edad;
   String sexo;
   int tipo;
   int urgencia = 0;
   int control = 0;
   int general = 0;
        System.out.println("registrar numero de consultas");
        dato.nextLine();
        System.out.println("Ingresar numero de historia clinica(-1 para finalizar)");
        His = dato.nextInt();
        System.out.println("Ingrese edad del paciente");
        edad = dato.nextInt();
        System.out.println("Ingrese tipo de sexo del paciente");
        sexo = dato.nextLine();
        dato.nextLine();
        System.out.println("Ingrese tipo de consulta(1 = urgencia,1 = control,3 = general)");
        tipo = dato.nextInt();
        while (His != -1) {
            if (tipo == 1){
                urgencia++;
            }else if (tipo == 2){
                control++;
            }else if (tipo == 3){
                general++;
            }else {
            System.out.println("No valido");
                
            }
            System.out.println("Registrar numero de consulta");
            dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresar numero de historia clinica (-1 para finalizar)");
            His = dato.nextInt();
            if (His == -1){
                break;
            }
            System.out.println("Ingrese edad del paciente");
            edad = dato.nextInt();
            System.out.println("Ingrese tipo de sexo del paciente");
            sexo = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingrese tipo de consulta(1 = urgencia,1 = control,3 = general)");
            tipo = dato.nextInt();
            
        
        }
        System.out.println("Resultados finales");
        System.out.println("Total de consultas de urgencia"+ urgencia);
        System.out.println("Total de consultas de control"+ control);
        System.out.println("Total de consultas generales"+ general);
        
            }
            }
        