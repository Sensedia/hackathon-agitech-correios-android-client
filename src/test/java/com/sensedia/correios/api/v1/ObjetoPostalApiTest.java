package com.sensedia.correios.api.v1;

import com.sensedia.correios.api.v1.client.ApiClient;
import com.sensedia.correios.api.v1.model.DetalhesEventos;
import com.sensedia.correios.api.v1.model.Erro;
import com.sensedia.correios.api.v1.model.Eventos;
import com.sensedia.correios.api.v1.model.ObjetoPostal;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjetoPostalApi
 */
public class ObjetoPostalApiTest {

    private ObjetoPostalApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ObjetoPostalApi.class);
    }

    
    /**
     * 
     *
     * Retorna uma lista de possiveis status para um determinado evento.
     */
    @Test
    public void getDetalhesEventosTest() {
        String clientId = null;
        String accessToken = null;
        String tipoEvento = null;
        String statusEvento = null;
        // List<DetalhesEventos> response = api.getDetalhesEventos(clientId, accessToken, tipoEvento, statusEvento);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Pesquisa por informações relacionadas a um objeto postal especifico.
     */
    @Test
    public void getObjetoTest() {
        String clientId = null;
        String accessToken = null;
        String codigoObjeto = null;
        String tipoEvento = null;
        // List<Eventos> response = api.getObjeto(clientId, accessToken, codigoObjeto, tipoEvento);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Pesquisa por informações relacionados a uma lista de objetos postais.
     */
    @Test
    public void getObjetosTest() {
        String clientId = null;
        String accessToken = null;
        String codigoObjeto = null;
        // List<ObjetoPostal> response = api.getObjetos(clientId, accessToken, codigoObjeto);

        // TODO: test validations
    }
    
}
