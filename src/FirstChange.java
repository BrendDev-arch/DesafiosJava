import javax.swing.JOptionPane;

public class FirstChange {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    
        String sair;
       
        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n 1- Estatística Descritiva\n 2- Probabilidade\n 3- Modelos Probabilísticos\n 4- Sair"));
            
            if(op!=4){

                switch (op) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Estatística Descritiva", "Aula3- Switch e Loops", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Probabilidade", "Aula3- Switch e Loops", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Modelos Probabilísticos", "Aula3- Switch e Loops", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida", "Aula3- Switch e Loops", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            sair = JOptionPane.showInputDialog("Gostaria de escolher outra opção: sim ou não");
            if (!sair.equalsIgnoreCase("sim")){
                JOptionPane.showMessageDialog(null, "Encerrando o sistema..."); break;
            }

            }else{
                JOptionPane.showMessageDialog(null, "Encerrando o sistema..."); break;
            }
        }
    }
                     
}

