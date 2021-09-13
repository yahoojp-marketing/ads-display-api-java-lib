package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedPreviewServiceAdTypeは、広告タイプを表します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceAdType describes the type of ad.<br> This field is required in requests. </div> <dl class=term>   <dt class=\"term__item\">BRANDPANEL_QUINTIE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：16:9の縮小機能付き画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of 16:9 image with reduction function.</span></dd>   <dt class=\"term__item\">BRANDPANEL_QUINTIE_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：16:9の縮小機能付き動画で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of 16:9 video with reduction function.</span></dd>   <dt class=\"term__item\">BRANDPANEL_PANORAMA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：4:1の縮小機能付き画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of 4:1 video with reduction function.</span></dd>   <dt class=\"term__item\">BRANDPANEL_PANORAMA_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：4:1の縮小機能付き動画で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of 4:1 video with reduction function.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_SQUARE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの1:1の画像と、センター画像、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 1:1 image, the center image, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_SQUARE_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの1:1の動画と、センター画像、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 1:1 video, the center image, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_QUINTIE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの16:9の縮小機能付き画像と、センター画像、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 16:9 image with reduction function, the center image, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_QUINTIE_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの16:9の縮小機能付き動画と、センター画像、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 16:9 video with reduction function, the center image, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_PANORAMA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの4:1の縮小機能付き画像と、センター画像、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 4:1 image with reduction function, the center image, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_PANORAMA_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの4:1の縮小機能付き動画と、センター画像、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 4:1 video with reduction function, the center image, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_PANORAMA_SIDE_VISION_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：16:9の縮小機能付き動画で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of 16:9 video with reduction function.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_PANORAMA_SIDE_SWITCH_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの4:1の縮小機能付き動画と、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 4:1 video with reduction function, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_THEATER_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの16:9の動画と、センター画像、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 16:9 video, the center image, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_SQUARE_SPECIAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの1:1の画像と、センター画像、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 1:1 image, the center image, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_SQUARE_SPECIAL_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの1:1の動画と、センター画像、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 1:1 video, the center image, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_PRIME_DISPLAY_DOUBLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの2:1の画像と、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 2:1 video, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">TOP_IMPACT_PRIME_DISPLAY_DOUBLE_VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型専用広告：メインの2:1の動画と、右サイド画像、左サイド画像で構成される広告です。</span><span lang=\"en\">Guaranteed ad composed of the main 2:1 video, the right side image, and the left side image.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedPreviewServiceAdType {
  
  BRANDPANEL_QUINTIE("BRANDPANEL_QUINTIE"),
  
  BRANDPANEL_QUINTIE_VIDEO("BRANDPANEL_QUINTIE_VIDEO"),
  
  BRANDPANEL_PANORAMA("BRANDPANEL_PANORAMA"),
  
  BRANDPANEL_PANORAMA_VIDEO("BRANDPANEL_PANORAMA_VIDEO"),
  
  TOP_IMPACT_SQUARE("TOP_IMPACT_SQUARE"),
  
  TOP_IMPACT_SQUARE_VIDEO("TOP_IMPACT_SQUARE_VIDEO"),
  
  TOP_IMPACT_QUINTIE("TOP_IMPACT_QUINTIE"),
  
  TOP_IMPACT_QUINTIE_VIDEO("TOP_IMPACT_QUINTIE_VIDEO"),
  
  TOP_IMPACT_PANORAMA("TOP_IMPACT_PANORAMA"),
  
  TOP_IMPACT_PANORAMA_VIDEO("TOP_IMPACT_PANORAMA_VIDEO"),
  
  TOP_IMPACT_PANORAMA_SIDE_VISION_VIDEO("TOP_IMPACT_PANORAMA_SIDE_VISION_VIDEO"),
  
  TOP_IMPACT_PANORAMA_SIDE_SWITCH_VIDEO("TOP_IMPACT_PANORAMA_SIDE_SWITCH_VIDEO"),
  
  TOP_IMPACT_THEATER_VIDEO("TOP_IMPACT_THEATER_VIDEO"),
  
  TOP_IMPACT_SQUARE_SPECIAL("TOP_IMPACT_SQUARE_SPECIAL"),
  
  TOP_IMPACT_SQUARE_SPECIAL_VIDEO("TOP_IMPACT_SQUARE_SPECIAL_VIDEO"),
  
  TOP_IMPACT_PRIME_DISPLAY_DOUBLE("TOP_IMPACT_PRIME_DISPLAY_DOUBLE"),
  
  TOP_IMPACT_PRIME_DISPLAY_DOUBLE_VIDEO("TOP_IMPACT_PRIME_DISPLAY_DOUBLE_VIDEO"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedPreviewServiceAdType(String value) {
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
  public static GuaranteedPreviewServiceAdType fromValue(String value) {
    for (GuaranteedPreviewServiceAdType b : GuaranteedPreviewServiceAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

