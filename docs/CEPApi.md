# CEPApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCeps**](CEPApi.md#getCeps) | **GET** cep/{estado} | 


<a name="getCeps"></a>
# **getCeps**
> List&lt;FaixaCEP&gt; getCeps(clientId, accessToken, estado, municipio)



Pesquisa pela faixa de CEPs nos municipios de um Estado.

### Example
```java
// Import classes:
//import com.sensedia.correios.api.v1.client.ApiException;
//import com.sensedia.correios.api.v1.CEPApi;


CEPApi apiInstance = new CEPApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String estado = "estado_example"; // String | Abreviaçáo do Estado.
String municipio = "municipio_example"; // String | Nome do Município.
try {
    List<FaixaCEP> result = apiInstance.getCeps(clientId, accessToken, estado, municipio);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CEPApi#getCeps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **estado** | **String**| Abreviaçáo do Estado. |
 **municipio** | **String**| Nome do Município. | [optional]

### Return type

[**List&lt;FaixaCEP&gt;**](FaixaCEP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

