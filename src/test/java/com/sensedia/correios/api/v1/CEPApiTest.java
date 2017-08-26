package com.sensedia.correios.api.v1;

import com.sensedia.correios.api.v1.client.ApiClient;
import com.sensedia.correios.api.v1.model.Erro;
import com.sensedia.correios.api.v1.model.FaixaCEP;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CEPApi
 */
public class CEPApiTest {

    private CEPApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CEPApi.class);
    }

    
    /**
     * 
     *
     * Pesquisa pela faixa de CEPs nos municipios de um Estado.
     */
    @Test
    public void getCepsTest() {
        String clientId = null;
        String accessToken = null;
        String estado = null;
        String municipio = null;
        // List<FaixaCEP> response = api.getCeps(clientId, accessToken, estado, municipio);

        // TODO: test validations
    }
    
}
