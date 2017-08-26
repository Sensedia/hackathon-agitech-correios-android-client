package com.sensedia.correios.api.v1;

import com.sensedia.correios.api.v1.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sensedia.correios.api.v1.model.Erro;
import com.sensedia.correios.api.v1.model.FaixaCEP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CEPApi {
  /**
   * 
   * Pesquisa pela faixa de CEPs nos municipios de um Estado.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo. (required)
   * @param accessToken Access token usado na autenticaçáo. (required)
   * @param estado Abreviaçáo do Estado. (required)
   * @param municipio Nome do Município. (optional)
   * @return Call&lt;List&lt;FaixaCEP&gt;&gt;
   */
  @GET("cep/{estado}")
  Call<List<FaixaCEP>> getCeps(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("estado") String estado, @retrofit2.http.Query("municipio") String municipio
  );

}
