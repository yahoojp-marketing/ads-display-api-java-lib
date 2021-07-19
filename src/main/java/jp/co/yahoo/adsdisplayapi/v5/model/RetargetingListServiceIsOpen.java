package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> RetargetingListServiceIsOpenは、リーチ蓄積の有無を表します。<br> このフィールドは、targetListTypeがRULEの場合は、ADD時に必須となり、SET時に省略可能となります。<br> DEFAULT_LISTの場合は、SET時に省略可能です。<br> その他の場合は、無視されます。 </div> <div lang=\"en\"> RetargetingListServiceIsOpen display the setting of store of reaches to Target List. <br> If targetListType is RULE, this field is required in ADD operation, and is optional in SET operation.<br> If targetListType is DEFAULT_LIST, this field is optional in SET operation.<br> For other cases, this field will be ignored. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲットリストに対してリーチを貯めます。</span><span lang=\"en\">Store Reaches to Target List.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲットリストに対してリーチを貯めません。</span><span lang=\"en\">Do not store Reaches to Target List.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceIsOpen {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceIsOpen(String value) {
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
  public static RetargetingListServiceIsOpen fromValue(String value) {
    for (RetargetingListServiceIsOpen b : RetargetingListServiceIsOpen.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

