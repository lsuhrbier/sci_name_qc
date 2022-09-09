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
 * AphiaRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-09T19:01:52.800Z[GMT]")
public class AphiaRecord {
  @SerializedName("IRMNG_ID")
  private Integer IRMNG_ID = 127160;

  @SerializedName("url")
  private String url = null;

  @SerializedName("scientificname")
  private String scientificname = null;

  @SerializedName("authority")
  private String authority = null;

  @SerializedName("taxonRankID")
  private Integer taxonRankID = null;

  @SerializedName("rank")
  private String rank = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("unacceptreason")
  private String unacceptreason = null;

  @SerializedName("valid_IRMNG_ID")
  private Integer validIRMNGID = null;

  @SerializedName("valid_name")
  private String validName = null;

  @SerializedName("valid_authority")
  private String validAuthority = null;

  @SerializedName("parentNameUsageID")
  private Integer parentNameUsageID = null;

  @SerializedName("kingdom")
  private String kingdom = null;

  @SerializedName("phylum")
  private String phylum = null;

  @SerializedName("class")
  private String propertyClass = null;

  @SerializedName("order")
  private String order = null;

  @SerializedName("family")
  private String family = null;

  @SerializedName("genus")
  private String genus = null;

  @SerializedName("citation")
  private String citation = null;

  @SerializedName("lsid")
  private String lsid = null;

  @SerializedName("isMarine")
  private Boolean isMarine = null;

  @SerializedName("isBrackish")
  private Boolean isBrackish = null;

  @SerializedName("isFreshwater")
  private Boolean isFreshwater = null;

  @SerializedName("isTerrestrial")
  private Boolean isTerrestrial = null;

  @SerializedName("isExtinct")
  private Boolean isExtinct = null;

  @SerializedName("match_type")
  private String matchType = null;

  @SerializedName("modified")
  private String modified = null;

  public AphiaRecord IRMNG_ID(Integer IRMNG_ID) {
    this.IRMNG_ID = IRMNG_ID;
    return this;
  }

   /**
   * Unique and persistent identifier within IRMNG. Primary key in the database -- 
   * @return IRMNG_ID
  **/
  @Schema(description = "Unique and persistent identifier within IRMNG. Primary key in the database -- ")
  public Integer getIRMNGID() {
    return IRMNG_ID;
  }

  public void setIRMNGID(Integer IRMNG_ID) {
    this.IRMNG_ID = IRMNG_ID;
  }

  public AphiaRecord url(String url) {
    this.url = url;
    return this;
  }

   /**
   * HTTP URL to the AphiaRecord
   * @return url
  **/
  @Schema(description = "HTTP URL to the AphiaRecord")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AphiaRecord scientificname(String scientificname) {
    this.scientificname = scientificname;
    return this;
  }

   /**
   * the full scientific name without authorship
   * @return scientificname
  **/
  @Schema(description = "the full scientific name without authorship")
  public String getScientificname() {
    return scientificname;
  }

  public void setScientificname(String scientificname) {
    this.scientificname = scientificname;
  }

  public AphiaRecord authority(String authority) {
    this.authority = authority;
    return this;
  }

   /**
   * the authorship information for the scientificname formatted according to the conventions of the applicable nomenclaturalCode
   * @return authority
  **/
  @Schema(description = "the authorship information for the scientificname formatted according to the conventions of the applicable nomenclaturalCode")
  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public AphiaRecord taxonRankID(Integer taxonRankID) {
    this.taxonRankID = taxonRankID;
    return this;
  }

   /**
   * the taxonomic rank identifier of the most specific name in the scientificname
   * @return taxonRankID
  **/
  @Schema(description = "the taxonomic rank identifier of the most specific name in the scientificname")
  public Integer getTaxonRankID() {
    return taxonRankID;
  }

  public void setTaxonRankID(Integer taxonRankID) {
    this.taxonRankID = taxonRankID;
  }

  public AphiaRecord rank(String rank) {
    this.rank = rank;
    return this;
  }

   /**
   * the taxonomic rank of the most specific name in the scientificname
   * @return rank
  **/
  @Schema(description = "the taxonomic rank of the most specific name in the scientificname")
  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public AphiaRecord status(String status) {
    this.status = status;
    return this;
  }

