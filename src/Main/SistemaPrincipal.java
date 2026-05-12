package Main;


import Model.TrechoRodovia;

public class SistemaPrincipal {
    public static void main(String[] args) {

        TrechoRodovia rodanel = new TrechoRodovia(0, 150, 0.3);
        rodanel.exibirInfo();
        rodanel.registrarCrescimento(15);
    }
}