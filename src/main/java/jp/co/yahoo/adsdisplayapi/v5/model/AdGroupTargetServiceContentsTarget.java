package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceTargetListDeliverType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceContentsTargetオブジェクトは、コンテンツターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがCONTENTS_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceContentsTarget object is a container for storing contents settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is CONTENTS_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceContentsTargetオブジェクトは、コンテンツターゲティングの設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがCONTENTS_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceContentsTarget object is a container for storing contents settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is CONTENTS_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceContentsTarget   {
  @JsonProperty("targetListDeliverType")
  private AdGroupTargetServiceTargetListDeliverType targetListDeliverType = null;

  @JsonProperty("contentsKeywordListName")
  private String contentsKeywordListName = null;

  public AdGroupTargetServiceContentsTarget targetListDeliverType(AdGroupTargetServiceTargetListDeliverType targetListDeliverType) {
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

  public AdGroupTargetServiceContentsTarget contentsKeywordListName(String contentsKeywordListName) {
    this.contentsKeywordListName = contentsKeywordListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンテンツキーワードリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Contents Keyword List name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return contentsKeywordListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンテンツキーワードリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Contents Keyword List name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getContentsKeywordListName() {
    return contentsKeywordListName;
  }

  public void setContentsKeywordListName(String contentsKeywordListName) {
    this.contentsKeywordListName = contentsKeywordListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceContentsTarget adGroupTargetServiceContentsTarget = (AdGroupTargetServiceContentsTarget) o;
    return Objects.equals(this.targetListDeliverType, adGroupTargetServiceContentsTarget.targetListDeliverType) &&
        Objects.equals(this.contentsKeywordListName, adGroupTargetServiceContentsTarget.contentsKeywordListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListDeliverType, contentsKeywordListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceContentsTarget {\n");
    
    sb.append("    targetListDeliverType: ").append(toIndentedString(targetListDeliverType)).append("\n");
    sb.append("    contentsKeywordListName: ").append(toIndentedString(contentsKeywordListName)).append("\n");
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

