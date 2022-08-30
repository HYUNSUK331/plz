package pre.project.server.domain.answer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pre.project.server.domain.answer.entity.Answer;
import pre.project.server.domain.question.entity.Question;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerRequestDto {

    /*
    private Long answerId;
    private LocalDateTime regDate;
    private LocalDateTime editDate;
    */
    private Question question;
    private String content;

    /** Dto -> Entity */
    public Answer toEntity() {
        Answer answer = Answer.builder()
                //.answerId(answerId)
                .content(content)
                //.regDate(regDate)
                //.editDate(editDate)
                .question(question)
                .build();
        return answer;
    }
}
