package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> MediaServiceCampaignBannerFlgは、キャンペーンバナーの設定フラグを表します。<br> このフィールドは、ADD時に省略可能となります。 </div> <div lang=\"en\"> MediaServiceCampaignBannerFlg displays the flag settings of Campaign banner image. <br> This field is optional in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンバナー画像です。</span><span lang=\"en\">Campaign banner image.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通常画像です。</span><span lang=\"en\">Normal image.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum MediaServiceCampaignBannerFlg {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  MediaServiceCampaignBannerFlg(String value) {
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
  public static MediaServiceCampaignBannerFlg fromValue(String value) {
    for (MediaServiceCampaignBannerFlg b : MediaServiceCampaignBannerFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

