package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> PlacementUrlListServiceUnknownDomainFlgは、不明ドメインフラグを表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> urlsフィールドに値が指定されていない場合、このフィールドは無視されます。<br> TRUEを指定する場合は、urlsフィールドに0以上のURLの指定が必要です。<br> FALSEを指定する場合は、urlsフィールドに1以上のURLの指定が必要です。 </div> <div lang=\"en\"> Unknown Domain Flag. <br> This field is optional in ADD and SET operation.<br> If urls field is not set value, this field will be ignored.<br> If this field is TRUE, urls field must be set 0 or more URL.<br> If this field is FALSE, urls field must be set 1 or more URL. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">不明ドメインを含む</span><span lang=\"en\">Including the unknown domain</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">不明ドメインを含まない</span><span lang=\"en\">not include the unknown domain</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum PlacementUrlListServiceUnknownDomainFlg {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PlacementUrlListServiceUnknownDomainFlg(String value) {
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
  public static PlacementUrlListServiceUnknownDomainFlg fromValue(String value) {
    for (PlacementUrlListServiceUnknownDomainFlg b : PlacementUrlListServiceUnknownDomainFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

