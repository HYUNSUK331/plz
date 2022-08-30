package pre.project.server.domain.answer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pre.project.server.domain.answer.entity.Answer;
import pre.project.server.domain.question.entity.Question;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerResponseDto {
    private Long answerId;

    private String content;
    private int recommendNum;
    private LocalDateTime regDate;
    private LocalDateTime editDate;

    private Question question;


    /** Entity -> Dto */
    public AnswerResponseDto(Answer answer) {
        this.answerId = answer.getAnswerId();
        this.content = answer.getContent();
        this.recommendNum = answer.getRecommendNum();
        this.regDate = answer.getRegDate();
        this.editDate = answer.getEditDate();
        this.question = getQuestion();
    }
}
