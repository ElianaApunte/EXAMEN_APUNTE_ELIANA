
package TEST;
import java.util.Scanner;
import CLASS.COORDENADAS;

public class TestCoordenadas {
    static Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        int cant;
        
        System.out.println("Programa que calcula la trayectoria de una particula");
        System.out.println("que va atravez del plano cartesiano iniciando en (0,0)");
        System.out.println("");
        System.out.println("Ingrese el # de movimientos que realizara la particula");
        cant=datos.nextInt();
        
        COORDENADAS [] coordenada = new COORDENADAS [cant]; 
        
        LlenaDatos(coordenada);
        
        //for(COORDENADAS COR:coordenada){
          //  System.out.println(COR);
        //}
        
        Distancia(coordenada);
        
    }
    
    public static void LlenaDatos(COORDENADAS COR[]){
        double distancia; 
        
        for (int i=0;i<COR.length;i++){
            System.out.println("Ingrese la distancia del mov "+(i+1));
            distancia=datos.nextDouble();
            
            COR[i] = new COORDENADAS(distancia);
        }
    }
    
    public static void Distancia(COORDENADAS COR[]){
        double contador=0;
        
        for (int i=0;i<COR.length;i++){
            contador=contador+COR[i].getDistancia();
        }
        
        System.out.println("El total de la distancia recorrida por la particula"
                + "es: "+contador);
    }
  
}
