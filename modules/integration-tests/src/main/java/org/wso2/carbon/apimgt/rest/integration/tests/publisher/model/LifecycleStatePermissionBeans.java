/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * LifecycleStatePermissionBeans
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T19:34:51.739+05:30")
public class LifecycleStatePermissionBeans {
  @JsonProperty("roles")
  private List<String> roles = null;

  @JsonProperty("forTarget")
  private String forTarget = null;

  public LifecycleStatePermissionBeans roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public LifecycleStatePermissionBeans addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public LifecycleStatePermissionBeans forTarget(String forTarget) {
    this.forTarget = forTarget;
    return this;
  }

   /**
   * Get forTarget
   * @return forTarget
  **/
  @ApiModelProperty(value = "")
  public String getForTarget() {
    return forTarget;
  }

  public void setForTarget(String forTarget) {
    this.forTarget = forTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleStatePermissionBeans lifecycleStatePermissionBeans = (LifecycleStatePermissionBeans) o;
    return Objects.equals(this.roles, lifecycleStatePermissionBeans.roles) &&
        Objects.equals(this.forTarget, lifecycleStatePermissionBeans.forTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, forTarget);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleStatePermissionBeans {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    forTarget: ").append(toIndentedString(forTarget)).append("\n");
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

