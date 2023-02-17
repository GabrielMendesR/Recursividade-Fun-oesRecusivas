package Atividade1Potencia;

public class Potencia {

    public Potencia() {
    }

    public int calculoPotencia(int valor) {
            if(valor == 0){
                return 1;
            }

        return 2 * calculoPotencia(valor - 1);
    }

}
