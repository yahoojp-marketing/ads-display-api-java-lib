package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   AudienceListServiceSharingStatusFilterTypeは、オーディエンスリストの共有状況でフィルタリングするための設定です。<br>   GET時のデフォルト設定値はALLとなります。 </div> <div lang=\"en\">   AudienceListServiceSharingStatusFilterType is setting for filtering by the sharing status of the audience list.<br>   The default value in GET operation will be ALL. </div> <hr> <dl class=term>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全てのリストを取得します。(DEFAULT)</span><span lang=\"en\">Get all list. (Default)</span></dd>   <dt class=\"term__item\">SHARED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有リストのみ取得します。</span><span lang=\"en\">Get only shared list.</span></dd>   <dt class=\"term__item\">NOT_SHARED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">非共有リストのみ取得します。</span><span lang=\"en\">Get only non-shared list.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AudienceListServiceSharingStatusFilterType {
  
  ALL("ALL"),
  
  SHARED("SHARED"),
  
  NOT_SHARED("NOT_SHARED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceSharingStatusFilterType(String value) {
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
  public static AudienceListServiceSharingStatusFilterType fromValue(String value) {
    for (AudienceListServiceSharingStatusFilterType b : AudienceListServiceSharingStatusFilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

