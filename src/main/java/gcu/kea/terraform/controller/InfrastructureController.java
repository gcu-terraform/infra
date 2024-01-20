package gcu.kea.terraform.controller;

import gcu.kea.terraform.dto.InfrastructureDto;
import gcu.kea.terraform.dto.ResponseDto;
import gcu.kea.terraform.service.InfrastructureService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InfrastructureController {

    private final InfrastructureService infrastructureService;

    @PostMapping("/infra")
    @Operation(summary = "Infrastructure 생성", description = "사용자에게 생성할 인프라 정보를 받아 해당 인프라에 관련된 테라폼 코드로 반환합니다.")
    public ResponseEntity<ResponseDto> createInfrastructure(@RequestBody InfrastructureDto infrastructureDto) {
        // InfrastructureDto를 받아서 InfrastructureService를 통해 처리하고, 그 결과를 ResponseDto에 담아 반환합니다.
        ResponseDto responseDto = new ResponseDto();
        responseDto.setCode(200);
        responseDto.setMessage("정상 처리되었습니다.");
        responseDto.setData(infrastructureService.createChatCompletion(infrastructureDto).getChoices().get(0).getMessage().getContent());

        return ResponseEntity.ok(responseDto);
    }
}
