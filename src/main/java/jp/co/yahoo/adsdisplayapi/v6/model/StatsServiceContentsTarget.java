package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.StatsServiceTargetListDeliverType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; StatsServiceContentsTargetオブジェクトは、コンテンツターゲティングの設定情報を保持します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; StatsServiceContentsTarget object is a container for storing contents settings. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> StatsServiceContentsTargetオブジェクトは、コンテンツターゲティングの設定情報を保持します。 </div> <div lang=\"en\"> StatsServiceContentsTarget object is a container for storing contents settings. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceContentsTarget   {
  @JsonProperty("targetListDeliverType")
  private StatsServiceTargetListDeliverType targetListDeliverType = null;

  @JsonProperty("contentsKeywordListName")
  private String contentsKeywordListName = null;

  public StatsServiceContentsTarget targetListDeliverType(StatsServiceTargetListDeliverType targetListDeliverType) {
    this.targetListDeliverType = targetListDeliverType;
    return this;
  }

  /**
   * Get targetListDeliverType
   * @return targetListDeliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceTargetListDeliverType getTargetListDeliverType() {
    return targetListDeliverType;
  }

  public void setTargetListDeliverType(StatsServiceTargetListDeliverType targetListDeliverType) {
    this.targetListDeliverType = targetListDeliverType;
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
    return Objects.equals(this.targetListDeliverType, statsServiceContentsTarget.targetListDeliverType) &&
        Objects.equals(this.contentsKeywordListName, statsServiceContentsTarget.contentsKeywordListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListDeliverType, contentsKeywordListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceContentsTarget {\n");
    
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

