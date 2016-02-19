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

import com.canviz.repairapp.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import static com.microsoft.services.orc.core.Helpers.*;
import com.microsoft.services.orc.serialization.JsonSerializer;

/**
 * The type DriveOperations.
 */
public class DriveOperations extends OrcOperations {

     /**
      * Instantiates a new DriveOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public DriveOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public DriveOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public DriveOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * allPhotos listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<DriveItem> allPhotos() { 
              
          
        
        ListenableFuture<String> future = allPhotosRaw();
        return transformToEntityListenableFuture(future, DriveItem.class, getResolver());
        
    }

     /**
     * allPhotosRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> allPhotosRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
                        
        request.getUrl().appendPathComponent("microsoft.graph.allPhotos");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
