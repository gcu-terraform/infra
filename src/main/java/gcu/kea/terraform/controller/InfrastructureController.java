package gcu.kea.terraform.controller;

import gcu.kea.terraform.dto.InfrastructureDto;
import gcu.kea.terraform.dto.ResponseDto;
import gcu.kea.terraform.service.InfrastructureService;
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
    public ResponseEntity<ResponseDto> createInfrastructure(@RequestBody InfrastructureDto infrastructureDto) {
        // InfrastructureDto를 받아서 InfrastructureService를 통해 처리하고, 그 결과를 ResponseDto에 담아 반환합니다.
        ResponseDto responseDto = new ResponseDto();
        responseDto.setCode(200);
        responseDto.setMessage("정상 처리되었습니다.");
        responseDto.setData(infrastructureService.createChatCompletion(infrastructureDto));

        return ResponseEntity.ok(responseDto);
    }
}
