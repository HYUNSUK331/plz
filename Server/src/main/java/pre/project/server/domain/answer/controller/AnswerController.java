package pre.project.server.domain.answer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pre.project.server.domain.answer.service.AnswerService;
import pre.project.server.domain.answer.dto.AnswerRequestDto;
import pre.project.server.domain.answer.dto.AnswerResponseDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/questions/{questionId}/answers")
public class AnswerController {
    private final AnswerService answerService;

    @PostMapping
    public ResponseEntity answerSave(@PathVariable("questionId") Long questionId, @RequestBody AnswerRequestDto dto) {
        return ResponseEntity.ok(answerService.answerSave(questionId, dto));
    }


    @GetMapping
    public List<AnswerResponseDto> read(@PathVariable("questionId") Long questionId) {
        return answerService.findAll(questionId);
    }

    /** Update */
    @PutMapping("/{answerId}")
    public ResponseEntity update(@PathVariable("answerId") Long answerId, @RequestBody AnswerRequestDto dto) {
        answerService.update(answerId, dto);
        return ResponseEntity.ok(answerId);
    }

    @DeleteMapping("/{answerId}")
    public ResponseEntity delete(@PathVariable("answerId") Long answerId) {
        answerService.delete(answerId);
        return ResponseEntity.noContent().build();
    }

}