   /**
   * the status of the use of the scientificname (usually a taxonomic opinion). Additional technical statuses are (1) &lt;u&gt;quarantined&lt;/u&gt;: hidden from public interface after decision from an editor and (2) &lt;u&gt;deleted&lt;/u&gt;: IRMNG_ID should NOT be used anymore, please replace it by the valid_IRMNG_ID
   * @return status
  **/
  @Schema(description = "the status of the use of the scientificname (usually a taxonomic opinion). Additional technical statuses are (1) <u>quarantined</u>: hidden from public interface after decision from an editor and (2) <u>deleted</u>: IRMNG_ID should NOT be used anymore, please replace it by the valid_IRMNG_ID")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AphiaRecord unacceptreason(String unacceptreason) {
    this.unacceptreason = unacceptreason;
    return this;
  }

   /**
   * the reason why a scientificname is unaccepted
   * @return unacceptreason
  **/
  @Schema(description = "the reason why a scientificname is unaccepted")
  public String getUnacceptreason() {
    return unacceptreason;
  }

  public void setUnacceptreason(String unacceptreason) {
    this.unacceptreason = unacceptreason;
  }

  public AphiaRecord validIRMNGID(Integer validIRMNGID) {
    this.validIRMNGID = validIRMNGID;
    return this;
  }

   /**
   * the IRMNG_ID (for the scientificname) of the currently accepted taxon. NULL if there is no currently accepted taxon.
   * @return validIRMNGID
  **/
  @Schema(description = "the IRMNG_ID (for the scientificname) of the currently accepted taxon. NULL if there is no currently accepted taxon.")
  public Integer getValidIRMNGID() {
    return validIRMNGID;
  }

  public void setValidIRMNGID(Integer validIRMNGID) {
    this.validIRMNGID = validIRMNGID;
  }

  public AphiaRecord validName(String validName) {
    this.validName = validName;
    return this;
  }

   /**
   * the scientificname of the currently accepted taxon
   * @return validName
  **/
  @Schema(description = "the scientificname of the currently accepted taxon")
  public String getValidName() {
    return validName;
  }

  public void setValidName(String validName) {
    this.validName = validName;
  }

  public AphiaRecord validAuthority(String validAuthority) {
    this.validAuthority = validAuthority;
    return this;
  }

   /**
   * the authorship information for the scientificname of the currently accepted taxon
   * @return validAuthority
  **/
  @Schema(description = "the authorship information for the scientificname of the currently accepted taxon")
  public String getValidAuthority() {
    return validAuthority;
  }

  public void setValidAuthority(String validAuthority) {
    this.validAuthority = validAuthority;
  }

  public AphiaRecord parentNameUsageID(Integer parentNameUsageID) {
    this.parentNameUsageID = parentNameUsageID;
    return this;
  }

   /**
   * the IRMNG_ID (for the scientificname) of the direct, most proximate higher-rank parent taxon (in a classification)
   * @return parentNameUsageID
  **/
  @Schema(description = "the IRMNG_ID (for the scientificname) of the direct, most proximate higher-rank parent taxon (in a classification)")
  public Integer getParentNameUsageID() {
    return parentNameUsageID;
  }

  public void setParentNameUsageID(Integer parentNameUsageID) {
    this.parentNameUsageID = parentNameUsageID;
  }

  public AphiaRecord kingdom(String kingdom) {
    this.kingdom = kingdom;
    return this;
  }

   /**
   * the full scientific name of the kingdom in which the taxon is classified
   * @return kingdom
  **/
  @Schema(description = "the full scientific name of the kingdom in which the taxon is classified")
  public String getKingdom() {
    return kingdom;
  }

  public void setKingdom(String kingdom) {
    this.kingdom = kingdom;
  }

  public AphiaRecord phylum(String phylum) {
    this.phylum = phylum;
    return this;
  }

   /**
   * the full scientific name of the phylum or division in which the taxon is classified
   * @return phylum
  **/
  @Schema(description = "the full scientific name of the phylum or division in which the taxon is classified")
  public String getPhylum() {
    return phylum;
  }

  public void setPhylum(String phylum) {
    this.phylum = phylum;
  }

  public AphiaRecord propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * the full scientific name of the class in which the taxon is classified
   * @return propertyClass
  **/
  @Schema(description = "the full scientific name of the class in which the taxon is classified")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public AphiaRecord order(String order) {
    this.order = order;
    return this;
  }

   /**
   * the full scientific name of the order in which the taxon is classified
   * @return order
  **/
  @Schema(description = "the full scientific name of the order in which the taxon is classified")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public AphiaRecord family(String family) {
    this.family = family;
    return this;
  }

