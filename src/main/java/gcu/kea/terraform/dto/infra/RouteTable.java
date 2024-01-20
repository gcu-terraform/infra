package gcu.kea.terraform.dto.infra;

import lombok.Data;

@Data
public class RouteTable {
    private String routeTableName;
    private VPC connectedVpc;
    private Subnet connectedSubnet;
    private String targetType;
    private String targetName;
    private String destinationIp;
    private String natGateway;
    private String tagInfo;
}

