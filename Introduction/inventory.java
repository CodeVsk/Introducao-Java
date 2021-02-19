package Introduction;

import javax.swing.JOptionPane;

public class inventory {
    public static void main(String[] args) {
        float Minimum = Float.parseFloat(JOptionPane.showInputDialog("Entre com o número minimo de peças:"));
        float Maximum = Float.parseFloat(JOptionPane.showInputDialog("Entre com o número máximo de peças:"));
        JOptionPane.showMessageDialog(null, "O estoque médio de peças é: "+(Minimum+Maximum)/2,"Estoque Médio",JOptionPane.INFORMATION_MESSAGE);
    }
}