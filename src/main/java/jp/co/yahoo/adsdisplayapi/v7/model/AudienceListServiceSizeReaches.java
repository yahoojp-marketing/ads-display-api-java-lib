package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceSize;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリストのサイズの各リーチ数を保持するオブジェクトです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceSizeReaches object contains each reaches of audience list size. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> オーディエンスリストのサイズの各リーチ数を保持するオブジェクトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AudienceListServiceSizeReaches object contains each reaches of audience list size. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceSizeReaches   {
  @JsonProperty("reach")
  private Long reach = null;

  @JsonProperty("audienceListSize")
  private AudienceListServiceSize audienceListSize = null;

  public AudienceListServiceSizeReaches reach(Long reach) {
    this.reach = reach;
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスリストのサイズのリーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reaches of audience list size. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスリストのサイズのリーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reaches of audience list size. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getReach() {
    return reach;
  }

  public void setReach(Long reach) {
    this.reach = reach;
  }

  public AudienceListServiceSizeReaches audienceListSize(AudienceListServiceSize audienceListSize) {
    this.audienceListSize = audienceListSize;
    return this;
  }

  /**
   * Get audienceListSize
   * @return audienceListSize
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceSize getAudienceListSize() {
    return audienceListSize;
  }

  public void setAudienceListSize(AudienceListServiceSize audienceListSize) {
    this.audienceListSize = audienceListSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceSizeReaches audienceListServiceSizeReaches = (AudienceListServiceSizeReaches) o;
    return Objects.equals(this.reach, audienceListServiceSizeReaches.reach) &&
        Objects.equals(this.audienceListSize, audienceListServiceSizeReaches.audienceListSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reach, audienceListSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceSizeReaches {\n");
    
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    audienceListSize: ").append(toIndentedString(audienceListSize)).append("\n");
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

