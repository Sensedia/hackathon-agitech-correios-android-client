/*
 * API dos Correios
 * API de rastreios de Objetos Postais
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sensedia.correios.api.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Objeto com detalhes do calculo do preço do frete
 */
@ApiModel(description = "Objeto com detalhes do calculo do preço do frete")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-26T09:19:56.657-03:00")
public class CalculoPrecoFrete {
  @SerializedName("codigo")
  private Integer codigo = null;

  @SerializedName("httpStatus")
  private Integer httpStatus = null;

  @SerializedName("valor")
  private String valor = null;

  @SerializedName("adicionalMaoPropria")
  private String adicionalMaoPropria = null;

  @SerializedName("adicionalAvisoRecebimento")
  private String adicionalAvisoRecebimento = null;

  @SerializedName("adicionalValorDeclarado")
  private String adicionalValorDeclarado = null;

  @SerializedName("valorSemAdicionais")
  private String valorSemAdicionais = null;

  @SerializedName("resultado")
  private String resultado = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("detalhes")
  private String detalhes = null;

  public CalculoPrecoFrete codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

   /**
   * Código
   * @return codigo
  **/
  @ApiModelProperty(example = "40010", value = "Código")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public CalculoPrecoFrete httpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * Código HTTP para a requisição
   * @return httpStatus
  **/
  @ApiModelProperty(example = "200", value = "Código HTTP para a requisição")
  public Integer getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
  }

  public CalculoPrecoFrete valor(String valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor do Frente
   * @return valor
  **/
  @ApiModelProperty(example = "21,00", value = "Valor do Frente")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public CalculoPrecoFrete adicionalMaoPropria(String adicionalMaoPropria) {
    this.adicionalMaoPropria = adicionalMaoPropria;
    return this;
  }

   /**
   * Adicional mão propria.
   * @return adicionalMaoPropria
  **/
  @ApiModelProperty(example = "0,00", value = "Adicional mão propria.")
  public String getAdicionalMaoPropria() {
    return adicionalMaoPropria;
  }

  public void setAdicionalMaoPropria(String adicionalMaoPropria) {
    this.adicionalMaoPropria = adicionalMaoPropria;
  }

  public CalculoPrecoFrete adicionalAvisoRecebimento(String adicionalAvisoRecebimento) {
    this.adicionalAvisoRecebimento = adicionalAvisoRecebimento;
    return this;
  }

   /**
   * Adicional aviso recebimento.
   * @return adicionalAvisoRecebimento
  **/
  @ApiModelProperty(example = "0,00", value = "Adicional aviso recebimento.")
  public String getAdicionalAvisoRecebimento() {
    return adicionalAvisoRecebimento;
  }

  public void setAdicionalAvisoRecebimento(String adicionalAvisoRecebimento) {
    this.adicionalAvisoRecebimento = adicionalAvisoRecebimento;
  }

  public CalculoPrecoFrete adicionalValorDeclarado(String adicionalValorDeclarado) {
    this.adicionalValorDeclarado = adicionalValorDeclarado;
    return this;
  }

   /**
   * Adicional valor declarado.
   * @return adicionalValorDeclarado
  **/
  @ApiModelProperty(example = "0,00", value = "Adicional valor declarado.")
  public String getAdicionalValorDeclarado() {
    return adicionalValorDeclarado;
  }

  public void setAdicionalValorDeclarado(String adicionalValorDeclarado) {
    this.adicionalValorDeclarado = adicionalValorDeclarado;
  }

  public CalculoPrecoFrete valorSemAdicionais(String valorSemAdicionais) {
    this.valorSemAdicionais = valorSemAdicionais;
    return this;
  }

   /**
   * Valor sem adicionais
   * @return valorSemAdicionais
  **/
  @ApiModelProperty(example = "21,00", value = "Valor sem adicionais")
  public String getValorSemAdicionais() {
    return valorSemAdicionais;
  }

  public void setValorSemAdicionais(String valorSemAdicionais) {
    this.valorSemAdicionais = valorSemAdicionais;
  }

  public CalculoPrecoFrete resultado(String resultado) {
    this.resultado = resultado;
    return this;
  }

   /**
   * Resultado do erro
   * @return resultado
  **/
  @ApiModelProperty(example = "", value = "Resultado do erro")
  public String getResultado() {
    return resultado;
  }

  public void setResultado(String resultado) {
    this.resultado = resultado;
  }

  public CalculoPrecoFrete status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Tipo de erro
   * @return status
  **/
  @ApiModelProperty(example = "", value = "Tipo de erro")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CalculoPrecoFrete detalhes(String detalhes) {
    this.detalhes = detalhes;
    return this;
  }

   /**
   * Detalhes do erro
   * @return detalhes
  **/
  @ApiModelProperty(example = "", value = "Detalhes do erro")
  public String getDetalhes() {
    return detalhes;
  }

  public void setDetalhes(String detalhes) {
    this.detalhes = detalhes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculoPrecoFrete calculoPrecoFrete = (CalculoPrecoFrete) o;
    return Objects.equals(this.codigo, calculoPrecoFrete.codigo) &&
        Objects.equals(this.httpStatus, calculoPrecoFrete.httpStatus) &&
        Objects.equals(this.valor, calculoPrecoFrete.valor) &&
        Objects.equals(this.adicionalMaoPropria, calculoPrecoFrete.adicionalMaoPropria) &&
        Objects.equals(this.adicionalAvisoRecebimento, calculoPrecoFrete.adicionalAvisoRecebimento) &&
        Objects.equals(this.adicionalValorDeclarado, calculoPrecoFrete.adicionalValorDeclarado) &&
        Objects.equals(this.valorSemAdicionais, calculoPrecoFrete.valorSemAdicionais) &&
        Objects.equals(this.resultado, calculoPrecoFrete.resultado) &&
        Objects.equals(this.status, calculoPrecoFrete.status) &&
        Objects.equals(this.detalhes, calculoPrecoFrete.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, httpStatus, valor, adicionalMaoPropria, adicionalAvisoRecebimento, adicionalValorDeclarado, valorSemAdicionais, resultado, status, detalhes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculoPrecoFrete {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    adicionalMaoPropria: ").append(toIndentedString(adicionalMaoPropria)).append("\n");
    sb.append("    adicionalAvisoRecebimento: ").append(toIndentedString(adicionalAvisoRecebimento)).append("\n");
    sb.append("    adicionalValorDeclarado: ").append(toIndentedString(adicionalValorDeclarado)).append("\n");
    sb.append("    valorSemAdicionais: ").append(toIndentedString(valorSemAdicionais)).append("\n");
    sb.append("    resultado: ").append(toIndentedString(resultado)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

