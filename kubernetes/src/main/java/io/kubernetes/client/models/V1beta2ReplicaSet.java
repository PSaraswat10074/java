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


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1beta2ReplicaSetSpec;
import io.kubernetes.client.models.V1beta2ReplicaSetStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReplicaSet represents the configuration of a ReplicaSet.
 */
@ApiModel(description = "ReplicaSet represents the configuration of a ReplicaSet.")

public class V1beta2ReplicaSet {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1beta2ReplicaSetSpec spec = null;

  @SerializedName("status")
  private V1beta2ReplicaSetStatus status = null;

  public V1beta2ReplicaSet apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1beta2ReplicaSet kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1beta2ReplicaSet metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages. Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1beta2ReplicaSet spec(V1beta2ReplicaSetSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec defines the specification of the desired behavior of the ReplicaSet. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   * @return spec
  **/
  @ApiModelProperty(value = "Spec defines the specification of the desired behavior of the ReplicaSet. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public V1beta2ReplicaSetSpec getSpec() {
    return spec;
  }

  public void setSpec(V1beta2ReplicaSetSpec spec) {
    this.spec = spec;
  }

  public V1beta2ReplicaSet status(V1beta2ReplicaSetStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status is the most recently observed status of the ReplicaSet. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   * @return status
  **/
  @ApiModelProperty(value = "Status is the most recently observed status of the ReplicaSet. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public V1beta2ReplicaSetStatus getStatus() {
    return status;
  }

  public void setStatus(V1beta2ReplicaSetStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ReplicaSet v1beta2ReplicaSet = (V1beta2ReplicaSet) o;
    return Objects.equals(this.apiVersion, v1beta2ReplicaSet.apiVersion) &&
        Objects.equals(this.kind, v1beta2ReplicaSet.kind) &&
        Objects.equals(this.metadata, v1beta2ReplicaSet.metadata) &&
        Objects.equals(this.spec, v1beta2ReplicaSet.spec) &&
        Objects.equals(this.status, v1beta2ReplicaSet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ReplicaSet {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

