import javax.swing.JOptionPane;

/**
 *
 * @author mateusrovedaa
 */
public class Mensagem {

    /**
     * M�todo privado para gera��o de mensagens do sistema
     *
     * @param titulo mensagem a ser exibida no topo da tela
     * @param mensagem mensagem a ser exibida no conteudo da caixa de dialogo
     * @param tipo padr�oo de mensagens <b>JOptionPane<b>
     */
    private static void mensagem(String titulo, String mensagem, int tipo) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, tipo);
    }

    private static int mensagemConfirmacao(String titulo, String mensagem, int tipo, Object botoes[]) {
        int escolha = JOptionPane.showOptionDialog(null, mensagem, titulo,
                JOptionPane.DEFAULT_OPTION, tipo, 
                null, botoes, botoes[0]);
        return escolha;
    }

    /**
     * Metodo para exibi��o de mensagens de aviso/alerta
     *
     * @param mensagem mensagem a ser exibida na tela
     */
    public static void aviso(String mensagem) {
        mensagem("Aviso", mensagem, JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Metodo para exibi��o de mensagens de informa��o
     *
     * @param mensagem mensagem a ser exibida na tela
     */
    public static void informacao(String mensagem) {
        mensagem("Informa��o", mensagem, JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Metodo para exibi��o de mensagens de erro
     *
     * @param mensagem mensagem a ser exibida na tela
     */
    public static void erro(String mensagem) {
        mensagem("Erro", mensagem, JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Metodo para exibi��o de mensagens de confirma��o
     *
     * @param mensagem mensagem a ser exibida na tela
     * @return int com a escolha: 0 - sim; 1 - n�o; 2 - cancelar;
     */
    public static int confirmacao(String mensagem) {
        Object botoes[] = {"Sim", "N�o", "Cancelar"};
        return mensagemConfirmacao("Confirma��o", mensagem, JOptionPane.QUESTION_MESSAGE, botoes);
    }
}