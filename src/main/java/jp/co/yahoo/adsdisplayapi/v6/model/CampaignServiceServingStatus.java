package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> CampaignServiceServingStatusは、キャンペーンレベルの配信状況です。 ユーザーによる広告配信の調整に関わらず、キャンペーンとしての状態を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> CampaignServiceServingStatus serves delivery status in campaign level. Display the campaign status, regardless of userStatus setting.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">SERVING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンは、現在配信されています。</span><span lang=\"en\">The campaign is currently serving ads.</span></dd>   <dt class=\"term__item\">ENDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信が終了しています。<br>設定されたキャンペーン期間後のため、現在配信されていません。</span><span lang=\"en\">The campaign has ended.<br>It is already past the delivery period, so the campaign is currently not serving ads.</span></dd>   <dt class=\"term__item\">PENDING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信が開始していません。<br>設定されたキャンペーン期間前のため、現在まだ配信されていません。</span><span lang=\"en\">The campaign has not started.<br>It has not reached the delivery period, so the campaign is currently not serving.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceServingStatus {
  
  SERVING("SERVING"),
  
  ENDED("ENDED"),
  
  PENDING("PENDING"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceServingStatus(String value) {
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
  public static CampaignServiceServingStatus fromValue(String value) {
    for (CampaignServiceServingStatus b : CampaignServiceServingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
