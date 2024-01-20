package gcu.kea.terraform.dto.openai;

import lombok.Data;

@Data
public class Message {

    /**
     * (필수) 'content'는 메시지의 내용을 나타냅니다.
     */
    private String content;

    /**
     * (필수) 'role'은 메시지를 작성한 참가자의 역할을 나타냅니다. 예를 들어, "system", "user", "assistant" 등이 있습니다.
     */
    private String role;
}
