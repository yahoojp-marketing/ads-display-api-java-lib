package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceDocumentFileは、商品資料情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceDocumentFile holds information about the package document.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceDocumentFileは、商品資料情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceDocumentFile holds information about the package document.<br>   Although this field will be returned in the response, it will be ignored on input.  </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceDocumentFile   {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("fileName")
  private String fileName = null;

  public GuaranteedSimulationServiceDocumentFile url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\">商品資料のダウンロードURLです。</div> <div lang=\"en\">Download URL of the package document.</div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品資料のダウンロードURLです。</div> <div lang=\"en\">Download URL of the package document.</div> ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GuaranteedSimulationServiceDocumentFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * <div lang=\"ja\">商品資料のファイル名です。</div> <div lang=\"en\">File name of the package document.</div> 
   * @return fileName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品資料のファイル名です。</div> <div lang=\"en\">File name of the package document.</div> ")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceDocumentFile guaranteedSimulationServiceDocumentFile = (GuaranteedSimulationServiceDocumentFile) o;
    return Objects.equals(this.url, guaranteedSimulationServiceDocumentFile.url) &&
        Objects.equals(this.fileName, guaranteedSimulationServiceDocumentFile.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceDocumentFile {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

