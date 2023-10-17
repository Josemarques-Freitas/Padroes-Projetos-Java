package one.digitalinnovation.gof.facade;

import subsistema1.srm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrandoCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().reuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
