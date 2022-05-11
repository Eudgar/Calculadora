import javax.swing.*;

public class Main {
    //Variaveis para o menu.
    static int option;
    static String menu;

    public static void main(String[] args) {

        OperacoesBasicas object = new OperacoesBasicas();

        do {
            menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n" + "1. Adicao\n" + "2. Subtracao\n" + "3. Divisao\n" + "4. Multiplicacao\n" + "5. Sair");
            option = Integer.parseInt(menu);
            switch (option){
                case 1:
                    object.adicao();
                    break;
                case 2:
                    object.subtracao();
                    break;
                case 3:
                    object.divisao();
                    break;
                case 4:
                    object.multiplicacao();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showInputDialog(null, "A opção " + option + " é incorreta");
            }
        }while (option != 5);
    }
}