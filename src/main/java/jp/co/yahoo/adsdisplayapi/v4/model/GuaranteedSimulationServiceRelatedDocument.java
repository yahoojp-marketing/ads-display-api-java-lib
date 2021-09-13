package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedSimulationServiceDocumentFile;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceRelatedDocumentは、商品関連資料情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceRelatedDocument holds information about the package related document.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceRelatedDocumentは、商品関連資料情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceRelatedDocument holds information about the package related document.<br>   Although this field will be returned in the response, it will be ignored on input.  </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceRelatedDocument   {
  @JsonProperty("files")
  @Valid
  private List<GuaranteedSimulationServiceDocumentFile> files = null;

  public GuaranteedSimulationServiceRelatedDocument files(List<GuaranteedSimulationServiceDocumentFile> files) {
    this.files = files;
    return this;
  }

  public GuaranteedSimulationServiceRelatedDocument addFilesItem(GuaranteedSimulationServiceDocumentFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServiceDocumentFile> getFiles() {
    return files;
  }

  public void setFiles(List<GuaranteedSimulationServiceDocumentFile> files) {
    this.files = files;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceRelatedDocument guaranteedSimulationServiceRelatedDocument = (GuaranteedSimulationServiceRelatedDocument) o;
    return Objects.equals(this.files, guaranteedSimulationServiceRelatedDocument.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceRelatedDocument {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

