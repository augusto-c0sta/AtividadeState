package app;

import model.Chamado;

public class Main {

    public static void main(String[] args) {

        System.out.println(" PRIMEIRO CHAMADO ");

        Chamado chamado1 = new Chamado(
                "CH001",
                "Erro no sistema",
                "Augusto"
        );

        chamado1.resolver();

        chamado1.iniciarAtendimento();

        chamado1.aguardarCliente();

        chamado1.resolver();

        chamado1.responderCliente();

        chamado1.resolver();

        chamado1.cancelar();

        System.out.println("\n SEGUNDO CHAMADO");

        Chamado chamado2 = new Chamado(
                "CH002",
                "Problema na impressora",
                "Carlos"
        );

        chamado2.cancelar();

        chamado2.iniciarAtendimento();
    }
}