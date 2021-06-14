package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAdPlaceType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermissionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackagePermittedAdPlaceTypesオブジェクトは、掲載面設定の制限情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackagePermittedAdPlaceTypes object holds the restriction information about the ad placement setting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackagePermittedAdPlaceTypesオブジェクトは、掲載面設定の制限情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePackagePermittedAdPlaceTypes object holds the restriction information about the ad placement setting.</div> ")

public class GuaranteedSimulationServicePackagePermittedAdPlaceTypes   {
  @JsonProperty("permission")
  private JsonNullable<GuaranteedSimulationServicePackagePermissionType> permission = JsonNullable.undefined();

  @JsonProperty("adPlaceTypes")
  @Valid
  private List<GuaranteedSimulationServiceAdPlaceType> adPlaceTypes = null;

  public GuaranteedSimulationServicePackagePermittedAdPlaceTypes permission(GuaranteedSimulationServicePackagePermissionType permission) {
    this.permission = JsonNullable.of(permission);
    return this;
  }

  /**
   * Get permission
   * @return permission
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermissionType> getPermission() {
    return permission;
  }

  public void setPermission(JsonNullable<GuaranteedSimulationServicePackagePermissionType> permission) {
    this.permission = permission;
  }

  public GuaranteedSimulationServicePackagePermittedAdPlaceTypes adPlaceTypes(List<GuaranteedSimulationServiceAdPlaceType> adPlaceTypes) {
    this.adPlaceTypes = adPlaceTypes;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedAdPlaceTypes addAdPlaceTypesItem(GuaranteedSimulationServiceAdPlaceType adPlaceTypesItem) {
    if (this.adPlaceTypes == null) {
      this.adPlaceTypes = new ArrayList<>();
    }
    this.adPlaceTypes.add(adPlaceTypesItem);
    return this;
  }

  /**
   * Get adPlaceTypes
   * @return adPlaceTypes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServiceAdPlaceType> getAdPlaceTypes() {
    return adPlaceTypes;
  }

  public void setAdPlaceTypes(List<GuaranteedSimulationServiceAdPlaceType> adPlaceTypes) {
    this.adPlaceTypes = adPlaceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePackagePermittedAdPlaceTypes guaranteedSimulationServicePackagePermittedAdPlaceTypes = (GuaranteedSimulationServicePackagePermittedAdPlaceTypes) o;
    return Objects.equals(this.permission, guaranteedSimulationServicePackagePermittedAdPlaceTypes.permission) &&
        Objects.equals(this.adPlaceTypes, guaranteedSimulationServicePackagePermittedAdPlaceTypes.adPlaceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, adPlaceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackagePermittedAdPlaceTypes {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    adPlaceTypes: ").append(toIndentedString(adPlaceTypes)).append("\n");
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

