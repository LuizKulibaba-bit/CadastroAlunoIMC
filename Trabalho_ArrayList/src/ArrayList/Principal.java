package ArrayList;


import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Interface inter = new Interface();
        ControlaAluno controlaAluno = new ControlaAluno();

        int opMenu;

        opMenu = inter.menuPrincipal();

        while (opMenu != 5) {

            switch (opMenu) {

            case 1:

                Aluno aluno = inter.novoAluno();

                if (controlaAluno.cadastrarAluno(aluno)) {
                    inter.mostraMensagem("Aluno Cadastrado com sucesso");
                    inter.mostraAluno(aluno);
                } else {
                    inter.mostraMensagem("Aluno Não Cadastrado");
                    inter.mostraAluno(aluno);
                }

                break;

            case 2:

                ArrayList<Aluno> alunosCadastrados =
                        controlaAluno.listarTodos();

                inter.mostraMensagem("Listar alunos cadastrados");
                inter.listarAluno(alunosCadastrados);

                break;

            case 3:

                int codigo_busca = inter.lerCodigoAluno();

                Aluno aluno_busca =
                        controlaAluno.buscaAlunoCodigo(codigo_busca);

                if (aluno_busca == null) {
                    inter.mostraMensagem(
                            "Aluno com código " + codigo_busca +
                            " NÃO encontrado");
                } else {
                    inter.mostraMensagem("Aluno cadastrado");
                    inter.mostraAluno(aluno_busca);
                }

                break;

            case 4:

                int codigo_buscaEx = inter.lerCodigoAluno();

                Aluno aluno_buscaExcluir =
                        controlaAluno.buscaExcluirAluno(codigo_buscaEx);

                if (aluno_buscaExcluir == null) {

                    inter.mostraMensagem(
                            "Aluno com código " + codigo_buscaEx +
                            " NÃO encontrado");

                } else {

                    inter.mostraMensagem(
                            "Aluno excluído com sucesso");

                    inter.mostraAluno(aluno_buscaExcluir);
                }

                break;
            }

            opMenu = inter.menuPrincipal();
        }

        inter.mostraMensagem("SAIR - Sistema encerrado");
    }
}