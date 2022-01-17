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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAudienceListTarget object holds configuration information of Audience list targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAudienceListTarget object holds configuration information of Audience list targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceAudienceListTarget   {
  @JsonProperty("deliverType")
  private StatsServiceDeliverType deliverType = null;

  @JsonProperty("audienceListName")
  private String audienceListName = null;

  public StatsServiceAudienceListTarget deliverType(StatsServiceDeliverType deliverType) {
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

  public StatsServiceAudienceListTarget audienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
    return this;
  }

  /**
   * <div lang=\"ja\">オーディエンスリスト名</div> <div lang=\"en\">Audience list name</div> 
   * @return audienceListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">オーディエンスリスト名</div> <div lang=\"en\">Audience list name</div> ")


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
    StatsServiceAudienceListTarget statsServiceAudienceListTarget = (StatsServiceAudienceListTarget) o;
    return Objects.equals(this.deliverType, statsServiceAudienceListTarget.deliverType) &&
        Objects.equals(this.audienceListName, statsServiceAudienceListTarget.audienceListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverType, audienceListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAudienceListTarget {\n");
    
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

