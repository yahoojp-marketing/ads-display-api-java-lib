package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceDeliverType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAUDIENCE_LIST_TARGETの場合、任意で指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceAudienceListTarget object is a container for storing audience list targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is AUDIENCE_LIST_TARGET, this field can be optionally specified. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがAUDIENCE_LIST_TARGETの場合、任意で指定できます。 </div> <div lang=\"en\"> AdGroupTargetServiceAudienceListTarget object is a container for storing audience list targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is AUDIENCE_LIST_TARGET, this field can be optionally specified. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceAudienceListTarget   {
  @JsonProperty("deliverType")
  private AdGroupTargetServiceDeliverType deliverType = null;

  @JsonProperty("audienceListName")
  private String audienceListName = null;

  public AdGroupTargetServiceAudienceListTarget deliverType(AdGroupTargetServiceDeliverType deliverType) {
    this.deliverType = deliverType;
    return this;
  }

  /**
   * Get deliverType
   * @return deliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceDeliverType getDeliverType() {
    return deliverType;
  }

  public void setDeliverType(AdGroupTargetServiceDeliverType deliverType) {
    this.deliverType = deliverType;
  }

  public AdGroupTargetServiceAudienceListTarget audienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience List name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return audienceListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience List name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAudienceListName() {
    return audienceListName;
  }

  public void setAudienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceAudienceListTarget adGroupTargetServiceAudienceListTarget = (AdGroupTargetServiceAudienceListTarget) o;
    return Objects.equals(this.deliverType, adGroupTargetServiceAudienceListTarget.deliverType) &&
        Objects.equals(this.audienceListName, adGroupTargetServiceAudienceListTarget.audienceListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverType, audienceListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceAudienceListTarget {\n");
    
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
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

