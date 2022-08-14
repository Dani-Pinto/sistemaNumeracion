
package app;

public class Bases {
    //--------------------------------
    //ATRIBUTOS
    //--------------------------------
    private int base1, base2;
    private String numero, resultado="";
    
    //--------------------------------
    //MÉTODO CONSTRUCTOR
    //--------------------------------
    public Bases(int base1, int base2, String numero) {
        this.base1 = base1;
        this.base2 = base2;
        this.numero = numero;
    }
    
    //--------------------------------
    //MÉTODOS
    //--------------------------------
    public String convertirBase(){
        int cont = 0;
        for (int i = 0; i < this.numero.length(); i++) {
            int num = Integer.parseInt(this.numero.substring(i,i+1));
            if(num > this.base1){
                this.resultado = "No se puede manito";
                break;
            } else{
                cont += (int) ((num) * Math.pow(this.base1, (this.numero.length()-i-1)));
            }
        }
        int dividendo = cont;
        int divisor = this.base2;
        int cociente = 0;
        int modulo = 0;
        
        if (resultado == "") {
            for (int i = 0; i < this.numero.length(); i++) {
                if (dividendo > divisor) {
                    cociente = dividendo / divisor;
                    modulo = dividendo % divisor;
                    dividendo = cociente;
                    resultado += String.valueOf(modulo);
                } else {
                    modulo = cociente;
                    resultado += String.valueOf(modulo);
                    break;
                }
            }

            String resultado2 = "";
            for (int i = 0; i < resultado.length(); i++) {
                resultado2 += resultado.charAt(resultado.length() - i - 1);
            }
            System.out.println("resultado = " + resultado);
            return resultado = resultado2;
        }else{
            System.out.println("resultado = " + resultado);
            return resultado;
            
        }
    }
    
    //--------------------------------
    //GETTERS AND SETTERS
    //--------------------------------
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    

    
}
