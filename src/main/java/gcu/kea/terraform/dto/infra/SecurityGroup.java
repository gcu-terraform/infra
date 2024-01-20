package gcu.kea.terraform.dto.infra;

import lombok.Data;

@Data
public class SecurityGroup {
    private String securityGroupName;
    private String inbound;
    private String outbound;
    private String tagInfo;
}
