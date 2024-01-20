package gcu.kea.terraform.dto.openai;

import lombok.Data;

@Data
public class Usage {

    /**
     * (필수) 생성된 완성에서의 토큰 수입니다.
     */
    private Integer completion_tokens;

    /**
     * (필수) 프롬프트의 토큰 수입니다.
     */
    private Integer prompt_tokens;

    /**
     * (필수) 요청에서 사용된 총 토큰 수(프롬프트 + 완성)입니다.
     */
    private Integer total_tokens;
}
