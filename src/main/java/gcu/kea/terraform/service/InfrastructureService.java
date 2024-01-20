package gcu.kea.terraform.service;

import gcu.kea.terraform.client.OpenAIApiClient;
import gcu.kea.terraform.dto.InfrastructureDto;
import gcu.kea.terraform.dto.openai.ChatCompletionRequestDto;
import gcu.kea.terraform.dto.openai.ChatCompletionResponseDto;
import gcu.kea.terraform.mapper.InfrastructureToChatRequestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfrastructureService {

    private final OpenAIApiClient openAIApiClient;
    private final InfrastructureToChatRequestMapper mapper;

    public ChatCompletionResponseDto createChatCompletion(InfrastructureDto infrastructureDto) {
        ChatCompletionRequestDto requestDto = mapper.map(infrastructureDto);
        return openAIApiClient.createChatCompletion(requestDto);
    }
}
