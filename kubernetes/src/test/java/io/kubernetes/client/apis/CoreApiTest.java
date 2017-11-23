/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIVersions;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CoreApi
 */
@Ignore
public class CoreApiTest {

    private final CoreApi api = new CoreApi();

    
    /**
     * 
     *
     * get available API versions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIVersionsTest() throws ApiException {
        V1APIVersions response = api.getAPIVersions();

        // TODO: test validations
    }
    
}
