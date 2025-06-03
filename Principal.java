import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        carro.entrada();
        carro.imprime();
        carro.acelerar(100);
        carro.frear(50f);
    }
}
