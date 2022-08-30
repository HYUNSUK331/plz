package pre.project.server.domain.answer.service;

import pre.project.server.domain.answer.dto.AnswerRequestDto;
import pre.project.server.domain.answer.dto.AnswerResponseDto;

import java.util.List;

public interface AnswerService {

    String answerSave(Long id, AnswerRequestDto dto);
    List<AnswerResponseDto> findAll(Long id);
    void update(Long questionId, AnswerRequestDto dto);
    void delete(Long questionId);
}
