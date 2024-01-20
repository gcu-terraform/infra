package gcu.kea.terraform.mapper;

import gcu.kea.terraform.dto.InfrastructureDto;
import gcu.kea.terraform.dto.openai.ChatCompletionRequestDto;
import gcu.kea.terraform.dto.openai.Message;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InfrastructureToChatRequestMapper {

    public ChatCompletionRequestDto map(InfrastructureDto infrastructureDto) {
        ChatCompletionRequestDto requestDto = new ChatCompletionRequestDto();

        // 메시지 생성
        Message message = new Message();
        message.setRole("assistant");
        message.setContent(
                "[" + infrastructureDto.toString() + "]\n" + "을 terraform code로 변환해줘."
        ); // infrastructureDto의 정보를 문자열로 변환

        // 메시지 리스트에 추가
        List<Message> messages = new ArrayList<>();
        messages.add(message);
        requestDto.setMessages(messages);

        // 사용할 모델 설정
        requestDto.setModel("gpt-3.5-turbo");

        return requestDto;
    }
}
