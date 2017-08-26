package com.sensedia.correios.api.v1;

import com.sensedia.correios.api.v1.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sensedia.correios.api.v1.model.Endereco;
import com.sensedia.correios.api.v1.model.Erro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface EnderecosApi {
  /**
   * 
   * Pesquisa pelo endereço de um dado CEP.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo. (required)
   * @param accessToken Access token usado na autenticaçáo. (required)
   * @param cep CEP a ser pesquisado. (required)
   * @return Call&lt;List&lt;Endereco&gt;&gt;
   */
  @GET("enderecos/{cep}")
  Call<List<Endereco>> getEnderecos(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("cep") String cep
  );

}
