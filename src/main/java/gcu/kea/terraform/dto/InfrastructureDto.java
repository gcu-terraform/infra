package gcu.kea.terraform.dto;

import gcu.kea.terraform.dto.infra.*;
import lombok.Data;

import java.util.List;

@Data
public class InfrastructureDto {
    private VPC vpc;
    private List<Subnet> subnets;
    private RouteTable routeTable;
    private SecurityGroup securityGroup;
    private LoadBalancer loadBalancer;
    private VirtualMachine virtualMachine;
    private ObjectStorage objectStorage;
    private MySQL mySQL;
}

