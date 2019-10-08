package com.yankie.learn.provider.entity;

import java.io.Serializable;

public class Region implements Serializable {
    private Integer regionId;

    private String regionName;

    private Integer parentRegionId;

    private String regionShortName;

    private Integer regionLevel;

    private String regionCode;

    private String postCode;

    private String regionFullName;

    private static final long serialVersionUID = 1L;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public Integer getParentRegionId() {
        return parentRegionId;
    }

    public void setParentRegionId(Integer parentRegionId) {
        this.parentRegionId = parentRegionId;
    }

    public String getRegionShortName() {
        return regionShortName;
    }

    public void setRegionShortName(String regionShortName) {
        this.regionShortName = regionShortName == null ? null : regionShortName.trim();
    }

    public Integer getRegionLevel() {
        return regionLevel;
    }

    public void setRegionLevel(Integer regionLevel) {
        this.regionLevel = regionLevel;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getRegionFullName() {
        return regionFullName;
    }

    public void setRegionFullName(String regionFullName) {
        this.regionFullName = regionFullName == null ? null : regionFullName.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Region other = (Region) that;
        return (this.getRegionId() == null ? other.getRegionId() == null : this.getRegionId().equals(other.getRegionId()))
            && (this.getRegionName() == null ? other.getRegionName() == null : this.getRegionName().equals(other.getRegionName()))
            && (this.getParentRegionId() == null ? other.getParentRegionId() == null : this.getParentRegionId().equals(other.getParentRegionId()))
            && (this.getRegionShortName() == null ? other.getRegionShortName() == null : this.getRegionShortName().equals(other.getRegionShortName()))
            && (this.getRegionLevel() == null ? other.getRegionLevel() == null : this.getRegionLevel().equals(other.getRegionLevel()))
            && (this.getRegionCode() == null ? other.getRegionCode() == null : this.getRegionCode().equals(other.getRegionCode()))
            && (this.getPostCode() == null ? other.getPostCode() == null : this.getPostCode().equals(other.getPostCode()))
            && (this.getRegionFullName() == null ? other.getRegionFullName() == null : this.getRegionFullName().equals(other.getRegionFullName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRegionId() == null) ? 0 : getRegionId().hashCode());
        result = prime * result + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        result = prime * result + ((getParentRegionId() == null) ? 0 : getParentRegionId().hashCode());
        result = prime * result + ((getRegionShortName() == null) ? 0 : getRegionShortName().hashCode());
        result = prime * result + ((getRegionLevel() == null) ? 0 : getRegionLevel().hashCode());
        result = prime * result + ((getRegionCode() == null) ? 0 : getRegionCode().hashCode());
        result = prime * result + ((getPostCode() == null) ? 0 : getPostCode().hashCode());
        result = prime * result + ((getRegionFullName() == null) ? 0 : getRegionFullName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", regionId=").append(regionId);
        sb.append(", regionName=").append(regionName);
        sb.append(", parentRegionId=").append(parentRegionId);
        sb.append(", regionShortName=").append(regionShortName);
        sb.append(", regionLevel=").append(regionLevel);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", postCode=").append(postCode);
        sb.append(", regionFullName=").append(regionFullName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}