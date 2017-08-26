package com.sensedia.correios.api.v1;

import com.sensedia.correios.api.v1.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for PrecosApi
 */
public class PrecosApiTest {

    private PrecosApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PrecosApi.class);
    }

    
    /**
     * 
     *
     * Cálculo de Preços por CEP de origem, CEP de destino e tipo de entrega.
     */
    @Test
    public void getPrecosTest() {
        String clientId = null;
        String accessToken = null;
        String codigoServico = null;
        String cepOrigem = null;
        String cepDestino = null;
        Integer peso = null;
        Integer formato = null;
        Integer comprimento = null;
        Integer altura = null;
        Integer largura = null;
        Integer diametro = null;
        String servicoMaoPropria = null;
        Integer valorDeclarado = null;
        String avisoRecebimento = null;
        String codigoEmpresa = null;
        String senhaEmpresa = null;
        // List<CalculoPrecoFrete> response = api.getPrecos(clientId, accessToken, codigoServico, cepOrigem, cepDestino, peso, formato, comprimento, altura, largura, diametro, servicoMaoPropria, valorDeclarado, avisoRecebimento, codigoEmpresa, senhaEmpresa);

        // TODO: test validations
    }
    
}
