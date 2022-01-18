package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceDataオブジェクトは、オーディエンスリストを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceData object displays the audience list. &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceDataオブジェクトは、オーディエンスリストを表します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> AudienceListServiceData object displays the audience list. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceData   {
  @JsonProperty("audienceListId")
  private Long audienceListId = null;

  @JsonProperty("audienceListName")
  private String audienceListName = null;

  public AudienceListServiceData audienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 組み合わせ対象のオーディエンスリストIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Audience list ID that is subject to the combination.<br> This field is required in ADD and SET operation. </div> 
   * @return audienceListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 組み合わせ対象のオーディエンスリストIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Audience list ID that is subject to the combination.<br> This field is required in ADD and SET operation. </div> ")


  public Long getAudienceListId() {
    return audienceListId;
  }

  public void setAudienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
  }

  public AudienceListServiceData audienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
    return this;
  }

  /**
   * <div lang=\"ja\">組み合わせ対象のオーディエンスリストの名前です。</div> <div lang=\"en\">Audience list name that is subject to the combination.</div> 
   * @return audienceListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">組み合わせ対象のオーディエンスリストの名前です。</div> <div lang=\"en\">Audience list name that is subject to the combination.</div> ")


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
    AudienceListServiceData audienceListServiceData = (AudienceListServiceData) o;
    return Objects.equals(this.audienceListId, audienceListServiceData.audienceListId) &&
        Objects.equals(this.audienceListName, audienceListServiceData.audienceListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceListId, audienceListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceData {\n");
    
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
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

