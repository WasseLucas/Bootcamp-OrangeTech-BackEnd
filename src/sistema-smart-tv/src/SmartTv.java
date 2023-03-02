public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 1;

  //metodo para ligar tv
  public void ligar(){
    ligada = true;
  }
  //metodo para desligar tv
  public void desligar(){
    ligada = false;
  }
  //metodo para aumentar volume
  public void aumentarVolume(){
    volume ++;
    System.out.println("Aumentando o volume para:  " + volume);
  }
  //metodo para diminuir volume
  public void diminuirVolume(){
    volume --;
    System.out.println("Diminuindo o volume para:  " + volume);
  }
  //metodo para mudar canal com parametro para setar novo canal
  public void mudarCanal(int novoCanal){
    canal = novoCanal;
  }
  //metodo para aumentar canal
  public void diminuirCanal(){  
    canal--;
  }
  //metodo para diminuir canal
  public void aumentarCanal(){
    canal++;
  }

  

}
