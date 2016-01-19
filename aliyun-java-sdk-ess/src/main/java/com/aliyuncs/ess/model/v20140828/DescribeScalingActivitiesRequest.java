/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingActivitiesRequest extends RpcAcsRequest<DescribeScalingActivitiesResponse> {
	
	public DescribeScalingActivitiesRequest() {
		super("Ess", "2014-08-28", "DescribeScalingActivities");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private Integer pageNumber;

	private Integer pageSize;

	private String scalingGroupId;

	private String statusCode;

	private String scalingActivityId1;

	private String scalingActivityId2;

	private String scalingActivityId3;

	private String scalingActivityId4;

	private String scalingActivityId5;

	private String scalingActivityId6;

	private String scalingActivityId7;

	private String scalingActivityId8;

	private String scalingActivityId9;

	private String scalingActivityId10;

	private String scalingActivityId11;

	private String scalingActivityId12;

	private String scalingActivityId13;

	private String scalingActivityId14;

	private String scalingActivityId15;

	private String scalingActivityId16;

	private String scalingActivityId17;

	private String scalingActivityId18;

	private String scalingActivityId19;

	private String scalingActivityId20;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", pageNumber);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		putQueryParameter("ScalingGroupId", scalingGroupId);
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
		putQueryParameter("StatusCode", statusCode);
	}

	public String getScalingActivityId1() {
		return this.scalingActivityId1;
	}

	public void setScalingActivityId1(String scalingActivityId1) {
		this.scalingActivityId1 = scalingActivityId1;
		putQueryParameter("ScalingActivityId.1", scalingActivityId1);
	}

	public String getScalingActivityId2() {
		return this.scalingActivityId2;
	}

	public void setScalingActivityId2(String scalingActivityId2) {
		this.scalingActivityId2 = scalingActivityId2;
		putQueryParameter("ScalingActivityId.2", scalingActivityId2);
	}

	public String getScalingActivityId3() {
		return this.scalingActivityId3;
	}

	public void setScalingActivityId3(String scalingActivityId3) {
		this.scalingActivityId3 = scalingActivityId3;
		putQueryParameter("ScalingActivityId.3", scalingActivityId3);
	}

	public String getScalingActivityId4() {
		return this.scalingActivityId4;
	}

	public void setScalingActivityId4(String scalingActivityId4) {
		this.scalingActivityId4 = scalingActivityId4;
		putQueryParameter("ScalingActivityId.4", scalingActivityId4);
	}

	public String getScalingActivityId5() {
		return this.scalingActivityId5;
	}

	public void setScalingActivityId5(String scalingActivityId5) {
		this.scalingActivityId5 = scalingActivityId5;
		putQueryParameter("ScalingActivityId.5", scalingActivityId5);
	}

	public String getScalingActivityId6() {
		return this.scalingActivityId6;
	}

	public void setScalingActivityId6(String scalingActivityId6) {
		this.scalingActivityId6 = scalingActivityId6;
		putQueryParameter("ScalingActivityId.6", scalingActivityId6);
	}

	public String getScalingActivityId7() {
		return this.scalingActivityId7;
	}

	public void setScalingActivityId7(String scalingActivityId7) {
		this.scalingActivityId7 = scalingActivityId7;
		putQueryParameter("ScalingActivityId.7", scalingActivityId7);
	}

	public String getScalingActivityId8() {
		return this.scalingActivityId8;
	}

	public void setScalingActivityId8(String scalingActivityId8) {
		this.scalingActivityId8 = scalingActivityId8;
		putQueryParameter("ScalingActivityId.8", scalingActivityId8);
	}

	public String getScalingActivityId9() {
		return this.scalingActivityId9;
	}

	public void setScalingActivityId9(String scalingActivityId9) {
		this.scalingActivityId9 = scalingActivityId9;
		putQueryParameter("ScalingActivityId.9", scalingActivityId9);
	}

	public String getScalingActivityId10() {
		return this.scalingActivityId10;
	}

	public void setScalingActivityId10(String scalingActivityId10) {
		this.scalingActivityId10 = scalingActivityId10;
		putQueryParameter("ScalingActivityId.10", scalingActivityId10);
	}

	public String getScalingActivityId11() {
		return this.scalingActivityId11;
	}

	public void setScalingActivityId11(String scalingActivityId11) {
		this.scalingActivityId11 = scalingActivityId11;
		putQueryParameter("ScalingActivityId.11", scalingActivityId11);
	}

	public String getScalingActivityId12() {
		return this.scalingActivityId12;
	}

	public void setScalingActivityId12(String scalingActivityId12) {
		this.scalingActivityId12 = scalingActivityId12;
		putQueryParameter("ScalingActivityId.12", scalingActivityId12);
	}

	public String getScalingActivityId13() {
		return this.scalingActivityId13;
	}

	public void setScalingActivityId13(String scalingActivityId13) {
		this.scalingActivityId13 = scalingActivityId13;
		putQueryParameter("ScalingActivityId.13", scalingActivityId13);
	}

	public String getScalingActivityId14() {
		return this.scalingActivityId14;
	}

	public void setScalingActivityId14(String scalingActivityId14) {
		this.scalingActivityId14 = scalingActivityId14;
		putQueryParameter("ScalingActivityId.14", scalingActivityId14);
	}

	public String getScalingActivityId15() {
		return this.scalingActivityId15;
	}

	public void setScalingActivityId15(String scalingActivityId15) {
		this.scalingActivityId15 = scalingActivityId15;
		putQueryParameter("ScalingActivityId.15", scalingActivityId15);
	}

	public String getScalingActivityId16() {
		return this.scalingActivityId16;
	}

	public void setScalingActivityId16(String scalingActivityId16) {
		this.scalingActivityId16 = scalingActivityId16;
		putQueryParameter("ScalingActivityId.16", scalingActivityId16);
	}

	public String getScalingActivityId17() {
		return this.scalingActivityId17;
	}

	public void setScalingActivityId17(String scalingActivityId17) {
		this.scalingActivityId17 = scalingActivityId17;
		putQueryParameter("ScalingActivityId.17", scalingActivityId17);
	}

	public String getScalingActivityId18() {
		return this.scalingActivityId18;
	}

	public void setScalingActivityId18(String scalingActivityId18) {
		this.scalingActivityId18 = scalingActivityId18;
		putQueryParameter("ScalingActivityId.18", scalingActivityId18);
	}

	public String getScalingActivityId19() {
		return this.scalingActivityId19;
	}

	public void setScalingActivityId19(String scalingActivityId19) {
		this.scalingActivityId19 = scalingActivityId19;
		putQueryParameter("ScalingActivityId.19", scalingActivityId19);
	}

	public String getScalingActivityId20() {
		return this.scalingActivityId20;
	}

	public void setScalingActivityId20(String scalingActivityId20) {
		this.scalingActivityId20 = scalingActivityId20;
		putQueryParameter("ScalingActivityId.20", scalingActivityId20);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<DescribeScalingActivitiesResponse> getResponseClass() {
		return DescribeScalingActivitiesResponse.class;
	}

}
