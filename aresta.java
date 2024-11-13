public class aresta {
  private no origem;
  private no destino;
  private String nome;
  private int peso;

  public aresta(String nome,no origem, no destino, int peso) {
      this.nome = nome;
      this.origem = origem;
      this.destino = destino;
      this.peso = peso;
  }

  public no getOrigem() {
      return origem;
  }

  public void setOrigem(no origem) {
      this.origem = origem;
  }

  public no getDestino() {
      return destino;
  }

  public void setDestino(no destino) {
      this.destino = destino;
  }

  public int getPeso() {
      return peso;
  }

  public void setPeso(int peso) {
      this.peso = peso;
  }
}
