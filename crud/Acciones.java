package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acciones {
    
    List <Integer> listakate=new ArrayList<Integer>();
    int opc;
    int opc2;
    Scanner c=new Scanner(System.in);
    
    public void Insertar(){
        System.out.println("¿Que dato deseas insertar?");
        opc=c.nextInt();
        listakate.add(opc);
        System.out.println("Dato insertado");
    }
    
    public void Mostrar(){
        if(listakate.isEmpty()){
            System.out.println("La lista está vacía"); 
        
        }else{
            System.out.println("************");
            for(int i=0;i<listakate.size();i++){
            System.out.println(listakate.get(i));
            } System.out.println("************");
        }
    }
    
    public void Actualizar(){
        if(listakate.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            System.out.println("************");
            for(int i=0;i<listakate.size();i++){
            System.out.println("Posición "+i+"."+listakate.get(i));
            } System.out.println("************");
        
            System.out.println("¿Que posición deseas actualizar?");
            opc2=c.nextInt();
            
            System.out.println("¿Que dato deseas insertar?");
            opc=c.nextInt();
            listakate.set(opc2, opc);
            System.out.println("Dato insertado");
           
            System.out.println("************"); 
            for(int i=0;i<listakate.size();i++){
            System.out.println("Posición "+i+"."+listakate.get(i));
            } System.out.println("************");
        }
    }
    
    public void Borrar(){
        if(listakate.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            System.out.println("1.Vaciar la lista 2.Borrar dato en específico");
            opc=c.nextInt();
            if(opc==1){
            listakate.clear();
                System.out.println("Datos eliminados");
            }else{
                System.out.println("************");
            for(int i=0;i<listakate.size();i++){
            System.out.println("Posición "+i+"."+listakate.get(i));
            } System.out.println("************");
            System.out.println("¿Que posición deseas Borrar?");
            opc=c.nextInt();
            //Quitar elemento
            listakate.remove(opc);
            System.out.println("************");
            for(int i=0;i<listakate.size();i++){
            System.out.println("Posición "+i+"."+listakate.get(i));
            } System.out.println("************");
            }
            
        }
        
    }

}
