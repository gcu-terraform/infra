package gcu.kea.terraform.client;

import gcu.kea.terraform.dto.ChatCompletionResponseDto;
import gcu.kea.terraform.dto.ChatCompletionRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "openai", url = "https://api.openai.com/v1")
public interface OpenAIApiClient {

    @PostMapping("/chat/completions")
    ChatCompletionResponseDto createChatCompletion(ChatCompletionRequestDto request);
}
