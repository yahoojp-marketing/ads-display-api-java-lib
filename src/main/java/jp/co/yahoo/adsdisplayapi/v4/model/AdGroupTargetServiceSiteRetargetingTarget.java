package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupTargetServiceTargetListDeliverType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがSITE_RETARGETINGの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceSiteRetargetingTarget object is a container for storing site retargeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is SITE_RETARGETING, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがSITE_RETARGETINGの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceSiteRetargetingTarget object is a container for storing site retargeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is SITE_RETARGETING, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceSiteRetargetingTarget   {
  @JsonProperty("targetListDeliverType")
  private AdGroupTargetServiceTargetListDeliverType targetListDeliverType = null;

  @JsonProperty("targetListName")
  private String targetListName = null;

  public AdGroupTargetServiceSiteRetargetingTarget targetListDeliverType(AdGroupTargetServiceTargetListDeliverType targetListDeliverType) {
    this.targetListDeliverType = targetListDeliverType;
    return this;
  }

  /**
   * Get targetListDeliverType
   * @return targetListDeliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceTargetListDeliverType getTargetListDeliverType() {
    return targetListDeliverType;
  }

  public void setTargetListDeliverType(AdGroupTargetServiceTargetListDeliverType targetListDeliverType) {
    this.targetListDeliverType = targetListDeliverType;
  }

  public AdGroupTargetServiceSiteRetargetingTarget targetListName(String targetListName) {
    this.targetListName = targetListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Target List name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Target List name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getTargetListName() {
    return targetListName;
  }

  public void setTargetListName(String targetListName) {
    this.targetListName = targetListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceSiteRetargetingTarget adGroupTargetServiceSiteRetargetingTarget = (AdGroupTargetServiceSiteRetargetingTarget) o;
    return Objects.equals(this.targetListDeliverType, adGroupTargetServiceSiteRetargetingTarget.targetListDeliverType) &&
        Objects.equals(this.targetListName, adGroupTargetServiceSiteRetargetingTarget.targetListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListDeliverType, targetListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceSiteRetargetingTarget {\n");
    
    sb.append("    targetListDeliverType: ").append(toIndentedString(targetListDeliverType)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
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

