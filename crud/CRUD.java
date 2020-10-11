
package crud;

import java.util.Scanner;

public class CRUD {

    public static void main(String[] args) {
       Acciones  instanciaAcciones=new Acciones();
       String opc;
       int opc2;
        Scanner c=new Scanner(System.in);
        
       do{
        System.out.println("¿Que acción quiere realizar?");
        System.out.println("A.Insertar dato a la lista");
        System.out.println("B.Mostrar lista");
        System.out.println("C.Actualizar lista");
        System.out.println("D.Borrar");
        System.out.println("E.Salir");
        opc=c.next();
        
       
        
        switch(opc){
            
            case "A":
             instanciaAcciones.Insertar();   
            break;
            
            case "B":
             instanciaAcciones.Mostrar();
            break;
            
            case "C":
             instanciaAcciones.Actualizar();
            break;
            
            case "D":
             instanciaAcciones.Borrar();
            break;
            
            case "E":
                System.exit(0);
            break;    
            
            default: System.out.println("Opción incorrecta");
        }
        
        do{
        System.out.println("¿Quieres realizar otra acción? 1. Si 2. No");
        opc2=c.nextInt();
        
             switch(opc2){
                 case 1:
                 opc2=1;
             break;
                 case 2:
                 System.exit(0);
                 break;
                 default: System.out.println("Opción incorrecta");
             }
        
        }while(opc2>1);
       
         }while(opc2==1);
       
    }
    
    
}
