package com.sensedia.correios.api.v1;

import com.sensedia.correios.api.v1.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sensedia.correios.api.v1.model.CalculoPrecoFrete;
import com.sensedia.correios.api.v1.model.Erro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PrecosApi {
  /**
   * 
   * Cálculo de Preços por CEP de origem, CEP de destino e tipo de entrega.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo. (required)
   * @param accessToken Access token usado na autenticaçáo. (required)
   * @param codigoServico Pode conter mais de um código por consulta separados por virgula. 40010 - SEDEX Varejo, 40045 - SEDEX a Cobrar Varejo, 40215 - SEDEX 10 Varejo, 40290 - SEDEX Hoje Varejo, 41106 - PAC Varejo (required)
   * @param cepOrigem CEP de Origem sem hífen.Exemplo: 05311900 (required)
   * @param cepDestino CEP de Destino sem hífen (required)
   * @param peso Peso da encomenda, incluindo sua embalagem. O peso deve ser informado em quilogramas. Se o formato for Envelope, o valor máximo permitido será 1 kg (required)
   * @param formato Formato da encomenda (incluindo embalagem). 1 - Formato caixa/pacote, 2 - Formato rolo/prisma, 3 - Envelope (required)
   * @param comprimento Comprimento da encomenda (incluindo embalagem), em centímetros. (required)
   * @param altura Altura da encomenda (incluindo embalagem), em centímetros. Se o formato for envelope, informar zero (0). (required)
   * @param largura Largura da encomenda (incluindo embalagem), em centímetros. (required)
   * @param diametro Diâmetro da encomenda (incluindo embalagem), em centímetros. (required)
   * @param servicoMaoPropria Indica se a encomenda será entregue com o serviço adicional mão própria. Valores possíveis: S ou N (S - Sim, N - Não) (optional, default to N)
   * @param valorDeclarado Indica se a encomenda será entregue com o serviço adicional valor declarado. Neste campo deve ser apresentado o valor declarado desejado, em Reais. (optional)
   * @param avisoRecebimento Indica se a encomenda será entregue com o serviço adicional aviso de recebimento. Valores possíveis: S ou N (S - Sim, N - Não) (optional, default to N)
   * @param codigoEmpresa Seu código administrativo junto à ECT. O código está disponível no corpo do contrato firmado com os Correios. (optional)
   * @param senhaEmpresa Senha para acesso ao serviço, associada ao seu código administrativo. A senha inicial corresponde aos 8 primeiros dígitos do CNPJ informado no contrato. (optional)
   * @return Call&lt;List&lt;CalculoPrecoFrete&gt;&gt;
   */
  @GET("precos")
  Call<List<CalculoPrecoFrete>> getPrecos(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Query("codigoServico") String codigoServico, @retrofit2.http.Query("cepOrigem") String cepOrigem, @retrofit2.http.Query("cepDestino") String cepDestino, @retrofit2.http.Query("peso") Integer peso, @retrofit2.http.Query("formato") Integer formato, @retrofit2.http.Query("comprimento") Integer comprimento, @retrofit2.http.Query("altura") Integer altura, @retrofit2.http.Query("largura") Integer largura, @retrofit2.http.Query("diametro") Integer diametro, @retrofit2.http.Query("servicoMaoPropria") String servicoMaoPropria, @retrofit2.http.Query("valorDeclarado") Integer valorDeclarado, @retrofit2.http.Query("avisoRecebimento") String avisoRecebimento, @retrofit2.http.Query("codigoEmpresa") String codigoEmpresa, @retrofit2.http.Query("senhaEmpresa") String senhaEmpresa
  );

}
