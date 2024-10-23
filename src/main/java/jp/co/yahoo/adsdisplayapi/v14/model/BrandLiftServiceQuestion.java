/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v14.model.BrandLiftServiceGoal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BrandLiftServiceQuestionオブジェクトは、ブランドリフト調査項目を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BrandLiftServiceQuestion object describes the brand lift survey contents.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  BrandLiftServiceQuestion.JSON_PROPERTY_QUESTION_ID,
  BrandLiftServiceQuestion.JSON_PROPERTY_GOAL,
  BrandLiftServiceQuestion.JSON_PROPERTY_PRE_APPROVE_ID,
  BrandLiftServiceQuestion.JSON_PROPERTY_QUESTION,
  BrandLiftServiceQuestion.JSON_PROPERTY_ANSWER_OPTION1,
  BrandLiftServiceQuestion.JSON_PROPERTY_ANSWER_OPTION2,
  BrandLiftServiceQuestion.JSON_PROPERTY_ANSWER_OPTION3,
  BrandLiftServiceQuestion.JSON_PROPERTY_ANSWER_OPTION4,
  BrandLiftServiceQuestion.JSON_PROPERTY_ANSWER_OPTION5
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BrandLiftServiceQuestion {
  public static final String JSON_PROPERTY_QUESTION_ID = "questionId";
  private Long questionId;

  public static final String JSON_PROPERTY_GOAL = "goal";
  private BrandLiftServiceGoal goal;

  public static final String JSON_PROPERTY_PRE_APPROVE_ID = "preApproveId";
  private String preApproveId;

  public static final String JSON_PROPERTY_QUESTION = "question";
  private String question;

  public static final String JSON_PROPERTY_ANSWER_OPTION1 = "answerOption1";
  private String answerOption1;

  public static final String JSON_PROPERTY_ANSWER_OPTION2 = "answerOption2";
  private String answerOption2;

  public static final String JSON_PROPERTY_ANSWER_OPTION3 = "answerOption3";
  private String answerOption3;

  public static final String JSON_PROPERTY_ANSWER_OPTION4 = "answerOption4";
  private String answerOption4;

  public static final String JSON_PROPERTY_ANSWER_OPTION5 = "answerOption5";
  private String answerOption5;

  public BrandLiftServiceQuestion() {
  }

  public BrandLiftServiceQuestion questionId(Long questionId) {
    
    this.questionId = questionId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;調査IDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Question ID. &lt;/div&gt; 
   * @return questionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUESTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuestionId() {
    return questionId;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }


  public BrandLiftServiceQuestion goal(BrandLiftServiceGoal goal) {
    
    this.goal = goal;
    return this;
  }

   /**
   * Get goal
   * @return goal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BrandLiftServiceGoal getGoal() {
    return goal;
  }


  @JsonProperty(JSON_PROPERTY_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoal(BrandLiftServiceGoal goal) {
    this.goal = goal;
  }


  public BrandLiftServiceQuestion preApproveId(String preApproveId) {
    
    this.preApproveId = preApproveId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;事前承認IDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Preapprove ID. &lt;/div&gt; 
   * @return preApproveId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_APPROVE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreApproveId() {
    return preApproveId;
  }


  @JsonProperty(JSON_PROPERTY_PRE_APPROVE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreApproveId(String preApproveId) {
    this.preApproveId = preApproveId;
  }


  public BrandLiftServiceQuestion question(String question) {
    
    this.question = question;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;設問です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Question. &lt;/div&gt; 
   * @return question
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuestion() {
    return question;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuestion(String question) {
    this.question = question;
  }


  public BrandLiftServiceQuestion answerOption1(String answerOption1) {
    
    this.answerOption1 = answerOption1;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;回答選択肢1です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Answer option1. &lt;/div&gt; 
   * @return answerOption1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnswerOption1() {
    return answerOption1;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswerOption1(String answerOption1) {
    this.answerOption1 = answerOption1;
  }


  public BrandLiftServiceQuestion answerOption2(String answerOption2) {
    
    this.answerOption2 = answerOption2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;回答選択肢2です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Answer option2. &lt;/div&gt; 
   * @return answerOption2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnswerOption2() {
    return answerOption2;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswerOption2(String answerOption2) {
    this.answerOption2 = answerOption2;
  }


  public BrandLiftServiceQuestion answerOption3(String answerOption3) {
    
    this.answerOption3 = answerOption3;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;回答選択肢3です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Answer option3. &lt;/div&gt; 
   * @return answerOption3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnswerOption3() {
    return answerOption3;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswerOption3(String answerOption3) {
    this.answerOption3 = answerOption3;
  }


  public BrandLiftServiceQuestion answerOption4(String answerOption4) {
    
    this.answerOption4 = answerOption4;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;回答選択肢4です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Answer option4. &lt;/div&gt; 
   * @return answerOption4
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnswerOption4() {
    return answerOption4;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswerOption4(String answerOption4) {
    this.answerOption4 = answerOption4;
  }


  public BrandLiftServiceQuestion answerOption5(String answerOption5) {
    
    this.answerOption5 = answerOption5;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;回答選択肢5です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Answer option5. &lt;/div&gt; 
   * @return answerOption5
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnswerOption5() {
    return answerOption5;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER_OPTION5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswerOption5(String answerOption5) {
    this.answerOption5 = answerOption5;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandLiftServiceQuestion brandLiftServiceQuestion = (BrandLiftServiceQuestion) o;
    return Objects.equals(this.questionId, brandLiftServiceQuestion.questionId) &&
        Objects.equals(this.goal, brandLiftServiceQuestion.goal) &&
        Objects.equals(this.preApproveId, brandLiftServiceQuestion.preApproveId) &&
        Objects.equals(this.question, brandLiftServiceQuestion.question) &&
        Objects.equals(this.answerOption1, brandLiftServiceQuestion.answerOption1) &&
        Objects.equals(this.answerOption2, brandLiftServiceQuestion.answerOption2) &&
        Objects.equals(this.answerOption3, brandLiftServiceQuestion.answerOption3) &&
        Objects.equals(this.answerOption4, brandLiftServiceQuestion.answerOption4) &&
        Objects.equals(this.answerOption5, brandLiftServiceQuestion.answerOption5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, goal, preApproveId, question, answerOption1, answerOption2, answerOption3, answerOption4, answerOption5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandLiftServiceQuestion {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    preApproveId: ").append(toIndentedString(preApproveId)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answerOption1: ").append(toIndentedString(answerOption1)).append("\n");
    sb.append("    answerOption2: ").append(toIndentedString(answerOption2)).append("\n");
    sb.append("    answerOption3: ").append(toIndentedString(answerOption3)).append("\n");
    sb.append("    answerOption4: ").append(toIndentedString(answerOption4)).append("\n");
    sb.append("    answerOption5: ").append(toIndentedString(answerOption5)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
