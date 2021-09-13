package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.PlacementUrlListServiceUrlActiveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; PlacementUrlListServiceUrlListオブジェクトは、URLを保持するオブジェクトです。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The objects to keep url.&lt;br&gt; This field is required in ADD operation, and is optional in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> PlacementUrlListServiceUrlListオブジェクトは、URLを保持するオブジェクトです。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> The objects to keep url.<br> This field is required in ADD operation, and is optional in SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlacementUrlListServiceUrlList   {
  @JsonProperty("placementUrl")
  private String placementUrl = null;

  @JsonProperty("urlActiveFlg")
  private PlacementUrlListServiceUrlActiveFlg urlActiveFlg = null;

  public PlacementUrlListServiceUrlList placementUrl(String placementUrl) {
    this.placementUrl = placementUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> プレイスメントURLです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Url.<br> This field is required in ADD and SET operation. </div> 
   * @return placementUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> プレイスメントURLです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Url.<br> This field is required in ADD and SET operation. </div> ")


  public String getPlacementUrl() {
    return placementUrl;
  }

  public void setPlacementUrl(String placementUrl) {
    this.placementUrl = placementUrl;
  }

  public PlacementUrlListServiceUrlList urlActiveFlg(PlacementUrlListServiceUrlActiveFlg urlActiveFlg) {
    this.urlActiveFlg = urlActiveFlg;
    return this;
  }

  /**
   * Get urlActiveFlg
   * @return urlActiveFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlacementUrlListServiceUrlActiveFlg getUrlActiveFlg() {
    return urlActiveFlg;
  }

  public void setUrlActiveFlg(PlacementUrlListServiceUrlActiveFlg urlActiveFlg) {
    this.urlActiveFlg = urlActiveFlg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlListServiceUrlList placementUrlListServiceUrlList = (PlacementUrlListServiceUrlList) o;
    return Objects.equals(this.placementUrl, placementUrlListServiceUrlList.placementUrl) &&
        Objects.equals(this.urlActiveFlg, placementUrlListServiceUrlList.urlActiveFlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementUrl, urlActiveFlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlListServiceUrlList {\n");
    
    sb.append("    placementUrl: ").append(toIndentedString(placementUrl)).append("\n");
    sb.append("    urlActiveFlg: ").append(toIndentedString(urlActiveFlg)).append("\n");
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

