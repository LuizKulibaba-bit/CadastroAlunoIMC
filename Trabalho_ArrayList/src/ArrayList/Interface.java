package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
	

	

	    Scanner entrada = new Scanner(System.in);

	    public int menuPrincipal() {
	        int op;
	        Scanner entrada = new Scanner(System.in);

	        System.out.println("------------------------------------");
	        System.out.println("----------   MENU   ----------------");
	        System.out.println("------------------------------------");
	        System.out.println("1 - Cadastrar Aluno ");
	        System.out.println("2 - Listar Aluno ");
	        System.out.println("3 - Procurar Aluno ");
	        System.out.println("4 - Excluir Aluno ");
	        System.out.println("5 - SAIR ");

	        op = entrada.nextInt();

	        while (op > 5 || op <= 0) {

	            System.out.println("------------------------------------");
	            System.out.println("----------   MENU   ----------------");
	            System.out.println("------------------------------------");
	            System.out.println("1 - Cadastrar Aluno ");
	            System.out.println("2 - Listar Aluno ");
	            System.out.println("3 - Procurar Aluno por Código ");
	            System.out.println("4 - Excluir Aluno ");
	            System.out.println("5 - SAIR ");

	            op = entrada.nextInt();
	        }

	        return op;
	    }

	    public int lerCodigoAluno() {
	        System.out.print("Digite o código do aluno: ");
	        return entrada.nextInt();
	    }

	    public String lerSexoAluno() {
	        System.out.print("Digite o sexo (Masculino / Feminino): ");
	        return entrada.nextLine();
	    }

	    public String lerNomeAluno() {
	        System.out.print("Digite o nome do aluno: ");
	        return entrada.next();
	    }

	    public String lerEmailAluno() {
	        System.out.print("Digite o e-mail do aluno: ");
	        return entrada.next();
	    }

	    public Double lerPesoAluno() {
	        System.out.print("Digite o peso do aluno: ");
	        return entrada.nextDouble();
	    }

	    public Double lerAlturaAluno() {
	        System.out.print("Digite a altura do aluno: ");
	        return entrada.nextDouble();
	    }

	    public void mostraAluno(Aluno aluno) {

	        if (aluno != null) {
	            System.out.println(aluno);
	        } else {
	            System.out.println("Aluno não encontrado.");
	        }
	    }

	  
	    public Aluno novoAluno() {

	        Aluno aluno;
	        int codAluno;
	        String sexoAluno;
	        String nomeAluno;
	        String emailAluno;
	        double pesoAluno;
	        double alturaAluno;

	        codAluno = lerCodigoAluno();
	        while (codAluno <= 0) {
	            codAluno = lerCodigoAluno();
	        }

	        sexoAluno = lerSexoAluno();

	        while (!sexoAluno.equalsIgnoreCase("Masculino")
	                && !sexoAluno.equalsIgnoreCase("Feminino")) {

	            System.out.println("Digite apenas Masculino ou Feminino.");
	            sexoAluno = lerSexoAluno();
	        }

	        nomeAluno = lerNomeAluno();
	        while (nomeAluno.indexOf(' ') >= 0) {
	            nomeAluno = lerNomeAluno();
	        }

	        emailAluno = lerEmailAluno();
	        while (emailAluno.indexOf('@') == -1) {
	            emailAluno = lerEmailAluno();
	        }

	        pesoAluno = lerPesoAluno();
	        while (pesoAluno <= 0) {
	            pesoAluno = lerPesoAluno();
	        }

	        alturaAluno = lerAlturaAluno();

	        
	        while (alturaAluno <= 0) {
	            alturaAluno = lerAlturaAluno();
	        }

	        aluno = new Aluno(
	                codAluno,
	                nomeAluno,
	                emailAluno,
	                pesoAluno,
	                alturaAluno,
	                sexoAluno);

	        return aluno;
	    }

	    public void listarAluno(ArrayList<Aluno> alunos) {

	        if (alunos.isEmpty()) {
	            System.out.println("Nenhum aluno cadastrado.");
	            return;
	        }

	        for (Aluno aluno : alunos) {
	            System.out.println(aluno);
	            
	        }
	    }

	    public void mostraMensagem(String msg) {
	        System.out.println("-------------");
	        System.out.println(msg);
	        System.out.println("-------------");
	    }
	}


