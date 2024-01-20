package gcu.kea.terraform.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * ChatGPTRequestDto는 OpenAI의 Chat API로 보내는 요청을 나타내는 데이터 전송 객체입니다.
 * 각 필드는 API의 요청 매개변수를 나타냅니다.
 */
@Data
public class ChatCompletionRequestDto {

    /**
     * (필수) 대화를 구성하는 메시지 목록입니다.
     */
    private List<Message> messages;

    /**
     * (필수) 사용할 모델의 ID입니다.
     */
    private String model;

    /**
     * 텍스트에서의 기존 빈도에 따라 새 토큰에 패널티를 부여하는 값입니다.
     * 값의 범위는 -2.0에서 2.0입니다.
     */
    private Double frequency_penalty;

    /**
     * 완성에서 지정된 토큰이 나타날 가능성을 수정하는 값입니다.
     */
    private Map<String, Double> logit_bias;

    /**
     * 출력 토큰의 로그 확률을 반환할지 여부를 결정하는 값입니다.
     */
    private Boolean logprobs;

    /**
     * 각 토큰 위치에서 반환할 가장 가능성이 높은 토큰의 수를 지정하는 값입니다.
     * 값의 범위는 0에서 5입니다.
     */
    private Integer top_logprobs;

    /**
     * 채팅 완성에서 생성될 수 있는 토큰의 최대 개수입니다.
     */
    private Integer max_tokens;

    /**
     * 각 입력 메시지에 대해 생성할 채팅 완성 선택사항의 수입니다.
     */
    private Integer n;

    /**
     * 텍스트에서의 존재 여부에 따라 새 토큰에 패널티를 부여하는 값입니다.
     * 값의 범위는 -2.0에서 2.0입니다.
     */
    private Double presence_penalty;

    /**
     * 모델이 출력해야 하는 형식을 지정하는 객체입니다.
     */
    private Map<String, String> response_format;

    /**
     * 동일한 seed와 매개변수를 가진 반복 요청이 동일한 결과를 반환하도록 결정론적으로 샘플링을 시도하는 값입니다.
     */
    private Integer seed;

    /**
     * API가 더 이상 토큰을 생성하지 않도록 하는 시퀀스입니다.
     */
    private List<String> stop;

    /**
     * 부분 메시지 델타를 전송할지 여부를 결정하는 값입니다.
     */
    private Boolean stream;

    /**
     * 사용할 샘플링 온도입니다.
     * 값의 범위는 0에서 2입니다.
     */
    private Double temperature;

    /**
     * 핵심 샘플링을 사용하는 값입니다.
     * 값의 범위는 0에서 1입니다.
     */
    private Double top_p;

    /**
     * 모델이 호출할 수 있는 도구의 목록입니다.
     */
    private List<String> tools;

    /**
     * 모델이 호출하는 함수를 제어하는 값입니다.
     */
    private String tool_choice;

    /**
     * OpenAI가 오남용을 모니터링하고 감지하는 데 도움이 되는 종단 사용자를 나타내는 고유 식별자입니다.
     */
    private String user;
}