   /**
   * the full scientific name of the family in which the taxon is classified
   * @return family
  **/
  @Schema(description = "the full scientific name of the family in which the taxon is classified")
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public AphiaRecord genus(String genus) {
    this.genus = genus;
    return this;
  }

   /**
   * the full scientific name of the genus in which the taxon is classified
   * @return genus
  **/
  @Schema(description = "the full scientific name of the genus in which the taxon is classified")
  public String getGenus() {
    return genus;
  }

  public void setGenus(String genus) {
    this.genus = genus;
  }

  public AphiaRecord citation(String citation) {
    this.citation = citation;
    return this;
  }

   /**
   * a bibliographic reference for the resource as a statement indicating how this record should be cited (attributed) when used
   * @return citation
  **/
  @Schema(description = "a bibliographic reference for the resource as a statement indicating how this record should be cited (attributed) when used")
  public String getCitation() {
    return citation;
  }

  public void setCitation(String citation) {
    this.citation = citation;
  }

  public AphiaRecord lsid(String lsid) {
    this.lsid = lsid;
    return this;
  }

   /**
   * LifeScience Identifier. Persistent GUID for an IRMNG_ID
   * @return lsid
  **/
  @Schema(description = "LifeScience Identifier. Persistent GUID for an IRMNG_ID")
  public String getLsid() {
    return lsid;
  }

  public void setLsid(String lsid) {
    this.lsid = lsid;
  }

  public AphiaRecord isMarine(Boolean isMarine) {
    this.isMarine = isMarine;
    return this;
  }

   /**
   * a boolean flag indicating whether the taxon is a marine organism, i.e. can be found in/above sea water. Possible values: 0/1/NULL
   * @return isMarine
  **/
  @Schema(description = "a boolean flag indicating whether the taxon is a marine organism, i.e. can be found in/above sea water. Possible values: 0/1/NULL")
  public Boolean isIsMarine() {
    return isMarine;
  }

  public void setIsMarine(Boolean isMarine) {
    this.isMarine = isMarine;
  }

  public AphiaRecord isBrackish(Boolean isBrackish) {
    this.isBrackish = isBrackish;
    return this;
  }

   /**
   * a boolean flag indicating whether the taxon occurrs in brackish habitats. Possible values: 0/1/NULL
   * @return isBrackish
  **/
  @Schema(description = "a boolean flag indicating whether the taxon occurrs in brackish habitats. Possible values: 0/1/NULL")
  public Boolean isIsBrackish() {
    return isBrackish;
  }

  public void setIsBrackish(Boolean isBrackish) {
    this.isBrackish = isBrackish;
  }

  public AphiaRecord isFreshwater(Boolean isFreshwater) {
    this.isFreshwater = isFreshwater;
    return this;
  }

   /**
   * a boolean flag indicating whether the taxon occurrs in freshwater habitats, i.e. can be found in/above rivers or lakes. Possible values: 0/1/NULL
   * @return isFreshwater
  **/
  @Schema(description = "a boolean flag indicating whether the taxon occurrs in freshwater habitats, i.e. can be found in/above rivers or lakes. Possible values: 0/1/NULL")
  public Boolean isIsFreshwater() {
    return isFreshwater;
  }

  public void setIsFreshwater(Boolean isFreshwater) {
    this.isFreshwater = isFreshwater;
  }

  public AphiaRecord isTerrestrial(Boolean isTerrestrial) {
    this.isTerrestrial = isTerrestrial;
    return this;
  }

   /**
   * a boolean flag indicating the taxon is a terrestial organism, i.e. occurrs on land as opposed to the sea. Possible values: 0/1/NULL
   * @return isTerrestrial
  **/
  @Schema(description = "a boolean flag indicating the taxon is a terrestial organism, i.e. occurrs on land as opposed to the sea. Possible values: 0/1/NULL")
  public Boolean isIsTerrestrial() {
    return isTerrestrial;
  }

  public void setIsTerrestrial(Boolean isTerrestrial) {
    this.isTerrestrial = isTerrestrial;
  }

  public AphiaRecord isExtinct(Boolean isExtinct) {
    this.isExtinct = isExtinct;
    return this;
  }

   /**
   * a flag indicating an extinct organism. Possible values: 0/1/NULL
   * @return isExtinct
  **/
  @Schema(description = "a flag indicating an extinct organism. Possible values: 0/1/NULL")
  public Boolean isIsExtinct() {
    return isExtinct;
  }

  public void setIsExtinct(Boolean isExtinct) {
    this.isExtinct = isExtinct;
  }

