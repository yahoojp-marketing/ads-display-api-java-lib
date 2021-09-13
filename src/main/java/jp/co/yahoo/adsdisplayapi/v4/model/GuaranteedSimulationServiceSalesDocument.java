package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedSimulationServiceDocumentFile;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceSalesDocumentは、セールスシート情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceSalesDocument holds the sales sheet information.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceSalesDocumentは、セールスシート情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceSalesDocument holds the sales sheet information.<br>   Although this field will be returned in the response, it will be ignored on input.  </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceSalesDocument   {
  @JsonProperty("file")
  private GuaranteedSimulationServiceDocumentFile file = null;

  public GuaranteedSimulationServiceSalesDocument file(GuaranteedSimulationServiceDocumentFile file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceDocumentFile getFile() {
    return file;
  }

  public void setFile(GuaranteedSimulationServiceDocumentFile file) {
    this.file = file;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceSalesDocument guaranteedSimulationServiceSalesDocument = (GuaranteedSimulationServiceSalesDocument) o;
    return Objects.equals(this.file, guaranteedSimulationServiceSalesDocument.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceSalesDocument {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

