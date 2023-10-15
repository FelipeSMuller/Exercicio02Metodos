package exercicioPOO;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class VerificaAno {

	public static void verificaAno(int ano) {

		LocalDate dataAtual = LocalDate.now();

		// Se um valor negativo ou igual a zero for inserido, gera um erro
		if (ano <= 0) {

			// Imprime no prompt a mensagem de erro intuitiva para o usuário
			JOptionPane.showMessageDialog(null,

					"Não é possível obter a verificação com valores negativos ou igual a zero!!", null,

					JOptionPane.WARNING_MESSAGE);

		}

		// Verifica se o ano inserido é maior do que o ano atual, já que isso não é
		// permitido, gera uma mensagem no prompt
		else if (ano > dataAtual.getYear()) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um ano maior do que " + dataAtual.getYear());

		}

		// Se o ano for um valor divisivel por 4 é bissexto
		else if (ano % 4 == 0) {

			JOptionPane.showMessageDialog(null, "O ano fornecido: " + ano + " é um ano bissexto!!");
		}

		else {

			JOptionPane.showMessageDialog(null, "O ano fornecido:  " + ano + " não é um ano bissexto!!", null,
					JOptionPane.WARNING_MESSAGE);
		}

	}

}
