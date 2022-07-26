class Main {

    public static void main(String[] args) {

        Motor motor1 = new Motor("baraoVermelho", 50.0f);
        Motor motor2 = new Motor("baraoAzul", 50.0f);

        motor1.setAtivo(true);
        motor2.setAtivo(true);

        Aviao baraoVermelho = new Aviao("Lacre","pisou",motor1,motor2);


        baraoVermelho.imprimeEstadoMotor();



    }
}