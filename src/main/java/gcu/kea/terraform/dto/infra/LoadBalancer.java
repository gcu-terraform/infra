package gcu.kea.terraform.dto.infra;

import lombok.Data;

@Data
public class LoadBalancer {
    private String lbType;
    private String lbName;
    private VPC vpc;
    private Subnet subnet;
    private String listenerProtocol;
    private int listenerPort;
    private String targetGroup;
    private boolean publicIp;
}
