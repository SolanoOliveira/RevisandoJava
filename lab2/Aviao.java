import java.lang.reflect.Array;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;

class Aviao{

    String modelo;
    String identificador;
    float altura;
    private float velocidade;
    private boolean emVoo;
    private Motor motorEsquerdo;
    private Motor motorDireito;
    ArrayList<Passageiro> listaPassageiro;

    Aviao(String novoM, String novoId, Motor novoMotorDireito,Motor novoMotorEsquerdo){
        this.setModelo(novoM);
        this.setIdentificador(novoId);
        this.setAltura(0.0f);
        this.setMotorDireito(novoMotorDireito);
        this.setMotorEsquerdo(novoMotorEsquerdo);
        ArrayList<Passageiro> list = new ArrayList<>();
        this.listaPassageiro = list;
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

    public boolean adicionarPassageiro(Passageiro obj){
        if(this.getEstadoMotor() == false){
            this.listaPassageiro.add(obj);
            return true;
        }
        else{
            System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
            return false;
        }
    }

    public Passageiro buscaPassageiroCpf(String cpf){
        for (Passageiro pessoa : listaPassageiro) {
            if (cpf.equals(pessoa.getCpf())){
                return pessoa;
            }
        }
        return null;
    }

    public void imprimirListaDePassageiros(){
            Passageiro pessoa;
            for(int i = 0; i < this.listaPassageiro.size(); i++){
            pessoa = this.listaPassageiro.get(i);
            System.out.println("Nome: " + pessoa.getPrimeiroNome());
            System.out.println("Ultimo nome: " + pessoa.getUltimoNome());
            System.out.println("Cpf: " + pessoa.getCpf());
        }
    }

    public void desembarcarPassageiros(){
        if(this.getEstadoMotor() == false){
                Passageiro pessoa;
                for(int i = 0; i < this.listaPassageiro.size(); i++){
                pessoa = this.listaPassageiro.get(i);
                System.out.println(pessoa.getPrimeiroNome() + " " + pessoa.getUltimoNome() + " desembarcou da aeronave");
            }
            this.listaPassageiro.clear();
        }
        else{
            System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
        }
    }

    public void ligarMotorEsquerdo() {
        this.getMotorEsquerdo().ligar();
    }

    public void desligaMotorEsquerdo() {
        this.getMotorEsquerdo().desligar();
    }

    public void ligarMotorDireito() {
        this.getMotorDireito().ligar();
    }

    public void desligaMotorDireito() {
        this.getMotorDireito().desligar();
    }

    //acredito que o enunciado está errado então eu considerei esse método
    public void imprimeEstadoMotor(){
        if (this.getMotorDireito().getAtivo() == true && this.getMotorEsquerdo().getAtivo() == true){
            System.out.println("Os motores estão ligados..");
        }
        else if(this.getMotorDireito().getAtivo() == false && this.getMotorEsquerdo().getAtivo() == false){
            System.out.println("Os motores estão desligados..");
        }
        
        else{
            if(this.getMotorDireito().getAtivo() == true){
                System.out.println("Somente o motor esquerdo está ligado");
            }else{
                System.out.println("Somente o motor direito está ligado");
                }
            }
        }

    public boolean getEstadoMotor(){
        if(this.getMotorEsquerdo().getAtivo() == true || this.getMotorDireito().getAtivo() == true){
            return true;
        }
        return false;
    }

    public void acelerar(){

        float soma = 0;

        if(this.getMotorDireito().ativo == true){
            soma = this.getMotorDireito().getPotencia() + soma;
        }

        if(this.getMotorEsquerdo().ativo == true){
            soma = this.getMotorEsquerdo().getPotencia() + soma;
        }

        if (this.getEstadoMotor()){
            this.setVelocidade(this.getVelocidade() + soma);
            System.out.printf("Aviao a %2f km/h \n",this.getVelocidade());
        } 
        else{
            System.out.printf("ERRO: Motor desligado \n");
        }
        atualizarStatusVoo();
    }

    public void desacelerar(){

        
        float soma = 0;

        if(this.getMotorDireito().ativo == true){
            soma = this.getMotorDireito().getPotencia() + soma;
        }

        if(this.getMotorEsquerdo().ativo == true){
            soma = this.getMotorEsquerdo().getPotencia() + soma;
        }

        if(getEstadoMotor()){
         if(this.getVelocidade() > 0.00f){
             this.setVelocidade(this.getVelocidade() - soma);
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

    public Motor getMotorDireito(){
        return this.motorDireito;
    }

    public void setMotorDireito(Motor novoMotor){
        this.motorDireito = novoMotor;
    }

    public Motor getMotorEsquerdo(){
        return this.motorEsquerdo;
    }

    public void setMotorEsquerdo(Motor novoMotor){
        this.motorEsquerdo = novoMotor;
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

