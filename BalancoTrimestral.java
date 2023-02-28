public class BalancoTrimestral {
    public static void main(String[] balancoTrimestral) {
        
        int gastosJaneiros = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosGerais = gastosJaneiros + gastosFevereiro + gastosMarco; 

        System.out.println("Os gastos Gerais foram de: " + gastosGerais + " reais");
        
        double mediaMensal = gastosGerais / 3;

        System.out.println("A média mensal foi de: " + mediaMensal + " reais");

    }
}
