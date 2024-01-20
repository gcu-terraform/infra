package gcu.kea.terraform.dto.openai;

/**
 * SystemMessageDto는 시스템 메시지를 나타내는 클래스입니다.
 * 이 클래스는 Message를 확장합니다.
 */
public class SystemMessage extends Message {

    /**
     * 'name'은 참가자의 이름을 나타냅니다. 이는 참가자가 같은 역할을 가질 경우 참가자를 구분하는 데 사용됩니다.
     */
    private String name;
}
