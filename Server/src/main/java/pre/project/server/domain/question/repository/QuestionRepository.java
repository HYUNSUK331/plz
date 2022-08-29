package pre.project.server.domain.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pre.project.server.domain.question.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
