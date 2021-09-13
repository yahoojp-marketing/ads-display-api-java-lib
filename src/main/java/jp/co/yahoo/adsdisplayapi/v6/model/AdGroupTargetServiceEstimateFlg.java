package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupTargetServiceEstimateFlgは、拡張配信の設定有無を表します。<br> このフィールドはAdGroupTargetServiceAgeが以下の場合には指定できません。<br> GT_RANGE15_19<br> GT_RANGE20_24<br> GT_RANGE25_29<br> GT_RANGE30_34<br> GT_RANGE35_39<br> GT_RANGE40_44<br> GT_RANGE45_49<br> GT_RANGE50_54<br> GT_RANGE55_59<br> GT_RANGE60_64<br> GT_RANGE65_69<br> GT_RANGE70_UL2<br> GT_UNKNOWN2<br> ADDおよびREPLACE時、このフィールドは必須となります。 </div> <div lang=\"en\"> AdGroupTargetServiceEstimateFlg displays the advance delivery setting.<br> This field cannot be specified if AdGroupTargetServiceAge is following value:<br> GT_RANGE15_19<br> GT_RANGE20_24<br> GT_RANGE25_29<br> GT_RANGE30_34<br> GT_RANGE35_39<br> GT_RANGE40_44<br> GT_RANGE45_49<br> GT_RANGE50_54<br> GT_RANGE55_59<br> GT_RANGE60_64<br> GT_RANGE65_69<br> GT_RANGE70_UL2<br> GT_UNKNOWN2<br> This field is required in ADD and REPLACE operation. </div> <dl class=term>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定した性別または年齢のユーザーに配信します。</span><span lang=\"en\">Deliver ads to users as designated gender or ages</span></dd>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定した性別または年齢と推定されるユーザーに配信します。</span><span lang=\"en\">Deliver ads to users who can be estimated as designated gender or ages</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupTargetServiceEstimateFlg {
  
  PAUSED("PAUSED"),
  
  ACTIVE("ACTIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupTargetServiceEstimateFlg(String value) {
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
  public static AdGroupTargetServiceEstimateFlg fromValue(String value) {
    for (AdGroupTargetServiceEstimateFlg b : AdGroupTargetServiceEstimateFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

