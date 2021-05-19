package OOP.Polimorfismo;

public class Exemplo003 {

    public static void main(String[] args) {

        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto()); //calculará imposto de R$ 10.

        Veiculo carro = new Carro();
        carro.setValorVenal(1000.0);
        System.out.println(carro.calculaImposto()); //calculará imposto de R$ 70.

        Veiculo moto = new Motocicleta();
        moto.setValorVenal(1000.0);
        System.out.println(moto.calculaImposto()); //calculará imposto de R$ 30.

    }

}
