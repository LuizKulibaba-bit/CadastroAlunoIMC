package ArrayList;

import java.util.ArrayList;

public class ControlaAluno {
	



	    private ArrayList<Aluno> alunos = new ArrayList<>();

	    public ArrayList<Aluno> listarTodos() {
	        return this.alunos;
	    }

	    public boolean cadastrarAluno(Aluno aluno) {

	        boolean alunoExistente = verificarAlunoExistente(aluno);

	        if (alunoExistente) {
	            return false;
	        } else {
	            this.alunos.add(aluno);
	            return true;
	        }
	    }

	    public boolean verificarAlunoExistente(Aluno aluno) {

	        for (Aluno a : alunos) {
	            if (a.equals(aluno)) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public Aluno buscaAlunoCodigo(int codigo_busca) {

	        Aluno aluno_busca = null;

	        for (Aluno a : alunos) {

	            if (a.getCodigo() == codigo_busca) {
	                aluno_busca = a;
	                break;
	            }
	        }

	        return aluno_busca;
	    }

	    public Aluno buscaExcluirAluno(int codigo_busca) {

	        for (int i = 0; i < alunos.size(); i++) {

	            if (alunos.get(i).getCodigo() == codigo_busca) {

	                Aluno aluno = alunos.get(i);
	                alunos.remove(i);

	                return aluno;
	            }
	        }

	        return null;
	    }
	}

