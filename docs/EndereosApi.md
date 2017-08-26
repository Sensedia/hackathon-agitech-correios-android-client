# EnderecosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnderecos**](EnderecosApi.md#getEnderecos) | **GET** enderecos/{cep} | 


<a name="getEnderecos"></a>
# **getEnderecos**
> List&lt;Endereco&gt; getEnderecos(clientId, accessToken, cep)



Pesquisa pelo endereço de um dado CEP.

### Example
```java
// Import classes:
//import com.sensedia.correios.api.v1.client.ApiException;
Enderecoscom.sensedia.correios.api.v1.EnderecosApireosApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String cep = "cep_example"; // String | CEP a ser pesquisado.
try {
    List<Endereco> result = apiInstance.getEnderecos(clientId, accessToken, cep);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnderecosApi#getEnderecos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **cep** | **String**| CEP a ser pesquisado. |

### Return type

[**List&lt;Endereco&gt;**](Endereco.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

