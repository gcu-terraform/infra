package gcu.kea.terraform.dto.infra;

import lombok.Data;

@Data
public class MySQL {
    private String instanceGroupName;
    private String mysqlVersion;
    private String mysqlUsername;
    private String mysqlPassword;
    private String availability;
    private String instanceType;
    private String storageType;
    private String storageSize;
    private String logStorageType;
    private String logStorageSize;
    private VPC vpc;
    private Subnet subnet;
    private int instanceCount;
}
