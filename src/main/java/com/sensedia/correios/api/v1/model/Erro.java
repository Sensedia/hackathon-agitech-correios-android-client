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
 * Erro
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-26T09:19:56.657-03:00")
public class Erro {
  @SerializedName("resultado")
  private String resultado = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("detalhes")
  private String detalhes = null;

  public Erro resultado(String resultado) {
    this.resultado = resultado;
    return this;
  }

   /**
   * Get resultado
   * @return resultado
  **/
  @ApiModelProperty(value = "")
  public String getResultado() {
    return resultado;
  }

  public void setResultado(String resultado) {
    this.resultado = resultado;
  }

  public Erro status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Erro detalhes(String detalhes) {
    this.detalhes = detalhes;
    return this;
  }

   /**
   * Get detalhes
   * @return detalhes
  **/
  @ApiModelProperty(value = "")
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
    Erro erro = (Erro) o;
    return Objects.equals(this.resultado, erro.resultado) &&
        Objects.equals(this.status, erro.status) &&
        Objects.equals(this.detalhes, erro.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultado, status, detalhes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erro {\n");
    
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
