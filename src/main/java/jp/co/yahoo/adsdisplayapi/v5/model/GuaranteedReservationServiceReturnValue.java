package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedReservationServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedReservationServiceReturnValueオブジェクトは、シミュレーション結果に基づいた予約情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedReservationServiceReturnValue object contains a reservation information based on simulation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedReservationServiceReturnValueオブジェクトは、シミュレーション結果に基づいた予約情報を格納するコンテナです。</div> <div lang=\"en\">GuaranteedReservationServiceReturnValue object contains a reservation information based on simulation result.</div> ")

public class GuaranteedReservationServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<GuaranteedReservationServiceValue>> values = JsonNullable.undefined();

  public GuaranteedReservationServiceReturnValue values(List<GuaranteedReservationServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public GuaranteedReservationServiceReturnValue addValuesItem(GuaranteedReservationServiceValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedReservationServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<GuaranteedReservationServiceValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedReservationServiceReturnValue guaranteedReservationServiceReturnValue = (GuaranteedReservationServiceReturnValue) o;
    return Objects.equals(this.values, guaranteedReservationServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedReservationServiceReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

