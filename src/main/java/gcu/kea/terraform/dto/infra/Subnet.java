package gcu.kea.terraform.dto.infra;

import lombok.Data;

@Data
public class Subnet {
    private String subnetName;
    private int numberOfSubnets;
    private VPC vpc;
    private String availabilityZone;
    private String ipCidrBlock;
    private String publicOrPrivate;
    private String tagInfo;
}

