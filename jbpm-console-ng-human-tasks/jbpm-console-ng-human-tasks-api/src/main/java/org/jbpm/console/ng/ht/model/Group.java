/*
 * Copyright 2013 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.console.ng.ht.model;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class Group extends IdentitySummary {

    private static final long serialVersionUID = -8439757821807142776L;
    
    // TODO only for id, remove it later
    private static final String PREFIX = "group_id";
    
    private Group parent;
    
    public Group(){
        
    }
    
    public Group(String description){
        super(description);
    }

    public Group getParent() {
        return parent;
    }

    public void setParent(Group parent) {
        this.parent = parent;
    }
    
    // TODO please remove it when we have id
    public String getId() {
        return PREFIX + SEPARATOR + super.getName();
    }

    

}
