package state;

import model.Chamado;

public class EstadoAguardandoCliente implements EstadoChamado {

    @Override
    public void iniciarAtendimento(Chamado chamado) {

        System.out.println(
                "O chamado está aguardando resposta do cliente."
        );
    }

    @Override
    public void aguardarCliente(Chamado chamado) {

        System.out.println(
                "O chamado já está aguardando cliente."
        );
    }

    @Override
    public void responderCliente(Chamado chamado) {

        chamado.setEstado(new EstadoEmAtendimento());

        System.out.println(
                "Cliente respondeu. Chamado voltou para atendimento."
        );
    }

    @Override
    public void resolver(Chamado chamado) {

        System.out.println(
                "Não é possível resolver enquanto aguarda resposta do cliente."
        );
    }

    @Override
    public void cancelar(Chamado chamado) {

        chamado.setEstado(new EstadoCancelado());

        System.out.println("Chamado cancelado.");
    }
}