
public class Facade {
	private Controller controller = new Controller();
		
		
		public void cadastrarAluno(String nome, String matricula, int codigoCurso, String telefone, String email) {
			controller.cadastrarAluno(nome, matricula, codigoCurso, telefone, email);
		}
	
		public String recuperaAluno(String matricula) {
			return controller.recuperaAluno(matricula);
		}
		
		public String listarAlunos() {
			return controller.listarAlunos();
		}
		
		public String getInfoAluno(String matricula, String atributo) {
			return controller.getInfoAluno(matricula, atributo);
		}
}


