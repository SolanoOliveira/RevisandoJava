public class Motor {

    String modelo;
    float potencia;
    boolean ativo;


    Motor(String novoModelo, Float novoPotencia){
        this.setModelo(novoModelo);;
        this.setPotencia(novoPotencia);
        this.setAtivo(false);
    }

    public void setModelo(String novoAtributo) {
        this.modelo = novoAtributo;
    }

    public String getModelo() {
        return this.modelo; 
    }

    public void setPotencia(Float novoAtributo) {
        this.potencia = novoAtributo;
    }

    public float getPotencia() {
        return this.potencia;
    }

    public void setAtivo(Boolean novoAtributo) {
        this.ativo = novoAtributo;
    }

    public boolean getAtivo() {
        return this.ativo; 
    }

    public void ligar(){
        setAtivo(true);
        System.out.println(".....VRUMMMM!!");
    }

    public void desligar(){
        setAtivo(false);
        System.out.println("mmmmm.....");
        
    }

    
}
