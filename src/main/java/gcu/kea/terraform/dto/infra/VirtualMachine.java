package gcu.kea.terraform.dto.infra;

import lombok.Data;

@Data
public class VirtualMachine {
    private String instanceType;
    private int instanceCount;
    private String osImage;
    private String keyPair;
    private boolean publicIp;
    private String tagInfo;
    private String volumeInfo;
    private String instanceName;
}

