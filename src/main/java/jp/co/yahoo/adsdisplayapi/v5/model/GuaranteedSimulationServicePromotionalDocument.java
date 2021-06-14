package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceDocumentFile;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServicePromotionalDocumentは、販促資料情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServicePromotionalDocument holds information about the promotional document.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServicePromotionalDocumentは、販促資料情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServicePromotionalDocument holds information about the promotional document.<br>   Although this field will be returned in the response, it will be ignored on input.  </div> ")

public class GuaranteedSimulationServicePromotionalDocument   {
  @JsonProperty("files")
  @Valid
  private JsonNullable<List<GuaranteedSimulationServiceDocumentFile>> files = JsonNullable.undefined();

  public GuaranteedSimulationServicePromotionalDocument files(List<GuaranteedSimulationServiceDocumentFile> files) {
    this.files = JsonNullable.of(files);
    return this;
  }

  public GuaranteedSimulationServicePromotionalDocument addFilesItem(GuaranteedSimulationServiceDocumentFile filesItem) {
    if (this.files == null || !this.files.isPresent()) {
      this.files = JsonNullable.of(new ArrayList<>());
    }
    this.files.get().add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedSimulationServiceDocumentFile>> getFiles() {
    return files;
  }

  public void setFiles(JsonNullable<List<GuaranteedSimulationServiceDocumentFile>> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePromotionalDocument guaranteedSimulationServicePromotionalDocument = (GuaranteedSimulationServicePromotionalDocument) o;
    return Objects.equals(this.files, guaranteedSimulationServicePromotionalDocument.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePromotionalDocument {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

