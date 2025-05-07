import java.util.Random;

import javax.swing.JOptionPane;

public class SecondChange {
    public static void main(String[] args) throws Exception {
        // Cara ou Coroa - Probabilidade
        // 50% Cara
        // 50% Coroapush
        // espaço amostral
        // Variável que receba a interação do jogo
        // Random
        // For, do While e While
        String [] espacoAmostral = {"1", "2","3","4","5","6"};
        // objeto Random..
        //sorteio
        Random random = new Random();
         
        //Contadores para verificar a distribuição
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;

        String mensagem = "Espaço amostral: Lançar dados\n" + "Probabilidade de ser 1: 16,666% \n"+ "Probabilidade de ser 2: 16,666% \n"+"Probabilidade de ser 3: 16,666% \n" +"Probabilidade de ser 4: 16,666% \n"+"Probabilidade de ser 5: 16,666% \n"+"Probabilidade de ser 6: 16,666% \n" 
                    + "\n" + "Deseja lançar um dado ?";
        // loop de lançamento
        while(true){
            // interação com usuário
            int opcao = JOptionPane.showConfirmDialog(null,mensagem, "Lançando moedas", JOptionPane.YES_NO_OPTION);
            if(opcao != JOptionPane.YES_NO_OPTION){
                //estatísticas
                String estatisticas = "Jogo finalizado!\n" +
                "Total de lançamentos: " + (cont1+cont2+cont3+cont4+cont5+cont6) + "\n"+
                " para o 1 foi: " + cont1 + "\n" + " para o 2 foi: " + cont2 + "\n" +  " para o 3 foi: " + cont3 + "\n" + " para o 4 foi: " + cont4 + "\n" +  " para o 5 foi: " + cont5 + "\n" +  " para o 6 foi: " +  cont6;
                  
                JOptionPane.showMessageDialog(null, estatisticas, "Finalizando Jogo", JOptionPane.INFORMATION_MESSAGE);
                break;
            } 
            
            int resultado = random.nextInt(6);
            switch (resultado) {
                case 0:
                    cont1++; break;
                case 1:
                    cont1++; break;
                case 2:
                    cont3++; break;
                case 3:
                    cont4++; break;
                case 4:
                    cont5++; break;
                case 5:
                    cont6++; break;
             
            }
            String saida = "Resultado do Lançamento: "+ espacoAmostral[resultado];
            JOptionPane.showMessageDialog(null, saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }                 

    }

}
