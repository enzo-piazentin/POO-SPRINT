package Main;


import Model.TrechoRodovia;

public class SistemaPrincipal {
    public static void main(String[] args) {

        TrechoRodovia trecho1 = new TrechoRodovia(0, 150, 10.0);
        TrechoRodovia trecho2 = new TrechoRodovia(150, 300, 15.0);
        
        trecho1.exibirInfo();
        trecho1.registrarCrescimento(5.0);
        
        trecho2.exibirInfo();
        trecho2.registrarCrescimento(3.0);
    }
}