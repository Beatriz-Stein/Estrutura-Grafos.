import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Grafo extends JPanel {

    private List<no> nos;
    private List<no> aresta;

    public Grafo() {
        nos = new ArrayList<>();
        aresta = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(400) + 50;
            int y = random.nextInt(400) + 50;
            no no = new no( x, y);
            nos.add(no);
        }

        for (int i = 0; i < 15; i++) {
            int tamanho = nos.size();

            int no1Aleatorio = random.nextInt(tamanho);
            int no2Aleatorio = random.nextInt(tamanho);

            no n1 = nos.get(no1Aleatorio);
            no n2 = nos.get(no2Aleatorio);

            double pesoFixo = 5.0;

            if (n1 != n2) {
                no aresta = new no(n1, n2, pesoFixo);
                aresta.add(aresta);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (no aresta : aresta) {
            no no1 = aresta.getno1();
            no no2 = aresta.getno2();
            g2d.drawLine(no1.getX(), no1.getY(), no2.getX(), no2.getY());
            float posX = (no2.getX() + no1.getX()) / 2;
            float posY = (no2.getY() + no2.getY()) / 2;
            g2d.drawString(String.valueOf(aresta.getPeso()), posX - 15, posY - 25);
        }

        for (no no : nos) {
            g2d.drawOval(no.getX(), no.getY(), 10, 10);
            g2d.drawString(no.getnome(), no.getX() - 10, no.getY() - 15);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Grafo grafo = new Grafo();
        frame.add(grafo);
        frame.setSize(500,  500);
        frame.setVisible(true);
    }
}