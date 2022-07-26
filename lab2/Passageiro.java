class Passageiro{

private String primeiroNome;
private String ultimoNome;
private String cpf;

Passageiro(String novoPrimeiroNome, String novoUltimoNome, String novoCpf){
    this.primeiroNome = novoPrimeiroNome;
    this.ultimoNome = novoUltimoNome;
    this.cpf = novoCpf;
}


Passageiro(String novoCpf){
    this.cpf = novoCpf;
}



public void setPrimeiroNome(String novoPrimeiroNome){
    this.primeiroNome = novoPrimeiroNome;
}

public String getPrimeiroNome(){
    return this.primeiroNome;
}

public void setUltimoNome(String novoUltimoNome){
    this.ultimoNome = novoUltimoNome;
}

public String getUltimoNome(){
    return this.ultimoNome;
}

public void setCpf(String novoCpf){
    this.cpf = novoCpf;
}

public String getCpf(){
    return this.cpf;
}




}