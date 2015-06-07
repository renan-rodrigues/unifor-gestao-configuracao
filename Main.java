/*
* Criação de um novo arquivo java.
*/
public class Gestao{
// Renan Rodrigues
  private String nomeRepositorio;
  private String nomeUsuario;
  private String senhaUsuario;
  
  //TODO Construtor
public Gestao(){
  this.super();
}

 //TODO Generate Getters and Setters
private String getNomeRepositorio(){
  return this.nomeRepositorio;
}

private void setNomeRepositorio(String nomeRepositorio){
  this.nomeRepositorio = nomeRepositorio;
}

private String getNomeUsuario(){
  return this.nomeUsuario;
}

private void setNomeUsuario(String nomeUsuario){
  this.nomeUsuario = nomeUsuario;
}

private String getSenhaUsuario(){
  return this.senhaUsuario;
}

private void setSenhaUsuario(String senhaUsuario){
  this.senhaUsuario = senhaUsuario;
}


