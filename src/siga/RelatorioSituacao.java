package siga;

public class RelatorioSituacao {

    private final FonteDeAlunos fonte;

    public RelatorioSituacao(FonteDeAlunos fonte) {
        this.fonte = fonte;
    }

    public void imprimir() {
        System.out.println("   Situação segundo o relatório:");
        for (Aluno aluno : fonte.listar()) {
            System.out.println("     " + aluno);
        }
    }
}