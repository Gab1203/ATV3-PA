/*Definição da Classe Aluno:
• Crie uma classe Aluno com os seguintes atributos: nome, idade e matricula.
• Implemente um construtor para inicializar os atributos.
• Implemente métodos de acesso para os atributos.

Programa Principal:
• No programa principal, crie um ArrayList para armazenar objetos do tipo Aluno.
• Permita ao usuário adicionar novos alunos ao cadastro, fornecendo nome, idade e matrícula.
• Permita exibir todos os alunos cadastrados.
• Implemente a remoção de um aluno do cadastro, fornecendo sua matrícula.*/

package atv3;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
	private String nome;
	private String idade;
	private String matricula;
	
	
	
	
	
	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getIdade() {
		return idade;
	}





	public void setIdade(String idade) {
		this.idade = idade;
	}





	public String getMatricula() {
		return matricula;
	}





	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	
	public Aluno(String nome, String idade, String matricula){
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		
		
	}



	@Override
	public String toString() {
		return "Nome = " + nome + ", idade = " + idade + ", matricula = " + matricula + "\n";
	}





	public static void main(String[] args) {
		
		int code = 1;
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		
		
		do {
			System.out.print("\n");
			System.out.printf("0 - Terminar programa\n1 - Adicionar aluno\n2 - Remover aluno\n3 - Mostrar alunos\nDigite a opção desejada:\n");
			code = scan.nextInt();
			System.out.print("\n");
			
			switch(code) {
			
			case 0:
				
				System.out.println("O programa foi finalizado!!!");
				
				break;
				
			case 1:
				 
				
				System.out.println("Digite o nome do aluno que deseja cadastrar:");
				String name = scan.next();
				
				System.out.println("Agora, a idade do aluno:");
				String age = scan.next();
				
				System.out.println("Por fim, sua matrícula:");
				String ra = scan.next();
				
				alunos.add(new Aluno(name, age, ra));
				
				break;
				
				
			case 2:
				
				System.out.println("Digite o número da matrícula aluno que deseja remover do cadastro:");
				String remover = scan.next();
				

for(int i = 0; i < alunos.size(); i++) {
	if(alunos.get(i).getMatricula().equals(remover)) 
		
		alunos.remove(i);
	
	
	
}
				break;
				
				
			case 3:
				
				System.out.println("Alunos cadastrados:");
			System.out.println(alunos.toString());
				
				
				break;
			
			}
			
			
		}while(code != 0);
		
		
		
		
		
	}

}
