/*
 * Copyright (C) 2007 Erik Swenson - erik@oreports.com
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 * 
 * You should have reserved a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 *  
 */
package org.efs.openreports.services.output;

import org.efs.openreports.ReportConstants;
import org.efs.openreports.ReportConstants.Status;

/**
 * Contains the data returned by request to generate a report. Content attributes
 * are optional and usually only returned for synchronous requests.
 * 
 * @see ReportConstants
 */

public class ReportServiceOutput 
{       
    /** content generated by the service */
    private byte[] content; 
    
    /** mime type of the content */
    private String contentType;    
    
    /** file extension of the content */
    private String contentExtension;
    
    /** message returned by the request */
    private String contentMessage;   
    
    /** status of the request */
    private Status status;

    public byte[] getContent() 
    {
        return content;
    }
    
    public void setContent(byte[] content) 
    {
        this.content = content;
    }
    
    public String getContentMessage() 
    {
        return contentMessage;
    }
    
    public void setContentMessage(String contentMessage) 
    {
        this.contentMessage = contentMessage;
    }
    
    public String getContentType() 
    {
        return contentType;
    }
    
    public void setContentType(String contentType) 
    {
        this.contentType = contentType;
    }
    
    public String getContentExtension() 
    {
        return contentExtension;
    }
    
    public void setContentExtension(String contentExtension) 
    {
        this.contentExtension = contentExtension;
    }  
    
    public Status getStatus()
    {
		return status;
	}

	public void setStatus(Status status) 
	{
		this.status = status;
	}    
}
