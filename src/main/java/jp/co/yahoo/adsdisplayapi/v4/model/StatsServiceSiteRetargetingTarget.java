package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.StatsServiceTargetListDeliverType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceSiteRetargetingTarget object holds configuration information of Site retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。</div> <div lang=\"en\">StatsServiceSiteRetargetingTarget object holds configuration information of Site retargeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceSiteRetargetingTarget   {
  @JsonProperty("targetListDeliverType")
  private StatsServiceTargetListDeliverType targetListDeliverType = null;

  @JsonProperty("targetListName")
  private String targetListName = null;

  public StatsServiceSiteRetargetingTarget targetListDeliverType(StatsServiceTargetListDeliverType targetListDeliverType) {
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

  public StatsServiceSiteRetargetingTarget targetListName(String targetListName) {
    this.targetListName = targetListName;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリスト名</div> <div lang=\"en\">Target list name</div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリスト名</div> <div lang=\"en\">Target list name</div> ")


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
    StatsServiceSiteRetargetingTarget statsServiceSiteRetargetingTarget = (StatsServiceSiteRetargetingTarget) o;
    return Objects.equals(this.targetListDeliverType, statsServiceSiteRetargetingTarget.targetListDeliverType) &&
        Objects.equals(this.targetListName, statsServiceSiteRetargetingTarget.targetListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListDeliverType, targetListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceSiteRetargetingTarget {\n");
    
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

