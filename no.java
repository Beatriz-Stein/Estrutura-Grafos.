import java.util.ArrayList;

public class no {
    private String cidade;
    private ArrayList<no> aresta;

    public no(String nomeCidade) {
        this.cidade = nomeCidade;
        this.aresta = new ArrayList<>();
    }

    public void adicionararesta(String nome,no origem, no destino, int peso) {
        this.aresta.add(new aresta(nome,origem,destino,peso));
    }

    public void removeraresta(no destino) {
        this.aresta.removeIf(aresta -> aresta.getDestino().equals(destino));
    }

    public void exibir(boolean mostrarPeso) {
        String resultado = "";

        if (this.aresta.isEmpty()) {
            System.out.println(this.getCidade() + " --> (Vazio)");
        } else {
            for (int i = 0; i < this.aresta.size(); i++) {
                if (i == 0) {
                    resultado += this.aresta.get(i).getOrigem().getCidade() + " --> ";
                }
                resultado += this.aresta.get(i).getDestino().getCidade();

                if (mostrarPeso) {
                    resultado += " (" + this.aresta.get(i).getPeso() + ")";
                }

                if (i != this.aresta.size() - 1) {
                    resultado += ", ";
                }
            }
            System.out.println(resultado);
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<no> getaresta() {
        return aresta;
    }
}