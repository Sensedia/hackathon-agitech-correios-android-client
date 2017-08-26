package com.sensedia.correios.api.v1;

import com.sensedia.correios.api.v1.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for EnderecosApi
 */
public class EnderecosApiTest {

    private EnderecosApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EnderecosApi.class);
    }

    
    /**
     * 
     *
     * Pesquisa pelo endereço de um dado CEP.
     */
    @Test
    public void getEnderecosTest() {
        String clientId = null;
        String accessToken = null;
        String cep = null;
        // List<Endereco> response = api.getEnderecos(clientId, accessToken, cep);

        // TODO: test validations
    }
    
}
