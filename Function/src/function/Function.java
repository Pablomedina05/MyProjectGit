/*
 * Function
*y procedimientos
 */
package function;

/**
 *
 * @author pablomedgao
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preu=100, tax=21, res;
        int euro=100;
        float result=conversorEdgar(euro);
        System.out.println("result");
        res=functionMarc(preu, tax);
        System.out.println(res);
        methodAitor (preu, tax, res);
    }
    private static float conversorEdgar(int euro){
        float result=0;
        result= (float)euro/0.91f;//cast
        return result;
    }
    
    
    
    
    //funcion CalculoPVP
    private static double functionMarc(double price, double iva){
        double PVP=0;// declarar variable
        PVP= price + price*(iva/100);
        return PVP;
        
    }
    public static void methodAitor(double price, double iva, double res){
         System.out.println("\033[34m" + "price " + price);
         System.out.println("\033[34m" + "iva " + iva);
         System.out.println("\033[34m" + "res " + res);
    }
        
    
    
}
