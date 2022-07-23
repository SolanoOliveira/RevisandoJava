class Main {

    public static void main(String[] args) {

        Aviao baraoVermelho = new Aviao("Lacre","pisou");
        baraoVermelho.imprimaOK();

        System.out.println("Modelo: " + baraoVermelho.getModelo() +
        "\nId:" + baraoVermelho.getIdentificador()+
        "\nStatus Motor:" + baraoVermelho.getMotor()+
        "\nAltura:" + baraoVermelho.getAltura());


        baraoVermelho.ligarMotor();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        barao.desacelerar();
        baraoVermelho.desligaMotor();
    }
}