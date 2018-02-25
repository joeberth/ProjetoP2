
public class Aluno {
	protected String nome;
	protected String matricula;
	protected int codigoCurso;
	protected String telefone;
	protected String email;
	
	public Aluno(String nome, String matricula, int codigoCurso, String telefone, String email) {
		validaAluno(nome);
		this.nome = nome;
		this.matricula = matricula;
		this.codigoCurso = codigoCurso;
		this.telefone = telefone;
		this.email = email;
	
	}
	

	private void validaAluno(String nome) {
		if (nome.trim() == null || nome.trim().equals("")) {
			throw new NullPointerException("Erro no cadastro de aluno: Nome nao pode ser vazio ou nulo");
		}
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoCurso;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (codigoCurso != other.codigoCurso)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		if (telefone == null || telefone.equals("")) {
			return matricula + " - " + nome + " - " + codigoCurso + " - " + email;
		}
		return matricula + " - " + nome + " - " + codigoCurso + " - " +  telefone + " - " + email;
		
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}
	
	
	//String nome, String matricula, int codigoCurso, String telefone, String email
}
