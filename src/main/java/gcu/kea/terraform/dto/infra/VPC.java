package gcu.kea.terraform.dto.infra;

import lombok.Data;

@Data
public class VPC {
    private String region;
    private String vpcName;
    private String vpcCidrBlock;
    private String tagInfo;
}

