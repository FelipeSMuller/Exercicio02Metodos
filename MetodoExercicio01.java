package exercicioPOO;

import javax.swing.JOptionPane;

public class MetodoExercicio01 {

	public static void main(String[] args) {

		int ano = 0;

		int escolha = 0;

		do {

			try {

				// Entrada de dados do usuário

				escolha = Integer.parseInt(
						JOptionPane.showInputDialog(null, "ESCOLHA UMA OPÇÃO \n1-Verificar ano \n2-Sair do programa"));

				switch (escolha) {

				case 1:

					ano = Integer.parseInt(JOptionPane.showInputDialog(null, "insira um ano para obter a verificação"));

					VerificaAno.verificaAno(ano);

					break;

				case 2:

					JOptionPane.showMessageDialog(null, "O programa foi finalizado!!", null,
							JOptionPane.WARNING_MESSAGE);

					break;

				default:

					JOptionPane.showMessageDialog(null,
							"Nenhuma opção foi selecionada, portanto a aplicação foi finalizada", null,
							JOptionPane.WARNING_MESSAGE);

					break;

				}

			} catch (NumberFormatException | NullPointerException erro) {

				// Imprime no prompt uma mensagem de erro, informando ao usuário que o programa
				// foi finalizado incorretamente!!
				JOptionPane.showMessageDialog(null,

						"Dados não numéricos foram fornecidos ou o programa foi encerrado incorretamente, a aplicação foi encerrada!!",
						null,

						JOptionPane.ERROR_MESSAGE);
				break;
			}

		} while (escolha > 0);

	}

}
