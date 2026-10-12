package siga;

public class TelaMatricula {

    private final FachadaMatricula fachada;

    public TelaMatricula(FachadaMatricula fachada) {
        this.fachada = fachada;
    }

    public void aoClicarEmMatricular(String matricula, String cpf, String codigoTurma) {
        try {
            Matricula nova = fachada.matricular(matricula, cpf, codigoTurma);
            System.out.println("   [tela] Matrícula realizada: " + nova);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("   [tela] Erro: " + e.getMessage());
        }
    }
}