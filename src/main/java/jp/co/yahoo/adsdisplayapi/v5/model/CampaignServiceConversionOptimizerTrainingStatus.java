package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionOptimizerTrainingStatusは、コンバージョン最適化の学習状況を表示します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> ConversionOptimizerTrainingStatus indicates the conversion optimizer training status. <br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">PROCESSING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">学習中です。</span><span lang=\"en\">Under training process.</span></dd>   <dt class=\"term__item\">COMPLETED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">学習完了です。</span><span lang=\"en\">Training completed.</span></dd>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">学習停止です。</span><span lang=\"en\">Training paused.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceConversionOptimizerTrainingStatus {
  
  PROCESSING("PROCESSING"),
  
  COMPLETED("COMPLETED"),
  
  PAUSED("PAUSED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceConversionOptimizerTrainingStatus(String value) {
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
  public static CampaignServiceConversionOptimizerTrainingStatus fromValue(String value) {
    for (CampaignServiceConversionOptimizerTrainingStatus b : CampaignServiceConversionOptimizerTrainingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

