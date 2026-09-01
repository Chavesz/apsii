public class Main {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaBicicleta = new Bicicleta();


        Pista pista = new Pista();
        pista.iniciarCorrida(meuCarro);
        pista.iniciarCorrida(minhaBicicleta);
    }
}