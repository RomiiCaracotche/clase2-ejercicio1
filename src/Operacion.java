public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(){};

    public Operacion(int num1, int num2){
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public void setNumero1(int num1){
        this.numero1 = num1;
    }

    public void setNumero2(int num2){
        this.numero2 = num2;
    }

    public int getNumero1(){
        return numero1;
    }

    public int getNumero2(){
        return numero2;
    }

    public void crearOperacion(int num1, int num2){
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public int sumar(int num1, int num2){
        return num1 + num2;
    }

    public int restar(int num1, int num2){
        return num1 - num2;
    }

    public int dividir(int num1, int num2){
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return num1 / num2;
    }

    public int multiplicar(int num1, int num2){
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede multiplicar por cero");
            return 0;
        }
        return num1 * num2;
    }

}
