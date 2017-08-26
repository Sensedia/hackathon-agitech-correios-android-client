package com.sensedia.correios.api.v1;

import com.sensedia.correios.api.v1.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sensedia.correios.api.v1.model.DetalhesEventos;
import com.sensedia.correios.api.v1.model.Erro;
import com.sensedia.correios.api.v1.model.Eventos;
import com.sensedia.correios.api.v1.model.ObjetoPostal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ObjetoPostalApi {
  /**
   * 
   * Retorna uma lista de possiveis status para um determinado evento.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo. (required)
   * @param accessToken Access token usado na autenticaçáo. (required)
   * @param tipoEvento Tipo de evento a ser pesquisado. (required)
   * @param statusEvento Status a ser filtrado. (optional)
   * @return Call&lt;List&lt;DetalhesEventos&gt;&gt;
   */
  @GET("eventos/{tipoEvento}")
  Call<List<DetalhesEventos>> getDetalhesEventos(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("tipoEvento") String tipoEvento, @retrofit2.http.Query("statusEvento") String statusEvento
  );

  /**
   * 
   * Pesquisa por informações relacionadas a um objeto postal especifico.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo. (required)
   * @param accessToken Access token usado na autenticaçáo. (required)
   * @param codigoObjeto Codigo do objeto a ser pesquisado. (required)
   * @param tipoEvento Tipo de evento a ser filtrado. (optional)
   * @return Call&lt;List&lt;Eventos&gt;&gt;
   */
  @GET("objetos/{codigoObjeto}")
  Call<List<Eventos>> getObjeto(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("codigoObjeto") String codigoObjeto, @retrofit2.http.Query("tipoEvento") String tipoEvento
  );

  /**
   * 
   * Pesquisa por informações relacionados a uma lista de objetos postais.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo. (required)
   * @param accessToken Access token usado na autenticaçáo. (required)
   * @param codigoObjeto Lista, separada por virgula, com codigos de objetos postais. (required)
   * @return Call&lt;List&lt;ObjetoPostal&gt;&gt;
   */
  @GET("objetos")
  Call<List<ObjetoPostal>> getObjetos(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Query("codigoObjeto") String codigoObjeto
  );

}
