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
import io.kubernetes.client.models.V1DeleteOptions;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomObjectsApi
 */
@Ignore
public class CustomObjectsApiTest {

    private final CustomObjectsApi api = new CustomObjectsApi();

    
    /**
     * 
     *
     * Creates a cluster scoped Custom object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClusterCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String plural = null;
        Object body = null;
        String pretty = null;
        Object response = api.createClusterCustomObject(group, version, plural, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a namespace scoped Custom object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String namespace = null;
        String plural = null;
        Object body = null;
        String pretty = null;
        Object response = api.createNamespacedCustomObject(group, version, namespace, plural, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes the specified cluster scoped custom object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClusterCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String plural = null;
        String name = null;
        V1DeleteOptions body = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        Object response = api.deleteClusterCustomObject(group, version, plural, name, body, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes the specified namespace scoped custom object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String namespace = null;
        String plural = null;
        String name = null;
        V1DeleteOptions body = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        Object response = api.deleteNamespacedCustomObject(group, version, namespace, plural, name, body, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a cluster scoped custom object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String plural = null;
        String name = null;
        Object response = api.getClusterCustomObject(group, version, plural, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a namespace scoped custom object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNamespacedCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String namespace = null;
        String plural = null;
        String name = null;
        Object response = api.getNamespacedCustomObject(group, version, namespace, plural, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch cluster scoped custom objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClusterCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String plural = null;
        String pretty = null;
        String labelSelector = null;
        String resourceVersion = null;
        Boolean watch = null;
        Object response = api.listClusterCustomObject(group, version, plural, pretty, labelSelector, resourceVersion, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch namespace scoped custom objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String namespace = null;
        String plural = null;
        String pretty = null;
        String labelSelector = null;
        String resourceVersion = null;
        Boolean watch = null;
        Object response = api.listNamespacedCustomObject(group, version, namespace, plural, pretty, labelSelector, resourceVersion, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified cluster scoped custom object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceClusterCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String plural = null;
        String name = null;
        Object body = null;
        Object response = api.replaceClusterCustomObject(group, version, plural, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified namespace scoped custom object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedCustomObjectTest() throws ApiException {
        String group = null;
        String version = null;
        String namespace = null;
        String plural = null;
        String name = null;
        Object body = null;
        Object response = api.replaceNamespacedCustomObject(group, version, namespace, plural, name, body);

        // TODO: test validations
    }
    
}
