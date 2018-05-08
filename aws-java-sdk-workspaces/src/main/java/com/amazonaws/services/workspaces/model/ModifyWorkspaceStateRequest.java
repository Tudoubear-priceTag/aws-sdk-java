/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyWorkspaceStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The WorkSpace state.
     * </p>
     */
    private String workspaceState;

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the WorkSpace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     * 
     * @return The ID of the WorkSpace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyWorkspaceStateRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The WorkSpace state.
     * </p>
     * 
     * @param workspaceState
     *        The WorkSpace state.
     * @see TargetWorkspaceState
     */

    public void setWorkspaceState(String workspaceState) {
        this.workspaceState = workspaceState;
    }

    /**
     * <p>
     * The WorkSpace state.
     * </p>
     * 
     * @return The WorkSpace state.
     * @see TargetWorkspaceState
     */

    public String getWorkspaceState() {
        return this.workspaceState;
    }

    /**
     * <p>
     * The WorkSpace state.
     * </p>
     * 
     * @param workspaceState
     *        The WorkSpace state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetWorkspaceState
     */

    public ModifyWorkspaceStateRequest withWorkspaceState(String workspaceState) {
        setWorkspaceState(workspaceState);
        return this;
    }

    /**
     * <p>
     * The WorkSpace state.
     * </p>
     * 
     * @param workspaceState
     *        The WorkSpace state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetWorkspaceState
     */

    public ModifyWorkspaceStateRequest withWorkspaceState(TargetWorkspaceState workspaceState) {
        this.workspaceState = workspaceState.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getWorkspaceState() != null)
            sb.append("WorkspaceState: ").append(getWorkspaceState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyWorkspaceStateRequest == false)
            return false;
        ModifyWorkspaceStateRequest other = (ModifyWorkspaceStateRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getWorkspaceState() == null ^ this.getWorkspaceState() == null)
            return false;
        if (other.getWorkspaceState() != null && other.getWorkspaceState().equals(this.getWorkspaceState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceState() == null) ? 0 : getWorkspaceState().hashCode());
        return hashCode;
    }

    @Override
    public ModifyWorkspaceStateRequest clone() {
        return (ModifyWorkspaceStateRequest) super.clone();
    }

}