package dio.springboot.app;

import java.util.List;


public class Remetente {
 
  private String nome;

  private String email;

  private List<Long> telefone;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Long> getTelefone() {
    return telefone;
  }

  public void setTelefone(List<Long> telefone) {
    this.telefone = telefone;
  }

  public String toString(){
    return "Remetente {" +
              "nome: " + nome + '\'' +
              ", email='" + email + '\'' +
              '}';      
  }
}
