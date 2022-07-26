class Main {

    public static void main(String[] args) {

        Motor motor1 = new Motor("baraoVermelho", 50.0f);
        Motor motor2 = new Motor("baraoAzul", 50.0f);

        Passageiro passageiro1 = new Passageiro("tidinha", "Meneghel", "123");
        Passageiro passageiro2 = new Passageiro("ygona", "moura", "123");
        Passageiro passageiro3 = new Passageiro("rodrigo", "apresentador", "123");
        Passageiro passageiro4 = new Passageiro("cururu", "things", "123");
        Passageiro passageiro5 = new Passageiro("agatha", "nunes", "123");

        motor1.setAtivo(false);
        motor2.setAtivo(false);

        Aviao baraoVermelho = new Aviao("Lacre","pisou",motor1,motor2);

        baraoVermelho.adicionarPassageiro(passageiro1);
        baraoVermelho.adicionarPassageiro(passageiro2);
        baraoVermelho.adicionarPassageiro(passageiro3);
        baraoVermelho.adicionarPassageiro(passageiro4);
        baraoVermelho.adicionarPassageiro(passageiro5);


        motor1.setAtivo(true);
        motor2.setAtivo(true);

        baraoVermelho.setMotorDireito(motor1);
        baraoVermelho.setMotorEsquerdo(motor2);


        baraoVermelho.imprimirListaDePassageiros();

        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.acelerar();
        baraoVermelho.desacelerar();
        baraoVermelho.desacelerar();
        baraoVermelho.desacelerar();
        baraoVermelho.desacelerar();
        baraoVermelho.desacelerar();

        motor1.setAtivo(false);
        motor2.setAtivo(false);

        baraoVermelho.setMotorDireito(motor1);
        baraoVermelho.setMotorEsquerdo(motor2);

        baraoVermelho.desembarcarPassageiros();



    }
}