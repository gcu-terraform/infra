package gcu.kea.terraform.dto.infra;

import lombok.Data;

@Data
public class ObjectStorage {
    private String bucketName;
    private String policy;
    private String tagInfo;
}
