
 
package heranca;

public class Heranca extends terrestre {

   
    public static void main(String[] args) {
        
        automovel carro = new automovel();
        automovel moto = new automovel();
        
        carro.setPlaca("ABH-6548");
        carro.setPortas (3);
        carro.setNumRodas (4);
        carro.setPortas(2);
        
        carro.ImprimeDadosCarro();
        
    
    }
    
}
