/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Suporte
 */
public class automovel extends terrestre {
    
    private String placa;
    private int portas;
    
    public void ImprimeDadosCarro() {
        
        System.out.println("Número da placa: "+placa);
        System.out.println("Número de portas: "+portas);
        System.out.println("Número de rodas: "+numRodas);
        System.out.println("Capacidade: "+capacidade);
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
  
    
    
    
}
