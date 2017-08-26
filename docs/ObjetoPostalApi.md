# ObjetoPostalApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetalhesEventos**](ObjetoPostalApi.md#getDetalhesEventos) | **GET** eventos/{tipoEvento} | 
[**getObjeto**](ObjetoPostalApi.md#getObjeto) | **GET** objetos/{codigoObjeto} | 
[**getObjetos**](ObjetoPostalApi.md#getObjetos) | **GET** objetos | 


<a name="getDetalhesEventos"></a>
# **getDetalhesEventos**
> List&lt;DetalhesEventos&gt; getDetalhesEventos(clientId, accessToken, tipoEvento, statusEvento)



Retorna uma lista de possiveis status para um determinado evento.

### Example
```java
// Import classes:
//import com.sensedia.correios.api.v1.client.ApiException;
//import com.sensedia.correios.api.v1.ObjetoPostalApi;


ObjetoPostalApi apiInstance = new ObjetoPostalApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String tipoEvento = "tipoEvento_example"; // String | Tipo de evento a ser pesquisado.
String statusEvento = "statusEvento_example"; // String | Status a ser filtrado.
try {
    List<DetalhesEventos> result = apiInstance.getDetalhesEventos(clientId, accessToken, tipoEvento, statusEvento);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjetoPostalApi#getDetalhesEventos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **tipoEvento** | **String**| Tipo de evento a ser pesquisado. |
 **statusEvento** | **String**| Status a ser filtrado. | [optional]

### Return type

[**List&lt;DetalhesEventos&gt;**](DetalhesEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getObjeto"></a>
# **getObjeto**
> List&lt;Eventos&gt; getObjeto(clientId, accessToken, codigoObjeto, tipoEvento)



Pesquisa por informações relacionadas a um objeto postal especifico.

### Example
```java
// Import classes:
//import com.sensedia.correios.api.v1.client.ApiException;
//import com.sensedia.correios.api.v1.ObjetoPostalApi;


ObjetoPostalApi apiInstance = new ObjetoPostalApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String codigoObjeto = "codigoObjeto_example"; // String | Codigo do objeto a ser pesquisado.
String tipoEvento = "tipoEvento_example"; // String | Tipo de evento a ser filtrado.
try {
    List<Eventos> result = apiInstance.getObjeto(clientId, accessToken, codigoObjeto, tipoEvento);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjetoPostalApi#getObjeto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **codigoObjeto** | **String**| Codigo do objeto a ser pesquisado. |
 **tipoEvento** | **String**| Tipo de evento a ser filtrado. | [optional]

### Return type

[**List&lt;Eventos&gt;**](Eventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getObjetos"></a>
# **getObjetos**
> List&lt;ObjetoPostal&gt; getObjetos(clientId, accessToken, codigoObjeto)



Pesquisa por informações relacionados a uma lista de objetos postais.

### Example
```java
// Import classes:
//import com.sensedia.correios.api.v1.client.ApiException;
//import com.sensedia.correios.api.v1.ObjetoPostalApi;


ObjetoPostalApi apiInstance = new ObjetoPostalApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String codigoObjeto = "codigoObjeto_example"; // String | Lista, separada por virgula, com codigos de objetos postais.
try {
    List<ObjetoPostal> result = apiInstance.getObjetos(clientId, accessToken, codigoObjeto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjetoPostalApi#getObjetos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **codigoObjeto** | **String**| Lista, separada por virgula, com codigos de objetos postais. |

### Return type

[**List&lt;ObjetoPostal&gt;**](ObjetoPostal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

