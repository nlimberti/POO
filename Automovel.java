import java.util.Scanner;

public class Automovel {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;
    private double velocidadeAtual=0;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao < 1900 || anoFabricacao > 2026) {
            System.out.println("Ano invalido");
        } else {
            this.anoFabricacao = anoFabricacao;
        }
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual < 0 || velocidadeAtual > 250) {
            System.out.println("Velocidade invalida");
        } else {
            this.velocidadeAtual = velocidadeAtual;
        }
    }
    public void entrada(){
        Scanner tlc = new Scanner(System.in);
        System.out.println("Digite a marca do carro: ");
        this.setMarca(tlc.nextLine());
        System.out.println("Digite o modelo do carro: ");
        this.setModelo(tlc.nextLine());
        System.out.println("Digite a data de fabricacao do carro: ");
        this.setAnoFabricacao(tlc.nextInt());
        tlc.nextLine();
        System.out.println("Digite a cor do carro: ");
        this.setCor(tlc.nextLine());
        System.out.println("Digite a velocidade atual do carro: ");
        this.setVelocidadeAtual(tlc.nextDouble());

    }
    public void imprime(){
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ano de fabricaçao: "+this.getAnoFabricacao());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Velocidade atual: "+this.getVelocidadeAtual());
    }
    public void acelerar(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;
        if (novaVelocidade > 250) {
            System.out.println("Velocidade maxima excedida");
        } else {
            this.velocidadeAtual = novaVelocidade;
            System.out.println("A nova velocidade depois de acelerar: "+this.getVelocidadeAtual());
        }
    }

    public void frear(double velocidade) {
        double novaVelocidade = this.velocidadeAtual - velocidade;
        if (novaVelocidade < 0) {
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual = novaVelocidade;
            System.out.println("A velocidade apos frear: "+this.getVelocidadeAtual());
        }
    }
}
