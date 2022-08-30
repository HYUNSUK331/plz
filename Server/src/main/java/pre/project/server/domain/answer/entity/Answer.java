package pre.project.server.domain.answer.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import pre.project.server.domain.question.entity.Question;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    @Column(nullable = false)
    private String content; // 댓글 내용

    @Column(name= "reg_date", nullable=false, updatable = false)
    @CreatedDate
    //private String regDate;
    private LocalDateTime regDate;

    @Column(name= "edit_date")
    @LastModifiedDate
    //private String editDate;
    private LocalDateTime editDate;

    private int recommendNum;

    @ManyToOne
    @JoinColumn(name = "questionId")
    private Question question;

    public void addQuestion(Question question){
        this.question = question;
    }
}
