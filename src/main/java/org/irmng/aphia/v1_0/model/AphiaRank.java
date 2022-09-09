/*
 * IRMNG REST webservice
 * The definitions and operations are listed below. Click on an operation name to view it's details, and test it.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.irmng.aphia.v1_0.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AphiaRank
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-09T18:22:45.022Z[GMT]")
public class AphiaRank {
  @SerializedName("taxonRankID")
  private Integer taxonRankID = null;

  @SerializedName("taxonRank")
  private String taxonRank = null;

  @SerializedName("IRMNG_ID")
  private Integer IRMNG_ID = null;

  @SerializedName("kingdom")
  private String kingdom = null;

  public AphiaRank taxonRankID(Integer taxonRankID) {
    this.taxonRankID = taxonRankID;
    return this;
  }

   /**
   * A taxonomic rank identifier
   * @return taxonRankID
  **/
  @Schema(example = "220", description = "A taxonomic rank identifier")
  public Integer getTaxonRankID() {
    return taxonRankID;
  }

  public void setTaxonRankID(Integer taxonRankID) {
    this.taxonRankID = taxonRankID;
  }

  public AphiaRank taxonRank(String taxonRank) {
    this.taxonRank = taxonRank;
    return this;
  }

   /**
   * A taxonomic rank name
   * @return taxonRank
  **/
  @Schema(example = "species", description = "A taxonomic rank name")
  public String getTaxonRank() {
    return taxonRank;
  }

  public void setTaxonRank(String taxonRank) {
    this.taxonRank = taxonRank;
  }

  public AphiaRank IRMNG_ID(Integer IRMNG_ID) {
    this.IRMNG_ID = IRMNG_ID;
    return this;
  }

   /**
   * IRMNG_ID of the kingdom
   * @return IRMNG_ID
  **/
  @Schema(example = "2", description = "IRMNG_ID of the kingdom")
  public Integer getIRMNGID() {
    return IRMNG_ID;
  }

  public void setIRMNGID(Integer IRMNG_ID) {
    this.IRMNG_ID = IRMNG_ID;
  }

  public AphiaRank kingdom(String kingdom) {
    this.kingdom = kingdom;
    return this;
  }

   /**
   * The name of a taxonomic kingdom the rank is used in
   * @return kingdom
  **/
  @Schema(example = "Animalia", description = "The name of a taxonomic kingdom the rank is used in")
  public String getKingdom() {
    return kingdom;
  }

  public void setKingdom(String kingdom) {
    this.kingdom = kingdom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AphiaRank aphiaRank = (AphiaRank) o;
    return Objects.equals(this.taxonRankID, aphiaRank.taxonRankID) &&
        Objects.equals(this.taxonRank, aphiaRank.taxonRank) &&
        Objects.equals(this.IRMNG_ID, aphiaRank.IRMNG_ID) &&
        Objects.equals(this.kingdom, aphiaRank.kingdom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxonRankID, taxonRank, IRMNG_ID, kingdom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AphiaRank {\n");
    
    sb.append("    taxonRankID: ").append(toIndentedString(taxonRankID)).append("\n");
    sb.append("    taxonRank: ").append(toIndentedString(taxonRank)).append("\n");
    sb.append("    IRMNG_ID: ").append(toIndentedString(IRMNG_ID)).append("\n");
    sb.append("    kingdom: ").append(toIndentedString(kingdom)).append("\n");
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
