package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedSimulationServicePositionTypeeは、インストリーム広告のポジションの種類を表します。</div> <div lang=\"en\">GuaranteedSimulationServicePositionType serves position types of the instream video ads.</div> <dl class=term>   <dt class=\"term__item\">INSTREAM_PREROLL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動画再生前に挿入されます。</span><span lang=\"en\">Before the video.</span></dd>   <dt class=\"term__item\">INSTREAM_MIDROLL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動画の途中に挿入されます。</span><span lang=\"en\">At points in between the video.</span></dd>   <dt class=\"term__item\">INSTREAM_POSTROLL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動画再生後に挿入されます。</span><span lang=\"en\">After the video.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServicePositionType {
  
  INSTREAM_PREROLL("INSTREAM_PREROLL"),
  
  INSTREAM_MIDROLL("INSTREAM_MIDROLL"),
  
  INSTREAM_POSTROLL("INSTREAM_POSTROLL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServicePositionType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GuaranteedSimulationServicePositionType fromValue(String value) {
    for (GuaranteedSimulationServicePositionType b : GuaranteedSimulationServicePositionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

