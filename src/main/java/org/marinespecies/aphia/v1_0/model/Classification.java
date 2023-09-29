/*
 * WoRMS REST webservice
 * The definitions and operations are listed below. Click on an operation name to view it's details, and test it.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.marinespecies.aphia.v1_0.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.marinespecies.aphia.v1_0.model.Classification;
/**
 * Classification
 *
 * @author mole
 * @version $Id: $Id
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-27T19:29:57.442Z[GMT]")
public class Classification {
  @SerializedName("AphiaID")
  private Integer aphiaID = 126132;

  @SerializedName("rank")
  private String rank = null;

  @SerializedName("scientificname")
  private String scientificname = null;

  @SerializedName("child")
  private Classification child = null;

  /**
   * <p>aphiaID.</p>
   *
   * @param aphiaID a {@link java.lang.Integer} object.
   * @return a {@link org.marinespecies.aphia.v1_0.model.Classification} object.
   */
  public Classification aphiaID(Integer aphiaID) {
    this.aphiaID = aphiaID;
    return this;
  }

  /**
   * Get aphiaID
   *
   * @return aphiaID
   */
  @Schema(description = "")
  public Integer getAphiaID() {
    return aphiaID;
  }

  /**
   * <p>Setter for the field <code>aphiaID</code>.</p>
   *
   * @param aphiaID a {@link java.lang.Integer} object.
   */
  public void setAphiaID(Integer aphiaID) {
    this.aphiaID = aphiaID;
  }

  /**
   * <p>rank.</p>
   *
   * @param rank a {@link java.lang.String} object.
   * @return a {@link org.marinespecies.aphia.v1_0.model.Classification} object.
   */
  public Classification rank(String rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Get rank
   *
   * @return rank
   */
  @Schema(description = "")
  public String getRank() {
    return rank;
  }

  /**
   * <p>Setter for the field <code>rank</code>.</p>
   *
   * @param rank a {@link java.lang.String} object.
   */
  public void setRank(String rank) {
    this.rank = rank;
  }

  /**
   * <p>scientificname.</p>
   *
   * @param scientificname a {@link java.lang.String} object.
   * @return a {@link org.marinespecies.aphia.v1_0.model.Classification} object.
   */
  public Classification scientificname(String scientificname) {
    this.scientificname = scientificname;
    return this;
  }

  /**
   * Get scientificname
   *
   * @return scientificname
   */
  @Schema(description = "")
  public String getScientificname() {
    return scientificname;
  }

  /**
   * <p>Setter for the field <code>scientificname</code>.</p>
   *
   * @param scientificname a {@link java.lang.String} object.
   */
  public void setScientificname(String scientificname) {
    this.scientificname = scientificname;
  }

  /**
   * <p>child.</p>
   *
   * @param child a {@link org.marinespecies.aphia.v1_0.model.Classification} object.
   * @return a {@link org.marinespecies.aphia.v1_0.model.Classification} object.
   */
  public Classification child(Classification child) {
    this.child = child;
    return this;
  }

  /**
   * Get child
   *
   * @return child
   */
  @Schema(description = "")
  public Classification getChild() {
    return child;
  }

  /**
   * <p>Setter for the field <code>child</code>.</p>
   *
   * @param child a {@link org.marinespecies.aphia.v1_0.model.Classification} object.
   */
  public void setChild(Classification child) {
    this.child = child;
  }


  /** {@inheritDoc} */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Classification classification = (Classification) o;
    return Objects.equals(this.aphiaID, classification.aphiaID) &&
        Objects.equals(this.rank, classification.rank) &&
        Objects.equals(this.scientificname, classification.scientificname) &&
        Objects.equals(this.child, classification.child);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(aphiaID, rank, scientificname, child);
  }


  /** {@inheritDoc} */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classification {\n");
    
    sb.append("    aphiaID: ").append(toIndentedString(aphiaID)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    scientificname: ").append(toIndentedString(scientificname)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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
