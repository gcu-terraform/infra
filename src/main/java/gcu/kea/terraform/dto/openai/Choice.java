package gcu.kea.terraform.dto.openai;

import lombok.Data;

@Data
public class Choice {

    /**
     * (필수) 모델이 토큰 생성을 중지한 이유입니다.
     */
    private String finish_reason;

    /**
     * (필수) 선택사항의 인덱스입니다.
     */
    private Integer index;

    /**
     * (필수) 모델이 생성한 채팅 완성 메시지입니다.
     */
    private Message message;

    /**
     * 선택사항에 대한 로그 확률 정보입니다.
     */
    private Object logprobs;
}
