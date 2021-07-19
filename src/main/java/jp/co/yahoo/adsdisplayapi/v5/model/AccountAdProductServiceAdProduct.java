package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountAdProductServiceAdProductオブジェクトは、広告掲載方式に関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountAdProductServiceAdProduct object is a relation of ad display\\ method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountAdProductServiceAdProductオブジェクトは、広告掲載方式に関する情報を表します。</div> <div lang=\"en\">AccountAdProductServiceAdProduct object is a relation of ad display\\ method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountAdProductServiceAdProduct   {
  @JsonProperty("adProductType")
  private String adProductType = null;

  public AccountAdProductServiceAdProduct adProductType(String adProductType) {
    this.adProductType = adProductType;
    return this;
  }

  /**
   * <div lang=\"ja\">広告商品情報です。</div> <div lang=\"en\">Information of ad product.</div> 
   * @return adProductType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告商品情報です。</div> <div lang=\"en\">Information of ad product.</div> ")


  public String getAdProductType() {
    return adProductType;
  }

  public void setAdProductType(String adProductType) {
    this.adProductType = adProductType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAdProductServiceAdProduct accountAdProductServiceAdProduct = (AccountAdProductServiceAdProduct) o;
    return Objects.equals(this.adProductType, accountAdProductServiceAdProduct.adProductType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adProductType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAdProductServiceAdProduct {\n");
    
    sb.append("    adProductType: ").append(toIndentedString(adProductType)).append("\n");
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

