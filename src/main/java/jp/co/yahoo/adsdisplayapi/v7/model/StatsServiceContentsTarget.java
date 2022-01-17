package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.StatsServiceDeliverType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; StatsServiceContentsTargetオブジェクトは、コンテンツターゲティングの設定情報を保持します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; StatsServiceContentsTarget object is a container for storing contents settings. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> StatsServiceContentsTargetオブジェクトは、コンテンツターゲティングの設定情報を保持します。 </div> <div lang=\"en\"> StatsServiceContentsTarget object is a container for storing contents settings. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceContentsTarget   {
  @JsonProperty("deliverType")
  private StatsServiceDeliverType deliverType = null;

  @JsonProperty("contentsKeywordListName")
  private String contentsKeywordListName = null;

  public StatsServiceContentsTarget deliverType(StatsServiceDeliverType deliverType) {
    this.deliverType = deliverType;
    return this;
  }

  /**
   * Get deliverType
   * @return deliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceDeliverType getDeliverType() {
    return deliverType;
  }

  public void setDeliverType(StatsServiceDeliverType deliverType) {
    this.deliverType = deliverType;
  }

  public StatsServiceContentsTarget contentsKeywordListName(String contentsKeywordListName) {
    this.contentsKeywordListName = contentsKeywordListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンテンツキーワードリスト名です。 </div> <div lang=\"en\"> Contents Keyword List name. </div> 
   * @return contentsKeywordListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンテンツキーワードリスト名です。 </div> <div lang=\"en\"> Contents Keyword List name. </div> ")


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
    StatsServiceContentsTarget statsServiceContentsTarget = (StatsServiceContentsTarget) o;
    return Objects.equals(this.deliverType, statsServiceContentsTarget.deliverType) &&
        Objects.equals(this.contentsKeywordListName, statsServiceContentsTarget.contentsKeywordListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverType, contentsKeywordListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceContentsTarget {\n");
    
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
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

