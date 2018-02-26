import java.util.HashMap;

public class Controller {
	private HashMap<String, Aluno> mapaAlunos;

	public Controller() {

		this.mapaAlunos = new HashMap<String, Aluno>();

	}

	// -------------------------- SOBRE ALUNOS -------------------------------

	/**
	 * metodo para cadastrar aluno. o aluno eh cadastrado e alocado em um HashMap
	 * que usa matricula para identificar o aluno
	 * 
	 * @param nome
	 * @param matricula
	 * @param codigoCurso
	 * @param telefone
	 * @param email
	 */

	// gambiarra nesse lugar aqui pra passsar nos testes de email invalido
	public void cadastrarAluno(String nome, String matricula, int codigoCurso, String telefone, String email) {
		matricula = matricula.trim();
		if (!this.mapaAlunos.containsKey(matricula)) {
			Aluno aluno = new Aluno(nome, matricula, codigoCurso, telefone, email);
			this.mapaAlunos.put(matricula, aluno);
		} else {
			throw new NullPointerException("Erro no cadastro de aluno: Aluno de mesma matricula ja cadastrado");
		}
	}

	// if (this.mapaAlunos.containsKey(matricula)) {
	// String[] emails = email.split("");
	// for (String letra : emails) {
	// if (!emails.equals("@")) {
	// throw new NullPointerException("Erro no cadastro de aluno: Email invalido");

	/**
	 * metodo para pegar(recuperar) o aluno que foi cadastrado e alocadoo no
	 * HashMap.
	 * 
	 * @param matricula
	 * @return retorna o aluno que foi procurado a partir da sua matricula e caso
	 *         nao exista esse aluno sera retornada uma msg "aluno nao encontrado".
	 */
	public String recuperaAluno(String matricula) {
		if (this.mapaAlunos.containsKey(matricula)) {
			return mapaAlunos.get(matricula).toString();
		}
		throw new NullPointerException("Erro na busca por aluno: Aluno nao encontrado");
	}

	/**
	 * metodo para listar alunos que foram colocados no HashMap.
	 * 
	 * @return ira retornar uma lista de strinng,
	 */
	public String listarAlunos() {
		String listaAlunos = "";
		for (int i = 0; i < mapaAlunos.size(); i++) {
			listaAlunos += (i + 1) + " - " + mapaAlunos.get(i).toString() + "\n";
		}

		return listaAlunos;
	}

	/**
	 * metodo que pega a informacao do aluno que estah no mapaAlunos atraves da
	 * matricula e atributo
	 * 
	 * @param matricula
	 * @param atributo
	 * @return retorna a informacao pedida pelo atributo
	 */
	public String getInfoAluno(String matricula, String atributo) {
		if (this.mapaAlunos.containsKey(matricula)) {

			switch (atributo) {
			case "Nome":
				return mapaAlunos.get(matricula).getNome();

			case "Telefone":
				return mapaAlunos.get(matricula).getTelefone();

			case "Email":
				return mapaAlunos.get(matricula).getEmail();

			}
		}

		throw new NullPointerException("Erro na obtencao de informacao de aluno: Aluno nao encontrado");
	}

	// ------------------------SOBRE TUTORES--------------------------
	// public void tornarTutor(String matricula, String disciplina, int
	// proficiencia) {
	// matricula = matricula.trim();

	// if (!this.mapaTutores.containsKey(matricula)) {
	// Tutor tutor = new Tutor(matricula, disciplina, proficiencia);
	// this.mapaTutores.put(matricula, tutor);
	// }
	// }

	// public String recuperaTutor(String matricula) {
	// if (this.mapaTutores.containsKey(matricula)) {
	// return mapaTutores.get(matricula).toString();
	// }
	// return "tutor nao existente";
	// }

	// public String listarTutores() {
	// String listaTutores = "";
	// for (int i = 0; i < mapaTutores.size(); i++) {
	// listaTutores += (i + 1) + mapaTutores.get(i).toString() + "\n";
	// }

	// return listaTutores;
	// }
}
