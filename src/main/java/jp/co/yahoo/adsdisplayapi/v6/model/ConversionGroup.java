package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionGroupServiceConversion;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionGroupオブジェクトは、コンバージョングループ情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionGroup object shows ConversionGroup information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionGroupオブジェクトは、コンバージョングループ情報を表します。</div> <div lang=\"en\">ConversionGroup object shows ConversionGroup information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionGroup   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("conversionGroupId")
  private Long conversionGroupId = null;

  @JsonProperty("conversionGroupName")
  private String conversionGroupName = null;

  @JsonProperty("conversions")
  @Valid
  private List<ConversionGroupServiceConversion> conversions = null;

  public ConversionGroup accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ConversionGroup conversionGroupId(Long conversionGroupId) {
    this.conversionGroupId = conversionGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョングループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> 
   * @return conversionGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョングループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> ")


  public Long getConversionGroupId() {
    return conversionGroupId;
  }

  public void setConversionGroupId(Long conversionGroupId) {
    this.conversionGroupId = conversionGroupId;
  }

  public ConversionGroup conversionGroupName(String conversionGroupName) {
    this.conversionGroupName = conversionGroupName;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョングループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Group Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return conversionGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョングループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Group Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getConversionGroupName() {
    return conversionGroupName;
  }

  public void setConversionGroupName(String conversionGroupName) {
    this.conversionGroupName = conversionGroupName;
  }

  public ConversionGroup conversions(List<ConversionGroupServiceConversion> conversions) {
    this.conversions = conversions;
    return this;
  }

  public ConversionGroup addConversionsItem(ConversionGroupServiceConversion conversionsItem) {
    if (this.conversions == null) {
      this.conversions = new ArrayList<>();
    }
    this.conversions.add(conversionsItem);
    return this;
  }

  /**
   * Get conversions
   * @return conversions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ConversionGroupServiceConversion> getConversions() {
    return conversions;
  }

  public void setConversions(List<ConversionGroupServiceConversion> conversions) {
    this.conversions = conversions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionGroup conversionGroup = (ConversionGroup) o;
    return Objects.equals(this.accountId, conversionGroup.accountId) &&
        Objects.equals(this.conversionGroupId, conversionGroup.conversionGroupId) &&
        Objects.equals(this.conversionGroupName, conversionGroup.conversionGroupName) &&
        Objects.equals(this.conversions, conversionGroup.conversions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, conversionGroupId, conversionGroupName, conversions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionGroup {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    conversionGroupId: ").append(toIndentedString(conversionGroupId)).append("\n");
    sb.append("    conversionGroupName: ").append(toIndentedString(conversionGroupName)).append("\n");
    sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

