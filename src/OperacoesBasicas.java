import javax.swing.*;

public class OperacoesBasicas {

    //Variaveis que usaremos.
    double n1;
    double n2;
    double res;

    //Construtor da classe OperacoesBasicas
    public OperacoesBasicas(){
        n1 = 0;
        n2 = 0;
        res = 0;
    }

    //Metodos que utilizaremos (adição, subtração, divisão, multiplicação)
    public void adicao(){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Valor"));
        res = n1 + n2;
        JOptionPane.showInputDialog(null, "O resultado é " + res);
    }
    public void subtracao() {
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Valor"));
        res = n1 - n2;
        JOptionPane.showInputDialog(null, "O resultado é " + res);
    }
    public void divisao() {
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Valor"));
        res = n1 / n2;
        JOptionPane.showInputDialog(null, "O resultado é " + res);
    }
    public void multiplicacao() {
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Valor"));
        res = n1 * n2;
        JOptionPane.showInputDialog(null, "O resultado é " + res);
    }
}