/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.canviz.repairapp.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Drive Item.
*/
public class DriveItem extends ODataBaseEntity {

    public DriveItem(){
        setODataType("#microsoft.graph.driveItem");
    }
            
    private byte[] content;
     
    /**
    * Gets the content.
    *
    * @return the byte[]
    */
    public byte[] getContent() {
        return this.content; 
    }

    /**
    * Sets the content.
    *
    * @param value the byte[]
    */
    public void setContent(byte[] value) { 
        this.content = value; 
        valueChanged("content", value);

    }
            
    private IdentitySet createdBy;
     
    /**
    * Gets the created By.
    *
    * @return the IdentitySet
    */
    public IdentitySet getCreatedBy() {
        return this.createdBy; 
    }

    /**
    * Sets the created By.
    *
    * @param value the IdentitySet
    */
    public void setCreatedBy(IdentitySet value) { 
        this.createdBy = value; 
        valueChanged("createdBy", value);

    }
            
    private java.util.Calendar createdDateTime;
     
    /**
    * Gets the created Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getCreatedDateTime() {
        return this.createdDateTime; 
    }

    /**
    * Sets the created Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setCreatedDateTime(java.util.Calendar value) { 
        this.createdDateTime = value; 
        valueChanged("createdDateTime", value);

    }
            
    private String cTag;
     
    /**
    * Gets the c Tag.
    *
    * @return the String
    */
    public String getCTag() {
        return this.cTag; 
    }

    /**
    * Sets the c Tag.
    *
    * @param value the String
    */
    public void setCTag(String value) { 
        this.cTag = value; 
        valueChanged("cTag", value);

    }
            
    private String description;
     
    /**
    * Gets the description.
    *
    * @return the String
    */
    public String getDescription() {
        return this.description; 
    }

    /**
    * Sets the description.
    *
    * @param value the String
    */
    public void setDescription(String value) { 
        this.description = value; 
        valueChanged("description", value);

    }
            
    private String eTag;
     
    /**
    * Gets the e Tag.
    *
    * @return the String
    */
    public String getETag() {
        return this.eTag; 
    }

    /**
    * Sets the e Tag.
    *
    * @param value the String
    */
    public void setETag(String value) { 
        this.eTag = value; 
        valueChanged("eTag", value);

    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getId() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.id = value; 
        valueChanged("id", value);

    }
            
    private IdentitySet lastModifiedBy;
     
    /**
    * Gets the last Modified By.
    *
    * @return the IdentitySet
    */
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy; 
    }

    /**
    * Sets the last Modified By.
    *
    * @param value the IdentitySet
    */
    public void setLastModifiedBy(IdentitySet value) { 
        this.lastModifiedBy = value; 
        valueChanged("lastModifiedBy", value);

    }
            
    private java.util.Calendar lastModifiedDateTime;
     
    /**
    * Gets the last Modified Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastModifiedDateTime() {
        return this.lastModifiedDateTime; 
    }

    /**
    * Sets the last Modified Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastModifiedDateTime(java.util.Calendar value) { 
        this.lastModifiedDateTime = value; 
        valueChanged("lastModifiedDateTime", value);

    }
            
    private String name;
     
    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getName() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.name = value; 
        valueChanged("name", value);

    }

            
    private Long size;
     
    /**
    * Gets the size.
    *
    * @return the Long
    */
    public Long getSize() {
        return this.size; 
    }

    /**
    * Sets the size.
    *
    * @param value the Long
    */
    public void setSize(Long value) { 
        this.size = value; 
        valueChanged("size", value);

    }
            
    private String webDavUrl;
     
    /**
    * Gets the web Dav Url.
    *
    * @return the String
    */
    public String getWebDavUrl() {
        return this.webDavUrl; 
    }

    /**
    * Sets the web Dav Url.
    *
    * @param value the String
    */
    public void setWebDavUrl(String value) { 
        this.webDavUrl = value; 
        valueChanged("webDavUrl", value);

    }
            
    private String webUrl;
     
    /**
    * Gets the web Url.
    *
    * @return the String
    */
    public String getWebUrl() {
        return this.webUrl; 
    }

    /**
    * Sets the web Url.
    *
    * @param value the String
    */
    public void setWebUrl(String value) { 
        this.webUrl = value; 
        valueChanged("webUrl", value);

    }
            

    
        
    private java.util.List<DriveItem> versions = null;
    
    
     
    /**
    * Gets the versions.
    *
    * @return the java.util.List<DriveItem>
    */
    public java.util.List<DriveItem> getVersions() {
        return this.versions; 
    }

    /**
    * Sets the versions.
    *
    * @param value the java.util.List<DriveItem>
    */
    public void setVersions(java.util.List<DriveItem> value) { 
        this.versions = value; 
        valueChanged("versions", value);

    }
    
        
    private java.util.List<DriveItem> children = null;
    
    
     
    /**
    * Gets the children.
    *
    * @return the java.util.List<DriveItem>
    */
    public java.util.List<DriveItem> getChildren() {
        return this.children; 
    }

    /**
    * Sets the children.
    *
    * @param value the java.util.List<DriveItem>
    */
    public void setChildren(java.util.List<DriveItem> value) { 
        this.children = value; 
        valueChanged("children", value);

    }

}

