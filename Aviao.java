class Aviao{

    String modelo;
    String identificador;
    boolean motor;
    float altura;
    private float velocidade;
    private boolean emVoo;

    Aviao(String novoM, String novoId){
        this.setModelo(novoM);;
        this.setIdentificador(novoId);
        this.setMotor(false);
        this.setAltura(0.0f);
    }

    public void atualizarStatusVoo(){
        if(this.getEmVoo()){
            if(this.getVelocidade() >= 200.0f){
                System.out.println("Estou voando..."); 
            }
            else{
                this.setEmVoo(false);
                System.out.println("Estou aterrisando...");
            }
        }

        else{
            if(this.getVelocidade() < 200.0f){
                System.out.println("Estou em solo...");
            }
            else{
                this.setEmVoo(true);
                System.out.println("Estou decolando...");
            }
        }

    }

    public void ligarMotor() {
        this.setMotor(true);
        System.out.println("Vrummmmmmmm");
    }

    public void desligaMotor() {
        this.setMotor(false);
    }

    public void imprimeEstadoMotor(){
        if (this.motor == true){
            System.out.println("O motor esta ligado..");
        }else{
            System.out.println("O motor esta desligado..");
        }
    }

    public boolean getEstadoMotor(){
        return this.getMotor();
    }

    public void acelerar(){
        if (this.getEstadoMotor()){
            this.setVelocidade(this.getVelocidade() + 50.0f);
            System.out.printf("Aviao a %2f km/h \n",this.getVelocidade());
        } 
        else{
            System.out.printf("ERRO: Motor desligado \n");
        }
        atualizarStatusVoo();
    }

    public void desacelerar(){
        if(getEstadoMotor()){
         if(this.getVelocidade() > 0.00f){
             this.setVelocidade(this.getVelocidade() - 50.0f);
         }   
         System.out.printf("Aviao a %2f km/h \n",this.getVelocidade());
        }
        else{
            System.out.printf("ERRO: Motor desligado \n");
        }
        atualizarStatusVoo();
    }

    public static void imprimaOK() {
     System.out.println("Ok");   
    }

    public void setModelo(String novoValor){
        this.modelo = novoValor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setAltura(float novoValor){
        this.altura = novoValor;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setIdentificador(String novoValor){
        this.identificador = novoValor;
    }

    public String getIdentificador(){
        return this.identificador;
    }

    public void setMotor(boolean novoValor){
        this.motor = novoValor;
    }

    public boolean getMotor(){
        return this.motor;
    }
    private void setVelocidade(float novoValor){
        this.velocidade = novoValor;
    }

    public float getVelocidade(){
        return this.velocidade;
    }

    private void setEmVoo(boolean novoValor){
        this.emVoo = novoValor;
    }

    public boolean getEmVoo(){
        return this.emVoo;
    }

}

