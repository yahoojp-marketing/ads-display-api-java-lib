package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets VideoServiceQualityType
 */
public enum VideoServiceQualityType {
  
  ORIGINAL("ORIGINAL"),
  
  HIGH("HIGH"),
  
  MIDDLE("MIDDLE"),
  
  LOW("LOW"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  VideoServiceQualityType(String value) {
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
  public static VideoServiceQualityType fromValue(String value) {
    for (VideoServiceQualityType b : VideoServiceQualityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

