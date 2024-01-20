package gcu.kea.terraform.dto;

import lombok.Data;

import java.util.List;

/**
 * ChatCompletionDto는 모델이 제공한 입력에 기반한 채팅 완성 응답을 나타냅니다.
 */
@Data
public class ChatCompletionResponseDto {

    /**
     * (필수) 채팅 완성에 대한 고유 식별자입니다.
     */
    private String id;

    /**
     * (필수) 채팅 완성 선택사항의 목록입니다. n이 1보다 큰 경우 여러 개가 될 수 있습니다.
     */
    private List<Choice> choices;

    /**
     * (필수) 채팅 완성이 생성된 Unix 타임스탬프(초 단위)입니다.
     */
    private Integer created;

    /**
     * (필수) 채팅 완성에 사용된 모델입니다.
     */
    private String model;

    /**
     * (필수) 이 지문은 모델이 실행하는 백엔드 구성을 나타냅니다.
     */
    private String system_fingerprint;

    /**
     * (필수) 객체 유형입니다. 항상 'chat.completion'입니다.
     */
    private String object;

    /**
     * (필수) 완성 요청에 대한 사용 통계입니다.
     */
    private Usage usage;

}
