package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceCustomAudienceListオブジェクトは、Yahoo! DMPの行動履歴を利用するオーディエンスリストを表します。ご利用にはYahoo! DMPのご契約が必要です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがCUSTOM_AUDIENCEの場合は、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceCustomAudienceList object displays Audience List using users&#39; visit/activity history from Yahoo! JAPAN DMP. To use the data, it is required to conclude a contract for Yahoo! DMP. &lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *If audienceListType is CUSTOM_AUDIENCE, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceCustomAudienceListオブジェクトは、Yahoo! DMPの行動履歴を利用するオーディエンスリストを表します。ご利用にはYahoo! DMPのご契約が必要です。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※audienceListTypeがCUSTOM_AUDIENCEの場合は、ADD時に必須となります。 </div> <div lang=\"en\"> AudienceListServiceCustomAudienceList object displays Audience List using users' visit/activity history from Yahoo! JAPAN DMP. To use the data, it is required to conclude a contract for Yahoo! DMP. <br> This field is optional in ADD and SET operation. <br> *If audienceListType is CUSTOM_AUDIENCE, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceCustomAudienceList   {
  @JsonProperty("customAudienceId")
  private String customAudienceId = null;

  @JsonProperty("reachPeriod")
  private Integer reachPeriod = null;

  public AudienceListServiceCustomAudienceList customAudienceId(String customAudienceId) {
    this.customAudienceId = customAudienceId;
    return this;
  }

  /**
   * <div lang=\"ja\">Yahoo! DMPに連携するIDです。</div> <div lang=\"en\">ID to configure Yahoo! JAPAN DMP.</div> 
   * @return customAudienceId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Yahoo! DMPに連携するIDです。</div> <div lang=\"en\">ID to configure Yahoo! JAPAN DMP.</div> ")


  public String getCustomAudienceId() {
    return customAudienceId;
  }

  public void setCustomAudienceId(String customAudienceId) {
    this.customAudienceId = customAudienceId;
  }

  public AudienceListServiceCustomAudienceList reachPeriod(Integer reachPeriod) {
    this.reachPeriod = reachPeriod;
    return this;
  }

  /**
   * <div lang=\"ja\"> 行動履歴の保持期間です（1日～60日）。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> Duration of user data configured from DMP (1-60days). <br> This field is required in ADD operation. </div> 
   * @return reachPeriod
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 行動履歴の保持期間です（1日～60日）。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> Duration of user data configured from DMP (1-60days). <br> This field is required in ADD operation. </div> ")


  public Integer getReachPeriod() {
    return reachPeriod;
  }

  public void setReachPeriod(Integer reachPeriod) {
    this.reachPeriod = reachPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceCustomAudienceList audienceListServiceCustomAudienceList = (AudienceListServiceCustomAudienceList) o;
    return Objects.equals(this.customAudienceId, audienceListServiceCustomAudienceList.customAudienceId) &&
        Objects.equals(this.reachPeriod, audienceListServiceCustomAudienceList.reachPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAudienceId, reachPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceCustomAudienceList {\n");
    
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    reachPeriod: ").append(toIndentedString(reachPeriod)).append("\n");
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

