package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.BrandLiftServiceGoal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BrandLiftServiceQuestionオブジェクトは、ブランドリフト調査項目を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BrandLiftServiceQuestion objects describes the brand lift survey contents.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BrandLiftServiceQuestionオブジェクトは、ブランドリフト調査項目を表します。</div> <div lang=\"en\">BrandLiftServiceQuestion objects describes the brand lift survey contents.</div> ")

public class BrandLiftServiceQuestion   {
  @JsonProperty("questionId")
  private JsonNullable<Long> questionId = JsonNullable.undefined();

  @JsonProperty("goal")
  private JsonNullable<BrandLiftServiceGoal> goal = JsonNullable.undefined();

  @JsonProperty("preApproveId")
  private JsonNullable<String> preApproveId = JsonNullable.undefined();

  @JsonProperty("question")
  private JsonNullable<String> question = JsonNullable.undefined();

  @JsonProperty("answerOption1")
  private JsonNullable<String> answerOption1 = JsonNullable.undefined();

  @JsonProperty("answerOption2")
  private JsonNullable<String> answerOption2 = JsonNullable.undefined();

  @JsonProperty("answerOption3")
  private JsonNullable<String> answerOption3 = JsonNullable.undefined();

  @JsonProperty("answerOption4")
  private JsonNullable<String> answerOption4 = JsonNullable.undefined();

  @JsonProperty("answerOption5")
  private JsonNullable<String> answerOption5 = JsonNullable.undefined();

  public BrandLiftServiceQuestion questionId(Long questionId) {
    this.questionId = JsonNullable.of(questionId);
    return this;
  }

  /**
   * <div lang=\"ja\">調査IDです。</div> <div lang=\"en\">Question ID. </div> 
   * @return questionId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">調査IDです。</div> <div lang=\"en\">Question ID. </div> ")


  public JsonNullable<Long> getQuestionId() {
    return questionId;
  }

  public void setQuestionId(JsonNullable<Long> questionId) {
    this.questionId = questionId;
  }

  public BrandLiftServiceQuestion goal(BrandLiftServiceGoal goal) {
    this.goal = JsonNullable.of(goal);
    return this;
  }

  /**
   * Get goal
   * @return goal
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BrandLiftServiceGoal> getGoal() {
    return goal;
  }

  public void setGoal(JsonNullable<BrandLiftServiceGoal> goal) {
    this.goal = goal;
  }

  public BrandLiftServiceQuestion preApproveId(String preApproveId) {
    this.preApproveId = JsonNullable.of(preApproveId);
    return this;
  }

  /**
   * <div lang=\"ja\">事前承認IDです。</div> <div lang=\"en\">Preapprove ID. </div> 
   * @return preApproveId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">事前承認IDです。</div> <div lang=\"en\">Preapprove ID. </div> ")


  public JsonNullable<String> getPreApproveId() {
    return preApproveId;
  }

  public void setPreApproveId(JsonNullable<String> preApproveId) {
    this.preApproveId = preApproveId;
  }

  public BrandLiftServiceQuestion question(String question) {
    this.question = JsonNullable.of(question);
    return this;
  }

  /**
   * <div lang=\"ja\">設問です。</div> <div lang=\"en\">Question. </div> 
   * @return question
  */
  @ApiModelProperty(value = "<div lang=\"ja\">設問です。</div> <div lang=\"en\">Question. </div> ")


  public JsonNullable<String> getQuestion() {
    return question;
  }

  public void setQuestion(JsonNullable<String> question) {
    this.question = question;
  }

  public BrandLiftServiceQuestion answerOption1(String answerOption1) {
    this.answerOption1 = JsonNullable.of(answerOption1);
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢1です。</div> <div lang=\"en\">Answer Option1. </div> 
   * @return answerOption1
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢1です。</div> <div lang=\"en\">Answer Option1. </div> ")


  public JsonNullable<String> getAnswerOption1() {
    return answerOption1;
  }

  public void setAnswerOption1(JsonNullable<String> answerOption1) {
    this.answerOption1 = answerOption1;
  }

  public BrandLiftServiceQuestion answerOption2(String answerOption2) {
    this.answerOption2 = JsonNullable.of(answerOption2);
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢2です。</div> <div lang=\"en\">Answer Option2. </div> 
   * @return answerOption2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢2です。</div> <div lang=\"en\">Answer Option2. </div> ")


  public JsonNullable<String> getAnswerOption2() {
    return answerOption2;
  }

  public void setAnswerOption2(JsonNullable<String> answerOption2) {
    this.answerOption2 = answerOption2;
  }

  public BrandLiftServiceQuestion answerOption3(String answerOption3) {
    this.answerOption3 = JsonNullable.of(answerOption3);
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢3です。</div> <div lang=\"en\">Answer Option3. </div> 
   * @return answerOption3
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢3です。</div> <div lang=\"en\">Answer Option3. </div> ")


  public JsonNullable<String> getAnswerOption3() {
    return answerOption3;
  }

  public void setAnswerOption3(JsonNullable<String> answerOption3) {
    this.answerOption3 = answerOption3;
  }

  public BrandLiftServiceQuestion answerOption4(String answerOption4) {
    this.answerOption4 = JsonNullable.of(answerOption4);
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢4です。</div> <div lang=\"en\">Answer Option4. </div> 
   * @return answerOption4
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢4です。</div> <div lang=\"en\">Answer Option4. </div> ")


  public JsonNullable<String> getAnswerOption4() {
    return answerOption4;
  }

  public void setAnswerOption4(JsonNullable<String> answerOption4) {
    this.answerOption4 = answerOption4;
  }

  public BrandLiftServiceQuestion answerOption5(String answerOption5) {
    this.answerOption5 = JsonNullable.of(answerOption5);
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢5です。</div> <div lang=\"en\">Answer Option5. </div> 
   * @return answerOption5
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢5です。</div> <div lang=\"en\">Answer Option5. </div> ")


  public JsonNullable<String> getAnswerOption5() {
    return answerOption5;
  }

  public void setAnswerOption5(JsonNullable<String> answerOption5) {
    this.answerOption5 = answerOption5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