  public AphiaRecord matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Type of match. Possible values: exact/like/phonetic/near_1/near_2
   * @return matchType
  **/
  @Schema(description = "Type of match. Possible values: exact/like/phonetic/near_1/near_2")
  public String getMatchType() {
    return matchType;
  }

  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }

  public AphiaRecord modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The most recent date-time in GMT on which the resource was changed
   * @return modified
  **/
  @Schema(description = "The most recent date-time in GMT on which the resource was changed")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AphiaRecord aphiaRecord = (AphiaRecord) o;
    return Objects.equals(this.IRMNG_ID, aphiaRecord.IRMNG_ID) &&
        Objects.equals(this.url, aphiaRecord.url) &&
        Objects.equals(this.scientificname, aphiaRecord.scientificname) &&
        Objects.equals(this.authority, aphiaRecord.authority) &&
        Objects.equals(this.taxonRankID, aphiaRecord.taxonRankID) &&
        Objects.equals(this.rank, aphiaRecord.rank) &&
        Objects.equals(this.status, aphiaRecord.status) &&
        Objects.equals(this.unacceptreason, aphiaRecord.unacceptreason) &&
        Objects.equals(this.validIRMNGID, aphiaRecord.validIRMNGID) &&
        Objects.equals(this.validName, aphiaRecord.validName) &&
        Objects.equals(this.validAuthority, aphiaRecord.validAuthority) &&
        Objects.equals(this.parentNameUsageID, aphiaRecord.parentNameUsageID) &&
        Objects.equals(this.kingdom, aphiaRecord.kingdom) &&
        Objects.equals(this.phylum, aphiaRecord.phylum) &&
        Objects.equals(this.propertyClass, aphiaRecord.propertyClass) &&
        Objects.equals(this.order, aphiaRecord.order) &&
        Objects.equals(this.family, aphiaRecord.family) &&
        Objects.equals(this.genus, aphiaRecord.genus) &&
        Objects.equals(this.citation, aphiaRecord.citation) &&
        Objects.equals(this.lsid, aphiaRecord.lsid) &&
        Objects.equals(this.isMarine, aphiaRecord.isMarine) &&
        Objects.equals(this.isBrackish, aphiaRecord.isBrackish) &&
        Objects.equals(this.isFreshwater, aphiaRecord.isFreshwater) &&
        Objects.equals(this.isTerrestrial, aphiaRecord.isTerrestrial) &&
        Objects.equals(this.isExtinct, aphiaRecord.isExtinct) &&
        Objects.equals(this.matchType, aphiaRecord.matchType) &&
        Objects.equals(this.modified, aphiaRecord.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IRMNG_ID, url, scientificname, authority, taxonRankID, rank, status, unacceptreason, validIRMNGID, validName, validAuthority, parentNameUsageID, kingdom, phylum, propertyClass, order, family, genus, citation, lsid, isMarine, isBrackish, isFreshwater, isTerrestrial, isExtinct, matchType, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AphiaRecord {\n");
    
    sb.append("    IRMNG_ID: ").append(toIndentedString(IRMNG_ID)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    scientificname: ").append(toIndentedString(scientificname)).append("\n");
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    taxonRankID: ").append(toIndentedString(taxonRankID)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unacceptreason: ").append(toIndentedString(unacceptreason)).append("\n");
    sb.append("    validIRMNGID: ").append(toIndentedString(validIRMNGID)).append("\n");
    sb.append("    validName: ").append(toIndentedString(validName)).append("\n");
    sb.append("    validAuthority: ").append(toIndentedString(validAuthority)).append("\n");
    sb.append("    parentNameUsageID: ").append(toIndentedString(parentNameUsageID)).append("\n");
    sb.append("    kingdom: ").append(toIndentedString(kingdom)).append("\n");
    sb.append("    phylum: ").append(toIndentedString(phylum)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
    sb.append("    citation: ").append(toIndentedString(citation)).append("\n");
    sb.append("    lsid: ").append(toIndentedString(lsid)).append("\n");
    sb.append("    isMarine: ").append(toIndentedString(isMarine)).append("\n");
    sb.append("    isBrackish: ").append(toIndentedString(isBrackish)).append("\n");
    sb.append("    isFreshwater: ").append(toIndentedString(isFreshwater)).append("\n");
    sb.append("    isTerrestrial: ").append(toIndentedString(isTerrestrial)).append("\n");
    sb.append("    isExtinct: ").append(toIndentedString(isExtinct)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
