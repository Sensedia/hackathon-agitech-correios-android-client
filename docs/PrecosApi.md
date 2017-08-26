# PrecosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrecos**](PrecosApi.md#getPrecos) | **GET** precos | 


<a name="getPrecos"></a>
# **getPrecos**
> List&lt;CalculoPrecoFrete&gt; getPrecos(clientId, accessToken, codigoServico, cepOrigem, cepDestino, peso, formato, comprimento, altura, largura, diametro, servicoMaoPropria, valorDeclarado, avisoRecebimento, codigoEmpresa, senhaEmpresa)



Cálculo de Preços por CEP de origem, CEP de destino e tipo de entrega.

### Example
```java
// Import classes:
//import com.sensedia.correios.api.v1.client.ApiException;
PrecosApicom.sensedia.correios.api.v1.PrecosApii();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String codigoServico = "codigoServico_example"; // String | Pode conter mais de um código por consulta separados por virgula. 40010 - SEDEX Varejo, 40045 - SEDEX a Cobrar Varejo, 40215 - SEDEX 10 Varejo, 40290 - SEDEX Hoje Varejo, 41106 - PAC Varejo
String cepOrigem = "cepOrigem_example"; // String | CEP de Origem sem hífen.Exemplo: 05311900
String cepDestino = "cepDestino_example"; // String | CEP de Destino sem hífen
Integer peso = 56; // Integer | Peso da encomenda, incluindo sua embalagem. O peso deve ser informado em quilogramas. Se o formato for Envelope, o valor máximo permitido será 1 kg
Integer formato = 56; // Integer | Formato da encomenda (incluindo embalagem). 1 - Formato caixa/pacote, 2 - Formato rolo/prisma, 3 - Envelope
Integer comprimento = 56; // Integer | Comprimento da encomenda (incluindo embalagem), em centímetros.
Integer altura = 56; // Integer | Altura da encomenda (incluindo embalagem), em centímetros. Se o formato for envelope, informar zero (0).
Integer largura = 56; // Integer | Largura da encomenda (incluindo embalagem), em centímetros.
Integer diametro = 56; // Integer | Diâmetro da encomenda (incluindo embalagem), em centímetros.
String servicoMaoPropria = "N"; // String | Indica se a encomenda será entregue com o serviço adicional mão própria. Valores possíveis: S ou N (S - Sim, N - Não)
Integer valorDeclarado = 56; // Integer | Indica se a encomenda será entregue com o serviço adicional valor declarado. Neste campo deve ser apresentado o valor declarado desejado, em Reais.
String avisoRecebimento = "N"; // String | Indica se a encomenda será entregue com o serviço adicional aviso de recebimento. Valores possíveis: S ou N (S - Sim, N - Não)
String codigoEmpresa = "codigoEmpresa_example"; // String | Seu código administrativo junto à ECT. O código está disponível no corpo do contrato firmado com os Correios.
String senhaEmpresa = "senhaEmpresa_example"; // String | Senha para acesso ao serviço, associada ao seu código administrativo. A senha inicial corresponde aos 8 primeiros dígitos do CNPJ informado no contrato.
try {
    List<CalculoPrecoFrete> result = apiInstance.getPrecos(clientId, accessToken, codigoServico, cepOrigem, cepDestino, peso, formato, comprimento, altura, largura, diametro, servicoMaoPropria, valorDeclarado, avisoRecebimento, codigoEmpresa, senhaEmpresa);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrecosApi#getPrecos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **codigoServico** | **String**| Pode conter mais de um código por consulta separados por virgula. 40010 - SEDEX Varejo, 40045 - SEDEX a Cobrar Varejo, 40215 - SEDEX 10 Varejo, 40290 - SEDEX Hoje Varejo, 41106 - PAC Varejo |
 **cepOrigem** | **String**| CEP de Origem sem hífen.Exemplo: 05311900 |
 **cepDestino** | **String**| CEP de Destino sem hífen |
 **peso** | **Integer**| Peso da encomenda, incluindo sua embalagem. O peso deve ser informado em quilogramas. Se o formato for Envelope, o valor máximo permitido será 1 kg |
 **formato** | **Integer**| Formato da encomenda (incluindo embalagem). 1 - Formato caixa/pacote, 2 - Formato rolo/prisma, 3 - Envelope |
 **comprimento** | **Integer**| Comprimento da encomenda (incluindo embalagem), em centímetros. |
 **altura** | **Integer**| Altura da encomenda (incluindo embalagem), em centímetros. Se o formato for envelope, informar zero (0). |
 **largura** | **Integer**| Largura da encomenda (incluindo embalagem), em centímetros. |
 **diametro** | **Integer**| Diâmetro da encomenda (incluindo embalagem), em centímetros. |
 **servicoMaoPropria** | **String**| Indica se a encomenda será entregue com o serviço adicional mão própria. Valores possíveis: S ou N (S - Sim, N - Não) | [optional] [default to N]
 **valorDeclarado** | **Integer**| Indica se a encomenda será entregue com o serviço adicional valor declarado. Neste campo deve ser apresentado o valor declarado desejado, em Reais. | [optional]
 **avisoRecebimento** | **String**| Indica se a encomenda será entregue com o serviço adicional aviso de recebimento. Valores possíveis: S ou N (S - Sim, N - Não) | [optional] [default to N]
 **codigoEmpresa** | **String**| Seu código administrativo junto à ECT. O código está disponível no corpo do contrato firmado com os Correios. | [optional]
 **senhaEmpresa** | **String**| Senha para acesso ao serviço, associada ao seu código administrativo. A senha inicial corresponde aos 8 primeiros dígitos do CNPJ informado no contrato. | [optional]

### Return type

[**List&lt;CalculoPrecoFrete&gt;**](CalculoPrecoFrete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

